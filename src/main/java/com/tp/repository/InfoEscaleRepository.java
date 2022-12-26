package com.tp.repository;

import com.tp.entity.vole.InfoEscale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface InfoEscaleRepository extends JpaRepository<InfoEscale,Long> {
}
