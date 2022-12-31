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

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.util.Date;

@Configuration
public class Confeguration {


    @Bean
    public CommandLineRunner commandLineRunner(ClientRepository clientRepository) {
        return args -> {


//            Reserver  reserver = new Reserver(
//                    "marri",
//                    "zakariae",
//                    "rabat",
//                    "0643454010",
//                    "marri@gmail.com",
//                    "marri",
//                    "zakariae",
//                    new Date(2022/12/30),
//                    new Date(2022/12/31)
//
//            );
//
//            Client client  = new Client(
//                    reserver.getClient_first_name(),
//                    reserver.getClient_last_name(),
//                    reserver.getAddress(),
//                    reserver.getTelephone(),
//                    reserver.getEmail()
//            );
//            Passager passager = new Passager(
//                    reserver.getPassager_first_name(),
//                    reserver.getPassager_last_name()
//            );
//
//            Vole vole = new Vole(
//                    reserver.getStart_vole(),
//                    reserver.getEnd_vole()
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



