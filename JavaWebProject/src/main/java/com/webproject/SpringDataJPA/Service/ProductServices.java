package com.webproject.JavaWebProject.Service;

import com.webproject.JavaWebProject.Model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductServices {

    List<Product> products= new ArrayList<>( Arrays.asList(
            new Product(101,"android",50000),
            new Product(102,"iphone",420000))) ;

    public List<Product> getProducts(){
        return products;
    }


    public Product getProductById(int prodId) {
        return products.stream().filter(p->p.getProdid() == prodId)
                .findFirst().orElse(null);
    }

    public void addProduct(Product product){
        products.add(product);
    }

}

//@Service tells Spring:
// "Create and manage an object of this class."
//So Spring creates a ProductServices object and keeps it inside the Spring container.


