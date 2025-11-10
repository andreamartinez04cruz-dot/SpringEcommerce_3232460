package com.sena.springecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.springecommerce.model.Producto;

public interface IProductoRepository extends JpaRepository<Producto, Integer> {

}
