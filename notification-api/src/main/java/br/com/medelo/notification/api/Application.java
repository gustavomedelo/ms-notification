package br.com.medelo.notification.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "br.com.medelo")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}