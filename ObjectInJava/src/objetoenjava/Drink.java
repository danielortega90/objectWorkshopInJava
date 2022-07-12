/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetoenjava;

import java.util.Scanner;

/**
 *
 * @author Daniel CAVS
 */
public class Drink {
     //class attributes
     public String name;
     private double price;
     protected int amount;
     
     //get y set  class

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
     
     // builder

    public Drink(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public Drink() {
    }
    
    //methods
    
    public void  enterPrice(){
        Scanner e = new Scanner(System.in);
        System.out.println("INTO PRICE :");
        price=e.nextDouble();
        
        System.out.println("Price :"+price);
       
        
       
    }
    
    public double showPrice(){
      return price;
    
    }
}
