# MySpring

It's a simple Spring notes

## 1. Why we need to retry?

In most our projects we usually have some scenario to retry few operation if it falls first time. For example let’s say the during invoking any backend external service, that service might be down for few reasons like network outage, server down, network glitch, deadlock etc. In this case usually we try to retry the operation for few times before we send any specific error to the client programs to make processing more robust and less prone to failure.

Sometimes it helps to automatically retry a failed operation in case it might succeed on a subsequent attempt. I guess all of you have faced this and as workaround, you most probably solved this by having a loop and break that loop once you reached the retry limit, but now with the help of spring-retry module, we don’t have to write such code to handle the retry scenario.


## 2. Spring retry
Spring-retry from spring family is another utility module which can help us in handle the retry of any specific operation with standard fashion. In spring-retry all configurations are simple annotation based.

### 2.1. Spring retry annotations
@EnableRetry – to enable spring retry in spring boot project
@Retryable – to indicate any method to be a candidate of retry
@Recover – to specify fallback method!

## 3. Spring retry example
### 3.1. Development environment
We will use the following technology stack to try out spring-retry in pur sample application below.

Java, Eclipse, Maven as Development Environment
Spring-boot as application framework
spring-retry module as retry module
AspectJ as dependency of spring-retry
### 3.2. Demo overview
Create one Spring boot project to expose once sample Rest API which will call one backend operation which is prone to failure, We will simulate this failure conditions to initiate the retry.
One service class which will actually invoke the remote api and this will send exception in case of failure, we will design the retry based on this custom exception, like once we receive this exception, we will retry for 3 times and finally return to client.
In those 3 attempts, if we get success response from backend service then that success response will be returned else a standard fallback method will be called.

### 3.3. Create Spring-boot project
As a first step we will create a spring boot project from spring initializer site where we will test the spring-retry functionality.

To do this we need to go to https://start.spring.io/ and select dependencies web and retry. Download the zip file containing the skeleton project and import to maven.

