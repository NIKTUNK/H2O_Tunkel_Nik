package com.store.model;

import javax.persistence.Entity;

@Entity
public class HardDrive extends Product {

    private int capacity;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
