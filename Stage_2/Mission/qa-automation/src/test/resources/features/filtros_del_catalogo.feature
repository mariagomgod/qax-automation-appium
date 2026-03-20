Feature: Filtros del catálogo
  Como usuario de la app My Demo App
  Quiero filtrar los productos del catálogo
  Para encontrar fácilmente los productos según nombre y precio

  Background:
    Given que el usuario se encuentra en el catálogo de productos

  Scenario: Filtrar productos por nombre ascendente
    When aplica el filtro por "nombre" "ascendente"
    Then los productos deben mostrarse ordenados de A a Z

  Scenario: Filtrar productos por nombre descendente
    When aplica el filtro por "nombre" "descendente"
    Then los productos deben mostrarse ordenados de Z a A

  Scenario: Filtrar productos por precio ascendente
    When aplica el filtro por "precio" "ascendente"
    Then los productos deben mostrarse del menor al mayor precio

  Scenario: Filtrar productos por precio descendente
    When aplica el filtro por "precio" "descendente"
    Then los productos deben mostrarse del mayor al menor precio

