package com.app.repository;

import com.app.entity.reservation.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import java.util.Optional;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
    Optional<Reservation> findById(Long id);
    Reservation findReservationById(Long id);
    Reservation findReservationById_ClientID(Long id);
}
