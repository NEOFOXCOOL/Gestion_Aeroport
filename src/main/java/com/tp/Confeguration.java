package com.tp;

import com.tp.entity.reservation.Client;
import com.tp.entity.reservation.Person;
import com.tp.entity.reservation.Reservation;
import com.tp.entity.reservation.Reserver;
import com.tp.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
public class Confeguration {


    @Bean
    public CommandLineRunner commandLineRunner(PersonRepository personRepository) {
        return args -> {


            Reserver reserver = new Reserver(
                    "marri",
                    "zakariae",
                    "rabat",
                    "0643454010",
                    "marri@gmail.com",
                    "marri",
                    "zakariae",
                    LocalDateTime.now().minusHours(5),
                    LocalDateTime.now()
            );

            Client client = new Client();
            Reservation reservation = new Reservation();
            client.setFirst_name("marri");
            client.setLast_name("zakariae");
            client.setTelephone("0643454010");
            client.setAddress("rabat");
            client.setEmail("mari@gmail.com");
            client.reserver(reservation);
            personRepository.save(client);
        };
    }
}
