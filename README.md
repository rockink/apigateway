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


## Check out the tags
Tags refer to a milestone for a project. Refer to it if:
1. `v1` contains plain project. 


## Connected Services
ApiGateway is a part of microservice architecture to create 
a e-commerce website. 


##### Product Service
``Product`` provides the information about the products. 
Api-gateway proxies the request to this service when it faces path `/product`

One way to connect to this service is directly via docker image.

1. Create a network if you haven't:
`docker network create -d bridge mynetwork`
2. Run the container. `docker run -e "JAVA_TOOL_OPTIONS=-Xms200m -Xmx200m" -p 8080:8080 --name product --network mynetwork rockink/product:v1`

