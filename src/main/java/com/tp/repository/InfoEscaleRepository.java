package com.tp.repository;

import com.tp.entity.Info_Escale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface InfoEscaleRepository extends JpaRepository<Info_Escale,Long> {
}
