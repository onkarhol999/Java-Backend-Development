package com.onkar.ShoopingWebsiteUsingSpring.controller;

import com.onkar.ShoopingWebsiteUsingSpring.model.Product;
import com.onkar.ShoopingWebsiteUsingSpring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/getAllProduct")
    public ResponseEntity< List<Product>> getAllProduct(){
        return new ResponseEntity<>(service.getAllProduct(), HttpStatus.OK);
    }

    @GetMapping("/getProductById/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id){
        return new ResponseEntity<>(service.getAllProductById(id), HttpStatus.OK);
    }

    @PostMapping("/addNewProduct")
    public String addNewProduct(@RequestBody Product product){
        service.addNewProduct(product);
        return "Added..";
    }

    @DeleteMapping("/deleteProdcut/{id}")
    public String deleteProduct(@PathVariable int id){
        service.deleteProduct(id);
        return "Deleted....";
    }

}
