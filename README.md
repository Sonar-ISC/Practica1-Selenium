# Practica 1 Selenium

Este repositorio es para practicar el uso de Selenium WebDriver con Java. Tambien que funcione como plantilla 
para proyectos futuros.

Los ejercicios propuestos son los siguientes:

## Dependencias Gradle

- Selenium WebDriver
- JUnit
## Material de apoyo

- [Selenium WebDriver](https://www.selenium.dev/documentation/en/webdriver/)
- [JUnit](https://junit.org/junit5/docs/current/user-guide/)
- [Gradle](https://docs.gradle.org/current/userguide/userguide.html)

## Ejercicios 

### Ejercicio 1 - Login

Ingresar a la página de [SauceDemo](https://www.saucedemo.com/) y realizar un login con los datos que se te proporcionen.

### Ejercicio 2 - Ejercicio propio

Realizar un ejercicio propio que involucre el uso de Selenium WebDriver con Java. De una pagina de su eleción, 
deben tener en cuenta que el enfoque es "Probar".

## Requisitos

Para poder ejecutar los ejercicios propuestos, es necesario tener instalado lo siguiente:

- Java 8 o superior
- Gradle
- Navegador Google Chrome
- ChromeDriver
- IDE de desarrollo (IntelliJ IDEA, Eclipse, NetBeans)

## Cosas basicas de Selenium

### WebDriver

WebDriver es una interfaz que permite la automatización de pruebas en navegadores web. Es una API que permite la
interacción con navegadores web. WebDriver es una herramienta que permite la automatización de pruebas en navegadores web.


### ChromeDriver

ChromeDriver es un controlador que se utiliza para la automatización de pruebas en navegadores web. ChromeDriver es una
implementación de WebDriver que permite la automatización de pruebas en Google Chrome.

### JUnit

JUnit es un marco de pruebas unitarias para el lenguaje de programación Java. JUnit es una herramienta que permite la
creación de pruebas unitarias en Java.

### Gradle

Gradle es una herramienta de automatización de compilación y construcción de proyectos. Gradle es una herramienta que
permite la automatización de tareas de compilación y construcción de proyectos.

### By

By es una clase que se utiliza para localizar elementos en una página web. By es una clase que permite la localización
de elementos en una página web.

```java
By button = By.id("id");
```

### WebElement

WebElement es una interfaz que representa un elemento en una página web. WebElement es una interfaz que permite la
interacción con elementos en una página web.

```
WebElement element = driver.findElement(By.id("id"));
```

Se puede interactuar con los elementos de la siguiente manera:

```
element.click();
element.sendKeys("Texto");
element.getText();
element.clear();
```

## Autor

- [Sebastian Agudelo - Co-Lider Sonar I.S.C](https://www.linkedin.com/in/sebastian-agudelo-morales-367970241/)

