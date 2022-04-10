# AGGREGATE CATEGORY

## 1. Technical decisions

###1.1 Aggregate

- We create "Aggregate Category" because it will be needed to manage and create Categories.


- Also, because of consistent: if we keep "Category" inside another aggregate like "Aggregate Product" and if we needed to delete some products, we will have to delete categories too.


###1.2 Entities
###Category 
We consider that "Category" should be an entity because:
- It has an identifier , and it is always unique even if there's another entity with the same properties.
  

- It will be needed to manage Categories in our application (remove and create Categories).

###Super Category

We consider that "Super Category" should be an entity because:

- It is the same as entity Category. Categories can have or not a super Category.


###1.3 Value objects

###Description

We consider thar "Description" should be a value object because:

- It classifies the entity "Category".


- It may follow some construction rules.




