Overview
--------
Beanstalk4j is an unofficial Java library for the Beanstalk REST API. With Beanstalk4j, you can easily integrate your Java application with Beanstalk. No need to go through the hassle with HTTP and XML.

Features
========
  * (Almost) full compliance with Beanstalk REST API
  * Works with POJOS instead of HTTP/XML
  * No dependency on external libraries

Getting started
===============
Add beanstalk4j.jar to your class path. Create a instance of *BeanstalkApi*.

The constructor expects three arguments. Your account name, username and password. Example:
    BeanstalkApi api = new BeanstalkApi("acme", "wile", "coyote010");

Let's get all users:
    List<User> users = api.getUsers();

Simple, uh?

Maven Support
=============
Include the following lines to your pom.xml and you are ready to go.
```
<dependency>
  <groupId>org.beanstalk4j</groupId>
  <artifactId>beanstalk4j</artifactId>
  <version>0.9.6</version>
</dependency>
```

Official Documentation
======================
The official documentation about the API can be found on the Beanstalk website at [http://api.beanstalkapp.com]
