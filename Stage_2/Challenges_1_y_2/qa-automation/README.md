# Challenges 1 y 2:  Localizar todos los elementos del flujo mobile y ampliar la cobertura de pruebas

### 🎯 Goals

- Explorar la jerarquía de la aplicación, entender cómo el sistema operativo expone los elementos y practicar distintos tipos de localizadores.
- Ampliar la cobertura de nuestras pruebas, agregando nuevas validaciones, acciones encadenadas y decisiones, para transformar escenarios simples en flujos completos de principio a fin.

---

### 🧪 Api Demos (Android)

En el proyecto trabajaremos con la aplicación Api Demos, en el cual vamos a localizar todos los elementos necesarios para completar un flujo básico dentro de la app.

---
### ⚙ Casos de prueba a automatizar
1. Abrir todos los menus del Home y validar qe tenga los submenús completos.
2. Abrir todos los submenus de cada menu.
3. Abrir el menu "Views", luego el submenu "Controls", luego el submenu "1. Light Theme",
   escribir texto en el campo de texto, seleccionar el checkbox y radio button, y finalmente validar que los elementos estén seleccionados.
4. Abrir el menu "Views", luego el submenu "Date Widgets", luego el submenu "1. Dialog", Click en "change the date", seleccionar una fecha y validar que la fecha seleccionada sea la correcta.

---
### ⚙ Instrucciones

1. Instalar la app `ApiDemos-debug.apk` en el emulador Android.
2. Abrir Appium Inspector y conectarse al emulador Android.
3. Explorar la aplicación y localizar todos los elementos necesarios para completar los casos de prueba.
4. Documentar los localizadores usados para cada elemento (Accessibility ID, ID, XPath, Class Name, etc.)
5. Agregar los localizadores del Home la clase `src/test/java/pages/HomePage.java`
6. Crear las clases para cada uno de los menus y submenus, agregando los localizadores correspondientes.
7. Agregar nuevas validaciones en la clase `src/test/java/test/HomeTests.java` para validar que cada menu del Home tenga los submenus completos. 9
8. Crear un nuevo test en la clase `src/test/java/test/ViewTest.java` para automatizar el caso de prueba 2.
9. Crear las clases necesarias en `src/test/java/pages/` para representar las pantallas involucradas en el caso de prueba 2, agregando los localizadores y métodos necesarios. 
10. Crear un nuevo test en la clase `src/test/java/test/ViewTest.java` para automatizar el caso de prueba 3.

---

### 🧪 ¿Cómo he estructurado el proyecto?
1. Creando una clase para cada aplicación inspeccionada, siguiendo el patrón Page Object Model (POM).
2. Cada clase contiene:
- Localizadores de los elementos inspeccionados.
- Métodos para interactuar con esos elementos (si aplica).
- Comentarios que expliquen la función de cada elemento y método.

---

### ⚙ ¿Cómo lanzamos los test?
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
   - Vamos a la clase de test que queramos lanzar y le damos al play (Run 'Test X')

3. Lanzar la suite de test completa:
   - Desde el terminal del IDE con el comando 'mvn test'