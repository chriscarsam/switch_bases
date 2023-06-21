# Conexión a dos bases de datos en Spring
Conexión a dos bases de datos(MySQL y PostgreSQL) en Spring

## Tecnologías Utilizadas:

- [OpenJDK JDK 17](https://openjdk.org/projects/jdk/17/)
- [IntelliJ IDEA Community Edition](https://www.jetbrains.com/idea/download/#section=linux)
- [MySQL](https://dev.mysql.com/downloads/mysql/)
- [PosgreSQL](https://www.postgresql.org/)
- [Docker](https://hub.docker.com/)
- [DBeaver](https://dbeaver.io/)

## Estructura del proyecto:
![Screenshot from 2023-06-21 17-45-35](https://github.com/chriscarsam/switch_bases/assets/28877424/00fccfc6-9209-4b26-a5d3-f1d558b1a287)

## Docker bases
![Screenshot from 2023-06-21 18-04-51](https://github.com/chriscarsam/switch_bases/assets/28877424/cedf8a71-c5df-413f-8286-eb29594665ea)


## Configuración del archivo (application.properties)

```properties
#properties de postgres
postgres.datasource.jdbc-url=jdbc:postgresql://172.17.0.3:5432/swichdb_one
postgres.datasource.username=postgres
postgres.datasource.password=postgres2016
postgres.datasource.driver-class-name=org.postgresql.Driver

postgres.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect

#properties de mysql
mysql.datasource.jdbc-url=jdbc:mysql://172.17.0.2/swichdb_two
mysql.datasource.username=user
mysql.datasource.password=clave
mysql.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

mysql.jpa.database-platform=org.hibernate.dialect.MySQLDialect

#spring.jpa.hibernate.ddl-auto=update
```

## 📝 Commits realizados:
Link: https://github.com/chriscarsam/switch_bases/commits/master

---

Basada en la implementacion de Lalo Ponse : https://www.youtube.com/watch?v=iE_o8viSbkc
