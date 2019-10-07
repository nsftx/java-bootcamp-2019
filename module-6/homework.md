# Homework
Create a new SpringBoot application that will expose an HTTP API with help of Spring Web package.

## 1. Movie class
* Create a Movie class that has three private members:
  * int id - the ID of a single movie resource
  * String name - the name of the movie
  * int rating - the rating of the movie (from 1 to 10)
* Create getter methods for all member variables
* Create a contructor that takes three parameters and initializes a new Movie object

## 2. MovieController
* Create a new rest controller class for resource Movie called MovieController,
* Add a private static member that will hold a list of movie objects and
initialize it with 4 Movie objects.

**Hint:**
```
//inside MovieController.java

private static List<Movie> movies;

static {
	movies = new ArrayList<>();
	movies.add(new Movie(1, "Jocker", 8));
	movies.add(new Movie(2, "It: Chapter Two", 7));
	movies.add(new Movie(3, "Ad Astra", 7));
	movies.add(new Movie(4, "Rambo: Last blood", 6));
}
```

### 2.1. Expose a new GET route `/movies` that will return a list of movie objects in JSON representation

* An example request would be:
```
GET http://localhost:<port>/movies
```
* Response should be:
```
200 OK
```
```
[
	{
	  "id": 1,
	  "name": "Jocker",
	  "rating": 8
	},
	{
	  "id": 2,
	  "name": "It: Chapter Two",
	  "rating": 7
	},
	{
	  "id": 3,
	  "name": "Ad Astra",
	  "rating": 7
	},
	{
	  "id": 4,
	  "name": "Rambo: Last blood",
	  "rating": 6
	}
]
```

### 2.2. Support a new [optional] query parameter `rating` that will be used to filter the Movie collection and return only Movies with the rating equal to the given value.

* An example request would be:
```
GET http://localhost:<port>/movies?rating=7
```
* Response should be:
```
HTTP 1.1 200 OK
```

```
[
	{
	  "id": 2,
	  "name": "It: Chapter Two",
	  "rating": 7
	},
	{
	  "id": 3,
	  "name": "Ad Astra",
	  "rating": 7
	}
]
```

### 2.3. Expose a new GET route `/movies/{id}` that will return a single movie object in JSON representation
* An example request would be:
```
GET http://localhost:<port>/movies/2
```
* Response should be:
```
HTTP 1.1 200 OK
```

```
{
  "id": 2,
  "name": "It: Chapter Two",
  "rating": 7
}
```