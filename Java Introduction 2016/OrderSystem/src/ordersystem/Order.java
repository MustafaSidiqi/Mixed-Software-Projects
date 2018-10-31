/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordersystem;

import java.util.ArrayList;

/**
 *
 * @author MustafaSidiqi
 */
public class Order {

    String name;
    String lastname;
    String address;
 
    int zipCode;
    int phoneNumber;
    int orderNumber;
    int total = 0;

    //A list of items in each order, so each order has many items.
    Item tempItem = new Item();
    public ArrayList<Item> itemsInOrder = new ArrayList<>();

}
