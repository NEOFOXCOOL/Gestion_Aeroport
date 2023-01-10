package com.app.manager.controller;

import com.app.manager.entity.Reserver;
import com.app.manager.entity.reservation.Client;
import com.app.manager.repository.ClientRepository;
import com.app.manager.repository.ReservationRepository;
import com.app.manager.services.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/app")
@RequiredArgsConstructor
public class ReservationController {

    private final ReservationService reservationService;

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

    @DeleteMapping(path = "/delete/{id}")
    public void deleteReservation(@PathVariable  Long id){
        reservationService.deleteReservation(id);
    }
}
