package com.webproject.SpringDataJPA.Repo;

import com.webproject.SpringDataJPA.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {}

