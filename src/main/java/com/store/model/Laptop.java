package com.store.model;

import javax.persistence.Entity;

@Entity
public class Laptop extends Product {

    private String size;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
