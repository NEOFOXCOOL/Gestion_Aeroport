package com.tp.controller;

import com.tp.entity.Reserver;
import com.tp.entity.reservation.Client;
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

    @GetMapping(path = "client")
    public List<Client> clientList(){
        return reservationService.clientList();
    }
    @PostMapping(path = "/newreservation")
    public void nesReservation(@RequestBody Reserver reserver){
        reservationService.newReservation(reserver);
    }

    @PutMapping(path = "update/{id}")
    public void updateReservation(@PathVariable Long id,@RequestBody Reserver reserver){
        reservationService.updateReservation(id,reserver);
    }
}
