package com.hafidtech.ecommerceapi.repository;

import com.hafidtech.ecommerceapi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findAllByNameContaining(String title);
}
