package com.example.producto.models.dao;

import com.example.producto.models.entity.producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productoDao extends JpaRepository<producto, Long> {
}
