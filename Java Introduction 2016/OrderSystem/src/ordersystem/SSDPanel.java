/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordersystem;

import javax.swing.JTabbedPane;

/**
 *
 * @author Triblex95
 */
public class SSDPanel extends javax.swing.JPanel {

    OrderSystemPanel ejer;

    /**
     * Creates new form SSD
     */
    public SSDPanel() {
        initComponents();
        /*
        ssd1.setText(osc.CPUs.get(0).name);
        ssdPrice1.setText(Integer.toString(osc.CPUs.get(0).price));
        ssd2.setText(osc.CPUs.get(1).name);
        ssdPrice2.setText(Integer.toString(osc.CPUs.get(1).price));
        ssd3.setText(osc.CPUs.get(2).name);
        ssdPrice3.setText(Integer.toString(osc.CPUs.get(2).price));
        ssd4.setText(osc.CPUs.get(3).name);
        ssdPrice4.setText(Integer.toString(osc.CPUs.get(3).price));
        ssd5.setText(osc.CPUs.get(4).name);
        ssdPrice5.setText(Integer.toString(osc.CPUs.get(4).price));
        ssd6.setText(osc.CPUs.get(5).name);
        ssdPrice6.setText(Integer.toString(osc.CPUs.get(5).price));
        ssd7.setText(osc.CPUs.get(6).name);
        ssdPrice7.setText(Integer.toString(osc.CPUs.get(6).price));
        ssd8.setText(osc.CPUs.get(7).name);
        ssdPrice8.setText(Integer.toString(osc.CPUs.get(7).price));
         */
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        ssd1 = new javax.swing.JLabel();
        ssdCombo1 = new javax.swing.JComboBox<>();
        ssdPrice1 = new javax.swing.JLabel();
        addSsd1 = new javax.swing.JButton();
        ssdPrice2 = new javax.swing.JLabel();
        addSsd2 = new javax.swing.JButton();
        ssd2 = new javax.swing.JLabel();
        ssdCombo2 = new javax.swing.JComboBox<>();
        ssdCombo3 = new javax.swing.JComboBox<>();
        ssdPrice3 = new javax.swing.JLabel();
        addSsd3 = new javax.swing.JButton();
        ssd3 = new javax.swing.JLabel();
        ssdPrice4 = new javax.swing.JLabel();
        addSsd4 = new javax.swing.JButton();
        ssdCombo4 = new javax.swing.JComboBox<>();
        ssd4 = new javax.swing.JLabel();
        ssdPrice5 = new javax.swing.JLabel();
        ssdCombo5 = new javax.swing.JComboBox<>();
        addSsd5 = new javax.swing.JButton();
        ssd5 = new javax.swing.JLabel();
        ssdPrice6 = new javax.swing.JLabel();
        ssdCombo6 = new javax.swing.JComboBox<>();
        addSsd6 = new javax.swing.JButton();
        ssd6 = new javax.swing.JLabel();
        addSsd7 = new javax.swing.JButton();
        ssdCombo7 = new javax.swing.JComboBox<>();
        ssd7 = new javax.swing.JLabel();
        ssdPrice7 = new javax.swing.JLabel();
        ssd8 = new javax.swing.JLabel();
        ssdCombo8 = new javax.swing.JComboBox<>();
        ssdPrice8 = new javax.swing.JLabel();
        addSsd8 = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        ssd1.setText("SSD 1: Samsung SSD 256 GB");

        ssdCombo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        ssdPrice1.setText("price");

        addSsd1.setText("Add");
        addSsd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSsd1ActionPerformed(evt);
            }
        });

        ssdPrice2.setText("price");

        addSsd2.setText("Add");
        addSsd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSsd2ActionPerformed(evt);
            }
        });

        ssd2.setText("SSD 2: Samsung SSD 256 GB");

        ssdCombo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        ssdCombo3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        ssdPrice3.setText("price");

        addSsd3.setText("Add");
        addSsd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSsd3ActionPerformed(evt);
            }
        });

        ssd3.setText("SSD 3: Samsung SSD 256 GB");

        ssdPrice4.setText("price");

        addSsd4.setText("Add");
        addSsd4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSsd4ActionPerformed(evt);
            }
        });

        ssdCombo4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        ssd4.setText("SSD 4: Samsung SSD 256 GB");

        ssdPrice5.setText("price");

        ssdCombo5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        addSsd5.setText("Add");
        addSsd5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSsd5ActionPerformed(evt);
            }
        });

        ssd5.setText("SSD 5: Samsung SSD 256 GB");

        ssdPrice6.setText("price");

        ssdCombo6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        addSsd6.setText("Add");
        addSsd6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSsd6ActionPerformed(evt);
            }
        });

        ssd6.setText("SSD 6: Samsung SSD 256 GB");

        addSsd7.setText("Add");
        addSsd7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSsd7ActionPerformed(evt);
            }
        });

        ssdCombo7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        ssd7.setText("SSD 7: Samsung SSD 256 GB");

        ssdPrice7.setText("price");

        ssd8.setText("SSD 8: Samsung SSD 256 GB");

        ssdCombo8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        ssdPrice8.setText("price");

        addSsd8.setText("Add");
        addSsd8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSsd8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ssd2, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ssdCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ssdPrice2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addSsd2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ssd3, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ssdCombo3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ssdPrice3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addSsd3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ssd4, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(ssdCombo4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ssdPrice4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addSsd4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ssd5, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ssdCombo5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ssdPrice5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addSsd5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ssd6, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ssdCombo6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ssdPrice6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addSsd6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ssd7, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ssdCombo7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ssdPrice7, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addSsd7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ssd8, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ssdCombo8, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ssdPrice8, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addSsd8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ssd1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ssdCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ssdPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addSsd1)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ssd1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ssdCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ssdPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addSsd1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ssd2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ssdCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ssdPrice2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addSsd2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ssd3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ssdCombo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ssdPrice3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addSsd3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ssd4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ssdCombo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ssdPrice4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addSsd4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ssd5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ssdCombo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ssdPrice5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addSsd5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ssd6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ssdCombo6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ssdPrice6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addSsd6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ssd7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ssdCombo7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ssdPrice7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addSsd7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ssd8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ssdCombo8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ssdPrice8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addSsd8))
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addSsd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSsd1ActionPerformed
        int amount = ssdCombo1.getSelectedIndex();
        for (int i = 0; i <= amount; i++) {
            //osc.addToShoppingBag(0);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_addSsd1ActionPerformed

    private void addSsd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSsd2ActionPerformed
        int amount = ssdCombo1.getSelectedIndex();
        for (int i = 0; i <= amount; i++) {
            //osc.addToShoppingBag(0);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_addSsd2ActionPerformed

    private void addSsd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSsd3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addSsd3ActionPerformed

    private void addSsd4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSsd4ActionPerformed
        int amount = ssdCombo1.getSelectedIndex();
        for (int i = 0; i <= amount; i++) {
            //osc.addToShoppingBag(0);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_addSsd4ActionPerformed

    private void addSsd5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSsd5ActionPerformed
        int amount = ssdCombo1.getSelectedIndex();
        for (int i = 0; i <= amount; i++) {
            //osc.addToShoppingBag(0);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_addSsd5ActionPerformed

    private void addSsd6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSsd6ActionPerformed
        int amount = ssdCombo1.getSelectedIndex();
        for (int i = 0; i <= amount; i++) {
            ///osc.addToShoppingBag(0);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_addSsd6ActionPerformed

    private void addSsd7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSsd7ActionPerformed
        int amount = ssdCombo1.getSelectedIndex();
        for (int i = 0; i <= amount; i++) {
            //osc.addToShoppingBag(0);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_addSsd7ActionPerformed

    private void addSsd8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSsd8ActionPerformed
        int amount = ssdCombo1.getSelectedIndex();
        for (int i = 0; i <= amount; i++) {
            //osc.addToShoppingBag(0);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_addSsd8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSsd1;
    private javax.swing.JButton addSsd2;
    private javax.swing.JButton addSsd3;
    private javax.swing.JButton addSsd4;
    private javax.swing.JButton addSsd5;
    private javax.swing.JButton addSsd6;
    private javax.swing.JButton addSsd7;
    private javax.swing.JButton addSsd8;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel ssd1;
    private javax.swing.JLabel ssd2;
    private javax.swing.JLabel ssd3;
    private javax.swing.JLabel ssd4;
    private javax.swing.JLabel ssd5;
    private javax.swing.JLabel ssd6;
    private javax.swing.JLabel ssd7;
    private javax.swing.JLabel ssd8;
    private javax.swing.JComboBox<String> ssdCombo1;
    private javax.swing.JComboBox<String> ssdCombo2;
    private javax.swing.JComboBox<String> ssdCombo3;
    private javax.swing.JComboBox<String> ssdCombo4;
    private javax.swing.JComboBox<String> ssdCombo5;
    private javax.swing.JComboBox<String> ssdCombo6;
    private javax.swing.JComboBox<String> ssdCombo7;
    private javax.swing.JComboBox<String> ssdCombo8;
    private javax.swing.JLabel ssdPrice1;
    private javax.swing.JLabel ssdPrice2;
    private javax.swing.JLabel ssdPrice3;
    private javax.swing.JLabel ssdPrice4;
    private javax.swing.JLabel ssdPrice5;
    private javax.swing.JLabel ssdPrice6;
    private javax.swing.JLabel ssdPrice7;
    private javax.swing.JLabel ssdPrice8;
    // End of variables declaration//GEN-END:variables
}
