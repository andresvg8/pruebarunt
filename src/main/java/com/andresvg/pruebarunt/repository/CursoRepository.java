package com.andresvg.pruebarunt.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.andresvg.pruebarunt.entity.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {

}
