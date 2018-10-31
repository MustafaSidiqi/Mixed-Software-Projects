package eventyr;

import java.util.ArrayList;

public class Eventyr {

    public static void main(String[] arg) {

        java.util.Scanner tastatur = new java.util.Scanner(System.in);  // forbered
        ArrayList<String> personer = new ArrayList<String>(); // liste af strenge
        personer.add("De tre små grise");
        personer.add("Ulven");
        personer.add("Rødhætte");
        personer.add("Mustafa");
        personer.add("Yousef");
        personer.add("Junid");
        personer.add("Ajmal");
        personer.add("Kuno");
        for (int i = 1; i <= 3; i++) {
            System.out.print("Skriv persons navn: ");
            String userNum = tastatur.next(); // variabel som lagrer input fra bruker. 
            personer.add(userNum);
        }
        ArrayList<String> handlinger = new ArrayList<String>();
        handlinger.add("slikker sig om munden");
        handlinger.add("får en idé!");
        handlinger.add("gemmer sig i skoven");
        handlinger.add("hopper");
        handlinger.add("sover");
        for (int i = 1; i <= 3; i++) {
            System.out.print("Skriv en handling: ");
            String userNum = tastatur.next(); // variabel som lagrer input fra bruker. 
            handlinger.add(userNum);
        }
        ArrayList<String> brukteHandlinger = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            int antalPersoner = personer.size(); // antal personer i listen, dvs 3
            int personNummer = (int) (Math.random() * antalPersoner); // giver 0-2
            String person = personer.get(personNummer);
            String handling = handlinger.get((int) (Math.random() * handlinger.size()));
            if(brukteHandlinger.contains(handling)){
                i--;
               continue; 
            }
            brukteHandlinger.add(handling);
            System.out.println(person + " " + handling);
        }
    }
}