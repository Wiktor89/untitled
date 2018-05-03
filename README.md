# untitled
untitled
<details>
  <summary>Table of Contents</summary>

  * [Installation](#installation)
    * [Maven](#maven)
    * [Gradle](#gradle)
  * [Usage](#usage)
  * [Running in IBM Cloud](#running-in-ibm-cloud)
  * [Authentication](#authentication)
    * [Username and Password](#username-and-password)
    * [API Key](#api-key)
    * [Using IAM](#using-iam)
  * IBM Watson Services
    * [Assistant](assistant)
    * [Discovery](discovery)
    * [Language Translator](language-translator)
    * [Natural Language Classifier](natural-language-classifier)
    * [Natural Language Understanding](natural-language-understanding)
    * [Personality Insights](personality-insights)
    * [Speech to Text](speech-to-text)
    * [Text to Speech](text-to-speech)
    * [Tone Analyzer](tone-analyzer)
    * [Tradeoff Analytics](tradeoff-analytics)
    * [Visual Recognition](visual-recognition)
  * [Android](#android)
  * [Using a Proxy](#using-a-proxy)
  * [Default Headers](#default-headers)
  * [Sending Request Headers](#sending-request-headers)
  * [Parsing HTTP Response Info](#parsing-http-response-info)
  * [Specifying a Service URL](#specifying-a-service-url)
  * [401 Unauthorized Error](#401-unauthorized-error)
  * [Changes for v4.0](#changes-for-v40)
  * [Debug](#debug)
  * [Eclipse and Intellij](#working-with-eclipse-and-intellij-idea)
  * [License](#license)
  * [Contributing](#contributing)

</details>

## Installation

##### Maven

All the services:

```xml
<dependency>
	<groupId>com.ibm.watson.developer_cloud</groupId>
	<artifactId>java-sdk</artifactId>
	<version>5.4.0</version>
</dependency>
```
