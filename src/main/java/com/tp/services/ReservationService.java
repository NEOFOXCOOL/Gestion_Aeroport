package com.tp.services;

import com.tp.entity.reservation.Reservation;
import com.tp.entity.reservation.Reserver;
import com.tp.repository.ClientRepository;
import com.tp.repository.PassagerRepository;
import com.tp.repository.ReservationRepository;
import com.tp.repository.VoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

private  final ReservationRepository reservationRepository;

    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public List<Reservation> reservation(){
        return reservationRepository.findAll();
    }



}
