package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import static ui.CatalogoProductosPage.LOCATOR_PRODUCTS_CONTAINER;
import static ui.ProductoPage.LOCATOR_ADD_PRODUCT;
import static ui.ProductoPage.LOCATOR_ADD_TO_CART_BTN;
import static ui.ProductoPage.LOCATOR_PRODUCT_COLOR;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Browser;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Interactive;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import java.time.Duration;
import java.util.Collections;

public class AgregarProductosAlCarrito implements Task {

    private final By locator;

    public AgregarProductosAlCarrito(By locator) {
        this.locator = locator;
    }

    public static AgregarProductosAlCarrito ahora(By locator) {
        return instrumented(AgregarProductosAlCarrito.class, locator);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LOCATOR_PRODUCTS_CONTAINER, isVisible()).forNoMoreThan(Duration.ofSeconds(10))
        );

        scrollToElement(locator);

        actor.attemptsTo(
                WaitUntil.the(locator, isClickable()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(locator),
                WaitUntil.the(LOCATOR_PRODUCT_COLOR, isClickable()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(LOCATOR_PRODUCT_COLOR),
                WaitUntil.the(LOCATOR_ADD_PRODUCT, isClickable()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(LOCATOR_ADD_PRODUCT),
                Click.on(LOCATOR_ADD_PRODUCT),
                Click.on(LOCATOR_ADD_TO_CART_BTN),
                Browser.navigateBack()
        );
    }

    public void scrollToElement(By locator) {
        WebDriver driver = Serenity.getDriver();
        int maxScrolls = 5;

        for (int i = 0; i < maxScrolls; i++) {

            try {
                WebElement element = driver.findElement(locator);
                if (element.isDisplayed()) {
                    return;
                }
            } catch (Exception ignored) {}

            Dimension size = driver.manage().window().getSize();

            int startX = (int) (size.width * 0.8);
            int startY = (int) (size.height * 0.5);
            int endY = (int) (size.height * 0.4);

            PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
            Sequence swipe = new Sequence(finger, 1);

            //Simula un dedo deslizado hacia arriba, que provoca scroll hacia abajo
            swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
            swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
            swipe.addAction(finger.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), startX, endY));
            swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

            // Ejecuta el swipe (La pantalla se mueve)
            ((Interactive) driver).perform(Collections.singletonList(swipe));
        }
        // Si después de 5 scrolls el elemento no aparece, lanza un error diciendo que el elemento no se encontró
        throw new NoSuchElementException("Element not found after scrolling: " + locator);
    }
}
