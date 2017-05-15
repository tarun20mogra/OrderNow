package com.example.tarun.ordernow;

import java.io.Serializable;

/**
 * Created by tarun on 5/8/2017.
 */

public class FoodMenu implements Serializable {
    String  name;
    double price;
    int img;

    public FoodMenu(String name, double price, int img) {
        this.name = name;
        this.price = price;
        this.img = img;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }




    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
