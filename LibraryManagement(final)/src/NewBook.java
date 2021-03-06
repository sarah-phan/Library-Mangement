
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author surface
 */
public class NewBook extends javax.swing.JFrame {
    Connection conn;
    ResultSet rs;
    PreparedStatement pst;

    /**
     * Creates new form NewBook
     */
    public NewBook(){
        super ("New Book");
        initComponents();
        conn = javaconnect.ConnecrDb();
        Random();
    }
    public void Random(){
        Random rd = new Random();
        BookIDField.setText("" + rd.nextInt(2000+1));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddBookPanel = new javax.swing.JPanel();
        EditionField = new javax.swing.JTextField();
        BookName = new javax.swing.JLabel();
        Price = new javax.swing.JLabel();
        Genre = new javax.swing.JLabel();
        BookID = new javax.swing.JLabel();
        BookNameField = new javax.swing.JTextField();
        ChooseGenre = new javax.swing.JComboBox<>();
        Edition = new javax.swing.JLabel();
        PriceField = new javax.swing.JTextField();
        AddBookButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        BookIDField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AddBookPanel.setBackground(new java.awt.Color(54, 54, 54));
        AddBookPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(232, 23, 93)), "ADD NEW BOOK", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 36), new java.awt.Color(232, 23, 93))); // NOI18N

        BookName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BookName.setForeground(new java.awt.Color(204, 82, 122));
        BookName.setText("Book Name");

        Price.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Price.setForeground(new java.awt.Color(204, 82, 122));
        Price.setText("Price");

        Genre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Genre.setForeground(new java.awt.Color(204, 82, 122));
        Genre.setText("Genre");

        BookID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BookID.setForeground(new java.awt.Color(204, 82, 122));
        BookID.setText("Book ID");

        BookNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookNameFieldActionPerformed(evt);
            }
        });

        ChooseGenre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fiction", "Non - fiction", "Novel", "Journal", "Informative", "Historical" }));

        Edition.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Edition.setForeground(new java.awt.Color(204, 82, 122));
        Edition.setText("Edition");

        AddBookButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AddBookButton.setForeground(new java.awt.Color(232, 23, 93));
        AddBookButton.setText("Add");
        AddBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBookButtonActionPerformed(evt);
            }
        });

        BackButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BackButton.setForeground(new java.awt.Color(232, 23, 93));
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddBookPanelLayout = new javax.swing.GroupLayout(AddBookPanel);
        AddBookPanel.setLayout(AddBookPanelLayout);
        AddBookPanelLayout.setHorizontalGroup(
            AddBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddBookPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Genre)
                    .addComponent(BookName)
                    .addComponent(BookID)
                    .addComponent(Edition)
                    .addComponent(Price))
                .addGap(51, 51, 51)
                .addGroup(AddBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(AddBookPanelLayout.createSequentialGroup()
                        .addComponent(AddBookButton)
                        .addGap(70, 70, 70)
                        .addComponent(BackButton))
                    .addComponent(BookNameField)
                    .addComponent(ChooseGenre, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EditionField)
                    .addComponent(PriceField, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                    .addComponent(BookIDField))
                .addContainerGap())
        );
        AddBookPanelLayout.setVerticalGroup(
            AddBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddBookPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BookID)
                    .addComponent(BookIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(AddBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BookName)
                    .addComponent(BookNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(AddBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Genre)
                    .addComponent(ChooseGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(AddBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Edition)
                    .addComponent(EditionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(AddBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Price)
                    .addComponent(PriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(AddBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBookButton)
                    .addComponent(BackButton))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddBookPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AddBookPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Home ha = new Home();
        ha.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void AddBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBookButtonActionPerformed
        String sql = "insert into NBook (Book_ID,Book_Name,Genre,Edition,Price) values (?,?,?,?,?)";
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1, BookIDField.getText());
            pst.setString(2, BookNameField.getText());
            pst.setString(3, (String) ChooseGenre.getSelectedItem());
            pst.setString(4, EditionField.getText());
            pst.setString(5, PriceField.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "New Book Added");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_AddBookButtonActionPerformed

    private void BookNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BookNameFieldActionPerformed

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
            java.util.logging.Logger.getLogger(NewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBookButton;
    private javax.swing.JPanel AddBookPanel;
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel BookID;
    private javax.swing.JTextField BookIDField;
    private javax.swing.JLabel BookName;
    private javax.swing.JTextField BookNameField;
    private javax.swing.JComboBox<String> ChooseGenre;
    private javax.swing.JLabel Edition;
    private javax.swing.JTextField EditionField;
    private javax.swing.JLabel Genre;
    private javax.swing.JLabel Price;
    private javax.swing.JTextField PriceField;
    // End of variables declaration//GEN-END:variables
}

