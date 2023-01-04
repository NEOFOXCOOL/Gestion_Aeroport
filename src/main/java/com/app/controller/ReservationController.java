package com.app.controller;

import com.app.entity.Reserver;
import com.app.entity.reservation.Client;
import com.app.repository.ClientRepository;
import com.app.repository.ReservationRepository;
import com.app.services.ReservationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "app")
public class ReservationController {

private final ReservationService reservationService;
    private final ReservationRepository reservationRepository;
    private final ClientRepository clientRepository;

    public ReservationController(ReservationService reservationService,
                                 ReservationRepository reservationRepository,
                                 ClientRepository clientRepository) {
        this.reservationService = reservationService;
        this.reservationRepository = reservationRepository;
        this.clientRepository = clientRepository;
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

    @DeleteMapping(path = "/delete/{id}")
    public void deleteReservation(@PathVariable  Long id){
        reservationService.deleteReservation(id);
    }
}
