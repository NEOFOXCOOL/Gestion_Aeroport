package com.tp;

import com.tp.entity.reservation.Client;
import com.tp.entity.reservation.Passager;
import com.tp.entity.reservation.Reservation;
import com.tp.entity.vole.Vole;
import com.tp.repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
public class Confeguration {


    @Bean
    public CommandLineRunner commandLineRunner(ClientRepository clientRepository) {
        return args -> {

//            Client client = new Client(
//                    "marri",
//                    "zakariae",
//                    "rabat",
//                    "0643454010",
//                    "marri@gmail.com"
//            );
//
//            client.addReservation(new Reservation(
//                    client,
//                    new Passager("marri", "zakariae"),
//                    new Vole(LocalDateTime.now().minusHours(5), LocalDateTime.now())
//            ));
//
//            clientRepository.save(client);

        };
    }
}
