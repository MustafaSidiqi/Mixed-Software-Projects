/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currencyconverter;

import javax.swing.JFrame;

/**
 *
 * @author Mustafa Sidiqi
 */
public class CurrencyConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        MitGrafikpanel panel = new MitGrafikpanel();        // opret panelet

        JFrame vindue = new JFrame("Grafikpanel");    // opret et vindue på skærmen
        vindue.add(panel);                          // vis panelet i vinduet

        vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // reagér på luk
        vindue.pack();                       // sæt vinduets størrelse
        vindue.setVisible(true);
        // åbn vinduet
    }

}
