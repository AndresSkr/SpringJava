package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Response.Response;
import com.example.demo.Services.PasajerosService;
import com.example.demo.dto.Pasajero;


@RestController
@RequestMapping("/api")
public class PasajeroController {

	
	@Autowired
	PasajerosService pasajeroService;
	Response res;
	@GetMapping("/pasajeros")
	public List<Pasajero> listar(){
		return pasajeroService.listar();
	}
	
	@GetMapping("/pasajeros/{id}")
	public Pasajero consultar(@PathVariable int id){
		return pasajeroService.consultar(id);
	}
	
	@PostMapping("/pasajeros")
	public Response guardar(@RequestBody Pasajero pasajero){
		return pasajeroService.Guardar(pasajero);
	}
	
	@DeleteMapping("/pasajeros/{id}")
	public Response Delete(@PathVariable int id){
		return pasajeroService.Delete(id);
	}
	
	
	
}
