package com.Shubham.ecom_backend.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String desc;
    private String brand;
    private BigDecimal price;
    private String category;

    private int stockQuantity;

    private String releaseDate;

    private boolean available;

    private String imageName;
    private String imageType;

    @Lob
    private byte[] imageData;
}
