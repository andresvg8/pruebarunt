package com.andresvg.pruebarunt.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.andresvg.pruebarunt.entity.Colegio;

@Repository
public interface ColegioRepository extends JpaRepository<Colegio, Long> {

}
