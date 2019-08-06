package com.theGuyBurguer.theGuyBurguer;

import com.theGuyBurguer.theGuyBurguer.infra.GenericRepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(repositoryBaseClass = GenericRepositoryImpl.class)
public class TheGuyBurguerApplication {

    public static void main(String[] args) {
	SpringApplication.run(TheGuyBurguerApplication.class, args);
    }

}
