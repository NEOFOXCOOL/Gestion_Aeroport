package com.tp.repository;

import com.tp.entity.Vole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface VoleRepository extends JpaRepository<Vole,Long> {
}
