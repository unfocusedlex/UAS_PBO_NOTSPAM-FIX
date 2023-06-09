/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Aplikasi_Kasir;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class KasirToken extends javax.swing.JFrame {

    /**
     * Creates new form KasirToken
     */
    public KasirToken() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        seleksi_nominal = new javax.swing.ButtonGroup();
        seleksi_pembayaran = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fieldNoMeteran = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        token10Radio = new javax.swing.JRadioButton();
        token25Radio = new javax.swing.JRadioButton();
        token50Radio = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        kasRadio = new javax.swing.JRadioButton();
        debitRadio = new javax.swing.JRadioButton();
        qrisRadio = new javax.swing.JRadioButton();
        btnKonfirmasi = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        btnback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel1.setText("Token Listrik");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("No Meteran");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel3.setText("Nominal");

        seleksi_nominal.add(token10Radio);
        token10Radio.setText("Token 10.000");

        seleksi_nominal.add(token25Radio);
        token25Radio.setText("Token 25.000");

        seleksi_nominal.add(token50Radio);
        token50Radio.setText("Token 50.000");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel4.setText("Metode Pembayaran");

        seleksi_pembayaran.add(kasRadio);
        kasRadio.setText("Cash");

        seleksi_pembayaran.add(debitRadio);
        debitRadio.setText("Debit");

        seleksi_pembayaran.add(qrisRadio);
        qrisRadio.setText("QRIS");

        btnKonfirmasi.setText("Konfirmasi");
        btnKonfirmasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKonfirmasiActionPerformed(evt);
            }
        });

        btnBatal.setText("Batal");

        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBatal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKonfirmasi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnback))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(fieldNoMeteran, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel3)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(token10Radio, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(token25Radio, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(token50Radio, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel4)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(kasRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(debitRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(qrisRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnback)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fieldNoMeteran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(token10Radio)
                    .addComponent(token25Radio)
                    .addComponent(token50Radio))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kasRadio)
                    .addComponent(debitRadio)
                    .addComponent(qrisRadio))
                .addGap(18, 18, 18)
                .addComponent(btnKonfirmasi, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBatal, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKonfirmasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKonfirmasiActionPerformed
        if (!checkString(fieldNoMeteran.getText(), 11, 12)){
            JOptionPane.showMessageDialog(null, "Nomor meteran terdiri dari angka dengan panjang 11-12 digit! Panjang sekarang " + fieldNoMeteran.getText().length(), "Invalid Input", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (seleksi_nominal.getSelection() == null || seleksi_pembayaran.getSelection() == null){
            JOptionPane.showMessageDialog(null, "Pilih nominal dan/atau metode pembayaran!", "Invalid Input", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Token temptoken = createToken();
        MetodePembayaran new_payment;
        
        if (kasRadio.isSelected()) {
            new_payment = new Kas(temptoken.getHarga());
        } else if (debitRadio.isSelected()) {
            new_payment = new KartuDebit(temptoken.getHarga());
        } else {
            new_payment = new QRIS(temptoken.getHarga());
        }
        
        new_payment.addItem(temptoken, 1);
        new_payment.setFlag(MetodePembayaran.Flags.TOKEN);
        new_payment.Payment();
        
        fieldNoMeteran.setText("");
    }//GEN-LAST:event_btnKonfirmasiActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        Home frame = new Home();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnbackActionPerformed

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
            java.util.logging.Logger.getLogger(KasirToken.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KasirToken.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KasirToken.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KasirToken.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KasirToken().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnKonfirmasi;
    private javax.swing.JButton btnback;
    private javax.swing.JRadioButton debitRadio;
    private javax.swing.JTextField fieldNoMeteran;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton kasRadio;
    private javax.swing.JRadioButton qrisRadio;
    private javax.swing.ButtonGroup seleksi_nominal;
    private javax.swing.ButtonGroup seleksi_pembayaran;
    private javax.swing.JRadioButton token10Radio;
    private javax.swing.JRadioButton token25Radio;
    private javax.swing.JRadioButton token50Radio;
    // End of variables declaration//GEN-END:variables
    private boolean checkString(String input, int lengthmin, int lengthmax) {
        if (input == null || (input.length() < lengthmin || input.length() > lengthmax)) {
            return false;
        }

        for (char c : input.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
    
    private Token createToken(){
        String noMeteran = fieldNoMeteran.getText();
        float nominal = 0f;
        
        String kode = "";
        String nama = "";
        float harga = 0f;
        
        String sql = """
                     SELECT t.kode, b.nama, b.harga, t.nominal FROM `token` t
                     INNER JOIN barang b ON t.kode = b.kode
                     WHERE t.kode = ?;
                     """;
        try {
            PreparedStatement stmt = DBConnector.conn.prepareStatement(sql);
            if (token10Radio.isSelected()){
                stmt.setString(1, "0011");
            }
            else if (token25Radio.isSelected()){
                stmt.setString(1, "0012");
            }
            else {
                stmt.setString(1, "0013");
            }
            
            ResultSet rs = stmt.executeQuery();
            if (rs.next()){
                nominal = rs.getFloat("nominal");
                kode = rs.getString("kode");
                nama = rs.getString("nama");
                harga = rs.getFloat("harga");
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        
        Token temp = new Token(noMeteran, nominal);
        temp.setKode(kode);
        temp.setHarga(harga);
        temp.setNama(nama);
        
        return temp;
    }
}
