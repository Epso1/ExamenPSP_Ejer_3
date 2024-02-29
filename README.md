# API de números aleatorios

## Descripción

Esta es una API desarrollada con Java y Spring Boot para trabajar con números aleatorios. La API tiene los siguientes endpoints:

- `GET /random/numbers`: Devuelve un listado de 100 números aleatorios.
- `GET /random/number/{d}`: Devuelve un número aleatorio que tendrá `d` dígitos.
- `PUT /random/number`: Recibe un número aleatorio (JSON en el body) y devuelve un número aleatorio (JSON en el body) con el mismo número de dígitos que el número recibido.

El JSON para cada número aleatorio es:

```json
{
    "random": 12345
}
```

## Requisitos del sistema

- Java 11 o superior
- Maven 3.6.3 o superior
- IntelliJ IDEA 2023.2.2 o superior

## Instalación en IntelliJ IDEA

1. Clona el repositorio de GitHub en tu máquina local.
2. Abre IntelliJ IDEA.
3. Haz clic en `File` > `Open`.
4. Navega hasta el directorio donde clonaste el repositorio y selecciona el archivo `pom.xml`.
5. Haz clic en `Open as Project`.
6. IntelliJ IDEA importará el proyecto y comenzará a descargar las dependencias necesarias.

## Uso

Para iniciar la aplicación, sigue estos pasos:

1. En IntelliJ IDEA, abre el archivo `Practica5Ejer3Application.java`.
2. Haz clic con el botón derecho en el editor de código y selecciona `Run 'Practica5Ejer3Application'`.
3. La aplicación comenzará a ejecutarse y estará disponible en `http://localhost:8080`.

Para interactuar con la API, puedes usar una herramienta como [Postman](https://www.postman.com/) o [RESTer](https://chrome.google.com/webstore/detail/rester/eejfoncpjfgmeleakejdcanedmefagga?hl=en). Aquí tienes algunos ejemplos de cómo usar los endpoints:

- Para obtener 100 números aleatorios, realiza una solicitud GET a `http://localhost:8080/random/numbers`.
- Para obtener un número aleatorio con `d` dígitos, realiza una solicitud GET a `http://localhost:8080/random/number/{d}`, reemplazando `{d}` con el número de dígitos que deseas.
- Para enviar un número aleatorio y recibir otro con el mismo número de dígitos, realiza una solicitud PUT a `http://localhost:8080/random/number` con el siguiente cuerpo de solicitud:

```json
{
    "random": 12345
}
```

Reemplaza `12345` con el número que deseas enviar.