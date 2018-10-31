package algoritme_aflevering_6;

public class Algoritme_aflevering_6 {

    /**
     * @param args the command line arguments
     *
     * static Node Search(Node a, String value) { Node x = a; while (x != null)
     * { if (x.key == value) { return x; } x = x.next; } return null; }
     */
    static Node Insert(Node head, Node x, String s) {
        x.prev = null;
        x.next = head;
        head.prev = x;
        x.key = s;
        return x;
    }

    static Node Delete(Node a, Node x) {
        if (x.prev != null) {
            x.prev.next = x.next;
        } else {
            a = x.next;
        }
        if (x.next != null) {
            x.next.prev = x.prev;
        }
        return a;
    }

    static Node Swap(Node k, Node f) {
        String temp = k.key;
        k.key = f.key;
        f.key = temp;
        return null;
    }
    
    

    public static void main(String[] args) {
        // TODO code application logic here
        Node a = new Node();
        Node b = new Node();
        Node c = new Node();
        a.key = "233";
        b.key = "-34";
        c.key = "0";
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = null;
        
        System.out.println("a.key = " + a.key);
        System.out.println("b.key = " + b.key);
        System.out.println("c.key = " + c.key);
        System.out.println();

        Node head = new Node();
        Insert(a, head, "4232");

        System.out.println("Der er addet 4232 som head.");
        //System.out.println(d.prev.key);
        System.out.println("head.key = " + head.key);
        System.out.println("a.key = " + a.key);
        System.out.println("b.key = " + b.key);
        System.out.println("c.key = " + c.key);

        Swap(head,a);

        
        System.out.println();
        System.out.println("Der er blevet SWAPPET med head og a.");
        System.out.println("head.key = " + head.key);
        System.out.println("a.key = " + a.key);
        System.out.println("b.key = " + b.key);
        System.out.println("c.key = " + c.key);

    }
}
