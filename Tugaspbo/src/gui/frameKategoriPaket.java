/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;
import crudDB.crudDB;
/**
 *
 * @author adyat
 */
public class frameKategoriPaket extends javax.swing.JFrame {
    
    crudDB mycrud;
    String fieldKategoriPaket[]={"id_kategori","katagori"};
    String judulkolom[]={"id_kategori","katagori"};
    int lebarkolom[]={150,150};
    String Sql="select *from kategori_paket";

    /**
     * Creates new form frameKategoriPaket
     */
    public frameKategoriPaket() {
        initComponents();
        this.setLocationRelativeTo(null);
        mycrud = new crudDB ();
        mycrud.settingJudulTabel(jTable1, judulkolom);
        mycrud.tampilTabel(jTable1, Sql, judulkolom);
        mycrud.settingLebarKolom(jTable1, lebarkolom);
        
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
        jLabel2 = new javax.swing.JLabel();
        txtIdKategori = new javax.swing.JTextField();
        txtKatagori = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        carilaporan = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("ID Kategori");

        jLabel2.setText("Katagori");

        txtKatagori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKatagoriActionPerformed(evt);
            }
        });

        jButton1.setText("SIMPAN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        carilaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carilaporanActionPerformed(evt);
            }
        });

        jButton4.setText("CETAK LAPORAN");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton2.setText("EDIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("HAPUS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30)
                        .addComponent(txtIdKategori))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(44, 44, 44)
                        .addComponent(txtKatagori, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(carilaporan, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(61, 61, 61)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(carilaporan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtIdKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtKatagori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton1))))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtKatagoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKatagoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKatagoriActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String isi[]={txtIdKategori.getText(),txtKatagori.getText()};
      mycrud.SimpanDinamis("kategori_paket", fieldKategoriPaket, isi); // TODO add your handling code here:
      mycrud.tampilTabel(jTable1, Sql, judulkolom);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void carilaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carilaporanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carilaporanActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         int baris = jTable1.getSelectedRow();
    if (baris == -1) {
        javax.swing.JOptionPane.showMessageDialog(this, "Pilih data yang ingin diedit!");
        return;
    }

    // Ambil ID dari baris yang dipilih (Primary Key)
    String id = jTable1.getValueAt(baris, 0).toString();

    // Ambil nilai baru dari TextField
    String[] field = {"id_kategori","katagori"};
    String[] value = {
        txtIdKategori.getText(), // Isi Berita
        txtKatagori.getText(), // Sumber
       
    };

    // Validasi jika ID atau field kosong
    if (id.isEmpty() || txtIdKategori.getText().isEmpty() || txtKatagori.getText().isEmpty() ) {
        javax.swing.JOptionPane.showMessageDialog(this, "Semua field diisi!");
        return;
    }

    // Panggil metode EditDinamis
    mycrud.EditDinamis("kategori_paket", "id_kategori", id, field, value);

    // Refresh tabel untuk menampilkan data terbaru
    mycrud.tampilTabel(jTable1, Sql, judulkolom);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int baris = jTable1.getSelectedRow();
    if (baris == -1) {
        javax.swing.JOptionPane.showMessageDialog(this, "Pilih data yang ingin dihapus!");
        return;
    }

    // Ambil ID dari baris yang dipilih (Primary Key)
    String id = jTable1.getValueAt(baris, 0).toString();

    // Konfirmasi penghapusan
    int konfirmasi = javax.swing.JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus data dengan ID " + id + "?", "Konfirmasi Hapus", javax.swing.JOptionPane.YES_NO_OPTION);
    if (konfirmasi == javax.swing.JOptionPane.YES_OPTION) {
        // Panggil metode HapusDinamis
        mycrud.HapusDinamis("kategori_paket", "id_kategori", id);

        // Refresh tabel untuk menampilkan data terbaru
        mycrud.tampilTabel(jTable1, Sql, judulkolom);
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         String sql="";
        if (carilaporan.getText().isEmpty()){
        
            sql="select*from kategori_paket";
        }
        else{
        
            sql="select*from kategori_paket where id_kategori ='"+carilaporan.getText()+"'";
        }
        mycrud.tampilLaporan("C:\\Users\\adyat\\OneDrive\\Dokumen\\NetBeansProjects\\Tugaspbo\\src\\laporan\\kategori.jrxml", sql);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(frameKategoriPaket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameKategoriPaket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameKategoriPaket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameKategoriPaket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameKategoriPaket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField carilaporan;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtIdKategori;
    private javax.swing.JTextField txtKatagori;
    // End of variables declaration//GEN-END:variables
}
