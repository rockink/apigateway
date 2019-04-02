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
##### Building Docker image (Optional)
If you want to build Docker image, you can do so. 

In `pom.xml`, configure the `<dockerImage>` property value, 
which is currently set as *rockink/apigateway:v2Static* 
and then build using `mvn compile jib:dockerBuild`


## Running all services 

##### Run Docker Image (via Docker Hub Image)
##### Create a network if you haven't:
`docker network create -d bridge mynetwork`
##### [Run the Api-Gateway](https://github.com/rockink/apigateway/tree/v2.0-static) 
`docker run -e "JAVA_TOOL_OPTIONS=-Xms200m -Xmx200m" -p 8090:8090 --name apiGateway --network mynetwork rockink/apigateway:v2Static`

##### [Run Product Service](https://github.com/rockink/products) 
`docker run -e "JAVA_TOOL_OPTIONS=-Xms200m -Xmx200m" -p 8080:8080 --name product --network mynetwork rockink/product:v1`


##### [Run Static Service](https://github.com/rockink/shopper-react/tree/v2.0)
`docker run -d -p 80:80 --name static --network mynetwork  rockink/shopper:v2`
