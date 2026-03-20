Feature: Login y vista About
  Como usuario de la app My Demo App
  Quiero iniciar sesión y acceder a la vista About
  Para verificar la información de la aplicación

  Background:
    Given que el usuario se encuentra en la pantalla de login

  Scenario: Login con credenciales correctas
    When ingresa credenciales válidas
    Then el sistema debe permitir el acceso a la aplicación

  Scenario: Login con credenciales incorrectas
    When ingresa credenciales inválidas
    Then el sistema debe mostrar un mensaje de error

  Scenario: Validar versión de la app en la vista About
    When accede a la vista About
    Then debe visualizarse la versión actual de la aplicación