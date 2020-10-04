package tech.geek.flu.digital.profile.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"tech.geek.flu.digital.profile"})
public class DigitalProfileApp {
    public static void main(String[] args) {
        SpringApplication.run(DigitalProfileApp.class, args);
    }
}



