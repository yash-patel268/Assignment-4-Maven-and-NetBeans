/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uthayakumar;
import java.util.ArrayList;
/**
 *
 * @author sujeev
 */
//Product database class
public class ProductDB {
    //first item in database with name=chair, upc=10001, and price=100.25
    Item chair = new Item("Chair", "10001", 100.25);
    //second item in database with name=table, upc=10002, and price=150.00
    Item table = new Item("Table", "10002", 150.00);
    //third item in database with name=coffee table, upc=10003, and price=200.00
    Item coffeeTable = new Item("Coffee Table", "10003", 200.00);
    //fourth item in database with name=lamp, upc=10004, and price=75.00
    Item lamp = new Item("Lamp", "10004", 75.00);
    
    //item array which holds each item
    Item[] items = {chair,table,coffeeTable,lamp};
    
    //function to get product info
    public Item GetProductInfo(String UPCCode){
        //for loop to cycle through items
        for (Item item: items){
            //if it the inputted item matches
            if(item.getUPC() == UPCCode || (item.getUPC()).equals(UPCCode)){
                //return that item
                return item;
            }
        }
        //else return null
        return null;
    }

    //override to allow item to have actual name and not memory
    @Override
    public String toString() {
        return "ProductDB{" +
                "items=" + items +
                '}';
    }
}
