/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.StoreAdmin;

import BusinessLogic.Drug;
import BusinessLogic.InventoryItem;
import BusinessLogic.Store;
import BusinessLogic.Supplier;
import BusinessLogic.SupplierDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class ManageInventoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddDrugJPanel
     */
    private JPanel userProcessContainer;
    private Store store;
    private SupplierDirectory supplierDirectory;

    public ManageInventoryJPanel(JPanel userProcessContainer, Store store, SupplierDirectory supplierDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.store = store;
        this.supplierDirectory = supplierDirectory;
        populateSupplierCombo();
    }

    private void populateSupplierCombo() {
        suppComboBox1.removeAllItems();
        for (Supplier s : supplierDirectory.getSupplierList()) {
            suppComboBox1.addItem(s);
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

        jLabel6 = new javax.swing.JLabel();
        suppComboBox1 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        supplierJTable = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();
        viewInvBtn = new javax.swing.JButton();
        quantitySpinner = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        viewDrugBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Supplier:");

        suppComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        suppComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppComboBox1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Supplier Drug Catalog");

        supplierJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Drug Name", "Drug ID", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(supplierJTable);
        if (supplierJTable.getColumnModel().getColumnCount() > 0) {
            supplierJTable.getColumnModel().getColumn(0).setResizable(false);
            supplierJTable.getColumnModel().getColumn(1).setResizable(false);
            supplierJTable.getColumnModel().getColumn(2).setResizable(false);
        }

        addBtn.setText("Add to Inventory");
        addBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        viewInvBtn.setText("View Inventory >>");
        viewInvBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        viewInvBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewInvBtnActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Qty:");

        viewDrugBtn.setText("View Drug Details >>");
        viewDrugBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        viewDrugBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDrugBtnActionPerformed(evt);
            }
        });

        backBtn.setText("<< Back");
        backBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(suppComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(viewDrugBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(viewInvBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(suppComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addComponent(viewDrugBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(viewInvBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewDrugBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDrugBtnActionPerformed
        int selectedRow = supplierJTable.getSelectedRow();
        if (selectedRow >= 0) {
            Drug drug = (Drug) supplierJTable.getValueAt(selectedRow, 0);
            ViewDrugJPanel panel = new ViewDrugJPanel(userProcessContainer, drug);
            userProcessContainer.add("ViewDrugJP", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_viewDrugBtnActionPerformed

    private void viewInvBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewInvBtnActionPerformed
        ViewInventoryJPanel panel = new ViewInventoryJPanel(userProcessContainer, store, supplierDirectory);
        userProcessContainer.add("ViewInventoryJP", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewInvBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        int selectedRow = supplierJTable.getSelectedRow();
        if (selectedRow >= 0) {
            Drug drug = (Drug) supplierJTable.getValueAt(selectedRow, 0);
            boolean alreadyPresent = false;
            int fetchedQuantity = (Integer) quantitySpinner.getValue();
            for (InventoryItem i : store.getInventory().getInventoryList()) {
                if (i.getDrug().getId() == drug.getId()) {
                    alreadyPresent = true;
                    int existingQuantity = i.getQuantity();
                    i.setQuantity(fetchedQuantity + existingQuantity);
                    i.setName(drug.getName());
                }
                
                else{
                    JOptionPane.showMessageDialog(null, "ERROR");
                }
            }
            if(!alreadyPresent){
                    InventoryItem ii = store.getInventory().addInventory();
                    ii.setDrug(drug);
                    ii.setName(drug.getName());
                    ii.setQuantity(fetchedQuantity);
                }
            
        } else {
            JOptionPane.showMessageDialog(null, "Please Select a row");
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void suppComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppComboBox1ActionPerformed
        populateDrugs();
    }//GEN-LAST:event_suppComboBox1ActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner quantitySpinner;
    private javax.swing.JComboBox suppComboBox1;
    private javax.swing.JTable supplierJTable;
    private javax.swing.JButton viewDrugBtn;
    private javax.swing.JButton viewInvBtn;
    // End of variables declaration//GEN-END:variables

    private void populateDrugs() {
        Supplier supplier = (Supplier) suppComboBox1.getSelectedItem();
        DefaultTableModel dtm = (DefaultTableModel) supplierJTable.getModel();
        dtm.setRowCount(0);
        if(supplier != null){
            for (Drug d : supplier.getDrugList().getDrugCatalog()) {
                Object row[] = new Object[3];
                row[0] = d;
                row[1] = d.getId();
                row[2] = d.getPrice();
                dtm.addRow(row);
        }
        }
    }
}