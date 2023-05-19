# Project : DoctorBooking Application

## Frameworks/Tools and languages used
     * SpringBoot
     * Java
     * PostMan
     * MySQL DataBase
--------------------------------------------------------------------------------------------------------------------
## Data flow in the project
 ### 0. Model : We have Two models here namely Doctor & Patient:

 #### Followings are the Glimse of the Models:

##### 0.1  Doctor ⬇️

--------------------------------------------------------------------------------------------------------------------

### 1. Controller : In Controller package the UserController is the gateWay to the API endpoints, Here we have provided many APIs perfrorm basic CRUD Operations on ToDo

--------------------------------------------------------------------------------------------------------------------

### 2. Services : All the operations linked with controller is been implemented with additional logics in service layer, service layer also interact with repository layer.


--------------------------------------------------------------------------------------------------------------------

### 3. Repository : Repository layer interacts with Database(MySQL) and persist the changes requested, We extend the JPA repository to get the predefined function.Here inside JPARespository Interface we have another Interface called CRUDRepo with provides us some of the preDefined methods


--------------------------------------------------------------------------------------------------------------------

### 4. DataBase : Here i have used mySQL : This database persist data even when the program is re-run.

## Data Structure Used in Project
* ArrayList















