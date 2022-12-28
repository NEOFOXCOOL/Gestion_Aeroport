package com.tp.controller;

import com.tp.entity.reservation.Reservation;
import com.tp.entity.reservation.Reserver;
import com.tp.services.ReservationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping(path = "reservation")
public class ReservationController {

private final ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }


    @GetMapping(path = "/list_reservation")
    public List<Reservation> listReservation(){
        return  reservationService.reservation();
    }

}
