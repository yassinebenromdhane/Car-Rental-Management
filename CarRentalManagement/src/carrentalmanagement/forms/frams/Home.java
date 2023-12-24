/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package carrentalmanagement.forms.frams;

import carrentalmanagement.forms.panels.CarsPanel;
import carrentalmanagement.forms.panels.CustomerPanel;
import carrentalmanagement.forms.panels.ReservationPanel;
import java.awt.Color;

/**
 *
 * @author yassine
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu_panel = new javax.swing.JPanel();
        bt_cars_menu = new javax.swing.JButton();
        bt_customers_menu = new javax.swing.JButton();
        bt_reservation_menu = new javax.swing.JButton();
        tabbed_pane = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menu_panel.setBackground(new java.awt.Color(93, 0, 255));

        bt_cars_menu.setText("Cars");
        bt_cars_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_cars_menuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_cars_menuMouseExited(evt);
            }
        });
        bt_cars_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cars_menuActionPerformed(evt);
            }
        });

        bt_customers_menu.setText("Customers");
        bt_customers_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_customers_menuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_customers_menuMouseExited(evt);
            }
        });
        bt_customers_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_customers_menuActionPerformed(evt);
            }
        });

        bt_reservation_menu.setText("Resérvation");
        bt_reservation_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_reservation_menuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_reservation_menuMouseExited(evt);
            }
        });
        bt_reservation_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_reservation_menuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menu_panelLayout = new javax.swing.GroupLayout(menu_panel);
        menu_panel.setLayout(menu_panelLayout);
        menu_panelLayout.setHorizontalGroup(
            menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_panelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_reservation_menu)
                    .addComponent(bt_customers_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_cars_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        menu_panelLayout.setVerticalGroup(
            menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_panelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(bt_cars_menu)
                .addGap(18, 18, 18)
                .addComponent(bt_customers_menu)
                .addGap(18, 18, 18)
                .addComponent(bt_reservation_menu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem1.setText("Add user");
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tabbed_pane, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(tabbed_pane, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void bt_cars_menuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_cars_menuMouseEntered
       bt_cars_menu.setBackground(new Color(102,102,255));
    }//GEN-LAST:event_bt_cars_menuMouseEntered

    private void bt_cars_menuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_cars_menuMouseExited
        bt_cars_menu.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_bt_cars_menuMouseExited

    private void bt_customers_menuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_customers_menuMouseEntered
        bt_customers_menu.setBackground(new Color(102,102,255));
    }//GEN-LAST:event_bt_customers_menuMouseEntered

    private void bt_customers_menuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_customers_menuMouseExited
        bt_customers_menu.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_bt_customers_menuMouseExited

    private void bt_reservation_menuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_reservation_menuMouseEntered
        bt_reservation_menu.setBackground(new Color(102,102,255));
    }//GEN-LAST:event_bt_reservation_menuMouseEntered

    private void bt_reservation_menuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_reservation_menuMouseExited
        bt_reservation_menu.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_bt_reservation_menuMouseExited

    private void bt_cars_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cars_menuActionPerformed
        if(tabbed_pane.indexOfTab("Cars") == -1){
            CarsPanel cars = new CarsPanel(tabbed_pane , this);
            tabbed_pane.add("Cars", cars);
        }
    }//GEN-LAST:event_bt_cars_menuActionPerformed

    private void bt_customers_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_customers_menuActionPerformed
        if(tabbed_pane.indexOfTab("Customers") == -1){
            CustomerPanel customers = new CustomerPanel(tabbed_pane , this);
            tabbed_pane.add("Customers", customers);
        }
    }//GEN-LAST:event_bt_customers_menuActionPerformed

    private void bt_reservation_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_reservation_menuActionPerformed
         if(tabbed_pane.indexOfTab("Reservations") == -1){
            ReservationPanel reservation = new ReservationPanel(tabbed_pane , this);
            tabbed_pane.add("Reservations", reservation);
        }
    }//GEN-LAST:event_bt_reservation_menuActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cars_menu;
    private javax.swing.JButton bt_customers_menu;
    private javax.swing.JButton bt_reservation_menu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel menu_panel;
    private javax.swing.JTabbedPane tabbed_pane;
    // End of variables declaration//GEN-END:variables
}
