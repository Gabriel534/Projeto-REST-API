package com.servidor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.servidor.model.Computadores;

@Repository
public interface ComputadoresRepository extends JpaRepository<Computadores,Long>{

}
