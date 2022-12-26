package com.tp.controller;

import com.tp.entity.reservation.Reservation;
import com.tp.entity.Reserver;
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

    @PostMapping(path = "/reserver")
    public void resever(@RequestBody  Reserver reserver){
        reservationService.addReservation(reserver);
    }
}
