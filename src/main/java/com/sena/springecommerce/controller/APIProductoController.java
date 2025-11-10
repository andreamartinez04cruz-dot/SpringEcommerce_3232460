package com.sena.springecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.springecommerce.service.IProductoServece;

@RestController
@RequestMapping("/apiproductos")
public class APIProductoController {

	@Autowired
	private IProductoServece productoservice;
}
