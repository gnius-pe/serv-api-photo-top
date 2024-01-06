# serv-api-photo-top

Un servicio GET para la clasificacion top de las fotos publicas de foto bid

## Tecnologías Utilizadas

- Java jdk-17
- Spring Boot 3
- Maven
- MongoDB

## Configuración del Entorno y Prerrequisitos
Asegúrate de tener instalados los siguientes componentes en tu entorno de desarrollo antes de comenzar:

- [Git](https://git-scm.com/downloads)
- [Maven](https://maven.apache.org/download.cgi)
- [Java jdk-17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/)

## Instrucciones de Uso

Sigue estos pasos para ejecutar la aplicación en tu entorno local:

#### Clonar el repositorio en tu máquina local
```
git clone https://github.com/gnius-pe/serv-api-photo-top.git
```
#### Navegar al directorio del proyecto
```
cd serv-api-photo-top
```
#### Limpia y empaqueta el proyecto utilizando Maven
```
mvn clean package
```
#### inicia la aplicación Spring Boot
```
mvn spring:run
```
## Base URL

- [http://localhost:8090](http://localhost:8090)

### Campos de la informacion de la publicacion

| Campo         | Descripción                              |
|---------------|------------------------------------------|
| `id`          | Identificador único de la publicacion.   |
| `description` | Descripción detallada de la publicacion. |
| `image`       | Objeto de las propiedades de la imagen   |

Destalles del Objeto image

| image    | Descripción                                               |
|----------|-----------------------------------------------------------|
| `id`     | Identificador único de imagen en el servidor de archivos. |
| `public_id` | Identificador de la imagen.                               |
| `secure_url`  | url de acceso directo a la imagen .jpg                    |

## Recursos Adicionales

Aquí hay algunos recursos adicionales que podrían ser útiles:


- [Documentacion de open jdk 17](https://docs.oracle.com/en/java/javase/17/docs/api/)
- [Documentacion de Spring boot](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)
- [Documentacion de Spring Data MongoDB](https://spring.io/projects/spring-data-mongodb)
- [Documentacion de Maven](https://maven.apache.org/guides/getting-started/)
- [Licencia de estudiante para IntelliJ IDEA](https://www.youtube.com/watch?v=cnEJxLxOcds)