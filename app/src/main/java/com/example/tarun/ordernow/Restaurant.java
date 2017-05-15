package com.example.tarun.ordernow;


import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by tarun on 5/8/2017.
 */

public class Restaurant implements Serializable{
    String restaurant_name;
    ArrayList<FoodMenu> menuArrayList = new ArrayList<>();

    public Restaurant(String restaurant_name, ArrayList<FoodMenu> menuArrayList) {
        this.restaurant_name = restaurant_name;
        this.menuArrayList = menuArrayList;
    }

   public String getRestaurant_name() {
        return this.restaurant_name;
    }

    public void setRestaurant_name(String restaurant_name) {
        this.restaurant_name = restaurant_name;
    }

    public ArrayList<FoodMenu> getMenuArrayList() {
        return this.menuArrayList;
    }

    public void setMenuArrayList(ArrayList<FoodMenu> menuArrayList) {
        this.menuArrayList = menuArrayList;
    }
}
