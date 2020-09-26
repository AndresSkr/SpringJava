package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.IPasajeroDao;
import com.example.demo.dto.Pasajero;


@Service
public class PasajerosService {
	
	@Autowired
	IPasajeroDao iPasajeroDao;
	
	public List<Pasajero> listar(){
		return iPasajeroDao.findAll();
	}

}
