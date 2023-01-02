package com.tp.repository;

import com.tp.entity.reservation.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
    Optional<Reservation> findById(Long id);
    Reservation findReservationById(Long id);
}
