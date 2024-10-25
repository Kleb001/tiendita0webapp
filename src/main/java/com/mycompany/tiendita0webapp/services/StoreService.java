/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendita0webapp.services;



import com.mycompany.tiendita0webapp.entities.Product;
import com.mycompany.tiendita0webapp.entities.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StoreService {
    // List to store products
    private List<Product> products = new ArrayList<>();
    
    // List to store users
    private List<User> users = new ArrayList<>();

    // Method to get all products
    public List<Product> getAllProducts() {
        return products;
    }

    // Method to add a new product
    public void addProduct(Product product) {
        products.add(product);
    }

    // Method to get all users
    public List<User> getAllUsers() {
        return users;
    }

    // Method to add a new user
    public void addUser(User user) {
        users.add(user);
    }
}