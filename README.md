# java-orders-sqllite

# Introduction

This is a basic database scheme with customers, orders, and sales agents.

# Instructions

Create a REST api server to store and read data from the provided SQLite Database called orders.db. The database is adapted from the sample database found at https://www.w3resource.com/sql/sql-table.php. This a continuation of the java-orders project. So start with your java-orders project and proceed from there.

* Convert to using SQLite
* Add additional end points
  - change end points so they return null when no data is found.
  - change end points so they return data that is deleted or a new copy of updated data
* Expose actuator end points

The table layouts are as follows

- [x] AGENTS
  * AGENTCODE primary key, not null Long
  * AGENTNAME string
  * WORKINGAREA string
  * COMMISSION double
  * PHONE string
  * COUNTRY string

- [x] CUSTOMERS
  * CUSTCODE primary key, not null Long
  * CUSTNAME String, not null
  * CUSTCITY String
  * WORKINGAREA String
  * CUSTCOUNTRY String
  * GRADE String
  * OPENINGAMT double
  * RECEIVEAMT double
  * PAYMENTAMT double
  * OUTSTANDINGAMT double
  * PHONE String
  * AGENTCODE long foreign key (one agent to many customers) not null

- [x] ORDERS
  * ORDNUM primary key, not null Long
  * ORDAMOUNT double
  * ADVANCEAMOUNT double
  * CUSTCODE long foreign key (one customer to many orders) not null
  * AGENTCODE long foreign key (one agent to many orders) not null
  * ORDDESCRIPTION


- [x] Create the entities needed to store this data
- [x] connect to the provided SQLite database orders.db
 
- [x] Create a generic error html page to return when error 404 happens (the rate of this depends on the user following directions).
- [x] Create a different generic error html page to return when error 500 happens (this should be rare).
- [x] Create a different generic error html page to return when an error other than a 404 or 500 happens (what? This should not happen).

- End points should return the data they worked with or nothing if no data was found

Expose the following end points

- [x] GET /customers - returns all the customers
- [x] GET /orders - return all the orders
- [x] GET /agents - return all the agents

- [x] GET /customers/{id}
- [x] GET /orders/{id}
- [x] GET /agents/{id}

- [x] POST /customers - adds a customer
- [x] POST /orders - adds an order
- [x] POST /agents - adds an agent

- [x] PUT /customers/{id} - updates a customer based on custcode
- [x] PUT /orders/{id} - updates an order based on ordnum
- [x] PUT /agents/{id} - updates an agent based on ordnum

- [x] DELETE /customers/{id} - Deletes a customer based off of their custcode and deletes all their associated orders
- [x] DELETE /orders/{id} - deletes an order based off its ordnum
- [x] DELETE /agents/{id} - Deletes an agent *if they are not assigned to a customer or order* (Stretch Goal-- Complete)

- [x] GET /customers/orders - Returns all customers with their orders
- [x] GET /customers/name/{name}/orders - Returns all orders for a particular customer based on name
- [x] GET /customers/id/{id}/orders - Returns all orders for a particular customer based on custcode
- [x] GET /agents/customers - Returns all agents with their customers
- [x] GET /agents/orders - Return a list with the agents name and associated order number and order description

* Expose at least the following the actuator endpoints to help with system mangagement
   - [x] /health
   - [x] /info
   - [x] /metrics
   
- [x] Stretch goal - update each of these three actuator endpoints to report your own messages. 
