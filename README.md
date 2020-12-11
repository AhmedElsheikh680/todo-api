# todo-api

Spring boot (RestfullAPI)

Technologies<br>
⦁ PostgreSQL Database <br>
⦁ Spring Web<br>
⦁ Spring Data JPA<br>
⦁ Spring Security<br>
⦁ JWT<br>
⦁ Postman(For Testing)<br>
⦁ Build Tool (i.e. Maven) <br>

## Instructions To Run Backend
1- Just Extract The BACKEND Folder to Intellij and run it as (Java Application) on port=8080.<br>
2- For Database You can Excute the sql file in your Sql Editor (it contain database creation statement) OR Just create the database(name=todo-spring,username=postgres,pass=adminadmin) Maunally And Run The Application And It will create the Tables With It Objects.<br>
3- Then You Can Test It Using Postman.<br>

== AppUser ==<br>
Login(POST:localhost:8080/api/v1/auth/login?userName=admin&password=admin)<br>
Login(POST:localhost:8080/api/v1/auth/login?userName=user&password=user)<br>

== Todo ==<br>
Return all Todos (GET : localhost:8080/api/v1/todos)<br>
Return Todos (GET : localhost:8080/api/v1/todos/{id})<br>
Add Todos (POST : localhost:8080/api/v1/todos) With Json Body <br>
Update Todos (PUT : localhost:8080/api/v1/todos) With Json Body <br>
Delete Todos (DELETE : localhost:8080/api/v1/todos/{id}) <br>
