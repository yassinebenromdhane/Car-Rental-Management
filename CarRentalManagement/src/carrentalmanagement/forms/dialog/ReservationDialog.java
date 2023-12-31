/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package carrentalmanagement.forms.dialog;

import carrentalmanagement.controllers.CarDAO;
import carrentalmanagement.controllers.CarsDAOImp;
import carrentalmanagement.controllers.CustomerDAO;
import carrentalmanagement.controllers.CustomerDAOImp;
import carrentalmanagement.controllers.ReservationDAO;
import carrentalmanagement.controllers.ReservationDAOImp;
import carrentalmanagement.models.Car;
import carrentalmanagement.models.Customer;
import carrentalmanagement.models.Reservation;
import carrentalmanagement.table.models.CarTableModel;
import carrentalmanagement.table.models.ReservationTableModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author mre
 */
public class ReservationDialog extends javax.swing.JDialog {

    boolean edit;
    Reservation res;
    int id;
    ReservationDAO dao = new ReservationDAOImp();
    boolean state;
    JTable table;
    ReservationTableModel model;
    List<Reservation> resList;
    Integer rowIndex;
    List<Car> carList;
    List<Customer> customersList;


    /**
     * Creates new form ReservationDialog
     */
    public ReservationDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.lb_id.setEnabled(false);
        this.tf_id.setEnabled(false);
        initForm();
    }

    public ReservationDialog(java.awt.Frame parent, boolean modal, boolean edit, int id, JTable table, List<Reservation> resList , Integer rowIndex , CarTableModel model) {
        super(parent, modal);
        this.edit = edit;
        this.id = id;
        this.table = table;
        this.resList = resList;
        this.rowIndex = rowIndex;
        initComponents();
        initForm();
    }

    public void initForm() {
        initCbCars();
        initCbCustomers();
        if (!edit) {
            lb_id.setVisible(false);
            tf_id.setVisible(false);
        } else {
            bt_add.setText("Edit");
            res = dao.getReservationById(this.id);
            tf_id.setText(String.valueOf(res.getId()));
        }
    }
    public void initCbCars(){
        CarDAO dao_cars = new CarsDAOImp();
        carList = new ArrayList<>();
        carList = dao_cars.getCarsList();
        for(Car car : carList){
            cb_cars.addItem(String.valueOf(car.getId()) + '-' + car.getModel());
        }

    }
    public void initCbCustomers(){
        CustomerDAO dao_customers = new CustomerDAOImp();
        customersList = new ArrayList<>();
        customersList = dao_customers.getCustomersList();
        for(Customer cust : customersList){
            cb_customers.addItem(String.valueOf(cust.getId()) + '-' + cust.getName());
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

        jComboBox3 = new javax.swing.JComboBox<>();
        lb_id = new javax.swing.JLabel();
        tf_id = new javax.swing.JTextField();
        tf_start = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_end = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lb_car = new javax.swing.JLabel();
        lb_customer = new javax.swing.JLabel();
        cb_cars = new javax.swing.JComboBox<>();
        cb_customers = new javax.swing.JComboBox<>();
        bt_cancel = new javax.swing.JButton();
        bt_add = new javax.swing.JButton();

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 700));

        lb_id.setText("id");

        tf_id.setText("jTextField1");

        jLabel2.setText("Start Date");

        jLabel4.setText("End Date");

        lb_car.setText("Car");

        lb_customer.setText("Cusotmer");

        bt_cancel.setText("Cancel");
        bt_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelActionPerformed(evt);
            }
        });

        bt_add.setText("Add");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_id)
                                .addGap(18, 18, 18)
                                .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lb_car)
                                        .addGap(33, 33, 33))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(8, 8, 8)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_start)
                                    .addComponent(cb_cars, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lb_customer)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(8, 8, 8)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_end)
                            .addComponent(cb_customers, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_add)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_cancel)
                        .addGap(108, 108, 108)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_id)
                    .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_car)
                    .addComponent(lb_customer)
                    .addComponent(cb_cars, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_customers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_start, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(tf_end, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_cancel)
                    .addComponent(bt_add))
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_cancelActionPerformed

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
            java.util.logging.Logger.getLogger(ReservationDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservationDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservationDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservationDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ReservationDialog dialog = new ReservationDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton bt_cancel;
    private javax.swing.JComboBox<String> cb_cars;
    private javax.swing.JComboBox<String> cb_customers;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lb_car;
    private javax.swing.JLabel lb_customer;
    private javax.swing.JLabel lb_id;
    private javax.swing.JTextField tf_end;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_start;
    // End of variables declaration//GEN-END:variables
}
