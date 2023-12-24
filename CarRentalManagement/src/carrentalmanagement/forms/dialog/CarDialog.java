/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package carrentalmanagement.forms.dialog;

import carrentalmanagement.controllers.CarDAO;
import carrentalmanagement.controllers.CarsDAOImp;
import carrentalmanagement.models.Car;
import carrentalmanagement.table.models.CarTableModel;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author mre
 */
public class CarDialog extends javax.swing.JDialog {

    boolean edit;
    Car car;
    int id;
    CarDAO dao = new CarsDAOImp();
    boolean state;
    JTable table;
    CarTableModel model;
    List<Car> carsList;
    Integer rowIndex;

    /**
     * Creates new form CarDialog
     */
    public CarDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public CarDialog(java.awt.Frame parent, boolean modal, boolean edit, int id, JTable table, List<Car> carsList , Integer rowIndex , CarTableModel model) {
        super(parent, modal);
        this.edit = edit;
        this.id = id;
        this.table = table;
        this.model = model;
        this.carsList = carsList;
        this.rowIndex = rowIndex;
        initComponents();
        initForm();
    }

    public void initForm() {
        if (!edit) {
            lb_id.setVisible(false);
            tf_id.setVisible(false);
        } else {
            bt_add.setText("Edit");
            car = dao.getCarById(this.id);
            tf_id.setText(String.valueOf(car.getId()));
            tf_model.setText(car.getModel());
            tf_serial.setText(car.getSeriel_number());
            initComboBox();
        }
    }

    public void initComboBox() {
        if (car.getState()) {
            cb_state.setSelectedIndex(0);
        } else {
            cb_state.setSelectedIndex(1);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tf_model = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_serial = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_price = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lb_id = new javax.swing.JLabel();
        tf_id = new javax.swing.JTextField();
        cb_state = new javax.swing.JComboBox<>();
        bt_add = new javax.swing.JButton();
        cb_exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Model");

        jLabel2.setText("Serial Number");

        jLabel3.setText("Price per hour");

        jLabel4.setText("State");

        lb_id.setText("Id");

        tf_id.setEditable(false);
        tf_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_idActionPerformed(evt);
            }
        });

        cb_state.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible", "Non Disponible" }));
        cb_state.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_stateActionPerformed(evt);
            }
        });

        bt_add.setText("Add");
        bt_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addActionPerformed(evt);
            }
        });

        cb_exit.setText("Cancel");
        cb_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_price, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(lb_id))
                            .addGap(67, 67, 67)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tf_model, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(bt_add))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cb_state, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_serial)))
                    .addComponent(cb_exit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_id)
                    .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(tf_serial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(tf_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(cb_state, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_add)
                    .addComponent(cb_exit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tf_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_idActionPerformed

    private void cb_stateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_stateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_stateActionPerformed

    private void cb_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_exitActionPerformed
        this.dispose();
    }//GEN-LAST:event_cb_exitActionPerformed

    private void bt_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addActionPerformed
        if (cb_state.getSelectedIndex() == 0) {
            this.state = true;
        } else {
            this.state = false;
        }
        if (!edit) {

            car = new Car(tf_model.getText(), tf_serial.getText(), Double.valueOf(tf_price.getText()), this.state);
            int add = dao.addCar(car);
            if (add > 0) {
                JOptionPane.showMessageDialog(this, "Car Inserted");
                this.dispose();
                dao = new CarsDAOImp();
                this.carsList = dao.getCarsList();
                this.table.setModel(new CarTableModel(carsList));
                this.table.repaint();
                //this.carsList.add(car);
                //this.table.setModel(new CarTableModel(carsList));
            }
        } else {
            car.setId(id);
            car.setModel(tf_model.getText());
            car.setSeriel_number(tf_serial.getText());
            car.setPrice_per_hour(Double.valueOf(tf_price.getText()));
            car.setState(this.state);
            int ed = dao.updateCarById(id, car);
            if (ed > 0) {
                JOptionPane.showMessageDialog(this, "Car Updated");
                this.dispose();
                this.carsList.get(id -1).setId(id);
                this.carsList.get(id -1).setModel(car.getModel());
                this.carsList.get(id -1).setPrice_per_hour(car.getPrice_per_hour());
                this.carsList.get(id -1).setSeriel_number(car.getSeriel_number());
                this.carsList.get(id -1).setState(car.getState());
            }
        }
    }//GEN-LAST:event_bt_addActionPerformed

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
            java.util.logging.Logger.getLogger(CarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CarDialog dialog = new CarDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_add;
    private javax.swing.JButton cb_exit;
    private javax.swing.JComboBox<String> cb_state;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lb_id;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_model;
    private javax.swing.JTextField tf_price;
    private javax.swing.JTextField tf_serial;
    // End of variables declaration//GEN-END:variables
}
