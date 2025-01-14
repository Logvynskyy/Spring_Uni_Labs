package com.kpi.lab1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab1V27Application implements CommandLineRunner {

    public static void main(String[] args) {
        System.out.println("Begin of main");
        SpringApplication.run(Lab1V27Application.class, args);
        System.out.println("End of main");
    }

    @Override
    public void run(String ...args) {
        System.out.println("Hello from Spring Boot");
    }

}
