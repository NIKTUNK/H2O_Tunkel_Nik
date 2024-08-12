package com.store.model;

import javax.persistence.Entity;

@Entity
public class Monitor extends Product {

    private String diagonal;

    public String getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(String diagonal) {
        this.diagonal = diagonal;
    }
}
