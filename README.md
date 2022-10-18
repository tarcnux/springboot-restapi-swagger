# springboot-restapi-swagger
Exemplo de uma simples API REST documentada com [Swagger](http://localhost:8080/swagger-ui.html)

usuario-controller
Usuario Controller

## GET
### /users
  getUsers

## POST
### /users
  cadastraUser
  ```
  {
    "id": 0,
    "login": "string",
    "password": "string"
  }
  ```

## PUT
### /users
  atualizaUser
  ```
  {
    "id": 0,
    "login": "string",
    "password": "string"
  }
  ```

## GET
### /users/{id}
  getOne

## DELETE
### /users/{id}
  deleteUser

## Models
```
Usuario {
  id	integer($int32)
  login	string
  password	string
}
```
