package com.tp.repository;

import com.tp.entity.reservation.Passager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassagerRepository extends JpaRepository<Passager,Long> {
}
