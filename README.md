# shopping-cart-microservices
## How to run?

### Build all modules:

`shopping-cart-microservices> ./mvnw clean package -DskipTests=true`

### Start infrastructure modules in docker:

**The simplest way to run all the services in Docker:**

`shopping-cart-microservices> ./run.sh start_all`

**To start only infrastructure services (mysqldb, rabbitmq, config-server, service-registry, hystrix-dashboard) in docker:**

`shopping-cart-microservices> ./run.sh start_infra`

**Start each microservice either in local or in docker:**

**Local:** `shopping-cart-microservices/catalog-service> ./mvnw spring-boot:run`

**Docker:** `shopping-cart-microservices> ./run.sh start <service>`

Ex: `shopping-cart-microservices> ./run.sh start catalog-service`


* MySQL container:
     * hostname: mysqldb
     * Ports : 3306:3306 (<host_port>:<container_port>)
     * Username/Password: root/admin

* RabbitMQ:
     * hostname: rabbitmq
     * Ports: 5672:5672, 15672:15672
     * Admin UI: http://localhost:15672
     * Username/password: guest/guest

* Vault:
    * hostname: vault
    * Ports: 8200:8200
    * Root token: 934f9eae-31ff-a8ef-e1ca-4bea9e07aa09

* config-server:
    * hostname: config-server
    * Ports: 8888:8888
    * URL: http://localhost:8888/

* service-registry:
    * hostname: service-registry
    * Ports: 8761:8761
    * URL: http://localhost:8761/
    
* hystrix-dashboard:
    * hostname: hystrix-dashboard
    * Ports: 8788:8788
    * URL: http://localhost:8788/hystrix

* catalog-service:
    * hostname: catalog-service
    * Ports: 18181:8181
    * URL: http://localhost:18181
    
* inventory-service   
    * hostname: inventory-service
    * Ports: 18282:8282
    * URL: http://localhost:18282
     
* shoppingcart-ui    
    * hostname: shoppingcart-ui
    * Ports: 18080:8080
    * URL: http://localhost:18080
