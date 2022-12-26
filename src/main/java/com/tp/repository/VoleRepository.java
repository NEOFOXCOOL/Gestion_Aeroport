package com.tp.repository;

import com.tp.entity.Vole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoleRepository extends JpaRepository<Vole,Long> {
}
