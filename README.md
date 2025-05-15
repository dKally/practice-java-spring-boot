# 📝 Spring Boot Hello World API

A simple Java + Spring Boot project to practice:
- REST endpoint creation
- URL parameter handling
- Route management

## 🚀 How to Run

1. **Prerequisites**:
    - Java 17+
    - Maven
    - IDE (IntelliJ, VS Code, Eclipse)

2. **Installation**:
   ```bash
   git clone https://github.com/dKally/practice-java-spring-boot
   cd spring-example
   mvn spring-boot:run

## Available Endpoints:


Method	URL	Description
- GET	/api/hello	Basic greeting
- GET	/api/hello/	Visitor greeting
- GET	/api/hello/{name}	Personalized greeting
- GET	/api/hello/{name}/{lastname}	Full name greeting


# 🛠️ Project Structure

```
src/ 
├── main/
│   ├── java/
│   │   └── com/
│   │       └── spring_example/
│   │           ├── DemoApplication.java     # Main class
│   │           └── controller/
│   │               └── HelloController.java # API routes
│   └── resources/
│       └── application.properties           # Configuration
```

# 💡 Key Concepts

    @RestController: Transforms class into an API controller

    @GetMapping: Maps HTTP GET requests

    @PathVariable: Captures URL values

    Route Handling:

        /hello and /hello/ are handled differently

        Parameters can be optional


# 📚 Learnings

This project helps understand:

    Spring Boot basics

    Route mapping

    Parameter handling

    Java project structure

## Educational purpose project