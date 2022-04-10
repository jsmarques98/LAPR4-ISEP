# AGGREGATE PRODUCT

## 1. Technical decisions

###1.1 Aggregate

- We create "Aggregate Order" because it will be needed to manage and create Orders.


- Also, because of consistent: if we keep "Order" inside another aggregate like "Aggregate Client" and if we needed to delete some clients, we will have to delete orders too.


###1.2 Entities
###Order 
We consider that "Order" should be an entity because:
- It has an identifier , and it is always unique even if there's another entity with the same properties (another client with an order with the same proprieties ).
  

- It will be needed to manage Orders in our application (remove and create orders).

###Order Item

We consider that "Order Item" should be an entity because:

- To remove an N to N association between "Product" and "Order" , because the same product can be added to N orders, and an order can have N products.


- Also, because we need to register the price of the product in orders.



###1.3 Value objects

###Price

We consider thar "Price" should be a value object because:

- It classifies the entity "Order" and "OrderItem".


- It may follow some construction rules.




