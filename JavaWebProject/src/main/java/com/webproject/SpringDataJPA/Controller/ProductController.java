package com.webproject.SpringDataJPA.Controller;

import com.webproject.SpringDataJPA.Model.Product;
import com.webproject.SpringDataJPA.Service.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//This tells Spring:
//"This class contains methods that handle HTTP requests and return data to the client."
//So Spring registers ProductController as a controller.
@RestController
public class ProductController {

        //You are basically saying:
        //"Spring, give me the ProductServices object
        // that you created."
        //Remember:@Service
        //public class ProductServices
        //tells Spring to create a ProductServices object.
        //Then:Autowired
        //ProductServices productServices;
        //asks Spring to inject that object into the controller.
        @Autowired
        ProductServices productServices;

        @GetMapping("/product")
        public List<Product> getProducts(){
            return  productServices.getProducts();
        }

        @GetMapping("/product/{prodId}")
       public Product getProductById(@PathVariable int prodId) {
            return productServices.getProductById(prodId);
       }

       @PostMapping("/product")
       public void addProduct(@RequestBody Product prod) {
                productServices.addProduct(prod);
       }
}

