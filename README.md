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



