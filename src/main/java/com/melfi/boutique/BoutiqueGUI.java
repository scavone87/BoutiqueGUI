package com.melfi.boutique;

import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author scavo
 */
public class BoutiqueGUI extends javax.swing.JFrame {

    /**
     * Creates new form ProvaGUI
     */
    public BoutiqueGUI() {
        initComponents();
        inizializza();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tipoProdottoComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nomeTextField = new javax.swing.JTextField();
        prezzoTextField = new javax.swing.JTextField();
        scontoTextField = new javax.swing.JTextField();
        tagliaTextField = new javax.swing.JTextField();
        coloreTextField = new javax.swing.JTextField();
        materialeTextField = new javax.swing.JTextField();
        numeroTascheTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        budgetTextArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aggiunta prodotto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 0, 12), javax.swing.UIManager.getDefaults().getColor("Actions.GreyInline"))); // NOI18N
        jPanel1.setForeground(java.awt.Color.darkGray);

        jLabel1.setText("Tipo prodotto");

        jLabel2.setText("Nome prodotto:");

        jLabel3.setText("Prezzo:");

        jLabel4.setText("Sconto (%): ");

        tipoProdottoComboBox.setToolTipText("");
        tipoProdottoComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tipoProdottoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoProdottoComboBoxActionPerformed(evt);
            }
        });

        jLabel5.setText("Taglia: ");

        jLabel6.setText("Colore: ");

        jLabel7.setText("Materiale: ");

        jLabel8.setText("Numero Tasche: ");

        jButton1.setText("Aggiungi prodotto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aggiungiProdottoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
                            .addComponent(prezzoTextField)
                            .addComponent(scontoTextField)
                            .addComponent(tagliaTextField)
                            .addComponent(coloreTextField)
                            .addComponent(materialeTextField)
                            .addComponent(numeroTascheTextField)
                            .addComponent(tipoProdottoComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tipoProdottoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(prezzoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(scontoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tagliaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(coloreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(materialeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(numeroTascheTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vendita prodotto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 0, 12), javax.swing.UIManager.getDefaults().getColor("Actions.GreyInline"))); // NOI18N
        jPanel2.setForeground(java.awt.Color.darkGray);

        jButton2.setText("Vendi Prodotto");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendiProdottoActionPerformed(evt);
            }
        });

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        productTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(productTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 564, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cassa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 0, 12), javax.swing.UIManager.getDefaults().getColor("Actions.GreyInline"))); // NOI18N
        jPanel3.setForeground(java.awt.Color.darkGray);

        budgetTextArea.setEditable(false);
        budgetTextArea.setColumns(20);
        budgetTextArea.setRows(5);
        jScrollPane2.setViewportView(budgetTextArea);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        jMenu1.setText("File");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem2.setText("esci");
        jMenuItem2.setToolTipText("");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esciMenuActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aggiungiProdottoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aggiungiProdottoActionPerformed
        String name = nomeTextField.getText();
        String priceText = prezzoTextField.getText();
        String discountText = scontoTextField.getText();
        String type = (String) tipoProdottoComboBox.getSelectedItem();

        if (name.isEmpty() || priceText.isEmpty() || discountText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Inserire tutti i campi obbligatori.", "Errore", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double price = 0.0;
        double discount = 0.0;
        try {
            price = Double.parseDouble(priceText);
            discount = Double.parseDouble(discountText);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Inserire valori numerici validi per Prezzo e Sconto.", "Errore", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Prodotto newProduct;
        if (type.equals("Maglietta")) {
            String taglia = tagliaTextField.getText();
            String colore = coloreTextField.getText();
            String materiale = materialeTextField.getText();
            if (taglia.isEmpty() || colore.isEmpty() || materiale.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Inserire tutti i campi obbligatori per la Maglietta.", "Errore", JOptionPane.ERROR_MESSAGE);
                return;
            }
            newProduct = new Maglietta(price, discount, name, taglia, colore, materiale);
        } else {
            String taglia = tagliaTextField.getText();
            String colore = coloreTextField.getText();
            String numeroTascheText = numeroTascheTextField.getText();
            if (taglia.isEmpty() || colore.isEmpty() || numeroTascheText.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Inserire tutti i campi obbligatori per i Jeans.", "Errore", JOptionPane.ERROR_MESSAGE);
                return;
            }
            int numeroTasche = 0;
            try {
                numeroTasche = Integer.parseInt(numeroTascheText);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Inserire un valore numerico valido per Numero Tasche.", "Errore", JOptionPane.ERROR_MESSAGE);
                return;
            }
            newProduct = new Jeans(price, discount, name, taglia, colore, numeroTasche);
        }

        boutique.addProdotto(newProduct);
        updateProductListAndBudget();
    }//GEN-LAST:event_aggiungiProdottoActionPerformed

    private void vendiProdottoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendiProdottoActionPerformed
        int selectedRow = productTable.getSelectedRow();
        if (selectedRow != -1) {
            Prodotto prodottoVenduto = boutique.getListaProdotti().get(selectedRow);
            double prezzoScontato = CalcolatoreSconto.calcolaPrezzoScontato(prodottoVenduto.getPrezzoDiListino(),
                    prodottoVenduto.getScontoPercentuale());
            int choice = JOptionPane.showConfirmDialog(null,
                    "Sei sicuro di voler vendere il prodotto?\n\n"
                    + "Nome Prodotto: " + prodottoVenduto.getNome() + "\n"
                    + "Prezzo Scontato: " + prezzoScontato + " euro",
                    "Conferma Vendita", JOptionPane.YES_NO_OPTION);

            if (choice == JOptionPane.YES_OPTION) {
                cassa.vendiProdotto(prezzoScontato);
                boutique.removeProdotto(selectedRow);
                tableModel.removeRow(selectedRow);
                this.productTable.clearSelection();
                updateProductListAndBudget();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleziona un prodotto dalla tabella per venderlo.", "Errore",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_vendiProdottoActionPerformed

    private void tipoProdottoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoProdottoComboBoxActionPerformed
        String selectedType = (String) tipoProdottoComboBox.getSelectedItem();
        if (selectedType.equals("Maglietta")) {
            tagliaTextField.setVisible(true);
            coloreTextField.setVisible(true);
            materialeTextField.setVisible(true);
            numeroTascheTextField.setVisible(false);
        } else if (selectedType.equals("Jeans")) {
            tagliaTextField.setVisible(true);
            coloreTextField.setVisible(true);
            materialeTextField.setVisible(false);
            numeroTascheTextField.setVisible(true);
        }
        // Forza il ridisegno corretto della finestra dopo aver cambiato la selezione
        BoutiqueGUI.this.revalidate();
    }//GEN-LAST:event_tipoProdottoComboBoxActionPerformed

    private void productTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productTableMouseClicked
        int selectedRow = productTable.rowAtPoint(evt.getPoint());
        productTable.setRowSelectionInterval(selectedRow, selectedRow);    }//GEN-LAST:event_productTableMouseClicked

    private void esciMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esciMenuActionPerformed
        super.dispose();
    }//GEN-LAST:event_esciMenuActionPerformed

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
            java.util.logging.Logger.getLogger(BoutiqueGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BoutiqueGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BoutiqueGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BoutiqueGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    //UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
                    UIManager.setLookAndFeel(new FlatMacDarkLaf());
                } catch (Exception ignored) {
                    System.err.println( "Failed to initialize LaF" );
                }

                new BoutiqueGUI().setVisible(true);
            }
        });
    }

    private Boutique boutique;
    private Cassa cassa;
    private DefaultTableModel tableModel;
    private String[] productTypes = {"Maglietta", "Jeans"};

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea budgetTextArea;
    private javax.swing.JTextField coloreTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField materialeTextField;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JTextField numeroTascheTextField;
    private javax.swing.JTextField prezzoTextField;
    private javax.swing.JTable productTable;
    private javax.swing.JTextField scontoTextField;
    private javax.swing.JTextField tagliaTextField;
    private javax.swing.JComboBox<String> tipoProdottoComboBox;
    // End of variables declaration//GEN-END:variables

    private void inizializza() {
        boutique = new Boutique();
        cassa = new Cassa(100);
        setTitle("Boutique GUI");
        this.setLocationRelativeTo(null);
        
        this.tipoProdottoComboBox.addItem(productTypes[0]);
        this.tipoProdottoComboBox.addItem(productTypes[1]);
        this.tipoProdottoComboBox.setSelectedItem(productTypes[0]);

        // Tabella per mostrare i prodotti nella boutique
        tableModel = new DefaultTableModel();
        this.productTable.setModel(tableModel);
        tableModel.addColumn("Nome Prodotto");
        tableModel.addColumn("Tipo Prodotto");
        tableModel.addColumn("Prezzo Scontato");
        // Aggiorniamo la lista dei prodotti e il budget iniziale
        updateProductListAndBudget();

    }

    // Aggiorna la lista dei prodotti e il budget nella JTable e JTextArea
    private void updateProductListAndBudget() {
        tableModel.setRowCount(0); // Rimuovi le righe precedenti dalla tabella
        List<Prodotto> prodotti = boutique.getListaProdotti();
        for (Prodotto prodotto : prodotti) {
            double prezzoScontato = CalcolatoreSconto.calcolaPrezzoScontato(prodotto.getPrezzoDiListino(),
                    prodotto.getScontoPercentuale());
            tableModel.addRow(new Object[]{prodotto.getNome(), prodotto.getClass().getSimpleName() ,prezzoScontato});
        }

        budgetTextArea.setText("Budget rimanente della cassa: " + cassa.getBudget() + " euro.");
    }
}
