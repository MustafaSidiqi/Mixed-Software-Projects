/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordersystem;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author MustafaSidiqi
 * @author Mickey
 */
public class OrderSystem {

    static ArrayList<Item> Laptops = new ArrayList<>();
    static ArrayList<Item> Phones = new ArrayList<>();
    static ArrayList<Item> CPUs = new ArrayList<>();
    static ArrayList<Item> GPUs = new ArrayList<>();
    static ArrayList<Item> Desktops = new ArrayList<>();
    static ArrayList<Item> SSDs = new ArrayList<>();
    static ArrayList<String> Category = new ArrayList<>();

    static ArrayList<User> Users = new ArrayList<>();
    static ArrayList<Item> ShoppingBag = new ArrayList<>();
    static ArrayList<Order> Orders = new ArrayList<>();

    private static int numberOfOrderQueue;// Antal billetter automaten i alt har solgt
    static boolean adminMode;
    static boolean userMode;
    static int itemsSold;
    static int totalIncome;
    static int userCountMax;
    static int userIndex;
    static int numberOfCategories = 2;

    static void showOrder() {
        Order tempOrder = new Order();
        Item tempItem = new Item();
        for (int i = 0; i < Orders.size(); i++) {
            tempOrder.name = Orders.get(i).name;
            tempOrder.phoneNumber = Orders.get(i).phoneNumber;
            tempOrder.address = Orders.get(i).address;
            tempOrder.total = Orders.get(i).total;
            tempOrder.orderNumber = Orders.get(i).orderNumber;
            System.out.println("Name: " + tempOrder.name + " Lastname: " + tempOrder.lastname + " Phone: " + tempOrder.phoneNumber + " Address: " + tempOrder.address + " zipcode: " + tempOrder.zipCode + "Total: " + tempOrder.total);
            System.out.println("");
            for (int j = 0; j < Orders.get(i).itemsInOrder.size(); j++) {
                tempItem.itemNumber = Orders.get(i).itemsInOrder.get(j).itemNumber;
                tempItem.kategorinummer = Orders.get(i).itemsInOrder.get(j).itemNumber;
                tempItem.name = Orders.get(i).itemsInOrder.get(j).name;
                tempItem.price = Orders.get(i).itemsInOrder.get(j).price;
                System.out.println("Name: " + tempItem.name + " Price: " + tempItem.price);

            }
            System.out.println("");
        }
    }

    OrderSystem() {
        importItems();
        User admin = new User();
        admin.userName = "admin";
        admin.password = 1234;
        Users.add(admin);
        User Michael = new User();
        Michael.userName = "michael";
        Michael.password = 1234;
        Users.add(Michael);
        User Lars = new User();
        Lars.userName = "Lars";
        Lars.password = 1234;
        Users.add(Lars);
        User Jens = new User();
        Jens.userName = "Jens";
        Jens.password = 1234;
        Users.add(Jens);
        User Mustafa = new User();
        Mustafa.userName = "xMSx95";
        Mustafa.password = 1234;
        Mustafa.name = "Mustafa";
        Mustafa.lastname = "sadf";
        Mustafa.zipCode = 100;
        Mustafa.phoneNumber = 42487060;
        Mustafa.address = "Nørre alle 15";
        Users.add(Mustafa);
        totalIncome = 0;
        itemsSold = 0;
        userCountMax = 3;
        userMode = false;

        Category.add("Phones");
        Category.add("Laptops");

    }

    public static void addUser(String username, int password) {
        User user = new User();
        user.userName = username;
        user.password = password;
        Users.add(user);
        userCountMax++;
    }

    public static void resetStatus() {
        totalIncome = 0;
        itemsSold = 0;
    }

    public static void showItems(int x) {
        switch (x) {
            case 1: {
                Item tempItem = new Item();
                for (int i = 0; i < Phones.size(); i++) {
                    tempItem = Phones.get(i);
                    System.out.print(i + 1 + ". ");
                    System.out.println("Name:   " + tempItem.name + " Price:    " + tempItem.price);
                }
            }
            case 2: {
                Item tempItem = new Item();
                for (int i = 0; i < Laptops.size(); i++) {
                    tempItem = Laptops.get(i);
                    System.out.print(i + 1 + ". ");
                    System.out.println(tempItem.name + "" + tempItem.price);
                }
                break;
            }
            default: {
                System.out.println("Unknown catagory number, try again.");
            }
        }
    }

