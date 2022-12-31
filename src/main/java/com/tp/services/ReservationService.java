package com.tp.services;

import com.tp.entity.Reserver;
import com.tp.entity.reservation.Client;
import com.tp.entity.reservation.Passager;
import com.tp.entity.reservation.Reservation;
import com.tp.entity.reservation.ReservationID;
import com.tp.entity.vole.Vole;
import com.tp.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReservationService {

    private  final ClientRepository clientRepository;

    public ReservationService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }


    public List<Client> clientList(){
        return  clientRepository.findAll();
    }

    //add new reservation
    public void newReservation(Reserver reserver){

        Client client  = new Client(
                reserver.getClient_first_name(),
                reserver.getClient_last_name(),
                reserver.getAddress(),
                reserver.getTelephone(),
                reserver.getEmail()
        );
        Passager passager = new Passager(
                reserver.getPassager_first_name(),
                reserver.getPassager_last_name()
        );

        Vole vole = new Vole(
                reserver.getStart_vole(),
                reserver.getEnd_vole()
        );

            client.addReservation(new Reservation(
                    new ReservationID(
                            client.getClientID(),
                            passager.getPassagerID(),
                            vole.getVoleID()
                    ),
                    LocalDateTime.now(),
                    client,
                    passager,
                    vole
            ));
            clientRepository.save(client);
    }
}
