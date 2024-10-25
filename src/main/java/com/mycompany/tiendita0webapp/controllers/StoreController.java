/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendita0webapp.controllers;

import ch.qos.logback.core.model.Model;
import com.mycompany.tiendita0webapp.entities.Product;
import com.mycompany.tiendita0webapp.entities.User;
import org.springframework.web.bind.annotation.*;
import com.mycompany.tiendita0webapp.services.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RestController
@RequestMapping("/store")
public class StoreController {

    @Autowired
    private StoreService storeService;
    
    @GetMapping("/")
    public String index(Model model) {
        return "index"; // this renders src/main/resources/templates/index.html
    }

    // Get all products
    @GetMapping("/products")
    public List<Product> getProducts() {
        return storeService.getAllProducts();
    }

    // Add a new product
    @PostMapping("/products")
    public void addProduct(@RequestBody Product product) {
        storeService.addProduct(product);
    }

    // Get all users
    @GetMapping("/users")
    public List<User> getUsers() {
        return storeService.getAllUsers();
    }

    // Add a new user
    @PostMapping("/users")
    public void addUser(@RequestBody User user) {
        storeService.addUser(user);
    }
}

