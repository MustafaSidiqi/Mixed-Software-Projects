/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordersystem;

import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mickey
 */
public class OrderSystemTest {
    
    public OrderSystemTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /*
    * showOrder function runs through the users orders and displays them all.
    */
    
    @Test
    public void testShowOrder() {
        System.out.println("showOrder");
        OrderSystem.showOrder();
    }

    /**
     * addUser method is only available for the admin user. This method adds a user to the system.
     */
    @Test
    public void testAddUser() {
        System.out.println("addUser");
        OrderSystem.logIn("admin", 1234);
        String username = "yo";
        int password = 1357;
        OrderSystem.addUser(username, password);
        boolean expResult = true;
        boolean result = OrderSystem.logIn(username, password);
        assertEquals(expResult, result);
    }

    /**
     * This method resets the status on sold items and total income.
     */
    @Test
    public void testResetStatus() {
        System.out.println("resetStatus");
        OrderSystem.itemsSold = 50;
        OrderSystem.totalIncome = 5000;
        OrderSystem.resetStatus();
        int expResult = 0;
        int result = OrderSystem.itemsSold;
        assertEquals(expResult, result);
        int expResult2 = 0;
        int result2 = OrderSystem.totalIncome;
        assertEquals(expResult2, result2);
    }

    /**
     * Test of showItems method, of class OrderSystem.
     * This method shows all items of the chosen catagory defined by x.
     * These possible values of x is shown to user.
     */
    @Test
    public void testShowItems() {
        System.out.println("showItems");
        int x = 0;
        OrderSystem.showItems(x);
    }

    /**
     * Test of logIn method, of class OrderSystem.
     */
    @Test
    public void test1LogIn() {
        System.out.println("logIn (wrong login)");
        String username = "";
        int password = 0;
        boolean expResult = false;
        boolean result = OrderSystem.logIn(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of showUserProfile method, of class OrderSystem.
     */
    @Test
    public void testShowUserProfile() {
        System.out.println("showUserProfile");
        OrderSystem.logOut();
        OrderSystem.logIn("michael",1234);
        OrderSystem.showUserProfile();
    }

    /**
     * Test of showSupportInfo method, of class OrderSystem.
     * This method displays support info.
     */
    @Test
    public void testShowSupportInfo() {
        System.out.println("showSupportInfo");
        OrderSystem.showSupportInfo();
    }

    /**
     * Test of importItems method, of class OrderSystem.
     */
    @Test
    public void testImportItems() {
        System.out.println("importItems");
        OrderSystem instance = new OrderSystem();
        instance.importItems();
        //it should now show importet items by the following method call:
        OrderSystem.showItems(0);
    }

    /**
     * Test of insertCash method, of class OrderSystem.
     */
    @Test
    public void testInsertCash() throws IOException  {
        System.out.println("insertCash");
        OrderSystem.userIndex = 0;
        int amount = 1;
        OrderSystem.insertCash(amount);
        int expResult = 1;
        int result = OrderSystem.getBalance();
        assertEquals(expResult, result);
    }

    /**
     * Test of getBalance method, of class OrderSystem.
     */
    @Test
    public void testGetBalance() throws IOException {
        System.out.println("getBalance");
        OrderSystem.userIndex = 1;
        OrderSystem.insertCash(100);
        int expResult = 100;
        int result = OrderSystem.getBalance();
        assertEquals(expResult, result);
    }

    /**
     * Test of getItemsSold method, of class OrderSystem.
     * This method does not work yet, and is under construction.
     
    @Test
    public void testGetItemsSold() {
        System.out.println("getItemsSold");
        int expResult = 0;
        int result = OrderSystem.getItemsSold();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    * /

    /**
     * Test of getNumberOfOrderQueue method, of class OrderSystem.
     *  This method is under construction.
     * 
    @Test
    public void testGetNumberOfOrderQueue() {
        System.out.println("getNumberOfOrderQueue");
        int expResult = 0;
        int result = OrderSystem.getNumberOfOrderQueue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    * */

    /**
     * Test of getTotalIncome method, of class OrderSystem.
     */
    @Test
    public void testGetTotalIncome() throws IOException {
        System.out.println("getTotalIncome");
        OrderSystem.userIndex = 3;
        OrderSystem.insertCash(500); 
        OrderSystem.addToShoppingBag(0);
        OrderSystem.checkout();
        int expResult = 1;
        int result = OrderSystem.getTotalIncome();
        assertEquals(expResult, result);
    }

    /**
     * Test of addToShoppingBag method, of class OrderSystem.
     */
    @Test
    public void testAddToShoppingBag() {
        
        System.out.println("addToShoppingBag and show showShoppingBag");
        OrderSystem.userIndex = 0;
        int x = 0;
        OrderSystem.addToShoppingBag(x);
        //The following methos should show the iphone in shoppingbag.
        OrderSystem.showShoppingBag();
    }

    /**
     * Test of removeFromShoppingBag method, of class OrderSystem.
     */
    @Test
    public void testRemoveFromShoppingBag() {
        System.out.println("removeFromShoppingBag");
        
        OrderSystem.addToShoppingBag(0);
        OrderSystem.addToShoppingBag(1);
        int index = 0;
        System.out.println("BEFORE removing item:");
        OrderSystem.showShoppingBag();
        System.out.println("AFTER removing item:");
        OrderSystem.removeFromShoppingBag(index);
        //The following line should be empty
        OrderSystem.showShoppingBag();
        System.out.println();
    }

    /**
     * Test of addItem method, of class OrderSystem.
     */
    @Test
    public void testAddItem() {
        System.out.println("addItem");
        String name = "HelloKitty Phone";
        int category = 0;
        int price = 5000;
        int itemNumber = 12345;
        int stock = 100;
        OrderSystem.logIn("admin", 1234);
        OrderSystem.addItem(name, category, price, itemNumber, stock);
        OrderSystem.showItems(0);
    }

    /**
     * Test of editItem method, of class OrderSystem.
     *
    @Test
    public void testEditItem() {
        System.out.println("editItem");
        int itemNumber = 12333;
        String name = "";
        int category = 0;
        int price = 0;
        int NewitemNumber = 0;
        int stock = 0;
        boolean expResult = false;
        OrderSystem.editItem(itemNumber, name, category, price, NewitemNumber, stock);
    }
    * /
    /**
     * Test of checkout method, of class OrderSystem.
     */
    @Test
    public void testCheckout() {
        System.out.println("checkout");
        OrderSystem.checkout();
    }
    
}
