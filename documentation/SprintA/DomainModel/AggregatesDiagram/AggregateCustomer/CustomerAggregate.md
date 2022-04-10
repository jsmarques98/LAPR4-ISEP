# AGGREGATE CUSTOMER

## 1. Technical decisions

###1.1 Aggregate

- We create "Aggregate Customer" because it will be needed to create and manage products.


- Also, because of consistent: if we keep "Customer" inside another aggregate like "Aggregate Order" and if we needed to delete some orders, we will have to delete customers too.


###1.2 Entities
###Product
We consider that "Customer" should be an entity because:
- It has a unique identifier (ID), and it is always unique because we won't have
two exactly the same customers


- It will be needed to manage and create customers in our application.



###1.3 Value objects

###ID

We consider that "ID" should be a value object because:

- It classifies the entity "Customer".


- It may follow some construction rules.

###Name
We consider that "Name" should be a value object because:

- It classifies the entity "Customer".


- It may follow some construction rules.

###Email
We consider that "Email" should be a value object because:

- It classifies the entity "Customer".


- It may follow some construction rules.


- It may not be as simple as a primitive data type.

###VATid
We consider that "VATid" should be a value object because:

- It classifies the entity "Customer".


- It may follow some construction rules.

###PhoneNumber
We consider that "PhoneNumber" should be a value object because:

- It classifies the entity "Customer".

- It may follow some construction rules.

###Birthdate
We consider that "Birthdate", even if it's optional, should be a value object because:

- It classifies the entity "Customer".

- It may follow some construction rules.

###Gender
We consider that "Gender", even if it's optional, should be a value object because:

- It classifies the entity "Customer".

###Address
We consider that "Address", even if it's optional, should be a value object because:

- It classifies the entity "Customer".
