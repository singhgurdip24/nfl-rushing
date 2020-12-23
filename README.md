### Installation and running this solution

# Explanation of application architecture :-

1. Backend: This application uses Spring Boot at the backend for the api. The reason for using the Spring Boot is because it is very easy to quickly design REST API using spring boot. It is also one of the most popular opinionated framework for Java application development.

2. Front end: The front end is based on React. I have built a minimalistic design for the front end using the most reusable components.

3. Database: Currently, I am not using any database and the api is reading the data from the input file provided "rushing.json". However, the database can be added with very less time with spring boot.

# Usage (Running the Application) :-
1. Install the docker on your system if you haven't already.
2. Clone the github repository.
```bash
git clone https://github.com/singhgurdip24/nfl-rushing.git
```
3. Run the app using following command.
```bash
docker-compose up --build
```
4. To access the application, open the following link in your browser
```
http://localhost/
```
# Screenshots

1. Front end screenshot:
![alt text](https://github.com/singhgurdip24/nfl-rushing/blob/main/screenshots/Front%20end.png?raw=true)

2. Spring application running:
![alt text](https://github.com/singhgurdip24/nfl-rushing/blob/main/screenshots/Docker%20screenshot.png?raw=true)
