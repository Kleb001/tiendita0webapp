    package com.mycompany.tiendita0webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class StoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(StoreApplication.class, args);
    }
}

@Controller
class HomeController {

    @GetMapping("/o")
    @ResponseBody
    public String home() {
        return "Welcome to the Store!";
    }

    @GetMapping("/products")
    @ResponseBody
    public String products() {
        return "List of Psssroducts";
    }
}