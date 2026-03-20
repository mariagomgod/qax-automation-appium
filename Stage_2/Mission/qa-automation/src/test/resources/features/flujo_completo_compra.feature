Feature: Flujo completo de compra
  Como usuario de la app My Demo App
  Quiero realizar una compra completa
  Para validar que el proceso de compra funciona correctamente

  Scenario: Realizar una compra completa de productos
    Given que el usuario se encuentra en el catálogo de productos
    When aplica un filtro de productos
    And selecciona 5 productos diferentes
    And agrega 3 unidades de cada producto
    And cambia el color de los productos cuando esté disponible
    And agrega los productos al carrito
    And procede al checkout
    And realiza el pago correctamente
    Then la compra debe completarse exitosamente
    And debe mostrarse una confirmación de la orden