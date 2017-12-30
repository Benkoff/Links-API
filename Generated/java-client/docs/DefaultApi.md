# DefaultApi

All URIs are relative to *https://links.juja-platform.com.ua/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**linksGet**](DefaultApi.md#linksGet) | **GET** /links | Get all links
[**linksIdDelete**](DefaultApi.md#linksIdDelete) | **DELETE** /links/{id} | Delete the link specified by it&#x60;s ID.
[**linksIdGet**](DefaultApi.md#linksIdGet) | **GET** /links/{id} | Get a link by link&#x60;s ID
[**linksIdPut**](DefaultApi.md#linksIdPut) | **PUT** /links/{id} | Update an existing link by link&#x60;s ID
[**linksPost**](DefaultApi.md#linksPost) | **POST** /links | Save a link
[**linksUserUserGet**](DefaultApi.md#linksUserUserGet) | **GET** /links/user/{user} | Get all user&#x60;s links by user&#x60;s ID


<a name="linksGet"></a>
# **linksGet**
> LinksRequestResponseBody linksGet(activeOnly, pageSize, pageNumber)

Get all links

Returns a list containing saved links. The list supports paging.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **activeOnly** | **Boolean**| Set true (default value) to return active links only, false to get all the links saved | [optional]
 **pageSize** | **Integer**| Number of links returned | [optional]
 **pageNumber** | **Integer**| Page number | [optional]

### Return type

[**LinksRequestResponseBody**](LinksRequestResponseBody.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="linksIdDelete"></a>
# **linksIdDelete**
> linksIdDelete(id)

Delete the link specified by it&#x60;s ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | This resource represents an individual saved link. Each link is identified by a string 'id'
try {
    apiInstance.linksIdDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#linksIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| This resource represents an individual saved link. Each link is identified by a string &#39;id&#39; |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="linksIdGet"></a>
# **linksIdGet**
> LinksRequestResponseBody linksIdGet(id)

Get a link by link&#x60;s ID

Returns a single link for its ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | This resource represents an individual saved link. Each link is identified by a string 'id'
try {
    LinksRequestResponseBody result = apiInstance.linksIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#linksIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| This resource represents an individual saved link. Each link is identified by a string &#39;id&#39; |

### Return type

[**LinksRequestResponseBody**](LinksRequestResponseBody.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="linksIdPut"></a>
# **linksIdPut**
> linksIdPut(id, link)

Update an existing link by link&#x60;s ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | This resource represents an individual saved link. Each link is identified by a string 'id'
LinksRequestResponseBody link = new LinksRequestResponseBody(); // LinksRequestResponseBody | Link to be updated
try {
    apiInstance.linksIdPut(id, link);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#linksIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| This resource represents an individual saved link. Each link is identified by a string &#39;id&#39; |
 **link** | [**LinksRequestResponseBody**](LinksRequestResponseBody.md)| Link to be updated |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="linksPost"></a>
# **linksPost**
> LinksRequestResponseBody linksPost(link)

Save a link

Adds a new link to the links list.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
LinksPostRequestBody link = new LinksPostRequestBody(); // LinksPostRequestBody | Link to be updated
try {
    LinksRequestResponseBody result = apiInstance.linksPost(link);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#linksPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **link** | [**LinksPostRequestBody**](LinksPostRequestBody.md)| Link to be updated |

### Return type

[**LinksRequestResponseBody**](LinksRequestResponseBody.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="linksUserUserGet"></a>
# **linksUserUserGet**
> LinksRequestResponseBody linksUserUserGet(user, pageSize, pageNumber)

Get all user&#x60;s links by user&#x60;s ID

Returns a list containing saved links. The list supports paging.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String user = "user_example"; // String | The link's ID
Integer pageSize = 56; // Integer | Number of links returned
Integer pageNumber = 56; // Integer | Page number
try {
    LinksRequestResponseBody result = apiInstance.linksUserUserGet(user, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#linksUserUserGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | **String**| The link&#39;s ID |
 **pageSize** | **Integer**| Number of links returned | [optional]
 **pageNumber** | **Integer**| Page number | [optional]

### Return type

[**LinksRequestResponseBody**](LinksRequestResponseBody.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

