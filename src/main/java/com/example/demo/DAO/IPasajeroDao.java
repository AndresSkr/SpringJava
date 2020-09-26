package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.Pasajero;


@Repository
public interface IPasajeroDao extends JpaRepository<Pasajero, Integer> {

}
