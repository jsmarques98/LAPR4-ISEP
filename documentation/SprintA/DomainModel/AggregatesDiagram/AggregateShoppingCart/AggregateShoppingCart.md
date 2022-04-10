# AGGREGATE PRODUCT

## 1. Technical decisions

###1.1 Aggregate

- We create "Aggregate Shopping Cart" because it will be needed to manage Shopping Carts.


- Also, because of consistent: if we keep "ShoppingCart" inside another aggregate like "Aggregate Order" and if we needed to delete some orders, we will have to delete the client's Shopping Cart too.


###1.2 Entities
###Shopping Cart
We consider that "Shopping Cart" should be an entity because:
- It has an identifier , and it is always unique even if there's another entity with the same properties (another client with a shopping cart with the same proprieties ).
  

- It will be needed to manage Shopping Carts in our application (remove and add items).

###Shopping Cart Item

We consider that "Shopping Cart Item" should be an entity because:

- To remove an N to N association between "Product" and "Shopping Cart" , because the same product can be added to N shopping carts, and a shopping cart can have N products.


- Also, because we need to register the addition date of the product to the shopping cart to sort shopping cart products by the addiction date.



###1.3 Value objects

###Quantity

We consider thar "Quantity" should be a value object because:

- It quantifies the entity "ShoppingCartItem".


- It may follow some construction rules.


###Addition Date

We consider thar "Addition Date" should be a value object because:

- It classifies the entity "ShoppingCartItem".


- It may follow some construction rules.

