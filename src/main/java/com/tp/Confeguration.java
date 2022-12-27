package com.tp;

import com.tp.entity.reservation.Client;
import com.tp.entity.reservation.Passager;
import com.tp.entity.reservation.Reservation;
import com.tp.entity.reservation.Reserver;
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
    public CommandLineRunner commandLineRunner(ReservationRepository reservationRepository)
    {
         return args -> {

//             Reserver reserver = new Reserver(
//                     "marri",
//                     "zakariae",
//                     "rabat",
//                     "0643454010",
//                     "marri@gmail.com",
//                     "marri",
//                     "zakariae",
//                     LocalDateTime.now().minusHours(5),
//                     LocalDateTime.now()
//             );
//
//        reservationRepository.save(
//                new Reservation(
//                        1L,
//                        LocalDateTime.now(),
//                        reserver.client(),
//                        reserver.passager(),
//                        reserver.vole()
//                ) );

            };
    }

}
