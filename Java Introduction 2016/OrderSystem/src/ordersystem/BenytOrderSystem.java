/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordersystem;

import java.io.IOException;

/**
 *
 * @author MustafaSidiqi
 * @author Mickey
 */
public class BenytOrderSystem {

    public static void main(String[] arg) throws IOException {
        boolean buying;
        OrderSystem orderSystem = new OrderSystem();
        java.util.Scanner tastatur = new java.util.Scanner(System.in);  // forbered
        System.out.println("Order System version 1.0");
        System.out.println();
        while (true) {
            OrderSystem.adminMode = false;
            System.out.println("Log in to proceed");
            System.out.print("Username: ");
            String username = tastatur.next();
            System.out.print("Password: ");
            int password = tastatur.nextInt();
            System.out.println();
            if (OrderSystem.logIn(username, password)) {
                while (orderSystem.userMode) {

                    System.out.println("-----------------------------------------------");
                    System.out.println("Enter 1 to show items");
                    System.out.println("Enter 2 to show shopping bag");
                    System.out.println("Enter 3 to edit item in shopping bag");
                    System.out.println("Enter 4 to show profile");
                    System.out.println("Enter 5 to to checkout");
                    System.out.println("Enter 6 to show order");
                    System.out.println("Enter 7 to show support information");
                    System.out.println("Enter 0 to log out");
                    if (OrderSystem.adminMode) {
                        System.out.println("Enter 10 to add user");
                        System.out.println("Enter 11 to edit item from stock");
                        System.out.println("Enter 12 to add item to stock");
                        System.out.println("Enter 13 to delete item from stock");
                        System.out.println("Enter 14 to show status");
                        System.out.println("Enter 15 to reset status");
                        System.out.println("Enter 16 to logout from admin mode");
                    }
                    int valg = tastatur.nextInt();
                    tastatur.nextLine();

                    switch (valg) {
                        case 0:
                            OrderSystem.logOut();
                            break;
                        case 1:
                            buying = true;
                            System.out.println("-----------------------------------------------");
                            for (int i = 0; i < OrderSystem.Category.size(); i++) {
                                System.out.print(i+1 + " - ");
                                System.out.println(OrderSystem.Category.get(i));
                            }
                            System.out.println("-----------------------------------------------");
                            while (buying) {
                                System.out.println("Enter catagory to show");
                                int catagory = tastatur.nextInt();
                                if (catagory == 9) {
                                    buying = false;
                                }
                                OrderSystem.showItems(catagory);
                                System.out.println("Enter the item you want to add to shoppingbag.");
                                int choice = tastatur.nextInt();
                                if (choice == 9) {
                                    buying = false;
                                }
                                OrderSystem.addToShoppingBag(choice, catagory, choice);
                                break;
                            }
                        case 2:
                            OrderSystem.showShoppingBag();
                            break;
                        case 3:
                            System.out.println("Enter the item number from shopping bag to remove:");
                            int remove = tastatur.nextInt();
                            OrderSystem.removeFromShoppingBag(remove);
                            break;
                        case 4:
                            OrderSystem.showUserProfile();
                            System.out.println("Enter amount of money to insert to system. (enter 0 to skip)");
                            int insertAmount = tastatur.nextInt();
                            OrderSystem.insertCash(insertAmount);
                            break;
                        case 5:
                            OrderSystem.checkout(); //mangler
                            break;
                        case 6:
                            OrderSystem.showOrder();
                            break;
                        case 7:
                            OrderSystem.showSupportInfo();
                            break;
                        case 10:
                            if (OrderSystem.adminMode) {
                                System.out.print("Enter username:");
                                username = tastatur.next();
                                System.out.print("Enter password:");
                                password = tastatur.nextInt();
                                OrderSystem.addUser(username, password);
                            } else {
                                System.out.println("You must be logged in as admin to enter!");
                            }
                            break;
                        case 11:
                            //mangler
                            break;
                        case 12:
                            System.out.println("Enter category number of item to add");
                            int category = tastatur.nextInt();
                            System.out.println("Enter ItemNumber of item to add");
                            int itemNumber = tastatur.nextInt();
                            System.out.println("Enter name of item to add");
                            String name = tastatur.next();
                            System.out.println("Enter price of item to add");
                            int price = tastatur.nextInt();
                            System.out.println("Enter stock amount of item to add");
                            int stockAmount = tastatur.nextInt();
                            OrderSystem.addItem(name, category, price, itemNumber, stockAmount);
                            break;
                        case 13:
                            //mangler
                            break;
                        case 14:
                            System.out.println("Total items sold: " + OrderSystem.getItemsSold());
                            System.out.println("Total income: " + OrderSystem.getTotalIncome());
                            break;
                        case 15:
                            OrderSystem.resetStatus();
                            break;
                        case 16:
                            OrderSystem.logOut();
                            break;
                        default:
                            System.out.println("Ugyldigt valg, prøv igen");
                            break;
                    }
                }
            } else {
                System.out.println("Incorrect username or password, try again.");
            }
        }
    }
}
