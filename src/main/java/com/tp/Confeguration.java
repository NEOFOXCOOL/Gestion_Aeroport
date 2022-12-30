package com.tp;

import com.tp.entity.Reserver;
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


//            Client client = new Client(
//                    "marri",
//                    "zakariae",
//                    "rabat",
//                    "0643454010",
//                    "marri@gmail.com"
//            );
//
//            Passager passager = new Passager(
//                    "marri",
//                    "zakariae"
//            );
//
//            Vole vole = new Vole(
//                    LocalDateTime.now().minusHours(5),
//                    LocalDateTime.now()
//            );
//
//            client.addReservation(new Reservation(
//                    new ReservationID(1L,1L,1L),
//                    LocalDateTime.now(),
//                    client,
//                    passager,
//                    vole
//            ));
//
//            clientRepository.save(client);

        };
    }
}

//Json Request
//{
//        "client_first_name":"marri",
//        "client_last_name":"zakariae",
//        "address":"rabat",
//        "telephone":"0643454010",
//        "email":"marri@gmail.com",
//        "passager_first_name":"marri",
//        "passager_last_name":"zakariae",
//        "start_vole": {
//        "year" : 2010,
//        "month" : "JANUARY",
//        "dayOfMonth" : 1,
//        "dayOfWeek" : "FRIDAY",
//        "dayOfYear" : 1,
//        "monthValue" : 1,
//        "hour" : 2,
//        "minute" : 2,
//        "second" : 0,
//        "nano" : 0,
//        "chronology" : {
//        "id" : "ISO",
//        "calendarType" : "iso8601"
//        }
//        },
//        "end_vole": {
//        "year" : 2010,
//        "month" : "JANUARY",
//        "dayOfMonth" : 1,
//        "dayOfWeek" : "FRIDAY",
//        "dayOfYear" : 1,
//        "monthValue" : 1,
//        "hour" : 4,
//        "minute" : 2,
//        "second" : 0,
//        "nano" : 0,
//        "chronology" : {
//        "id" : "ISO",
//        "calendarType" : "iso8601"
//        }
//        }
//        }



