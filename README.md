# ForoHub API

## Descripción del Proyecto

ForoHub API es una API REST desarrollada con Spring Boot para gestionar un foro de discusión. Permite a los usuarios realizar operaciones CRUD en temas, autenticación basada en JWT para proteger las operaciones sensibles y está integrada con una base de datos PostgreSQL para persistencia de datos.

## Funcionalidades

- **Listar todos los temas:** `GET /api/topics`
- **Obtener un tema por ID:** `GET /api/topics/{id}`
- **Crear un nuevo tema:** `POST /api/topics`
- **Actualizar un tema existente:** `PUT /api/topics/{id}`
- **Eliminar un tema:** `DELETE /api/topics/{id}`

## Requisitos Previos

Asegúrate de tener instalado lo siguiente antes de ejecutar la aplicación:

- Java 17
- Maven
- PostgreSQL

## Configuración

### Configuración de la Base de Datos

Asegúrate de tener PostgreSQL instalado y configurado localmente. Luego, configura las siguientes propiedades en `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/forohub_db
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.datasource.driver-class-name=org.postgresql.Driver

spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
```
