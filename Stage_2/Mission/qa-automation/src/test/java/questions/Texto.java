package questions;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Texto implements Question<String> {
    private final Target target;

    public Texto(Target target) {
        this.target = target;
    }

    public static Texto en(Target target) {
        return new Texto(target);
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(target, isVisible()).forNoMoreThan(5).seconds()
        );
        return Text.of(target).answeredBy(actor);
    }
}