package com.tp;

import com.tp.entity.Client;
import com.tp.repository.ClientRepository;
import com.tp.repository.PassagerRepository;
import com.tp.repository.VoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Confeguration {

    public CommandLineRunner commandLineRunner(
            ClientRepository clientRepository,
            PassagerRepository passagerRepository,
            VoleRepository voleRepository
    )
    {
        clientRepository.save(
                new Client(
                        1L,
                        "marri",
                        "zakariae",
                        "rabat",
                        "0643454010",
                        "marri@gmail.com"
                )
        )
    }

}
