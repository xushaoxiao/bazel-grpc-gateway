# EchoServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**echoServiceEcho**](EchoServiceApi.md#echoServiceEcho) | **POST** /v1/example/echo/{id} | Echo method receives a simple message and returns it.
[**echoServiceEcho2**](EchoServiceApi.md#echoServiceEcho2) | **GET** /v1/example/echo/{id}/{num} | Echo method receives a simple message and returns it.
[**echoServiceEcho3**](EchoServiceApi.md#echoServiceEcho3) | **GET** /v1/example/echo/{id}/{num}/{lang} | Echo method receives a simple message and returns it.
[**echoServiceEcho4**](EchoServiceApi.md#echoServiceEcho4) | **GET** /v1/example/echo1/{id}/{lineNum}/{status.note} | Echo method receives a simple message and returns it.
[**echoServiceEcho5**](EchoServiceApi.md#echoServiceEcho5) | **GET** /v1/example/echo2/{no.note} | Echo method receives a simple message and returns it.
[**echoServiceEchoBody**](EchoServiceApi.md#echoServiceEchoBody) | **POST** /v1/example/echo_body | EchoBody method receives a simple message and returns it.
[**echoServiceEchoDelete**](EchoServiceApi.md#echoServiceEchoDelete) | **DELETE** /v1/example/echo_delete | EchoDelete method receives a simple message and returns it.
[**echoServiceEchoPatch**](EchoServiceApi.md#echoServiceEchoPatch) | **PATCH** /v1/example/echo_patch | EchoPatch method receives a NonStandardUpdateRequest and returns it.
[**echoServiceEchoUnauthorized**](EchoServiceApi.md#echoServiceEchoUnauthorized) | **GET** /v1/example/echo_unauthorized | EchoUnauthorized method receives a simple message and returns it. It must always return a google.rpc.Code of &#x60;UNAUTHENTICATED&#x60; and a HTTP Status code of 401.


<a name="echoServiceEcho"></a>
# **echoServiceEcho**
> ProtobufsSimpleMessage echoServiceEcho(id, num, lineNum, lang, statusProgress, statusNote, en, noProgress, noNote)

Echo method receives a simple message and returns it.

The message posted as the id parameter will also be returned.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EchoServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    EchoServiceApi apiInstance = new EchoServiceApi(defaultClient);
    String id = "id_example"; // String | Id represents the message identifier.
    String num = "num_example"; // String | 
    String lineNum = "lineNum_example"; // String | 
    String lang = "lang_example"; // String | 
    String statusProgress = "statusProgress_example"; // String | 
    String statusNote = "statusNote_example"; // String | 
    String en = "en_example"; // String | 
    String noProgress = "noProgress_example"; // String | 
    String noNote = "noNote_example"; // String | 
    try {
      ProtobufsSimpleMessage result = apiInstance.echoServiceEcho(id, num, lineNum, lang, statusProgress, statusNote, en, noProgress, noNote);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EchoServiceApi#echoServiceEcho");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Id represents the message identifier. |
 **num** | **String**|  | [optional]
 **lineNum** | **String**|  | [optional]
 **lang** | **String**|  | [optional]
 **statusProgress** | **String**|  | [optional]
 **statusNote** | **String**|  | [optional]
 **en** | **String**|  | [optional]
 **noProgress** | **String**|  | [optional]
 **noNote** | **String**|  | [optional]

### Return type

[**ProtobufsSimpleMessage**](ProtobufsSimpleMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

<a name="echoServiceEcho2"></a>
# **echoServiceEcho2**
> ProtobufsSimpleMessage echoServiceEcho2(id, num, lineNum, lang, statusProgress, statusNote, en, noProgress, noNote)

Echo method receives a simple message and returns it.

The message posted as the id parameter will also be returned.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EchoServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    EchoServiceApi apiInstance = new EchoServiceApi(defaultClient);
    String id = "id_example"; // String | Id represents the message identifier.
    String num = "num_example"; // String | 
    String lineNum = "lineNum_example"; // String | 
    String lang = "lang_example"; // String | 
    String statusProgress = "statusProgress_example"; // String | 
    String statusNote = "statusNote_example"; // String | 
    String en = "en_example"; // String | 
    String noProgress = "noProgress_example"; // String | 
    String noNote = "noNote_example"; // String | 
    try {
      ProtobufsSimpleMessage result = apiInstance.echoServiceEcho2(id, num, lineNum, lang, statusProgress, statusNote, en, noProgress, noNote);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EchoServiceApi#echoServiceEcho2");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Id represents the message identifier. |
 **num** | **String**|  |
 **lineNum** | **String**|  | [optional]
 **lang** | **String**|  | [optional]
 **statusProgress** | **String**|  | [optional]
 **statusNote** | **String**|  | [optional]
 **en** | **String**|  | [optional]
 **noProgress** | **String**|  | [optional]
 **noNote** | **String**|  | [optional]

### Return type

[**ProtobufsSimpleMessage**](ProtobufsSimpleMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

<a name="echoServiceEcho3"></a>
# **echoServiceEcho3**
> ProtobufsSimpleMessage echoServiceEcho3(id, num, lang, lineNum, statusProgress, statusNote, en, noProgress, noNote)

Echo method receives a simple message and returns it.

The message posted as the id parameter will also be returned.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EchoServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    EchoServiceApi apiInstance = new EchoServiceApi(defaultClient);
    String id = "id_example"; // String | Id represents the message identifier.
    String num = "num_example"; // String | 
    String lang = "lang_example"; // String | 
    String lineNum = "lineNum_example"; // String | 
    String statusProgress = "statusProgress_example"; // String | 
    String statusNote = "statusNote_example"; // String | 
    String en = "en_example"; // String | 
    String noProgress = "noProgress_example"; // String | 
    String noNote = "noNote_example"; // String | 
    try {
      ProtobufsSimpleMessage result = apiInstance.echoServiceEcho3(id, num, lang, lineNum, statusProgress, statusNote, en, noProgress, noNote);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EchoServiceApi#echoServiceEcho3");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Id represents the message identifier. |
 **num** | **String**|  |
 **lang** | **String**|  |
 **lineNum** | **String**|  | [optional]
 **statusProgress** | **String**|  | [optional]
 **statusNote** | **String**|  | [optional]
 **en** | **String**|  | [optional]
 **noProgress** | **String**|  | [optional]
 **noNote** | **String**|  | [optional]

### Return type

[**ProtobufsSimpleMessage**](ProtobufsSimpleMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

<a name="echoServiceEcho4"></a>
# **echoServiceEcho4**
> ProtobufsSimpleMessage echoServiceEcho4(id, lineNum, statusNote, num, lang, statusProgress, en, noProgress)

Echo method receives a simple message and returns it.

The message posted as the id parameter will also be returned.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EchoServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    EchoServiceApi apiInstance = new EchoServiceApi(defaultClient);
    String id = "id_example"; // String | Id represents the message identifier.
    String lineNum = "lineNum_example"; // String | 
    String statusNote = "statusNote_example"; // String | 
    String num = "num_example"; // String | 
    String lang = "lang_example"; // String | 
    String statusProgress = "statusProgress_example"; // String | 
    String en = "en_example"; // String | 
    String noProgress = "noProgress_example"; // String | 
    try {
      ProtobufsSimpleMessage result = apiInstance.echoServiceEcho4(id, lineNum, statusNote, num, lang, statusProgress, en, noProgress);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EchoServiceApi#echoServiceEcho4");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Id represents the message identifier. |
 **lineNum** | **String**|  |
 **statusNote** | **String**|  |
 **num** | **String**|  | [optional]
 **lang** | **String**|  | [optional]
 **statusProgress** | **String**|  | [optional]
 **en** | **String**|  | [optional]
 **noProgress** | **String**|  | [optional]

### Return type

[**ProtobufsSimpleMessage**](ProtobufsSimpleMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

<a name="echoServiceEcho5"></a>
# **echoServiceEcho5**
> ProtobufsSimpleMessage echoServiceEcho5(noNote, id, num, lineNum, lang, statusProgress, en, noProgress)

Echo method receives a simple message and returns it.

The message posted as the id parameter will also be returned.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EchoServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    EchoServiceApi apiInstance = new EchoServiceApi(defaultClient);
    String noNote = "noNote_example"; // String | 
    String id = "id_example"; // String | Id represents the message identifier.
    String num = "num_example"; // String | 
    String lineNum = "lineNum_example"; // String | 
    String lang = "lang_example"; // String | 
    String statusProgress = "statusProgress_example"; // String | 
    String en = "en_example"; // String | 
    String noProgress = "noProgress_example"; // String | 
    try {
      ProtobufsSimpleMessage result = apiInstance.echoServiceEcho5(noNote, id, num, lineNum, lang, statusProgress, en, noProgress);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EchoServiceApi#echoServiceEcho5");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **noNote** | **String**|  |
 **id** | **String**| Id represents the message identifier. | [optional]
 **num** | **String**|  | [optional]
 **lineNum** | **String**|  | [optional]
 **lang** | **String**|  | [optional]
 **statusProgress** | **String**|  | [optional]
 **en** | **String**|  | [optional]
 **noProgress** | **String**|  | [optional]

### Return type

[**ProtobufsSimpleMessage**](ProtobufsSimpleMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

<a name="echoServiceEchoBody"></a>
# **echoServiceEchoBody**
> ProtobufsSimpleMessage echoServiceEchoBody(body)

EchoBody method receives a simple message and returns it.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EchoServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    EchoServiceApi apiInstance = new EchoServiceApi(defaultClient);
    ProtobufsSimpleMessage body = new ProtobufsSimpleMessage(); // ProtobufsSimpleMessage | 
    try {
      ProtobufsSimpleMessage result = apiInstance.echoServiceEchoBody(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EchoServiceApi#echoServiceEchoBody");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProtobufsSimpleMessage**](ProtobufsSimpleMessage.md)|  |

### Return type

[**ProtobufsSimpleMessage**](ProtobufsSimpleMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

<a name="echoServiceEchoDelete"></a>
# **echoServiceEchoDelete**
> ProtobufsSimpleMessage echoServiceEchoDelete(id, num, lineNum, lang, statusProgress, statusNote, en, noProgress, noNote)

EchoDelete method receives a simple message and returns it.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EchoServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    EchoServiceApi apiInstance = new EchoServiceApi(defaultClient);
    String id = "id_example"; // String | Id represents the message identifier.
    String num = "num_example"; // String | 
    String lineNum = "lineNum_example"; // String | 
    String lang = "lang_example"; // String | 
    String statusProgress = "statusProgress_example"; // String | 
    String statusNote = "statusNote_example"; // String | 
    String en = "en_example"; // String | 
    String noProgress = "noProgress_example"; // String | 
    String noNote = "noNote_example"; // String | 
    try {
      ProtobufsSimpleMessage result = apiInstance.echoServiceEchoDelete(id, num, lineNum, lang, statusProgress, statusNote, en, noProgress, noNote);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EchoServiceApi#echoServiceEchoDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Id represents the message identifier. | [optional]
 **num** | **String**|  | [optional]
 **lineNum** | **String**|  | [optional]
 **lang** | **String**|  | [optional]
 **statusProgress** | **String**|  | [optional]
 **statusNote** | **String**|  | [optional]
 **en** | **String**|  | [optional]
 **noProgress** | **String**|  | [optional]
 **noNote** | **String**|  | [optional]

### Return type

[**ProtobufsSimpleMessage**](ProtobufsSimpleMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

<a name="echoServiceEchoPatch"></a>
# **echoServiceEchoPatch**
> ProtobufsDynamicMessageUpdate echoServiceEchoPatch(body, updateMask)

EchoPatch method receives a NonStandardUpdateRequest and returns it.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EchoServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    EchoServiceApi apiInstance = new EchoServiceApi(defaultClient);
    ProtobufsDynamicMessage body = new ProtobufsDynamicMessage(); // ProtobufsDynamicMessage | 
    String updateMask = "updateMask_example"; // String | 
    try {
      ProtobufsDynamicMessageUpdate result = apiInstance.echoServiceEchoPatch(body, updateMask);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EchoServiceApi#echoServiceEchoPatch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProtobufsDynamicMessage**](ProtobufsDynamicMessage.md)|  |
 **updateMask** | **String**|  | [optional]

### Return type

[**ProtobufsDynamicMessageUpdate**](ProtobufsDynamicMessageUpdate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

<a name="echoServiceEchoUnauthorized"></a>
# **echoServiceEchoUnauthorized**
> ProtobufsSimpleMessage echoServiceEchoUnauthorized(id, num, lineNum, lang, statusProgress, statusNote, en, noProgress, noNote)

EchoUnauthorized method receives a simple message and returns it. It must always return a google.rpc.Code of &#x60;UNAUTHENTICATED&#x60; and a HTTP Status code of 401.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EchoServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    EchoServiceApi apiInstance = new EchoServiceApi(defaultClient);
    String id = "id_example"; // String | Id represents the message identifier.
    String num = "num_example"; // String | 
    String lineNum = "lineNum_example"; // String | 
    String lang = "lang_example"; // String | 
    String statusProgress = "statusProgress_example"; // String | 
    String statusNote = "statusNote_example"; // String | 
    String en = "en_example"; // String | 
    String noProgress = "noProgress_example"; // String | 
    String noNote = "noNote_example"; // String | 
    try {
      ProtobufsSimpleMessage result = apiInstance.echoServiceEchoUnauthorized(id, num, lineNum, lang, statusProgress, statusNote, en, noProgress, noNote);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EchoServiceApi#echoServiceEchoUnauthorized");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Id represents the message identifier. | [optional]
 **num** | **String**|  | [optional]
 **lineNum** | **String**|  | [optional]
 **lang** | **String**|  | [optional]
 **statusProgress** | **String**|  | [optional]
 **statusNote** | **String**|  | [optional]
 **en** | **String**|  | [optional]
 **noProgress** | **String**|  | [optional]
 **noNote** | **String**|  | [optional]

### Return type

[**ProtobufsSimpleMessage**](ProtobufsSimpleMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

