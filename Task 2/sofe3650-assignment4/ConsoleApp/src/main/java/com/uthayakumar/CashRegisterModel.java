/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uthayakumar;
/**
 *
 * @author sujeev
 */
//Create cashregistermodel class
public class CashRegisterModel {
    //create database to store products
    ProductDB database = new ProductDB();
    //create new iteam
    Item newItem;
    
    //create a function to set upc to an item 
    public Item setCurrentProductUPC(String UPC){
        //As long as it's not null
        if(database.GetProductInfo(UPC)!= null){
            //return the item from database
            newItem = database.GetProductInfo(UPC);
            return newItem;
        }
        else {
            return null;
        }
    }
}
