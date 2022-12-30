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

@Service
public class ReservationService {

    private  final ClientRepository clientRepository;

    public ReservationService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    //add new reservation
    public void newReservation(Reserver reserver){
            Client client = reserver.infoClient();
            Passager passager = reserver.infoPassager();
            Vole vole = reserver.infoVole();
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
