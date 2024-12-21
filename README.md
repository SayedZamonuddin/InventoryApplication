### API Requests
```bash
# Swagger / Health Check  
GET http://localhost:8080/swagger-ui/index.html  

# Products  
GET http://localhost:8080/api/products  
Authorization: Basic YWRtaW46YWRtaW4xMjM=  
Accept: application/json  

POST http://localhost:8080/api/products  
Authorization: Basic YWRtaW46YWRtaW4xMjM=  
Content-Type: application/json  

{
  "name": "Test Product A",
  "price": 25.50,
  "categoryId": 2,
  "quantity": 50
}

GET http://localhost:8080/api/products/2  
Authorization: Basic YWRtaW46YWRtaW4xMjM=  
Accept: application/json  

PUT http://localhost:8080/api/products/2  
Authorization: Basic YWRtaW46YWRtaW4xMjM=  
Content-Type: application/json  

{
  "name": "Modified Product B",
  "price": 30.00,
  "categoryId": 2,
  "quantity": 75
}

DELETE http://localhost:8080/api/products/2  
Authorization: Basic YWRtaW46YWRtaW4xMjM=  

GET http://localhost:8080/api/products  
Authorization: Basic dXNlcjp1c2VyMTIz  
Accept: application/json  

POST http://localhost:8080/api/products  
Authorization: Basic dXNlcjp1c2VyMTIz  
Content-Type: application/json  

{
  "name": "Unauthorized Product",
  "price": 15.00,
  "categoryId": 1,
  "quantity": 20
}

# Categories  
POST http://localhost:8080/api/categories  
Authorization: Basic YWRtaW46YWRtaW4xMjM=  
Content-Type: application/json  

{
  "name": "Books"
}

GET http://localhost:8080/api/categories/3  
Authorization: Basic YWRtaW46YWRtaW4xMjM=  
Accept: application/json  

PUT http://localhost:8080/api/categories/3  
Authorization: Basic YWRtaW46YWRtaW4xMjM=  
Content-Type: application/json  

{
  "name": "Updated Books"
}

DELETE http://localhost:8080/api/categories/3  
Authorization: Basic YWRtaW46YWRtaW4xMjM=  

# Inventory  
POST http://localhost:8080/api/inventory/add/3  
Authorization: Basic YWRtaW46YWRtaW4xMjM=  
Content-Type: application/json  

{
  "quantity": 30
}

POST http://localhost:8080/api/inventory/deduct/3  
Authorization: Basic YWRtaW46YWRtaW4xMjM=  
Content-Type: application/json  

{
  "quantity": 10
}

GET http://localhost:8080/api/inventory/stock-level/3  
Authorization: Basic YWRtaW46YWRtaW4xMjM=  

GET http://localhost:8080/api/inventory/low-stock?threshold=5  
Authorization: Basic YWRtaW46YWRtaW4xMjM=  
