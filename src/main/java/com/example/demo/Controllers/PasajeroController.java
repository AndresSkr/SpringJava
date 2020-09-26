package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Services.PasajerosService;
import com.example.demo.dto.Pasajero;


@RestController
@RequestMapping("/api")
public class PasajeroController {

	
	@Autowired
	PasajerosService pasajeroService;
	
	@GetMapping("/pasajeros")
	public List<Pasajero> listar(){
		return pasajeroService.listar();
	}
	
}
