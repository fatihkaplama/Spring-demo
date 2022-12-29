package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student fatih = new Student(
                    1L,
                    "Fatih",
                    LocalDate.of(2000, Month.FEBRUARY, 23),
                    "fatih@gmail.com"
            );

            Student zeynep = new Student(
                    2L,
                    "Zeynep",
                    LocalDate.of(2003, Month.AUGUST, 16),
                    "zeynep@gmail.com"
            );

            repository.saveAll(
                    List.of(fatih, zeynep)
            );
        };
    }
}
