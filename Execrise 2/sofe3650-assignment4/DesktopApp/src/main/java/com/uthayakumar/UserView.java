/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uthayakumar;
//Import all the java swing components
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
/**
 *
 * @author sujeev
 */
@SuppressWarnings("serial")
public class UserView extends javax.swing.JFrame{
    //Assign the java swing components to the each of the cashregister components
    //JTextField to input which is product upc
    private JTextField productUPC;
    //Jbutton which is used to submit
    private JButton scanProduct;
    //JLabel to display name
    private JLabel nameDisplay;
    //JLabel to display price
    private JLabel priceDisplay;
    //Jlabel to display if there is a label
    private JLabel errorDisplay;
    
    public static void main(String[] args) {
        //call function to create view
        new UserView();
    }
    
    //Function to create the GUI
    public UserView(){
        //GUI size of 400 by 400 pixels
        setSize(400, 400);
        //Close the GUI
	addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
		System.exit(0);
            }
        });
        //Make GUI visible
	setVisible(true);
        //productUPC created as a text field using java swing
        productUPC = new JTextField(10);
	add(productUPC);
		
        //scanProduct created as button to submit
	scanProduct = new JButton("Scan Product");
	add(scanProduct);
        
        //display name using jlabel
        nameDisplay = new JLabel();
        add(nameDisplay);
        
        //display price using jlabel
        priceDisplay = new JLabel();
        add(priceDisplay);
        
        //display error using jlabel
        errorDisplay = new JLabel();
        add(errorDisplay);
        
        //Closing the GUI on the IDe closing
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        //Reset the text box
        productUPC.setToolTipText("");
        
        //Listener to override the submit 
        scanProduct.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitUPC(evt);
            }
        });
    }
    
    //Function for submitUPC
    public void submitUPC(java.awt.event.ActionEvent evt){
        //If the text input isnt blank then take input
        if(!productUPC.getText().equals("")){
            //Create cashregistermodel 
            CashRegisterModel model = new CashRegisterModel();
            try{
            //Get user input and assign it to a string
            String upc = productUPC.getText();
            //Create an item with the inputted upc
            Item item = model.setCurrentProductUPC(upc);
            //if item exisits
            if(item != null){
                //Display  name, price, and blank error
                nameDisplay.setText(item.getName());
                priceDisplay.setText("$" + item.getPrice());
                errorDisplay.setText("");
            }else{
                //Display blank name, blank price,  no upc
                nameDisplay.setText("");
                priceDisplay.setText("");
                errorDisplay.setText("No UPC Found");
            } 
            //if the user input was not of the correct type.
            }catch(java.lang.NumberFormatException e) {
                    errorDisplay.setText("Please input a number");
                    nameDisplay.setText("");
                    priceDisplay.setText("");
            }
        //tell user to input upc again
        }else{
            nameDisplay.setText("");
            priceDisplay.setText("");
            errorDisplay.setText("Enter a UPC Code");
        }
     }
}


