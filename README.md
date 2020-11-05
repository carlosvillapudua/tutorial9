# Mockito Tutorial

Mockito is a mocking framework used for unit testing in Java. Mockito allows you to use mock objects, which act as dummy implementations of external classes/dependencies so that when the test calls the mock object, the result is always the same. This library is often used with Junit for unit tests in Java, but not always.

When testing, a developer doesn’t want conditions outside of their own written code to affect the test results, so it’s beneficial to have constant testing conditions. This is where Mockito comes into play. A developer is able to define mock objects that output the same results every time their methods are called which eliminates dependencies on outside services, like a database or an API.

## Setup

According to the framework site, the best way to set up Mockito is by adding “mockito-core” as a dependency in Gradle or Maven.  

*For Gradle:*
```
repositories { jcenter() }
dependencies { testCompile “org.mockito:mockito-core:2.+” }
```

*For Maven:*
```
<dependency>
	<groupId>org.mockito</groupId>
	<artifactId>mockito-core</artifactId>
	<version>3.6.0</version>
</dependency>
```

The framework jar files can be downloaded from the framework’s Bintray repository for manual dependency management.

*For sample usage, see our InstagramAnalyticsTester.java file in this repository.*
