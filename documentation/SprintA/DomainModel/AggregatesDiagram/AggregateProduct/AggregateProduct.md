# AGGREGATE PRODUCT

## 1. Technical decisions

###1.1 Aggregate

- We create "Aggregate Product" because it will be needed to create and manage products.


- Also, because of consistent: if we keep "Product" inside another aggregate like "Aggregate Order" and if we needed to delete some orders, we will have to delete products too.


###1.2 Entities
###Product
We consider that "Product" should be an entity because:
- It has a unique identifier (UniqueInternalCode), 
  and it is always unique even if there's another entity with the same properties.
  

- It will be needed to manage and create products in our application.



###1.3 Value objects

###Unique Internal Code

We consider thar "Unique Internal Code" should be a value object because:

- It classifies the entity "Product".


- It may follow some construction rules.

###Production Code
We consider thar "Production Code" should be a value object because:

- It classifies the entity "Product".


- It may follow some construction rules.

###Brand
We consider that "Brand" should be a value object because:

- It classifies the entity "Product".


- It may follow some construction rules.


- It may not be as simple as a primitive data type.

###Reference
We consider that "Reference" should be a value object because:

- It classifies the entity "Product".


- It may follow some construction rules.

###Volume
We consider that "Volume" should be a value object because:

- It classifies the entity "Product".

###Pictures
We consider that "Pictures" should be a value object because:

- It classifies the entity "Product".

###Weight
We consider that "Weight" should be a value object because:

- It classifies the entity "Product".

###Base Price
We consider that "Base Price" should be a value object because:

- It classifies the entity "Product".


- It may not be as simple as a primitive data type.



###Barcode
We consider that "Barcode" should be a value object because:

- It classifies the entity "Product".


- It may follow some construction rules.


###Description
We consider that "Description" should be a value object because:

- It classifies the entity "Product".


- It may follow some construction rules.