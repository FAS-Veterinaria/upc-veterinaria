package com.example.veterinaria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class VeterinariaApplication {

    @Autowired
    private DateRepository dateRepository;

    @PostMapping("/date")
    public Date addDate(@RequestBody Date date) {
        return dateRepository.save(date);
    }

    @GetMapping("/dates")
    public List<Date> getDates() {
        return dateRepository.findAll();
    }

    public static void main(String[] args) {
        SpringApplication.run(VeterinariaApplication.class, args);
    }

}
