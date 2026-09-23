# Spring MVC

A hands-on **Spring MVC learning project** built from scratch to understand web application development using Spring Framework.

This repository focuses on understanding **Spring MVC internally and practically**, starting from HTTP and Servlet fundamentals before moving into Spring's MVC architecture.

> **Note:** Spring Boot is intentionally not used in this repository. The goal is to understand Spring MVC itself before moving to Spring Boot.

---

## 🎯 Goals

* Understand how web applications work
* Understand HTTP request/response fundamentals
* Understand the Servlet API
* Understand Servlet Containers and Tomcat
* Understand `DispatcherServlet`
* Understand Spring MVC request flow
* Build Controllers and handle requests
* Understand request parameters and path variables
* Understand Model and Views
* Understand Filters and Interceptors
* Understand MVC architecture
* Build Spring MVC applications without Spring Boot

---

# 📚 Topics

## 7.1 Web Fundamentals

**Status:** 

Topics:

* Web applications
* Client and Server
* HTTP
* HTTP Request
* HTTP Response
* HTTP Methods
* URL structure
* HTTP Headers
* Request Body
* Response Body
* HTTP Status Codes
* Servlet
* `HttpServletRequest`
* `HttpServletResponse`
* Servlet Container
* Apache Tomcat
* Why Spring MVC
* Basic MVC request flow

### Project

**Employee Web Server**

Technologies:

* Java 21
* Maven
* Servlet API
* Apache Tomcat
* `@WebServlet`

Current flow:

```text
Client
   ↓
HTTP Request
   ↓
Tomcat
   ↓
Servlet
   ↓
HttpServletRequest
   ↓
Application Logic
   ↓
HttpServletResponse
   ↓
HTTP Response
   ↓
Client
```

---

## 7.2 HTTP in Depth

**Status:** 

Topics:

* HTTP request structure
* HTTP response structure
* HTTP methods
* URL
* Query parameters
* Headers
* Request body
* Response body
* Content-Type
* Accept
* Status codes
* Statelessness
* Cookies
* Sessions — introduction

---

## 7.3 Servlet Fundamentals

**Status:** 

Topics:

* Servlet lifecycle
* `HttpServlet`
* `doGet()`
* `doPost()`
* `doPut()`
* `doDelete()`
* Servlet configuration
* `@WebServlet`
* Servlet initialization
* Servlet destruction
* Request parameters
* Request attributes
* Response handling
* Servlet context
* Servlet configuration

---

## 7.4 DispatcherServlet

**Status:**

Topics:

* What is `DispatcherServlet`?
* Front Controller pattern
* Why Spring MVC uses `DispatcherServlet`
* DispatcherServlet initialization
* DispatcherServlet configuration
* Request dispatching
* Handler mapping
* Handler adapter
* Controller execution
* View resolution

Request flow:

```text
Client
   ↓
Tomcat
   ↓
DispatcherServlet
   ↓
Handler Mapping
   ↓
Controller
   ↓
Handler Adapter
   ↓
Controller Method
   ↓
View / Response
```

---

## 7.5 Controllers

**Status:** 

Topics:

* `@Controller`
* Controller classes
* Controller methods
* `@RequestMapping`
* `@GetMapping`
* `@PostMapping`
* `@PutMapping`
* `@DeleteMapping`
* Controller responsibilities
* Controller → Service architecture

---

## 7.6 Request Mapping & Request Data

**Status:** ⬜ Not Started

Topics:

* URL mapping
* `@RequestMapping`
* `@GetMapping`
* `@PostMapping`
* `@RequestParam`
* `@PathVariable`
* `@RequestHeader`
* `@CookieValue`
* Request parameters
* Path variables
* HTTP headers
* Multiple request parameters

---

## 7.7 Request Body & Form Data

**Status:** ⬜ Not Started

Topics:

* HTML forms
* Form submission
* Request body
* Form data
* `@RequestBody`
* `@ModelAttribute`
* Data binding
* Object binding

---

## 7.8 Model

**Status:** ⬜ Not Started

Topics:

* Model
* Passing data from Controller to View
* `Model`
* `ModelMap`
* Model attributes
* Request attributes
* Controller → View data flow

---

## 7.9 Views & View Resolution

**Status:** ⬜ Not Started

Topics:

* Server-side rendering
* View
* ViewResolver
* View name
* JSP
* Thymeleaf — introduction
* Controller → View
* Model → View

Flow:

```text
Controller
    ↓
Model
    ↓
View Name
    ↓
ViewResolver
    ↓
View
    ↓
HTML Response
```

