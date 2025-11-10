package com.sena.springecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.springecommerce.model.DetalleOrden;

@Service
public class DetalleOrdenServeceImplement implements IDetalleOrdenService {
	@Autowired
	private IDetalleOrdenRepository detalleOrdenRepository;
	

	@Override
	public DetalleOrden save(DetalleOrden detalleOrden) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
