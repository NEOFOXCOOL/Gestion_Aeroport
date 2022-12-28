package com.tp;

import com.tp.entity.reservation.Client;
import com.tp.entity.reservation.Passager;
import com.tp.entity.reservation.Reservation;
import com.tp.entity.reservation.Reserver;
import com.tp.entity.vole.Vole;
import com.tp.repository.ClientRepository;
import com.tp.repository.PassagerRepository;
import com.tp.repository.ReservationRepository;
import com.tp.repository.VoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
public class Confeguration {


    @Bean
    public CommandLineRunner commandLineRunner(
            ClientRepository clientRepository,
            ReservationRepository reservationRepository,
            PassagerRepository passagerRepository,
            VoleRepository voleRepository

    )
    {
         return args -> {

             Reservation reservation = new Reservation();
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
             client.Reserver(
                     reservation,
                     passager,
                     vole
             );

             clientRepository.save(client);




         };
    }
}
