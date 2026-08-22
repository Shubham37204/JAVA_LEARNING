package com.webproject.SpringDataJPA.Service;

import com.webproject.SpringDataJPA.Model.Product;
import com.webproject.SpringDataJPA.Repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductServices {

    @Autowired
    ProductRepo repo;

//    List<Product> products= new ArrayList<>( Arrays.asList(
//            new Product(101,"android",50000),
//            new Product(102,"iphone",420000))) ;

    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(null);
    }

    public void addProduct(Product product){
        repo.save(product);
    }

    public void updateProduct(Product prodId){
        repo.save(prodId);
    }

    public void deleteProduct(int prodId){
        repo.deleteById(prodId);
    }
}
