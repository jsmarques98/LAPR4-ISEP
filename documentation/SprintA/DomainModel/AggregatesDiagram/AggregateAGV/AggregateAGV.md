# AGGREGATE AGV

## 1. Technical decisions

###1.1 Aggregate

- We create "Aggregate AGV" because it will be needed to manage and create AGVs.


- Also, because of consistent: if we keep "AGV" inside another aggregate like "Aggregate Order" and if we needed to delete some orders, we will have to delete AGVs too.


###1.2 Entities
###AGV 
We consider that "AGV" should be an entity because:
- It has an identifier , and it is always unique even if there's another entity with the same properties (another AGV with the same proprieties ).
  

- It will be needed to manage AGVs in our application.




###1.3 Value objects

###Current Task

We consider thar "Current Task" should be a value object because:

- It classifies the entity "AGV".


- It may follow some construction rules.


- It may not be as simple as a primitive data type.

###Autonomy

We consider thar "Autonomy" should be a value object because:

- It classifies the entity "AGV".


- It may follow some construction rules.


- It may not be as simple as a primitive data type.


###Base Location

We consider thar "Base Location" should be a value object because:

- It classifies the entity "AGV".


- It may follow some construction rules.


- It may not be as simple as a primitive data type.


###Max Weight 

We consider thar "Max Weight" should be a value object because:

- It classifies the entity "AGV".


- It may follow some construction rules.


###Model

We consider thar "Model" should be a value object because:

- It classifies the entity "AGV".


- It may follow some construction rules.


- It may not be as simple as a primitive data type.



###Short Description

We consider thar "Short Description" should be a value object because:

- It classifies the entity "AGV".


- It may follow some construction rules.
