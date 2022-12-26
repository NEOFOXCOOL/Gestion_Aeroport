package com.tp;

import com.tp.entity.reservation.Client;
import com.tp.entity.reservation.Passager;
import com.tp.repository.ClientRepository;
import com.tp.repository.PassagerRepository;
import com.tp.repository.VoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Confeguration {

    @Bean
    public CommandLineRunner commandLineRunner(
            ClientRepository clientRepository,
            PassagerRepository passagerRepository,
            VoleRepository voleRepository
    )
    {
 return args -> {
            clientRepository.save(new Client(
                    "marri",
                    "zakariae",
                    "rabat",
                    "0643454010",
                    "marri@gmail.com"
                    ));
//            passagerRepository.save(new Passager(
//                    1L,
//                    "marri",
//                    "zakariae"
//            ));


 };
    }

}