    static boolean logIn(String username, int password) {
        String tempUserName;
        int tempPassword;
        for (int i = 0; i < userCountMax; i++) {
            tempUserName = Users.get(i).userName;
            tempPassword = Users.get(i).password;
            if (username.equals("admin")) {
                if (password == 1234) {
                    adminMode = true;
                    userMode = true;
                    userIndex = i;
                    return true;
                } else {
                    return false;
                }
            } else if (tempUserName.equals(username)) {
                if (tempPassword == password) {
                    adminMode = false;
                    userMode = true;
                    userIndex = i;
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;

    }

    static void showUserProfile() {
        System.out.println("Username:                    " + Users.get(userIndex).userName);
        System.out.println("Total amount of money spent: " + Users.get(userIndex).moneyUsed);
        System.out.println("Balance:                     " + getBalance());

    }

    public static void showSupportInfo() {
        System.out.println("Support phone:  11 22 33 44");
        System.out.println("Open hours:     09:00 to 16:00");
    }

    public static void importItems() {
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();

        item1.stock = 100;
        item1.itemNumber = 12412;
        item1.kategorinummer = 1;
        item1.name = "iPhone 6";
        item1.price = 1;
        Phones.add((item1));

        item2.stock = 100;
        item2.itemNumber = 12412;
        item2.kategorinummer = 1;
        item2.name = "Samsung S7";
        item2.price = 299;
        Phones.add((item2));

        item3.stock = 100;
        item3.itemNumber = 12412;
        item3.kategorinummer = 1;
        item3.name = "OnePlus 2";
        item3.price = 10000;
        Phones.add((item3));

    }

    public int getOrderInfo(String s) {
        return 0;
    }

    public static void insertCash(int amount) throws IOException {
        if (amount >= 0) {
            Users.get(userIndex).balance = Users.get(userIndex).balance + amount;
        } else {
            System.out.println("You have entered a invalid amount of money.");
        }
    }

    /*
     public int returnCash() throws IOException {
     int returnCash = balance;
     balance = 0;
     return returnCash;
     }
     */
    public static int getBalance() {
        return Users.get(userIndex).balance;
    }

    public static int getItemsSold() {
        if (adminMode) {
            return itemsSold;
        } else {
            System.out.println("declined - log in as admin first");
            return 0;
        }
    }

    public static int getNumberOfOrderQueue() {
        if (adminMode) {
            return numberOfOrderQueue;
        } else {
            System.out.println("declined - log in as admin first");
            return 0;
        }
    }

    public static int getTotalIncome() {
        if (adminMode) {
            return totalIncome;
        } else {
            System.out.println("declined - log in as admin first");
            return 0;
        }
    }

    public void getPris(int category, int itemNumber) {

        System.out.println("Items not found in stock.");
    }

    public static void addToShoppingBag(int amount, int categoryNumber, int itemIndex) {

        switch (categoryNumber) {
            case 1:
                for (int i = 0; i < amount; i++) {
                    ShoppingBag.add(Phones.get(itemIndex-1));

                }
                break;
            case 2:

        }
    }

    public static void showShoppingBag() {
        Item tempItem = new Item();
        for (int i = 0; i < ShoppingBag.size(); i++) {
            tempItem = ShoppingBag.get(i);
            System.out.print(i + ". ");
            System.out.println("Name:   " + tempItem.name + " Price:    " + tempItem.price);
        }
    }

    public static void removeFromShoppingBag(int index) {
        ShoppingBag.remove(index);
    }

    public static boolean addItem(String name, int category, int price, int itemNumber, int stock) {
        if (adminMode) {
            Item AddedItem = new Item();
            AddedItem.name = name;
            AddedItem.kategorinummer = category;
            AddedItem.itemNumber = itemNumber;
            AddedItem.price = price;
            AddedItem.stock = stock;
            switch (category) {
                case 0:
                    Phones.add(AddedItem);
                    break;
                case 1:
                    Desktops.add(AddedItem);
                    break;
                case 2:
                    Laptops.add(AddedItem);
                    break;
                case 3:
                    CPUs.add(AddedItem);
                    break;
                case 4:
                    GPUs.add(AddedItem);
                    break;
                case 5:
                    SSDs.add(AddedItem);
                    break;
                default:
                    System.out.println("invalid category to add item to.");
                    break;
            }
            return true;
        } else {
            System.out.println("declined - log in as admin first");
            return false;
        }
    }

    public static void logOut() {
        userMode = false;
        adminMode = false;
    }

    /*
    public static boolean editItem(int itemNumber, String name, int category, int price, int NewitemNumber, int stock) {
        if (adminMode) {
            Item userAddedItem = new Item();
            userAddedItem.name = name;
            userAddedItem.kategorinummer = category;
            userAddedItem.itemNumber = itemNumber;
            userAddedItem.price = price;
            userAddedItem.stock = stock;

            return true;
        } else {
            System.out.println("declined - log in as admin first");
            return false;
        }
    }
     */
    static void checkout() {
        int totalSum = 0;
        Order tempOrder = new Order();
        for (int i = 0; i < ShoppingBag.size(); i++) {
            totalSum = totalSum + ShoppingBag.get(i).price;
            System.out.print(i + " - ");
            System.out.println("Name:   " + ShoppingBag.get(i).name + " Price:  " + ShoppingBag.get(i).price + " $");
        }
        System.out.println("Total: " + totalSum + " $");
        System.out.println("Transfering money from account...");
        if (Users.get(userIndex).balance >= totalSum) {
            Users.get(userIndex).balance = Users.get(userIndex).balance - totalSum;
            System.out.println("Items purchased: ");
            for (int i = 0; i < ShoppingBag.size(); i++) {
                System.out.print(i + " - ");
                System.out.println("Name:   " + ShoppingBag.get(i).name + " Price:  " + ShoppingBag.get(i).price + " $");
                ShoppingBag.get(i).stock--;
                //ShoppingBag.remove(i);
                tempOrder.tempItem.kategorinummer = 2;
                Item e = new Item();
                e.itemNumber = ShoppingBag.get(i).itemNumber;
                e.name = ShoppingBag.get(i).name;
                e.price = ShoppingBag.get(i).price;
                e.kategorinummer = ShoppingBag.get(i).kategorinummer;
                tempOrder.itemsInOrder.add(e);
            }
            System.out.println("-----------------------------------------------");
            System.out.println("New balance: " + Users.get(userIndex).balance);
            OrderSystem.itemsSold = OrderSystem.itemsSold + ShoppingBag.size();
            OrderSystem.totalIncome = OrderSystem.totalIncome + totalSum;
            tempOrder.address = Users.get(userIndex).address;
            tempOrder.name = Users.get(userIndex).name;
            tempOrder.lastname = Users.get(userIndex).lastname;
            tempOrder.phoneNumber = Users.get(userIndex).phoneNumber;
            Orders.add(tempOrder);

        } else {
            System.out.println("You do not have enough money to checkout.");
            System.out.println("Please transfer money to your account first.");
            System.out.println("-----------------------------------------------");

        }
    }
}
