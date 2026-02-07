# Mission #1: Crear automatizaciones para apps originales e instaladas.

## 🎯 Goals

- Configurar un proyecto Maven para Appium con Java.
- Abrir aplicaciones nativas instaladas en el dispositivo.
- Abrir aplicaciones instaladas mediante APK.

---

## Cómo abrir aplicaciones nativas en Android

Para abrir aplicaciones nativas que ya vienen instaladas en el dispositivo, es necesario conocer el `appPackage` y `appActivity` de la aplicación. Estos valores se pueden obtener utilizando herramientas como `adb` o Appium Inspector.
1. Configurar el proyecto Maven llamado "qax-mobile-native"
2. Agregar las dependencias necesarias para Appium en el archivo `pom.xml`.
3. Crear una clase de prueba que configure las capabilities con el `appPackage` y `appActivity` de la aplicación nativa.
4. Ejecutar la prueba para validar que la aplicación se abre correctamente.

> Una clase `java` por aplicación nativa.

Aplicaciones nativas para probar:
- Calculadora (no la tiene el emulador)
- Contactos
- Mensajes
- Navegador
- Cámara
- Calendario
- Reloj
- Youtube
- Llamadas
- Configuración

## Cómo abrir aplicaciones instaladas mediante APK
Para abrir aplicaciones instaladas manualmente mediante APK, es necesario proporcionar la ruta del archivo APK en las capabilities.
Se recomienda usar emuladores por temas de seguridad, ya que son app publicas y pueden contener malware.
1. Configurar el proyecto Maven nuevo llamado "qax-mobile-apk"
2. Agregar las dependencias necesarias para Appium en el archivo `pom.xml`.
3. Crear una clase de prueba que configure las capabilities con la ruta del archivo APK.
4. Ejecutar la prueba para validar que la aplicación se instala y se abre correctamente.

> Una clase `java` por aplicación instalada mediante APK.

Las aplicaciones APK para probar estan en esta carpeta,[ las puede encontrar aqui](src/test/resources)