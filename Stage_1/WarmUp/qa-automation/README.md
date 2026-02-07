## Quick Task

### Requisitos previos (ya cumplidos)

- ✔ Java instalado
- ✔ Android SDK configurado
- ✔ Emulador o dispositivo físico activo
- ✔ Appium Server instalado
- ✔ Postman instalado
- ✔ APK disponible 

### Instrucciones seguidas para la realización del ejercicio

1. Iniciar Appium Server y asegurarnos de que está corriendo en `http://`
- Mensaje esperado
```bash
You can provide the following URLs in your client code to connect to this server:
        http://127.0.0.1:4723/ (only accessible from the same host)
        http://192.168.0.104:4723/
[Appium] Available drivers:
[Appium]   - uiautomator2@4.2.9 (automationName 'UiAutomator2')

```

2.  Crear las Capabilities (JSON)

```json

{
  "capabilities": {
    "alwaysMatch": {
      "platformName": "Android",
      "appium:automationName": "UiAutomator2",
      "appium:deviceName": "R5GYA1MKNWX",
      "appium:app": "/ruta/completa/ApiDemos-debug.apk"
    },
    "firstMatch": [{}]
  }
}
```
3. Crear la sesión desde Postman

Crear un request POST a: `http://localhost:4723/session`
- Body: raw JSON (usar las capabilities creadas)
- Enviar request
-  Verificar que la respuesta incluya un `sessionId`

```bash
{
  "value": {
    "sessionId": "abc123",
    "capabilities": {
      "platformName": "Android",
      "deviceName": "Android Emulator"
    }
  }
}
```

> 📱 La app se abre automáticamente en el emulador.

- Usar la [colección de postman](assets/Appium%20-%20Test.postman_collection.json)

4. Tomar un screenshot de la sesión activa
