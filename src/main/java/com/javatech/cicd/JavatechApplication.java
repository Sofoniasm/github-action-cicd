package com.javatech.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavatechApplication {

    // Define a GET mapping for "/welcome"
    @GetMapping("/welcome")
    public String welcome() { // Corrected method declaration with parentheses
        return "Welcome to java techie!"; // Return welcome message
    }
   // echo "# github-action-cicd" >> README.md
   // git init
   // git add README.md
   // git commit -m "first commit"
   // git branch -M main
   // git remote add origin https://github.com/Sofoniasm/github-action-cicd.git
   // git push -u origin main

    // Main method to run the Spring Boot application
    public static void main(String[] args) {
        SpringApplication.run(JavatechApplication.class, args);
    }

}

