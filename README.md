# darshan.springcloud
SpringCloud Test

Steps to run the project::
1. Clone the project ou your local machine
2. Maven Build the project
3. Run as Spring Boot Application (This will start your application on default port 8080)
4. Hit the APIs exposed by application using curl/postman or any other tool.
5. Below are the sample APIs to call

- curl -H "Content-Type: text/plain" http://localhost:8080/function -d "Message"
- curl -H "Content-Type: text/plain" http://localhost:8080/consume -d "Message"
- curl -H "Content-Type: text/plain" http://localhost:8080/supply

- curl -H "Content-Type: text/plain" http://localhost:8080/functionTest -d "Message"
