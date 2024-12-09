/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.Customer;
import UI.Customer.EditCustomerJFrame;
import UI.Customer.AddCustomerJFrame;
import UI.DatabaseConnection;
import UI.MainMenuJFrame;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AnjanaSruthiR
 */
public class ManageCustomersJFrame extends javax.swing.JFrame {

    private final MainMenuJFrame parent;

    /**
     * Creates new form ManageCustomersJFrame
     */
    public ManageCustomersJFrame(MainMenuJFrame parent) {
        initComponents();
        this.parent = parent;
        loadCustomerData();

    }

    public void loadCustomerData() {
        DefaultTableModel model = (DefaultTableModel) TblCustomers.getModel();
        model.setRowCount(0); // Clear existing rows

        String query = "SELECT c.Customer_PersonID AS CustomerID, "
                + "CONCAT(p.FirstName, ' ', p.LastName) AS FullName, "
                + "p.Email, p.PhoneNumber, c.LicenseExpiryDate, c.PreferredPaymentMethod "
                + "FROM Customer c "
                + "JOIN Person p ON c.Customer_PersonID = p.PersonID";

        try (Connection conn = DatabaseConnection.getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("CustomerID"),
                    rs.getString("FullName"),
                    rs.getString("Email"),
                    rs.getString("PhoneNumber"),
                    rs.getDate("LicenseExpiryDate"),
                    rs.getString("PreferredPaymentMethod")
                });
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error loading customer data.");
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

        BtnBack = new javax.swing.JButton();
        BtnAdd = new javax.swing.JButton();
        BtnEdit = new javax.swing.JButton();
        BtnDelete = new javax.swing.JButton();
        JscrollPane = new javax.swing.JScrollPane();
        TblCustomers = new javax.swing.JTable();
        BtnDetails = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnBack.setText("<-Back");
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });

        BtnAdd.setText("Add");
        BtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddActionPerformed(evt);
            }
        });

        BtnEdit.setText("Edit");
        BtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditActionPerformed(evt);
            }
        });

        BtnDelete.setText("Delete");
        BtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeleteActionPerformed(evt);
            }
        });

        TblCustomers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Customer ID", "Full Name", "Email", "Phone Number", "License Expiry Date", "Preferred Payment Method"
            }
        ));
        JscrollPane.setViewportView(TblCustomers);

        BtnDetails.setText("Additional Details");
        BtnDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDetailsActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Customers");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JscrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BtnAdd)
                                .addGap(18, 18, 18)
                                .addComponent(BtnEdit)
                                .addGap(18, 18, 18)
                                .addComponent(BtnDelete)
                                .addGap(14, 14, 14)
                                .addComponent(BtnDetails)
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BtnBack)
                                .addGap(56, 56, 56)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(170, 170, 170))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JscrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnDelete)
                    .addComponent(BtnAdd)
                    .addComponent(BtnEdit)
                    .addComponent(BtnDetails))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddActionPerformed
        AddCustomerJFrame addCustomerFrame = new AddCustomerJFrame(this);
        addCustomerFrame.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAddActionPerformed

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        this.dispose();
        if (parent != null) {
            parent.setVisible(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnBackActionPerformed

    private void BtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditActionPerformed
        int selectedRow = TblCustomers.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a customer to edit.");
            return;
        }

        // Fetch selected customer ID
        DefaultTableModel model = (DefaultTableModel) TblCustomers.getModel();
        int customerID = (int) model.getValueAt(selectedRow, 0);

        // Navigate to EditCustomerJFrame
        EditCustomerJFrame editFrame = new EditCustomerJFrame(this, customerID);
        editFrame.setVisible(true);
        this.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_BtnEditActionPerformed

    private void BtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeleteActionPerformed
        int selectedRow = TblCustomers.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a customer to delete.");
            return;
        }

        // Confirm deletion
        int confirm = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to delete this customer?",
                "Confirm Deletion",
                JOptionPane.YES_NO_OPTION);

        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        // Fetch Customer ID
        DefaultTableModel model = (DefaultTableModel) TblCustomers.getModel();
        int customerID = (int) model.getValueAt(selectedRow, 0);

        // Delete the customer from the database
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement("DELETE FROM Customer WHERE Customer_PersonID = ?")) {
            stmt.setInt(1, customerID);
            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                // Delete associated person entry
                try (PreparedStatement personStmt = conn.prepareStatement("DELETE FROM Person WHERE PersonID = ?")) {
                    personStmt.setInt(1, customerID);
                    personStmt.executeUpdate();
                }
                JOptionPane.showMessageDialog(this, "Customer deleted successfully.");
                loadCustomerData(); // Refresh table
            } else {
                JOptionPane.showMessageDialog(this, "Error: Customer could not be deleted.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error deleting customer: " + e.getMessage());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_BtnDeleteActionPerformed

    private void BtnDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDetailsActionPerformed
        int selectedRow = TblCustomers.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a customer to view details.");
            return;
        }

        // Get selected customer ID
        DefaultTableModel model = (DefaultTableModel) TblCustomers.getModel();
        int customerID = (int) model.getValueAt(selectedRow, 0); // Customer ID

        // Fetch additional details from the database
        String query = "SELECT c.Customer_PersonID AS CustomerID, p.FirstName, p.LastName, p.Gender, "
                + "p.DateOfBirth, p.Email, p.PhoneNumber, p.Nationality, p.AddressID, "
                + "c.LicenseExpiryDate, c.PreferredPaymentMethod, c.DriverLicenseNumber "
                + "FROM Customer c JOIN Person p ON c.Customer_PersonID = p.PersonID WHERE c.Customer_PersonID = ?";

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, customerID);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                // Prepare details message
                String details = String.format(
                        "Customer ID: %d%n"
                        + "Name: %s %s%n"
                        + "Gender: %s%n"
                        + "Date of Birth: %s%n"
                        + "Email: %s%n"
                        + "Phone: %s%n"
                        + "Nationality: %s%n"
                        + "Address ID: %d%n"
                        + "License Expiry: %s%n"
                        + "Payment Method: %s%n"
                        + "Driver License: %s",
                        rs.getInt("CustomerID"),
                        rs.getString("FirstName"),
                        rs.getString("LastName"),
                        rs.getString("Gender"),
                        rs.getDate("DateOfBirth"),
                        rs.getString("Email"),
                        rs.getString("PhoneNumber"),
                        rs.getString("Nationality"),
                        rs.getInt("AddressID"),
                        rs.getDate("LicenseExpiryDate"),
                        rs.getString("PreferredPaymentMethod"),
                        rs.getString("DriverLicenseNumber")
                );

                // Show details in a dialog
                JOptionPane.showMessageDialog(this, details, "Customer Details", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error fetching customer details: " + e.getMessage());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_BtnDetailsActionPerformed

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
            java.util.logging.Logger.getLogger(ManageCustomersJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageCustomersJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageCustomersJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageCustomersJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new ManageCustomersJFrame(null).setVisible(true); // Pass null for independent testing
        }
    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdd;
    private javax.swing.JButton BtnBack;
    private javax.swing.JButton BtnDelete;
    private javax.swing.JButton BtnDetails;
    private javax.swing.JButton BtnEdit;
    private javax.swing.JScrollPane JscrollPane;
    private javax.swing.JTable TblCustomers;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
