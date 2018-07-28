package com.noat;

import com.noat.data.repository.UserRepository;
import com.noat.data.representarion.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private UserRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        repository.deleteAll();

        // save a couple of customers
        repository.save(User.builder()
                .username("felpera")
                .hashedPassword("huehuebrbr")
                .name("Felipe 1")
                .build());
        repository.save(User.builder()
                .username("felpera2")
                .hashedPassword("huehuebrbr2")
                .name("Felipe 2")
                .build());

        // fetch all customers
        System.out.println("Usuarios encontrados com findAll():");
        System.out.println("-------------------------------");
        for (User user : repository.findAll()) {
            System.out.println(user);
        }
        System.out.println();

        // fetch an individual customer
        System.out.println("Usuarios encontrados com findByUsername('felpera'):");
        System.out.println("--------------------------------");
        System.out.println(repository.findByUsername("felpera"));
    }
}
