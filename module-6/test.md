# Spring HTTP and REST API: Test (2019-10-10)

## 1. Theory

In your own words, answer the following:

### 1.1. What different parts is an HTTP `request` made of? _(10 points)_
* _Request line with HTTP method, URI and protocol version._
* _Zero or more headers._
* _An optional message body._

### 1.2. What different parts is an HTTP `response` made of? _(10 points)_
* _A status line with protocol version and response code_
* _Zero or more headers._
* _An optional message body._

### 1.3. When would it be appropriate for HTTP server to return a `201` response code? _(5 points)_
_When a new resource has been successfully created._

### 1.4. How would an HTTP server _signal_ a malformed request body to the client in a response? _(5 points)_
_`400 Bad request` status code (and an error message in body)._

## 2. Practice

Based on https://github.com/nsftx/java-bootcamp-2019/tree/beginner/module-6/todolist project, complete the following tasks:

### 2.1. Expose new `POST /users/{userId}/todos` API route by implementing controller method named `saveTodo`. _(15 points)_

### 2.2. Expose new `GET /users/{userId}/todos/{id}` API route by implementing controller method named `getTodo`. _(15 points)_

### 2.3. Expose new `PUT /users/{userId}/todos/{id}` API route by implementing controller method named `updateTodo`. _(20 points)_

### 2.4. Expose new `GET /users/{userId}/todos` API route by implementing controller method named `listTodos`. _(20 points)_

_For solutions of these 4 excersises take a look at the latest revision (278c07cef995459860da6870d7e23aa09fba7f71) of https://github.com/nsftx/java-bootcamp-2019/blob/beginner/module-6/todolist/src/main/java/ba/spark/bootcamp/rest/resource/TodoResource.java controller class._
