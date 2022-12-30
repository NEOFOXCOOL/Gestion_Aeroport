package com.tp.controller;

import com.tp.entity.Reserver;
import com.tp.services.ReservationService;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping(path = "reservation")
public class ReservationController {

private final ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @PostMapping(path = "/newreservation")
    public void nesReservation(@RequestBody Reserver reserver){
        reservationService.newReservation(reserver);
    }
}
