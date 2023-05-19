# Project : DoctorBooking Application

## Frameworks/Tools and languages used
    ➡️ SpringBoot
    ➡️ Java
    ➡️ PostMan
    ➡️ MySQL DataBase
--------------------------------------------------------------------------------------------------------------------
## Data flow in the project
 ### 0. Model : We have Two models here namely Doctor & Patient:

 #### Followings are the Glimse of the Models:

##### 0.1  Doctor ⬇️

<img width="532" alt="Screenshot 2023-03-07 at 3 40 21 PM" src="https://user-images.githubusercontent.com/100271790/223391278-d3eef271-fa10-4a67-b073-b7159eeb608e.png">

##### 0.2  Patient ⬇️

<img width="580" alt="Screenshot 2023-03-07 at 3 40 42 PM" src="https://user-images.githubusercontent.com/100271790/223391379-42c01a6e-1655-4856-812e-94ecb7be44b5.png">

 #### To see Models
(https://github.com/HHrisHikesHH/SpringBoot/tree/main/FEB/Hospital/src/main/java/com/hrishikesh/Hospital/model)

--------------------------------------------------------------------------------------------------------------------

### 1. Controller : In Controller package the UserController is the gateWay to the API endpoints, Here we have provided many APIs perfrorm basic CRUD Operations on ToDo

  #### Followings are the Glimse of the some of EndPoints of the Controller:
 
##### 1.1  Doctor ⬇️  
  
<img width="978" alt="Screenshot 2023-03-07 at 3 42 41 PM" src="https://user-images.githubusercontent.com/100271790/223391825-4bc8f8a2-4dd9-42b9-a9fe-73f485ee892e.png">

##### 1.2  Patient ⬇️

<img width="977" alt="Screenshot 2023-03-07 at 3 42 59 PM" src="https://user-images.githubusercontent.com/100271790/223391891-88b966b2-a024-434a-a18b-dd2e5b48e23d.png">


  #### To see Entire controller 
(https://github.com/HHrisHikesHH/SpringBoot/tree/main/FEB/Hospital/src/main/java/com/hrishikesh/Hospital/controller)

--------------------------------------------------------------------------------------------------------------------

### 2. Services : All the operations linked with controller is been implemented with additional logics in service layer, service layer also interact with repository layer.
   
   #### Followings are the Glimse of the some of BussinessLogic Implemented in the Service:
   
##### 2.1  Doctor ⬇️  

<img width="703" alt="Screenshot 2023-03-07 at 3 44 05 PM" src="https://user-images.githubusercontent.com/100271790/223392165-9e1c2034-9078-4aa3-a882-e3285d1142f5.png">

 
##### 2.2  Patient ⬇️ 

<img width="745" alt="Screenshot 2023-03-07 at 3 44 31 PM" src="https://user-images.githubusercontent.com/100271790/223392278-83ec619a-a663-4a4e-96bf-3e7d0e16b3d9.png">


#### To see Entire Service

(https://github.com/HHrisHikesHH/SpringBoot/tree/main/FEB/Hospital/src/main/java/com/hrishikesh/Hospital/service)

--------------------------------------------------------------------------------------------------------------------

### 3. Repository : Repository layer interacts with Database(MySQL) and persist the changes requested, We extend the JPA repository to get the predefined function.Here inside JPARespository Interface we have another Interface called CRUDRepo with provides us some of the preDefined methods
   
#### Followings are the Glimse of the some of Custom methods Implemented in the Repository:

##### 3.1  Doctor ⬇️  

<img width="699" alt="Screenshot 2023-03-07 at 3 45 28 PM" src="https://user-images.githubusercontent.com/100271790/223392551-b97c2f7a-bf46-4d3d-8eea-423d95d10def.png">


##### 3.2  Patient ⬇️ 

<img width="800" alt="Screenshot 2023-03-07 at 3 45 43 PM" src="https://user-images.githubusercontent.com/100271790/223392614-9a9957a4-4af5-459f-9655-be4d2eef87ad.png">


#### To see Entire Repository

(https://github.com/HHrisHikesHH/SpringBoot/tree/main/FEB/Hospital/src/main/java/com/hrishikesh/Hospital/repository)

--------------------------------------------------------------------------------------------------------------------

### 4. DataBase : Here i have used mySQL : This database persist data even when the program is re-run.
   #### Table of Doctor contents

<img width="495" alt="Screenshot 2023-03-07 at 3 47 30 PM" src="https://user-images.githubusercontent.com/100271790/223393128-907b6daf-4c93-422d-8fb1-7f93f0ef2347.png">

 #### Table of Patient contents

<img width="689" alt="Screenshot 2023-03-07 at 3 48 33 PM" src="https://user-images.githubusercontent.com/100271790/223393385-caa5a130-2f62-4f3c-ba8d-dac54fdb47eb.png">

## Data Structure Used in Project
* ArrayList
* JSONArray
* JSONObject

## Project Summary

### Project Result
➡️ : FindAll Doctor : localhost:8080/api/v1/doctor/getDoctor

<img width="1440" alt="Screenshot 2023-03-07 at 3 56 21 PM" src="https://user-images.githubusercontent.com/100271790/223396426-ddb4b358-b4bc-41cf-9b51-7fa44cb21893.png">


➡️ : FindById Doctor : localhost:8080/api/v1/doctor/getDoctor?doctorId=1

<img width="1440" alt="Screenshot 2023-03-07 at 3 56 31 PM" src="https://user-images.githubusercontent.com/100271790/223396528-25d7e19e-76da-4b2a-b704-fed909ae3206.png">


➡️ : Create Doctor : localhost:8080/api/v1/doctor/saveDoctor

<img width="1440" alt="Screenshot 2023-03-07 at 3 56 13 PM" src="https://user-images.githubusercontent.com/100271790/223396563-081f3609-cd9f-4970-86e9-24393bc45843.png">


➡️ : Update Doctor : localhost:8080/api/v1/doctor/updateDoctor?doctorId=2

<img width="1440" alt="Screenshot 2023-03-07 at 3 56 53 PM" src="https://user-images.githubusercontent.com/100271790/223396764-431679f3-9674-4094-8e76-3887fdb4a1ef.png">


➡️ : Delete Doctor : localhost:8080/api/v1/doctor/deleteDoctor?doctorId=6

<img width="1440" alt="Screenshot 2023-03-07 at 3 57 22 PM" src="https://user-images.githubusercontent.com/100271790/223396913-e772f4ef-b30d-4ead-97fd-7f263fd9c53a.png">


➡️ : FindAll Patient : localhost:8080/api/v1/patient/getPatient

<img width="1440" alt="Screenshot 2023-03-07 at 3 58 12 PM" src="https://user-images.githubusercontent.com/100271790/223397101-db43da54-19ea-4963-98dc-446a78199f50.png">


➡️ : FindById Patient : localhost:8080/api/v1/patient/getPatient?patientId=3

<img width="1440" alt="Screenshot 2023-03-07 at 3 58 23 PM" src="https://user-images.githubusercontent.com/100271790/223397249-08a4cfc1-421d-4297-ad20-e102f14c12ee.png">


➡️ : Create Patient : localhost:8080/api/v1/patient/savePatient

<img width="1440" alt="Screenshot 2023-03-07 at 3 58 01 PM" src="https://user-images.githubusercontent.com/100271790/223397031-365dc84d-abca-49e0-8e53-74e48139c59c.png">


➡️ : Update Patient : localhost:8080/api/v1/patient/updatePatient?patientId=10

<img width="1440" alt="Screenshot 2023-03-07 at 3 59 05 PM" src="https://user-images.githubusercontent.com/100271790/223397339-bca01384-93b5-4533-b470-a098ffd530fc.png">


➡️ : Delete Patient : localhost:8080/api/v1/patient/deletePatient?patientId=10

<img width="1440" alt="Screenshot 2023-03-07 at 3 59 13 PM" src="https://user-images.githubusercontent.com/100271790/223397392-d9d0e9a0-bec4-4e98-9c11-9134ab5aa584.png">













