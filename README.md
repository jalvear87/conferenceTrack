# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.3.2/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.3.2/maven-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.3.2/reference/htmlsingle/index.html#using.devtools)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.

## Steps
1. Open the MAVEN project with an IDE
2. Run the project
3. The rest service is deployed on port 8100
4. Swagger interface Conference for test
    Url Swagger: http://localhost:8100/swagger-ui/index.html or 
   Postam Aplication Test API method: POST
    Url: http://localhost:8100/conference
5. Json example:
[
  {
    "title": "Java Sprint",
    "duration": 30
  },
  {
    "title": "Java Sprint Boot",
    "duration": 30
  },
  {
    "title": "Keycloac",
    "duration": 45
  },
  {
    "title": "Spring Aplication",
    "duration": 30
  },
   {
    "title": "Api Gateway",
    "duration": 45
  },
   {
    "title": "Eureka",
    "duration": 45
  },
   {
    "title": "React native",
    "duration": 45
  },
  {
    "title": "JAVA 17",
    "duration": 60
  },
  {
    "title": "Ruby on Rails",
    "duration": 30
  },
  {
    "title": "Writing Fast Tests Against Enterprise Rails",
    "duration": 60
  }
]


### 1. Ejecución de Construcción de la Imagen Docker a partir del .jar
```shell
docker build -t conference_image --no-cache --build-arg JAR_FILE=target/*.jar .
```Windows 
docker build -t conference_image --no-cache --build-arg JAR_FILE=target/conference-0.0.1-SNAPSHOT.jar .
```
### 2. Ejecución del Contenedor Docker 
```shell
docker run -d -p 8100:8100 --name conference_container conference_image:latest
