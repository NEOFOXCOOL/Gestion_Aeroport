package com.tp.services;

import com.tp.entity.Client;
import com.tp.entity.Passager;
import com.tp.entity.Vole;
import com.tp.repository.ClientRepository;
import com.tp.repository.PassagerRepository;
import com.tp.repository.ReservationRepository;
import com.tp.entity.Reservation;
import com.tp.repository.VoleRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Transactional
public class ReservationServices implements RSVrepository {

    private final ClientRepository clientRepository;
    private final PassagerRepository passagerRepository;
    private final ReservationRepository reservationRepository;
    private final VoleRepository voleRepository;

    public ReservationServices(
            ClientRepository clientRepository,
            PassagerRepository passagerRepository,
            ReservationRepository reservationRepository,
            VoleRepository voleRepository) {
        this.clientRepository = clientRepository;
        this.passagerRepository = passagerRepository;
        this.reservationRepository = reservationRepository;
        this.voleRepository = voleRepository;
    }

    public List<Reservation> listReservation(){
        return reservationRepository.findAll();
    }
    //Add reservation
    public void reserver(Reservation reservation){
        saveReservation(reservation);
    }
    //modifier reservation
public void editReservation(Long id,Reservation reservation) throws ResourceNotfound {
        Reservation updatedReservation = reservationRepository.findById(id).orElseThrow(
                () -> new ResourceNotfound("not found with id")
        );
        updatedReservation.setDate_réservation(reservation.getDate_réservation());
        updatedReservation.setPassager(reservation.getPassager());
        updatedReservation.setClient(reservation.getClient());
        updatedReservation.setVole(reservation.getVole());
        saveReservation(reservation);
}

    @Override
    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Passager savePassager(Passager passager) {
        return passagerRepository.save(passager);
    }

    @Override
    public Vole saveVole(Vole vole) {
        return voleRepository.save(vole);
    }

    @Override
    public Reservation saveReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }
}
