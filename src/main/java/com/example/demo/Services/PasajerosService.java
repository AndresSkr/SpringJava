package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.IPasajeroDao;
import com.example.demo.Response.Response;
import com.example.demo.dto.Pasajero;


@Service
public class PasajerosService {
	
	@Autowired
	IPasajeroDao iPasajeroDao;
	Response res = new Response();
	public List<Pasajero> listar(){
		return (List<Pasajero>) iPasajeroDao.findAll();
	}
	
	public Pasajero consultar(int id) {
		
		try {
			return iPasajeroDao.findById(id).get();
		} catch (Exception e) {
			return new Pasajero(0,"no encontrado");
		}
		
	}
	
	public Response Guardar(Pasajero pasajero) {
		
		if(pasajero.getId()==0) {
			res.setMessage("ID no puede ser 0");
			res.setStatus(false);
			return res;
		}
		
		try {
			Pasajero existePasajero=consultar(pasajero.getId());
			if(existePasajero.getId()==0 ) {
				iPasajeroDao.save(pasajero);
				res.setMessage("Usuario ingreso correctamente");
				res.setStatus(true);
				return res;
			}else {
				res.setMessage("Ya hay un usuario con este ID");
				res.setStatus(false);
				return res;
			}
		
			
		} catch (Exception e) {
			res.setMessage(e.getMessage());
			res.setStatus(false);
			return res;
		}
		
		
	}
	
	public Response Delete(int id) {
		try {
			Pasajero existePasajero=consultar(id);
			
			if(existePasajero.getId()!=0 ) {

				 iPasajeroDao.deleteById(id);
				res.setMessage("PASAJERO ELIMINADO CORRECTAMENTE");
				res.setStatus(true);
				return res;
			}else {
				res.setMessage("EL USUARIO QUE QUIERE ELIMINAR NO EXISTE");
				res.setStatus(false);
				return res;
			}
		} catch (Exception e) {
			res.setMessage(e.getMessage());
			res.setStatus(false);
			return res;
		}
		
		 
		 
	}
}
