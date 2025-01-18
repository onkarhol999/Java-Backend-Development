package com.onkar.ShoopingWebsiteUsingSpring.repo;

import com.onkar.ShoopingWebsiteUsingSpring.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
