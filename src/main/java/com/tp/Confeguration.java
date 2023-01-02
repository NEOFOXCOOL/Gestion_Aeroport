package com.tp;

import com.tp.repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
//                   LocalDateTime.now(),
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
//        "start_vole":"2023-01-02",
//        "end_vole":"2023-01-03"
//        }



