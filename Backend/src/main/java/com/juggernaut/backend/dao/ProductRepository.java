package com.juggernaut.backend.dao;

import com.juggernaut.backend.entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products, Long> {



}
