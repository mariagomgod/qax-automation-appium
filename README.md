# 🌱 Configurar entorno con Appium

## Instalación de JDK (Java Development Kit)

### **Windows**

1. Descarga el **JDK** desde [Oracle Java Downloads](https://www.oracle.com/java/technologies/downloads/).
2. Selecciona la versión **LTS (Long Term Support)**, por ejemplo: **Java 17**.
3. Instala siguiendo el asistente.
4. Recuerda la ruta donde se instaló, normalmente:

   > **Nota:**  
   > La ruta de instalación puede variar según la versión y configuración de tu sistema.  
   > Ejemplo de ruta por defecto:
   > ```
    > C:\Program Files\Java\jdk-17
    > ```

### **Mac/Linux**

- En Mac, usa [Oracle Java Downloads](https://www.oracle.com/java/technologies/downloads/) o instala con Homebrew:

  ```bash
  brew install openjdk@17
  ```

- En Linux (Ubuntu/Debian):

  ```bash
  sudo apt update
  sudo apt install openjdk-17-jdk
  ```

---

##  Configuración de Variables de Entorno

#### **Windows**

1. Abre **Panel de Control → Sistema → Configuración avanzada del sistema → Variables de entorno**.
2. Crea una nueva variable del sistema:

    - **Variable:** `JAVA_HOME`
    - **Valor:** Ruta donde instalaste el JDK, ejemplo:  
      `C:\Program Files\Java\jdk-17`

3. Edita la variable **Path** y agrega:  
   `%JAVA_HOME%\bin`

#### **Mac/Linux**

1. Edita tu archivo de configuración (`~/.zshrc` o `~/.bashrc`):

    ```bash
    export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64
    export PATH=$JAVA_HOME/bin:$PATH
    ```

2. Aplica cambios:

    ```bash
    source ~/.zshrc   # o ~/.bashrc
    ```

---

### Validación de Instalación de Java

Abre la terminal (cmd, powershell o bash) y ejecuta:

```bash
java -version
```

Debe mostrar algo como:

```
java version "17.0.16" 2025-07-15 LTS
```

---

### Instalación y Configuración de Maven

#### **Windows**

1. Descarga Maven: [Maven Downloads](https://maven.apache.org/download.cgi)
2. Descomprime en `C:\Program Files\Apache\maven`.
3. Crea la variable del sistema:

    - **Variable:** `MAVEN_HOME`
    - **Valor:** `C:\Program Files\Apache\maven\apache-maven-3.x.x`

4. Edita **Path** y agrega:  
   `%MAVEN_HOME%\bin`

#### **Mac/Linux**

- Ubuntu/Debian:

  ```bash
  sudo apt install maven
  ```

- Mac:

  ```bash
  brew install maven
  ```

---

### Validación de Maven

Ejecuta en terminal:

```bash
mvn -version
```

Debe mostrar algo como:

```
Maven home: C:\maven\apache-maven-3.9.11
Java version: 17.0.16, vendor: Oracle Corporation, runtime: C:\Program Files\Java\jdk-17
```

Nota: Si aparece un error indicando que no se encuentra el comando mvn, se recomienda reiniciar el ordenador o PC para que se apliquen correctamente los cambios.


---

### Creación de un Proyecto Maven

Vamos a crear un proyecto base que utilizararemos como referencia en futuros desarrollos

Seleccione una carpeta de referencia donde desee crear el proyecto base. Es recomendable elegir una ubicación organizada y de fácil acceso para facilitar el desarrollo futuro.

Ejecuta en terminal:

```bash
mvn archetype:generate -DgroupId=com.qaxpert -DartifactId=qa-automation -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

El comando que ves es para crear un nuevo proyecto Java usando Maven, una herramienta que ayuda a gestionar proyectos y dependencias.

mvn archetype:generate: Le dice a Maven que cree un nuevo proyecto a partir de una plantilla (arquetipo).
-DgroupId=com.qaxpert: Define el "grupo" o el nombre de la organización/empresa.
-DartifactId=qa-automation: Es el nombre del proyecto o módulo.
-DarchetypeArtifactId=maven-archetype-quickstart: Usa una plantilla básica para proyectos Java.
-DinteractiveMode=false: Hace que el comando se ejecute sin pedirte información extra (todo automático).

Esto generará un proyecto con estructura básica:

```
qa-automation/
├── src/
│   ├── main/java
│   └── test/java
└── pom.xml
```

Utilizaremos nuestro IDE de referencia, preferiblemente IntelliJ IDEA, y abriremos el proyecto que creamos previamente.

#### Secciones principales del `pom.xml`

- **`<project>`**: Raíz del archivo.
- **`<modelVersion>`**: Versión del modelo POM.
- **`<groupId>`**: Identificador único del proyecto/organización.
- **`<artifactId>`**: Nombre del proyecto (cómo se exportará el artefacto).
- **`<version>`**: Versión del proyecto.
- **`<packaging>`**: Tipo de paquete (JAR, WAR, etc.).
- **`<properties>`**: Configuraciones globales (como versión de Java).
- **`<dependencies>`**: Librerías externas que el proyecto necesita.
- **`<build>`**: Plugins y configuraciones de compilación.

---

#### Ejemplo de `pom.xml`

Ahora procederemos a reemplazar el contenido del archivo pom.xml con el siguiente código, el cual contiene la configuración necesaria para nuestro proyecto.

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
            xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
            xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 
            http://maven.apache.org/xsd/maven-4.0.0.xsd">

     <modelVersion>4.0.0</modelVersion>
     <groupId>com.qaxpert</groupId>
     <artifactId>qa-automation</artifactId>
     <version>1.0-SNAPSHOT</version>
     <properties>
        <selenium.version>4.9.1</selenium.version>
        <webdrivermanager.version>5.5.0</webdrivermanager.version>
        <maven.compiler.source>17</maven.compiler.source>
         <maven.compiler.target>17</maven.compiler.target>
     </properties>

     <dependencies>
              <!-- Selenium WebDriver -->
     <dependency>
          <groupId>org.seleniumhq.selenium</groupId>
          <artifactId>selenium-java</artifactId>
          <version>4.9.1</version>
     </dependency>

     <!-- WebDriverManager -->
     <dependency>
          <groupId>io.github.bonigarcia</groupId>
          <artifactId>webdrivermanager</artifactId>
          <version>5.5.0</version>
     </dependency>

       <!-- JUnit 5 -->
      <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>7.4.0</version>
            <scope>test</scope>
        </dependency>
     </dependencies>
</project>
```

### Instalacion Dependencias

Puedes encontrar las versiones más recientes de estas dependencias en [Maven Central](https://mvnrepository.com). Simplemente busca el nombre del artefacto o grupo para obtener la última versión disponible.

#### Dependencias del Proyecto

Este proyecto utiliza tres librerías clave para la automatización de pruebas con Java.  
Cada una cumple un rol fundamental dentro del entorno de testing automatizado:

---

##### Selenium Java
Selenium es la librería principal que permite **interactuar directamente con navegadores web**.  
Con ella puedes abrir páginas, encontrar elementos, ejecutar clics, escribir texto o verificar resultados en la interfaz.  
Es el núcleo que conecta tu código con el navegador real (Chrome, Firefox, Edge, etc.), simulando las acciones del usuario final.

**Funciones principales:**
- Control del navegador mediante la API de WebDriver.
- Soporte para diferentes estrategias de localización (ID, CSS, XPath, etc.).
- Ejecución en entornos locales o remotos (como Selenium Grid).

---

##### WebDriverManager
WebDriverManager se encarga de **gestionar automáticamente los drivers** necesarios para ejecutar las pruebas.  
Esto significa que ya no tienes que descargar ni configurar manualmente archivos como `chromedriver.exe` o `geckodriver`.

**Ventajas:**
- Detecta la versión del navegador instalada.
- Descarga y configura automáticamente el driver compatible.
- Evita errores de compatibilidad entre versiones de navegador y Selenium.
- Simplifica la ejecución del proyecto en diferentes sistemas operativos.

---

##### TestNG
TestNG es el **framework de pruebas** que estructura y organiza la ejecución de los casos de test.  
Permite definir suites, dependencias entre pruebas y reportes automáticos de los resultados.

**Beneficios principales:**
- Permite usar anotaciones para el ciclo de vida del test (`@BeforeTest`, `@AfterTest`, etc.).
- Soporta ejecución paralela de pruebas.
- Genera reportes detallados y legibles.
- Facilita la integración con herramientas CI/CD como Jenkins o GitHub Actions.

---
> Estas tres dependencias conforman una base sólida para crear un framework de automatización moderno:

---

#### Instalación de Dependencias con Maven

Una vez creado el proyecto y configurado el `pom.xml`, instala las dependencias ejecutando en la terminal, dentro de la carpeta del proyecto:

```bash
mvn clean install
```

> Esto descargará todas las dependencias y compilará el proyecto por primera vez.

---

## Configuración del Entorno Android

### Paso 1: Instalar Android Studio

Android Studio no es solo un IDE, es la forma oficial de obtener:
1. Android SDK
2. Platform Tools (ADB)
3. Emuladores
4. APIs del sistema

- Windows y macOS
1.	Ve a la página oficial de [Android Studio](https://developer.android.com/)
2.	Descarga la versión estable
3.	Instala con las opciones por defecto
4.	Abre Android Studio al finalizar

> No necesitas programar en Android Studio, solo usar su ecosistema.


### Paso 2: Verificar instalación del Android SDK

Dentro de Android Studio:
1.	Abre Settings / Preferences
2.	y escribe "Android SDK"
3.	Verifica que estén instalados:

     -  Android SDK Platform
     -  Android SDK Platform-Tools
     -  Android SDK Build-Tools
     -  Emulator

> ⚠️ Si falta alguno, Appium no podrá comunicarse con el dispositivo.

### Paso 3:  Crear un Emulador Android (AVD)

1.	Abre, Android Studio / Tools / Device Manager
2.	Click en Create Device
3.	Selecciona un dispositivo (Pixel recomendado)
4.	Elige una imagen de sistema:

     - Android estable
     - Preferiblemente Google APIs
5.	Finaliza la creación

> No crees emuladores muy pesados
> Menos RAM = menos problemas
<div style="display: flex; gap: 10px;">
<img src="/Assets/01_Stage_1/01_WarmUp/device-manager-2.png" width="350"/>
<img src="/Assets/01_Stage_1/01_WarmUp/device-manager-1.png" width="350"/>
<img src="/Assets/01_Stage_1/01_WarmUp/device-manager-3.png" width="350"/>
</div>

### Paso 4: Levantar y validar el Emulador
1.	Inicia el emulador
2.	Espera a que cargue completamente
3.	Desbloquea la pantalla
4.	Verifica que responde como un dispositivo real

>Si el emulador no arranca bien, no sigas.
>Primero soluciona eso.

### Paso 5: Verificar ADB (Android Debug Bridge)

ADB es el idioma que Appium usa para hablar con Android.

🔹 Windows y macOS

Abre la terminal o CMD y ejecuta:

```bash

adb devices

```
Resultado esperado:

	-  El emulador aparece como device
	-  No como offline

> Si ADB no reconoce el emulador, Appium no funcionará.


### Paso 6: Configurar variables ANDROID_HOME / ANDROID_SDK_ROOT

#### 📌 Windows

Variables de entorno:
- ANDROID_HOME o ANDROID_SDK_ROOT
- Agregar al PATH:

        - platform-tools
        - emulator
        - tools

#### 📌 macOS

En .zshrc o .bashrc:

```bash

export ANDROID_SDK_ROOT=$HOME/Library/Android/sdk
export PATH=$PATH:$ANDROID_SDK_ROOT/platform-tools
export PATH=$PATH:$ANDROID_SDK_ROOT/emulator

```
Reinicia la terminal y valida:

```bash

adb version

```
Resultado esperado: algo parecido a esto:

```bash

Android Debug Bridge version 1.0.41
Version 35.0.2-12147458
Installed as /Users/macbookpro/Library/Android/sdk/platform-tools/adb
Running on Darwin 24.6.0 (arm64)

```

### Paso 7: Validación final del entorno Android

Antes de Appium, verifica este checklist:
-	✔ Android Studio abre sin errores
-	✔ SDK instalado
-	✔ Emulador inicia correctamente
-	✔ adb devices reconoce el emulador
-	✔ El emulador responde a acciones

Si todo esto funciona → tu Android está listo 🟢

**Importante**
1. No avances al código si el emulador falla
2. El 80% de problemas en mobile automation son setup
3. Un QA Mobile profesional valida su entorno antes de automatizar

----

## Instalacion de Appium Server y Appium Inspector

Documentación oficial de Appium:
- [Appium Docs](https://appium.io/docs/en/latest/intro/)
###  Prerrequisitos

Asumimos que ya tienes:
- Java instalado y variables configuradas
- Android SDK instalado
- Variables ANDROID_HOME y PATH correctas
- Emulador o dispositivo Android funcionando
- Node.js instalado

> Appium depende de Node.js, no es opcional.

### Instalación de Appium (Windows y macOS)

#### Paso 1: Instalar Appium Desktop
Se puede instalar Appium de dos formas:
1. Usando npm (Node Package Manager)
```bash
npm install -g appium
```
2. Usando Appium Desktop (recomendado para principiantes)
> Recomendamos usar Appium Desktop para facilitar la instalación y uso inicial.

Descarga Appium Desktop](https://github.com/appium/appium-desktop/releases):
•	Incluye:
•	Appium Server
•	Interfaz gráfica

> No necesitas instalar Appium por consola

⸻

#### Instalación de Appium Doctor (obligatorio)

Appium Doctor valida que tu entorno realmente funciona.

##### Instalar Appium Doctor

Desde terminal (Windows PowerShell o Terminal macOS):
```bash
npm install -g appium-doctor
```
> Verifica instalación:

```bash
appium-doctor --version
```

#### Validar entorno Android con Appium Doctor
Desde terminal, ejecuta:

```bash
appium-doctor --android
```
Appium Doctor revisará:
- Java
- Android SDK
- `adb`
- sdk tools
- sdk manager
- Emulador
- platform-tools
- builds tools

> No continúes hasta que todo esté en verde. ### Diagnostic for necessary dependencies starting ###

### Iniciar Appium Server (GUI)
hay dos formas de iniciar Appium Server:
1. Desde Appium Desktop (GUI)
2. Desde terminal (CLI)

    ```bash
    appium 
    ```
   > Recomendamos usar Appium Desktop para principiantes.

#### Abrir Appium Desktop
1. Abre Appium Desktop
2. Click en Start Server
3. El server se levanta por defecto en:
4. http://127.0.0.1:4723

Este puerto es el punto de comunicación entre:
- Tu framework (Serenity + Java)
- Appium Inspector
- El dispositivo Android

### Instalar driver android:

```
npm install appium-uiautomator2-driver
appium driver install uiautomator2
```

### ¿Qué hace Appium Server realmente?

Un poco más técnico

Appium Server:
- Es un servidor HTTP REST
- Escucha comandos WebDriver (POST, GET)
- Usa el protocolo W3C WebDriver

Para Android:
- Lanza UIAutomator2 Server dentro del dispositivo
- Se comunica vía ADB
- Traduce comandos como:

      - findElement
      - click
      - sendKeys

en acciones nativas del SO Android


### Appium Inspector: Configuración inicial

Appium Inspector es la herramienta visual para:
- Explorar la app móvil
- Probar localizadores
- Validar la estructura UI
- Generar código base
- Facilitar la creación de tests

#### Instalación de Appium Inspector
- Appium Inspector viene incluido con Appium Desktop
- Si usas Appium CLI, descarga Appium Inspector desde:

[Appium Inspector Releases](https://github.com/appium/appium-inspector/releases)

Para windows: `Appium-Inspector-2026.1.3-win-arm64.exe`
>Si no se muestra hacer click en "Show all "

#### Configuración de Appium Inspector para Android
1. Abre Appium Inspector
2. Configura una nueva sesión
3. Completa las Desired Capabilities (ver sección siguiente)
4. Inicia la sesión



Ejemplo mínimo Android:

```bash

{
  "platformName": "Android",
  "deviceName": "Android Emulator",
  "automationName": "UiAutomator2",
  "appPackage": "com.example.app",
  "appActivity": ".MainActivity"
}

```

> Si el Inspector abre la app → tu entorno está OK 🎉

## Capacidades Deseadas (Desired Capabilities)

Las Capabilities son un mapa de configuración que le dice a Appium:
1.	📱 Qué dispositivo usar
2.	🤖 Qué sistema operativo
3.	🧪 Cómo automatizar
4.	📦 Qué app abrir
5.	🔌 Cómo conectarse al dispositivo

>Sin capabilities correctas → Appium no sabe qué hacer.

###  Rol de las Capabilities en la Arquitectura

>  Las capabilities conectan el código con el dispositivo.

### Capabilities comunes para Android
| Capability        | Descripción                                      | Ejemplo                      |
|-------------------|--------------------------------------------------|------------------------------| 
| platformName      | Nombre del sistema operativo                      | "Android"                    |
| deviceName        | Nombre del dispositivo o emulador                 | "Android Emulator"
| automationName    | Motor de automatización                           | "UiAutomator2"               |
| app               | Ruta del APK a instalar.                         | "app": "/ruta/app.apk"           |
| appPackage        | Paquete de la app a automatizar                   | "com.example.app
| appActivity       | Actividad principal de la app                      | ".MainActivity"              |
| platformVersion   | Evita que Appium elija un Android incorrecto.     | "platformVersion": "13"                  |
| noReset           | Mantener el estado de la app entre sesiones       | true/false                   |
| fullReset         | Reinstalar la app en cada sesión                  | true/false
| newCommandTimeout | Tiempo de espera para nuevos comandos            | 60                           |
| autoGrantPermissions |  Acepta permisos automáticamente (cámara, ubicación).            |  true/false                           |

> Si ya esta la app instalada en el emulador, no es necesario usar la capability `app`.
> Solo `appPackage` y `appActivity` son suficientes para abrir la app existente.
> noReset=true evita que la app se reinstale o resetee entre sesiones.
> noReset=false fuerza a Appium a reinstalar la app cada vez.

### Ejemplo completo de Desired Capabilities para Android

```json
{
  "platformName": "Android",
  "deviceName": "Pixel_3a_API_30_x86",
  "automationName": "UiAutomator2",
  "appPackage": "com.example.myapp",
  "appActivity": ".MainActivity",
  "noReset": true,
  "newCommandTimeout": 120
}
```

>  Con esto, el 80% de los setups funciona.

### ❌ Errores comunes con Capabilities

- ❌ Usar nombres mal escritos
- ❌ Mezclar app con appPackage sin entender
- ❌ No definir automationName
- ❌ Copiar capabilities sin entenderlas

> Las capabilities no son código,
> son contratos con el sistema operativo.
> Si fallan → no es tu test, es el setup.


---

## Proyecto maven con las dependencias appium

En un proyecto Maven, debes agregar las dependencias necesarias para Appium en el archivo `pom.xml`. Aquí tienes un ejemplo de cómo hacerlo:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">

    <modelVersion>4.0.0</modelVersion>

    <groupId>com.qaxpert</groupId>
    <version>1.0-SNAPSHOT</version>

    <!-- ========== PROPIEDADES ========== -->
    <properties>
        <!-- Java -->
        <maven.compiler.source>11</maven.compiler.source>
        <maven.compiler.target>11</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>

        <!-- Dependencias -->
        <appium.version>8.6.0</appium.version>
        <junit.version>4.13.2</junit.version>

        <!-- Plugins -->
        <maven-compiler-plugin.version>3.11.0</maven-compiler-plugin.version>
        <maven-surefire-plugin.version>3.0.0</maven-surefire-plugin.version>
    </properties>
    <dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>org.seleniumhq.selenium</groupId>
                <artifactId>selenium-java</artifactId>
                <version>4.16.1</version>
            </dependency>
        </dependencies>
    </dependencyManagement>

    <!-- ========== DEPENDENCIAS ========== -->
    <dependencies>

        <!-- ===== APPIUM ===== -->
        <dependency>
            <groupId>io.appium</groupId>
            <artifactId>java-client</artifactId>
            <version>${appium.version}</version>
        </dependency>


        <!-- ===== JUNIT ===== -->
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>${junit.version}</version>
            <scope>test</scope>
        </dependency>

    </dependencies>

</project>


```

#### ¿Por qué usamos Java 11 si existe Java 17 o más nuevos?

Buena pregunta, y muy común.

> Porque es la opción más estable para Appium hoy.
- **Appium Java Client**: La librería principal para interactuar con Appium desde Java. Se comunica directamente con Appium Server

#### ¿Por qué en este proyecto NO instalamos Selenium directamente?

En este proyecto NO agregamos Selenium como dependencia directa en el pom.xml.

Y eso es totalmente intencional.

>Porque Appium Java Client YA incluye Selenium internamente.


#### Entonces… ¿sí usamos Selenium o no?

- ✔️ Sí se usa Selenium
- ❌ Pero no lo gestionamos nosotros

##### Appium:
- Usa Selenium (WebDriver)
- Lo incluye internamente
- Controla la versión compatible

> Tú solo trabajas con Appium.

### ¿Por qué Appium necesita Selenium y cómo trabajan juntos?

- Appium NO reemplaza a Selenium
- Appium usa el modelo de Selenium (WebDriver) para hablar con el dispositivo.
- Selenium no es solo “para web”.
- Selenium es un estándar de automatización.

####  Selenium = el lenguaje común (WebDriver)

Selenium define algo muy importante:

#### El protocolo WebDriver (W3C)

Ese protocolo dice cosas como:
- “Busca un elemento”
- “Haz click”
- “Escribe texto”
- “Espera a que algo aparezca”

> No dice cómo hacerlo, solo qué pedir.

#### Appium = la implementación mobile de WebDriver

Appium dice:

>“Yo voy a implementar WebDriver… pero para móviles”

Por eso:
-	Selenium define el contrato
-	Appium implementa ese contrato para:
- Android (UIAutomator2)
- iOS (XCUITest)


#### ¿Dónde entra Selenium Java en el proyecto?

Cuando usas:

```bash
AndroidDriver driver = new AndroidDriver(...);
```
Internamente pasa esto:
1.	`AndroidDriver` hereda de `RemoteWebDriver`
2.	`RemoteWebDriver` viene de **Selenium**

> Appium extiende Selenium, no lo reemplaza.

Por eso necesitas la dependencia: `selenium-java` en tu `pom.xml`.


---

## Checklist Final: Mi Máquina Está Lista

1. Sistema base
-  Java JDK 17 instalado y variables configuradas

```bash
java --version
```
2. Variables de entorno Java configuradas
3. Android Studio instalado
4. Android SDK instalado y actualizado

    -	Android Studio instalado
    -	SDK descargado (Platforms + Build Tools)
    -	Variables configuradas:
    -	ANDROID_HOME
    -	PATH incluye:
    -	platform-tools
    -    emulator

5. Variables ANDROID_HOME / ANDROID_SDK_ROOT configuradas
6. Emulador Android creado y funcionando
7. ADB reconoce el emulador
```bash
adb devices
 
```

8. Node.js instalado
```bash
node -v
npm -v 
```

9. Appium Server instalado (Appium Desktop o CLI)
10. Appium Doctor instalado y todo en verde
11. Appium Inspector instalado
12. Proyecto Maven creado con dependencias Appium y Selenium
13. Capabilities definidas para Android