# Spring Boot Docker

##### To run the application follow the below steps:

1. `cd workshop`
2. build project using docker profile `mvn clean install -Pdocker`
3. build command should build a local image of the app in your local docker cache.
4. verify if the images does exists `docker images` it should be with name `workshop-ws:latest`
5. in the same dir run `docker-compose up`
6. app uses port `9898` -> sample request `http://localhost:9898/BHR`

