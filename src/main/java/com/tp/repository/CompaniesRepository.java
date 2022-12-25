package com.tp.repository;

import com.tp.entity.CompagniesAerienne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface CompaniesRepository extends JpaRepository<CompagniesAerienne,Long> {
}
