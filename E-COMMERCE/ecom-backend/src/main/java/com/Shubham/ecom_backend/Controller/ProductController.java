package com.webproject.SpringDataJPA.Controller;

import com.webproject.SpringDataJPA.Model.Product;
import com.webproject.SpringDataJPA.Service.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

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

       @PatchMapping("/product")
       public void updateProduct(@RequestBody Product prod) {
            productServices.updateProduct(prod);
       }

       @DeleteMapping("/product/{prodId}")
       public void deleteProduct(@RequestBody int prod) {
            productServices.deleteProduct(prod);
       }
}

