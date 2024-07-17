# ChallengeForoAPI
ForoHub es un espacio donde los usuarios de una plataforma pueden hacer preguntas y compartir respuestas sobre diversos temas. Este proyecto se centra en el desarrollo de una API REST utilizando Spring para gestionar los tópicos y respuestas.

Funcionalidades de la API
Nuestra API permite a los usuarios realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre tópicos y respuestas. Las funcionalidades principales incluyen:

Crear un nuevo tópico o respuesta
Mostrar todos los tópicos o respuestas
Mostrar un tópico o respuesta específico
Actualizar un tópico o respuesta
Eliminar un tópico o respuesta
Configuración
Variables de Entorno
Para que la aplicación funcione correctamente, se deben configurar las siguientes variables de entorno:

VARIABLE	DESCRIPCIÓN
DB_HOST	Ruta a la base de datos con su puerto
DB_NAME	Nombre de la base de datos: "liter_alura"
DB_USR	Usuario de la base de datos
DB_PASSWORD	Contraseña de acceso a la base de datos
Comenzando 🚀
Estas instrucciones te permitirán obtener una copia del proyecto en funcionamiento en tu máquina local para desarrollo y pruebas.

Pre-requisitos 📋
IntelliJ IDEA
Insomnia (para pruebas)
PgAdmin4
Enlaces de descarga:

IntelliJ IDEA
Insomnia
PostgreSQL
Instalación 🔧
Crear la Base de Datos: Antes de iniciar el servicio, crea una nueva base de datos con el nombre: foro_hub.

Clonar el Repositorio:

bash
Copiar código
git clone https://github.com/SamuelVelascoH/ForoHub-API-REST.git
Abrir el Proyecto: Abre el proyecto en IntelliJ IDEA.

Configurar Variables: Verifica los siguientes datos en el archivo .properties:

spring.datasource.username=${SU_USUARIO_DE_SU_DB}
spring.datasource.password=${LA_CONTRASEÑA_DE_SU_DB}
spring.datasource.url=jdbc:postgresql://localhost:SU_RUTA/foro_hub
api.security.secret=${JWT_SECRET:(12345 por defecto)}
Iniciar el Servicio:

Uso de la API
Usuarios
Crear un Usuario:

Método: POST
URI: http://localhost:8080/user
Cuerpo:
json
Copiar código
{
   "email" : "tu email",
   "userName" : "tu usuario",
   "password" : "tu contraseña"
}
Actualizar un Usuario:

Método: PUT
URI: http://localhost:8080/user/{id}
Cuerpo:
json
Copiar código
{
   "id" : "id del usuario",
   "email" : "tu nuevo email",
   "userName" : "tu nuevo usuario",
   "password" : "tu nueva contraseña"
}
Listar Todos los Usuarios:

Método: GET
URI: http://localhost:8080/user
Obtener un Usuario por ID:

Método: GET
URI: http://localhost:8080/user/{id}
Eliminar un Usuario:

Método: DELETE
URI: http://localhost:8080/user/{id}
Tópicos
Crear un Tópico:

Método: POST
URI: http://localhost:8080/topics
Cuerpo:
json
Copiar código
{
   "title" : "tu titulo",
   "body" : "tu tema",
   "courseName" : "tu nombre de curso"
}
Actualizar un Tópico:

Método: PUT
URI: http://localhost:8080/topics/{id}
Cuerpo:
json
Copiar código
{
   "id" : "id del topico",
   "title" : "tu nuevo titulo",
   "body" : "tu nuevo tema",
   "courseName" : "nombre del curso"
}
Listar Todos los Tópicos:

Método: GET
URI: http://localhost:8080/topics
Obtener un Tópico por ID:

Método: GET
URI: http://localhost:8080/topics/{id}
Eliminar un Tópico:

Método: DELETE
URI: http://localhost:8080/topics/{id}
Respuestas
Crear una Respuesta:

Método: POST
URI: http://localhost:8080/response/{id}
Cuerpo:
json
Copiar código
{
   "id" : "id del topico",
   "responseTitle": "el titulo de tu respuesta",
   "body": "tu respuesta"
}
Actualizar una Respuesta:

Método: PUT
URI: http://localhost:8080/response/{id}
Cuerpo:
json
Copiar código
{
   "id" : "id de la respuesta",
   "responseTitle": "el titulo de tu nueva respuesta",
   "body": "tu nueva respuesta"
}
Listar Todas las Respuestas:

Método: GET
URI: http://localhost:8080/response
Obtener una Respuesta por ID:

Método: GET
URI: http://localhost:8080/response/{id}
Eliminar una Respuesta:

Método: DELETE
URI: http://localhost:8080/response/{id}
Autenticación y Pruebas
Para ejecutar las pruebas, la API usa un token de seguridad para cada usuario (JWT). Deberás autenticarse para poder realizar las pruebas. El usuario y la contraseña deben estar previamente registrados en la base de datos con la contraseña cifrada utilizando Bcrypt.

Autenticar un Usuario
URI: http://localhost:8080/login
Cuerpo:
json
Copiar código
{
   "login" : "tu usuario",
   "key" : "tu contraseña"
}
Generador de Hash Bcrypt
Generador de hash Bcrypt
Ejecución de Pruebas
Para un uso completo de la API, autentícate como usuario de tipo UserApi. Esto te permitirá crear, actualizar y eliminar usuarios de tipo UserForo. Asegúrate de que tu usuario y contraseña estén guardados en la base de datos en la tabla users_api.
