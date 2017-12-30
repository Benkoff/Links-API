# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        
        DefaultApi apiInstance = new DefaultApi();
        Boolean activeOnly = true; // Boolean | Set true (default value) to return active links only, false to get all the links saved
        Integer pageSize = 56; // Integer | Number of links returned
        Integer pageNumber = 56; // Integer | Page number
        try {
            LinksRequestResponseBody result = apiInstance.linksGet(activeOnly, pageSize, pageNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#linksGet");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://links.juja-platform.com.ua/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**linksGet**](docs/DefaultApi.md#linksGet) | **GET** /links | Get all links
*DefaultApi* | [**linksIdDelete**](docs/DefaultApi.md#linksIdDelete) | **DELETE** /links/{id} | Delete the link specified by it&#x60;s ID.
*DefaultApi* | [**linksIdGet**](docs/DefaultApi.md#linksIdGet) | **GET** /links/{id} | Get a link by link&#x60;s ID
*DefaultApi* | [**linksIdPut**](docs/DefaultApi.md#linksIdPut) | **PUT** /links/{id} | Update an existing link by link&#x60;s ID
*DefaultApi* | [**linksPost**](docs/DefaultApi.md#linksPost) | **POST** /links | Save a link
*DefaultApi* | [**linksUserUserGet**](docs/DefaultApi.md#linksUserUserGet) | **GET** /links/user/{user} | Get all user&#x60;s links by user&#x60;s ID


## Documentation for Models

 - [LinksPostRequestBody](docs/LinksPostRequestBody.md)
 - [LinksRequestResponseBody](docs/LinksRequestResponseBody.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