---

## 7.10 Filters

**Status:** ⬜ Not Started

Topics:

* Servlet Filter
* Filter lifecycle
* `Filter`
* `FilterChain`
* `doFilter()`
* Request preprocessing
* Response postprocessing
* Logging
* Encoding
* Filter configuration
* Filter vs Servlet

Flow:

```text
Client
   ↓
Filter
   ↓
DispatcherServlet
   ↓
Controller
```

---

## 7.11 Interceptors

**Status:** ⬜ Not Started

Topics:

* `HandlerInterceptor`
* `preHandle()`
* `postHandle()`
* `afterCompletion()`
* Interceptor configuration
* Request interception
* Controller-level processing
* Filter vs Interceptor

Flow:

```text
Client
   ↓
Filter
   ↓
DispatcherServlet
   ↓
Interceptor
   ↓
Controller
```

---

## 7.12 Exception Handling

**Status:** ⬜ Not Started

Topics:

* Controller exceptions
* `@ExceptionHandler`
* `@ControllerAdvice`
* Global exception handling
* Error responses
* HTTP status codes

---

## 7.13 Spring MVC Architecture

**Status:** ⬜ Not Started

Complete request flow:

```text
                    Client
                       │
                       │ HTTP Request
                       ▼
              Servlet Container
                   (Tomcat)
                       │
                       ▼
                    Filter
                       │
                       ▼
               DispatcherServlet
                       │
                       ▼
                  Interceptor
                       │
                       ▼
                   Controller
                       │
                       ▼
                    Service
                       │
                       ▼
               DAO / Repository
                       │
                       ▼
                   Database
```

Response:

```text
Database
   ↑
DAO / Repository
   ↑
Service
   ↑
Controller
   ↑
Interceptor
   ↑
DispatcherServlet
   ↑
Filter
   ↑
Tomcat
   ↑
Client
```

---

# 🛠️ Technologies

| Technology       | Purpose                       |
| ---------------- | ----------------------------- |
| Java 21          | Programming language          |
| Maven            | Build & dependency management |
| Servlet API      | Web foundation                |
| Apache Tomcat    | Servlet container             |
| Spring Framework | MVC framework                 |
| JSP / Thymeleaf  | Server-side views             |
| Git              | Version control               |

> Spring Boot is intentionally excluded from this repository.

---

# 📁 Repository Structure

The structure will evolve as new topics are added.

Initial structure:

```text
spring-mvc
│
├── pom.xml
│
├── src
│   └── main
│       ├── java
│       │   └── ...
│       │
│       └── webapp
│           └── WEB-INF
│
└── README.md
```

---

# 🧠 Learning Approach

This repository follows a **concept → implementation → project** approach.

For each topic:

1. Learn the underlying concept
2. Understand how Spring handles it
3. Implement it from scratch
4. Add it to the project
5. Commit the changes
6. Update this README

The goal is to understand **why Spring MVC works**, rather than only memorizing annotations.

---

# 📝 Commit Progress

| Topic | Description                    | Status         |
| ----- | ------------------------------ | -------------- |
| 7.1   | Web Fundamentals               | 🟡 In Progress |
| 7.2   | HTTP in Depth                  | ⬜              |
| 7.3   | Servlet Fundamentals           | ⬜              |
| 7.4   | DispatcherServlet              | ⬜              |
| 7.5   | Controllers                    | ⬜              |
| 7.6   | Request Mapping & Request Data | ⬜              |
| 7.7   | Request Body & Form Data       | ⬜              |
| 7.8   | Model                          | ⬜              |
| 7.9   | Views & View Resolution        | ⬜              |
| 7.10  | Filters                        | ⬜              |
| 7.11  | Interceptors                   | ⬜              |
| 7.12  | Exception Handling             | ⬜              |
| 7.13  | Spring MVC Architecture        | ⬜              |

---

# 🎯 Final Goal

By completing this repository, I should be able to understand and build a Spring MVC application without depending on Spring Boot.

The final architecture should look like:

```text
Client
   ↓
HTTP
   ↓
Tomcat
   ↓
Filter
   ↓
DispatcherServlet
   ↓
Interceptor
   ↓
Controller
   ↓
Service
   ↓
DAO / Repository
   ↓
Database
```

The next step after completing Spring MVC is to move to **Spring Boot**, where the focus will shift from manually configuring the Spring application to understanding **auto-configuration, starters, embedded servers, and production-ready application setup**.
