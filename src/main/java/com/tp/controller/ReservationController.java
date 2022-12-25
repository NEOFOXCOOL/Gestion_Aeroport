package com.tp.controller;

import com.tp.entity.Reservation;
import com.tp.services.ReservationServices;
import com.tp.services.ResourceNotfound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
//@RequestMapping(path = "reservation")
public class ReservationController {

    @Autowired
    private  ReservationServices reservationServices;

    @GetMapping(path = "/list")
    public List<Reservation> listreservation(){
        return reservationServices.listReservation();
    }

    @PostMapping(path = "reserver")
    public void reserver(@RequestBody Reservation reservation){
reservationServices.reserver(reservation);
    }

    @PutMapping(path = "edit_reservation")
    public void updatereservation(@PathVariable("num_reservation") Long id,@RequestBody Reservation reservation) throws ResourceNotfound {
        reservationServices.editReservation(id,reservation);
    }

}
