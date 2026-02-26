## Quick Task

### 🎯 Goal

- Explorar aplicaciones nativas del dispositivo y apps instaladas vía APK, identificar su pantalla Home y localizar todos los elementos visibles usando herramientas de inspección mobile.

## Aplicaciones a utilizar

### 📲 Apps nativas del dispositivo
1. Mensajes
2. Cámara
3. Calendario
4. Gmail
5. YouTube
6. Calculadora (no la incluye el emulador)
7. Llamadas
8. Contactos

### 📲 App externa
Una aplicación instalada usandos todas [las apk de aqui](src/test/resources).


### ⚙ Instrucciones
He seguido estos pasos para completar el ejercicio:

1. Abrir Appium Inspector y conectarlo con el emulador o dispositivo Android.
2. Seleccionar una de las aplicaciones nativas del dispositivo o la app externa instalada.
3. Inspeccionar la pantalla Home de la aplicación seleccionada.
4. Identificar y anotar los siguientes detalles para cada elemento visible en la pantalla Home:
5. localizador XPath
6. Tipo de localizador (text, content-desc, resource-id, etc.)
7. Descripción breve de la función del elemento (por ejemplo, botón de enviar, campo de búsqueda, etc.)
8. Repetir el proceso para 5 elementos diferentes en la pantalla Home de la aplicación.

### 🧪 ¿Cómo he estructurado el proyecto?
1. Creando una clase para cada aplicación inspeccionada, siguiendo el patrón Page Object Model (POM).
2. Cada clase contiene:
- Localizadores de los elementos inspeccionados.
- Métodos para interactuar con esos elementos (si aplica).
- Comentarios que expliquen la función de cada elemento y método.

### ⚙ ¿Cómo lanzamos los tests?
- Vamos a la clase de test que queramos lanzar y le damos al play (Run 'Test X')