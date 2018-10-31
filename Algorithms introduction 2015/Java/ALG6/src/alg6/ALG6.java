/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alg6;

/**
 *
 * @author MustafaSidiqi
 */
public class ALG6 {

    /**
     * @param args the command line arguments
     */
    public static Node Insert(Node x, Node y, int a) {
        Node temp = new Node();
        temp = x;
        x.Key = a;
        x.prev = null;
        x.next = temp;
        y.prev = temp;
        
        y.prev = null;
        y.next = x;
        x.prev = y;
        y.Key = a;
        return x;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Node a = new Node();
        Node b = new Node();
        Node c = new Node();
        a.Key = 1;
        a.Key = 2;
        b.Key = 3;
        
        System.out.println(a.Key);
        System.out.println(b.Key);
        System.out.println(c.Key);
        
        a.prev = null;
        a.next = b;
        
        b.prev = a;
        b.next = c;
        
        c.prev = b;
        c.next = null;
        
        //a.next = a.next.next;
        
        System.out.println();
        System.out.println(a.Key);
        System.out.println(a.next.Key);
        System.out.println(a.next.next.Key);   
    }

}
