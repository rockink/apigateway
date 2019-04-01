## ApiGateway
This project is supposed to be an API-Gateway for the shopping app. 
Behind this api-gateway, there are microservices this api-gateway 
is supposed to call. 

## Developing it 
This is done via `mvn spring-boot:run` command, or running through IDE. 


## Zuul integration 
Zuul is the api-gateway that we are going to use. 
In order to see the power of Zuul, we will need to create different 
microservices, which will then be called by Zuul based on path and
different configurations. 

## Current Architecture 
![image](https://user-images.githubusercontent.com/8319308/55299897-16765680-5403-11e9-8bab-a471f58fa42a.png)

The microservices are discussed below. 



## Check out the tags
Tags refer to a milestone for a project. Refer to it if:
1. `v1` contains plain project. 
2. `assoc-product-micserv` - connects to Product microservice 
3. `first-docker-image` creates first docker image


## Connected Services
ApiGateway is a part of microservice architecture to create 
a e-commerce website. 


## Docker 
##### Build Docker image (Optional)
If you want to build Docker image, you can do so. 
In `pom.xml`, configure the `<dockerImage>` property value, and then run `mvn compile jib:dockerBuild`


##### Run Docker Image (via Docker Hub Image)
We can run api-gateway in dokcker following the commands:
1. Create a network if you haven't:
`docker network create -d bridge mynetwork`
2. Run the container. `docker run -e "JAVA_TOOL_OPTIONS=-Xms200m -Xmx200m" 
-p 8090:8090 --name apiGateway --network mynetwork rockink/apigateway:v2Static`



## Product Service
``Product`` provides the information about the products. 

The GitHub project for this is: 
`https://github.com/rockink/products`

Api-gateway proxies the request to this service when it faces path `/product`

One way to connect to this service is directly via docker image.

1. Create a network if you haven't:
`docker network create -d bridge mynetwork`
2. Run the container. `docker run -e "JAVA_TOOL_OPTIONS=-Xms200m -Xmx200m" -p 8080:8080 --name product --network mynetwork rockink/product:v1`


## Static Service 
`Static` service serves the React based static microservice. 
The project is hosted in `https://github.com/rockink/shopper-react`

