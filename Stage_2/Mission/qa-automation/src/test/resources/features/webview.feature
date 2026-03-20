Feature: WebView
  Como usuario de la app My Demo App
  Quiero interactuar con el WebView integrado
  Para validar que la funcionalidad web dentro de la app funciona correctamente

  Scenario: Cargar una URL en WebView
    Given que el usuario se encuentra en el menú principal
    When accede al módulo WebView
    And ingresa la URL "www.qaxpert.com/mi2026"
    Then debe mostrarse el contenido de la página
    And debe visualizarse la palabra "Workshop"