package com.onkar.ShoopingWebsiteUsingSpring.service;

import com.onkar.ShoopingWebsiteUsingSpring.model.Product;
import com.onkar.ShoopingWebsiteUsingSpring.repo.ProductRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;

    public List<Product> getAllProduct() {
         return repo.findAll();
    }

    public Product getAllProductById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Transactional
    public void addNewProduct(Product product) {
        repo.save(product);
    }

    public void deleteProduct(int id) {
        repo.deleteById(id);
    }
}
