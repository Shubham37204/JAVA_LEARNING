package com.Shubham.ecom_backend.Controller;

import com.Shubham.ecom_backend.Model.Product;
import com.Shubham.ecom_backend.Service.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public  class ProductController{

    @Autowired
    private ProductServices services;

    @GetMapping("/product")
    public ResponseEntity<List<Product>> getProducts(){
        return new ResponseEntity<>(services.getAllProducts(), HttpStatus.OK);
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id){
    Product product = services.getProductById(id);
        if(product!=null){
          return new ResponseEntity<>(product, HttpStatus.OK);
        }else {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
         }
    }

    @PostMapping("/product")
    public ResponseEntity<Product> addProduct(@RequestBody Product product,
                                              @RequestPart MultipartFile imageFile){
      try {
          Product prods = services.addProduct(product,imageFile);
          return new ResponseEntity<>(prods, HttpStatus.CREATED);
      }catch (Exception e){
          return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
      }

    }
}
