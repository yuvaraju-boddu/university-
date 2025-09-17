# University Application

A simple Spring Boot application for managing university-related data.

## Features

- Spring Boot based Java application
- Maven for build and dependency management

## Prerequisites

- Java 17 or higher
- Maven 3.8+
- Git

## Setup

1. Clone the repository:
2. Build the project:
3. mvn clean install then Run the application

## CREAT DATABASE (schema)

we can creat three tables like studen,course and professor.and all table connection by using Foreign keys 
And relation between like this 1.STUDENT TO COURSES --> one to many 2.PROFESSOR TO COURSES -->one to many

<img width="897" height="592" alt="image" src="https://github.com/user-attachments/assets/92737e90-54fb-4a51-94a6-f50b0528845a" />

## DEBUGING 
1. Set Breakpoints Click in the left margin next to the code line where you want execution to pause (e.g., inside a controller method).
2. <img width="1159" height="513" alt="image" src="https://github.com/user-attachments/assets/30905f71-a606-4aa8-9d98-ebafde74454e" />

3. Start in Debug Mode Click the green bug icon or right-click your main class and select Debug 'UniversityApplication'.
4. <img width="978" height="452" alt="image" src="https://github.com/user-attachments/assets/8b9137e5-6fa7-4ce3-9b26-a628db431f4f" />

5. Trigger the Endpoint Use a browser or tool like Postman to call the API endpoint (e.g., http://localhost:8080/api/university/students).
6. Execution Pauses at Breakpoint When the breakpoint is hit, IntelliJ will pause execution and highlight the line.
7. Inspect Variables Use the Debug panel to view variable values, call stack, and method parameters.
8. Step Through Code Use the toolbar buttons:
      Step Over (F8): Move to the next line in the same method.
      Step Into (F7): Enter into method calls.
      Step Out (Shift+F8): Exit the current method.
9. Continue or Stop Debugging Click Resume (F9) to continue or Stop to end the session.
   


