package com.webproject.SpringDataJPA.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {

    @Id
    private int prodid;
    private String prodName;
    private int price;

    public Product() {}

    public Product( int prodid, String prodName, int price) {
        this.prodid = prodid;
        this.prodName = prodName;
        this.price = price;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getProdid() {
        return prodid;
    }

    public void setProdid(int prodid) {
        this.prodid = prodid;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodid=" + prodid +
                ", prodName='" + prodName + '\'' +
                ", price=" + price +
                '}';
    }
}
