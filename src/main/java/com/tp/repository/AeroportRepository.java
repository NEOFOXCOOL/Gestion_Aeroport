package com.tp.repository;

import com.tp.entity.Aeroport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AeroportRepository extends JpaRepository<Aeroport,Long> {

}
