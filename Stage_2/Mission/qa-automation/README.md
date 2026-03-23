# Mission 2: Crear automatizaciones para apps originales e instaladas.

En esta misión vamos a automatizar una regresión completa en una app de comercio, cubriendo los flujos críticos de negocio de principio a fin.
Pasaremos de pruebas aisladas a escenarios end-to-end, validando navegación, datos, estados y resultados, tal como lo haría un usuario real.


### 🎯 Goals

- Ampliar la cobertura de pruebas incorporando validaciones funcionales y de estado que aseguren la estabilidad de la aplicación ante cambios.
- Implementar flujos end-to-end que simulen escenarios reales de usuario, desde la apertura de la app hasta la finalización de una compra.
- Diseñar escenarios de regresión robustos y reutilizables, aplicando buenas prácticas de automatización para facilitar su mantenimiento y ejecución continua.


---

## Historias de usuario a automatizar
### Historia de Usuario 1: Filtros del catálogo

- **Como** usuario de la app My Demo App
- **Quiero** filtrar los productos del catálogo
- **Para** encontrar fácilmente los productos según nombre y precio

### Escenarios gherkin:

```gherkin
Scenario: Filtrar productos por nombre ascendente
  Given que el usuario se encuentra en el catálogo de productos
  When aplica el filtro por nombre ascendente
  Then los productos deben mostrarse ordenados de A a Z

Scenario: Filtrar productos por nombre descendente
  Given que el usuario se encuentra en el catálogo de productos
  When aplica el filtro por nombre descendente
  Then los productos deben mostrarse ordenados de Z a A

Scenario: Filtrar productos por precio ascendente
  Given que el usuario se encuentra en el catálogo de productos
  When aplica el filtro por precio ascendente
  Then los productos deben mostrarse del menor al mayor precio

Scenario: Filtrar productos por precio descendente
  Given que el usuario se encuentra en el catálogo de productos
  When aplica el filtro por precio descendente
  Then los productos deben mostrarse del mayor al menor precio
```
### Historia de Usuario 2: Login y vista About
- **Como** usuario de la app My Demo App
- **Quiero** iniciar sesión y acceder a la vista About
- **Para** verificar la información de la aplicación
### Escenarios gherkin:

```gherkin
Scenario: Login con credenciales correctas
  Given que el usuario se encuentra en la pantalla de login
  When ingresa credenciales válidas
  Then el sistema debe permitir el acceso a la aplicación

Scenario: Login con credenciales incorrectas
  Given que el usuario se encuentra en la pantalla de login
  When ingresa credenciales inválidas
  Then el sistema debe mostrar un mensaje de error

Scenario: Validar versión de la app en la vista About
  Given que el usuario ha iniciado sesión correctamente
  When accede a la vista About
  Then debe visualizarse la versión actual de la aplicación

```
### Historia de Usuario 3: WebView
- **Como** usuario de la app My Demo App
- **Quiero** interactuar con el WebView integrado
- **Para** validar que la funcionalidad web dentro de la app funciona correctamente
### Escenarios gherkin:
```gherkin
Scenario: Cargar una URL en WebView
  Given que el usuario se encuentra en el menú principal
  When accede al módulo WebView
   And ingresa la URL "www.qaxpert.com/mi2026"
  Then debe mostrarse el contenido de la página
   And debe visualizarse la palabra "Workshop"
```
### Historia de Usuario 4: Flujo completo de compra
- **Como** usuario de la app My Demo App
- **Quiero** realizar una compra completa
- **Para** validar que el proceso de compra funciona correctamente

### Escenarios gherkin:
```gherkin
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
```
### NOTAS QA:
- No podemos agregar un segundo producto al carrito apliques el fitltro que apliques. Por algún motivo al intentar seleccionarlo la app se cierra automáticamente. Por tanto, solo se procede autmatizar el primero, el tercero, el cuarto, el quinto y el sexto producto.

---
### 📂 Instrucciones y estructuración del proyecto
1. Descargar la app My Demo App: https://apkpure.com/es/my-demo-app/br.com.rg.gabrielsalles.mydemoapp2017/download/1.1 para el ejercicio.
2. Crear un nuevo proyecto Maven en IntelliJ IDEA, agregando las dependencias necesarias para Appium.
3. Implementar el patrón Page Object Model (POM) para estructurar el proyecto.
4. Crear las clases de página necesarias para representar las pantallas de la app, agregando los localizadores y métodos correspondientes.
5. Implementar los escenarios de prueba descritos en las historias de usuario, asegurando que cada flujo esté cubierto de principio a fin.
6. Ejecutar las pruebas en un emulador Android.

---

### 🚀 ¿Cómo lanzamos los tests?
1. Pre-requisitos técnicos:
   - Java Development Kit (JDK): Versión 8 o superior, con JAVA_HOME configurado.
   - Node.js y NPM: Necesarios para instalar el servidor Appium.
   - Appium Server (v2.x recomendado): Instalado vía npm install -g appium.
   - Drivers de Appium: Instalar los drivers necesarios:
     - Android: appium driver install uiautomator2.
     - iOS: appium driver install xcuitest.
   - Entorno de Desarrollo (IDE): IntelliJ IDEA o Eclipse.
   - Android SDK/Studio: Para emuladores/dispositivos físicos. Configurar ANDROID_HOME.
   - Xcode: Solo para automatización iOS (requiere Mac).
   - Appium Inspector: Para localizar elementos.
   - Maven: Para gestionar dependencias (Appium Java Client, TestNG/JUnit)
   
2. Lanzar un test de forma individualizada:
   - Vamos al fichero de feature y al escenario que queramos lanzar y le damos al play (Run 'Scenario: X')

3. Lanzar la suite de test completa:
   - Desde el terminal del IDE con el comando 'mvn integration-test', o vamos al TestRunner y le damos al play (Run Test)
