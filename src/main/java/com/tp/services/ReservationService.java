package com.tp.services;

import com.tp.entity.Reservation;
import com.tp.entity.Reserver;
import com.tp.repository.ClientRepository;
import com.tp.repository.PassagerRepository;
import com.tp.repository.ReservationRepository;
import com.tp.repository.VoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

private  final ReservationRepository reservationRepository;
private final ClientRepository clientRepository;
private final PassagerRepository passagerRepository;
private final VoleRepository voleRepository;

    public ReservationService(ReservationRepository reservationRepository, ClientRepository clientRepository, PassagerRepository passagerRepository, VoleRepository voleRepository) {
        this.reservationRepository = reservationRepository;
        this.clientRepository = clientRepository;
        this.passagerRepository = passagerRepository;
        this.voleRepository = voleRepository;
    }


    public void addReservation(Reserver reserver){
            reservationRepository.save(
            new Reservation(
                    clientRepository.findById(reserver.getClient()).get(),
                    passagerRepository.findById(reserver.getPassager()).get(),
                    voleRepository.findById(reserver.getVole()).get()
            )
            );
    }

    public List<Reservation> reservation(){
        return reservationRepository.findAll();
    }

}
