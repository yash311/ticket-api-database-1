# ticket-api-database-1
A standalone Spring boot application that allows to perform CRUD operations with in memory database(derby).

## Requirements
* JDK 8 or above. (check version by running "java -version" in cmd)

## Running
* Download .jar file [https://github.com/yash311/ticket-api-database-1/blob/master/ticket-api-database-1-0.0.1-SNAPSHOT.jar]
* Once downloaded, double click on the file to start the service
* Open localhost:8080 on any API development tool (like Postman)
* Perform CRUD operation

## data format to perform Post operation
{
    "ticketKey": "key-1",
    "comment": "sprint from POST",
    "status": "IN_PROGRESS",
    "priority": "HIGH"
}

## APIs
* GET: localhost:8080/tickets/ (to get all the tickets)
* GET: localhost:8080/tickets/[ticketKey] (to get the ticket with given key. eg. localhost:8080/tickets/key-1)
* POST: localhost:8080/tickets/ (provide data as a body as above mentioned format)
* PUT: localhost:8080/tickets/[ticketKey] (to update values for given key. provide updation data as a body as above mentioned format)
* DELETE: localhost:8080/tickets/[ticketKey] (to delete a ticket specified by key)
