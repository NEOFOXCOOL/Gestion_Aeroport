package com.tp;

import com.tp.entity.reservation.Client;
import com.tp.entity.reservation.Passager;
import com.tp.entity.reservation.Reservation;
import com.tp.entity.reservation.ReservationID;
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

            Client client = new Client(
                    "marri",
                    "zakariae",
                    "rabat",
                    "0643454010",
                    "marri@gmail.com"
            );

            Passager passager = new Passager(
                    "marri",
                    "zakariae"
            );

            Vole vole = new Vole(
                    LocalDateTime.now().minusHours(5),
                    LocalDateTime.now()
            );

            client.addReservation(new Reservation(
                    new ReservationID(1L,1L,1L),
                    LocalDateTime.now(),
                    client,
                    passager,
                    vole
            ));

            clientRepository.save(client);

        };
    }
}
