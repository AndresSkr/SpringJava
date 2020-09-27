package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.IPasajeroDao;
import com.example.demo.dto.Pasajero;


@Service
public class PasajerosService {
	
	@Autowired
	IPasajeroDao iPasajeroDao;
	
	public List<Pasajero> listar(){
		return (List<Pasajero>) iPasajeroDao.findAll();
	}
	
	public Pasajero consultar(int id) {
		return iPasajeroDao.findById(id).get();
	}
	
	public Pasajero Guardar(Pasajero pasajero) {
		return iPasajeroDao.save(pasajero);
	}
	
	public void Delete(int id) {
		 iPasajeroDao.deleteById(id);
	}
}
