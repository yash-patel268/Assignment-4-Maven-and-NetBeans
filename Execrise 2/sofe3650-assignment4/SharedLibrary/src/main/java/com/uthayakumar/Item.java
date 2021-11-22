/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uthayakumar;

/**
 *
 * @author sujeev
 */
//Create item class 
public class Item {
    //create a string called name
    private String name;
    //create a string called UPC
    private String UPC;
    //create a double called price
    private double price;

    //Function to assign an item object with name, upc, price
    public Item(String name, String UPC, double price) {
        this.name = name;
        this.UPC = UPC;
        this.price = price;
    }

    //constructor to getName of item
    public String getName() {
        return name;
    }

    //constructor to getUPC
    public String getUPC() {
        return UPC;
    }

    //constructor to getPrice
    public double getPrice() {
        return price;
    }

    //override to assign the string properly instead of memory locations
    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", UPC='" + UPC + '\'' +
                ", price=" + price +
                '}';
    }
}
