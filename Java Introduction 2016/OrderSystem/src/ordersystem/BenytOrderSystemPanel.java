/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordersystem;

import javax.swing.JFrame;

public class BenytOrderSystemPanel
{
	public static void main(String[] arg)
	{
		OrderSystemPanel panel = new OrderSystemPanel();        // opret panelet
		//panel.checkoutPanel1.ejer = panel;
                JFrame vindue = new JFrame("Grafikpanel");    // opret et vindue på skærmen
		vindue.add(panel);                          // vis panelet i vinduet
		vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // reagér på luk
		vindue.pack();                       // sæt vinduets størrelse
		vindue.setVisible(true);                      // åbn vinduet
	}
}
