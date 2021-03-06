/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.form;

import modul.model.ModelDataKelas;
import modul.query.QueryDataKelas;
import modul.utils.DBConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Handitowira
 * @version 1.0
 */
public class FormDataKelas extends javax.swing.JFrame {

    /**
     * Creates new form FormDataKelas
     */
    private List<ModelDataKelas> records = new ArrayList<ModelDataKelas>();
    private int row = 0;
    private boolean status;

    /**
     * ketika frame di run, maka akan mengeksekusi method method di bawah ini
     */
    public FormDataKelas() {
        initComponents();
        loadRecords();
        updateRow();
        this.setLocationRelativeTo(null);
        editForm(false);
    }

    public void loadRecords() {
        try {
            DBConnection conn = DBConnection.getInstance();
            QueryDataKelas queryDk = new QueryDataKelas(conn.getCon());
            records = queryDk.getAll();
        } catch (SQLException ex) {
            Logger.getLogger(FormDataKelas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateRow() {
        if (this.records.size() > 0) {
            if (row < 0) {
                row = 0;
            }
            ModelDataKelas mdk = records.get(row);
            txtIdKelas.setText(mdk.getIdkelas());
            txtNamaKelas.setText(mdk.getNamakelas());
            txtJurusan.setText(mdk.getJurusan());
            txtWaliKelas.setText(mdk.getWalikelas());
            txtKetuaKelas.setText(mdk.getKetuakelas());
            txtJumlahSiswa.setText(mdk.getJumlahsiswa().toString());
            txtLetakKelas.setText(mdk.getLetak());
        } else {
            bersihkanForm();
            editForm(false);
        }
    }

    public void loadRecords2() {
        try {
            DBConnection conn = DBConnection.getInstance();
            QueryDataKelas queryDk = new QueryDataKelas(conn.getCon());
            records = queryDk.getAllIdKelas(txtIdKelas.getText());
            editForm(false);
        } catch (SQLException ex) {
            Logger.getLogger(FormDataKelas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateRow2() {
        if (this.records.size() > 0) {
            if (row < 0) {
                row = 0;
            }
            ModelDataKelas mdk = records.get(row);
            txtIdKelas.setText(mdk.getIdkelas());
            txtNamaKelas.setText(mdk.getNamakelas());
            txtJurusan.setText(mdk.getJurusan());
            txtWaliKelas.setText(mdk.getWalikelas());
            txtKetuaKelas.setText(mdk.getKetuakelas());
            txtJumlahSiswa.setText(mdk.getJumlahsiswa().toString());
            txtLetakKelas.setText(mdk.getLetak());
            editForm(false);
        } else {
            JOptionPane.showMessageDialog(this, "Not Found");
            loadRecords();
            updateRow();
        }
    }

    public void loadRecordsNama() {
        try {
            DBConnection conn = DBConnection.getInstance();
            QueryDataKelas queryDk = new QueryDataKelas(conn.getCon());
            records = queryDk.getAllNamaKelas(txtNamaKelas.getText());
            editForm(false);
        } catch (SQLException ex) {
            Logger.getLogger(FormDataKelas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateRowNama() {
        if (this.records.size() > 0) {
            if (row < 0) {
                row = 0;
            }
            ModelDataKelas mdk = records.get(row);
            txtIdKelas.setText(mdk.getIdkelas());
            txtNamaKelas.setText(mdk.getNamakelas());
            txtJurusan.setText(mdk.getJurusan());
            txtWaliKelas.setText(mdk.getWalikelas());
            txtKetuaKelas.setText(mdk.getKetuakelas());
            txtJumlahSiswa.setText(mdk.getJumlahsiswa().toString());
            txtLetakKelas.setText(mdk.getLetak());
            editForm(false);
        } else {
            JOptionPane.showMessageDialog(this, "Not Found");
            loadRecords();
            updateRow();
        }
    }

    void bersihkanForm() {
        txtIdKelas.setText("");
        txtNamaKelas.setText("");
        txtJurusan.setText("");
        txtWaliKelas.setText("");
        txtKetuaKelas.setText("");
        txtJumlahSiswa.setText("");
        txtLetakKelas.setText("");
    }

    void editForm(boolean x) {
        txtIdKelas.setEditable(x);
        txtNamaKelas.setEditable(x);
        txtJurusan.setEditable(x);
        txtWaliKelas.setEditable(x);
        txtKetuaKelas.setEditable(x);
        txtJumlahSiswa.setEditable(x);
        txtLetakKelas.setEditable(x);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtKetuaKelas = new javax.swing.JTextField();
        txtJumlahSiswa = new javax.swing.JTextField();
        txtLetakKelas = new javax.swing.JTextField();
        txtWaliKelas = new javax.swing.JTextField();
        txtJurusan = new javax.swing.JTextField();
        txtNamaKelas = new javax.swing.JTextField();
        txtIdKelas = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnCari = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("~ Data Kelas");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("ID Kelas");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Nama Kelas");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Jurusan");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Wali Kelas");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Ketua Kelas");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Jumlah Siswa");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Letak Kelas");

        txtJumlahSiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahSiswaActionPerformed(evt);
            }
        });

        txtNamaKelas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNamaKelasMouseClicked(evt);
            }
        });
        txtNamaKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaKelasActionPerformed(evt);
            }
        });

        txtIdKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdKelasActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Proses Data");

        btnAdd.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnAdd.setText("Tambah Data");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnEdit.setText("Edit Data");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnDelete.setText("Hapus Data");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnSave.setText("Simpan Data");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnExit.setText("Keluar");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("*Jika anda ingin mencari data klik tombol cari ketikkan Nama Kelas Kelas lalu tekan 'Enter'");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("Masukkan nama kelas yang sudah ada ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLetakKelas)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtJumlahSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtKetuaKelas)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtWaliKelas)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtIdKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtNamaKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel11)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExit))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNamaKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtWaliKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtKetuaKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtJumlahSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtLetakKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        status = true;
        editForm(true);
        bersihkanForm();
        txtIdKelas.requestFocus();
        btnEdit.setEnabled(false);
        btnDelete.setEnabled(false);
        btnAdd.setEnabled(false);
        btnExit.setEnabled(false);
        btnCari.setEnabled(false);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtIdKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdKelasActionPerformed
        // TODO add your handling code here:
        loadRecords2();
        updateRow2();
    }//GEN-LAST:event_txtIdKelasActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if (!txtIdKelas.getText().trim().isEmpty()
                && !txtNamaKelas.getText().trim().isEmpty()
                && !txtJurusan.getText().trim().isEmpty()
                && !txtWaliKelas.getText().trim().isEmpty()
                && !txtKetuaKelas.getText().trim().isEmpty()
                && !txtJumlahSiswa.getText().trim().isEmpty()
                && !txtLetakKelas.getText().trim().isEmpty()) {
            if (status == true) {
                try {
                    ModelDataKelas mdk = new ModelDataKelas();
                    mdk.setIdkelas(txtIdKelas.getText());
                    mdk.setNamakelas(txtNamaKelas.getText());
                    mdk.setJurusan(txtJurusan.getText());
                    mdk.setWalikelas(txtWaliKelas.getText());
                    mdk.setKetuakelas(txtKetuaKelas.getText());
                    mdk.setJumlahsiswa(Integer.parseInt(txtJumlahSiswa.getText()));
                    mdk.setLetak(txtLetakKelas.getText());
                    DBConnection conn = DBConnection.getInstance();
                    QueryDataKelas queryDk = new QueryDataKelas(conn.getCon());
                    queryDk.insert(mdk);
                    JOptionPane.showMessageDialog(this, "Data Saved");
                    loadRecords();
                    updateRow();
                    editForm(false);
                    btnEdit.setEnabled(true);
                    btnDelete.setEnabled(true);
                    btnAdd.setEnabled(true);
                    btnExit.setEnabled(true);
                    btnCari.setEnabled(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FormDataKelas.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    ModelDataKelas mdk = new ModelDataKelas();
                    mdk.setIdkelas(txtIdKelas.getText());
                    mdk.setNamakelas(txtNamaKelas.getText());
                    mdk.setJurusan(txtJurusan.getText());
                    mdk.setWalikelas(txtWaliKelas.getText());
                    mdk.setKetuakelas(txtKetuaKelas.getText());
                    mdk.setJumlahsiswa(Integer.parseInt(txtJumlahSiswa.getText()));
                    mdk.setLetak(txtLetakKelas.getText());
                    DBConnection conn = DBConnection.getInstance();
                    QueryDataKelas queryDk = new QueryDataKelas(conn.getCon());
                    queryDk.update(mdk.getIdkelas(), mdk);
                    JOptionPane.showMessageDialog(this, "Data Update");
                    loadRecords();
                    updateRow();
                    editForm(false);
                    btnEdit.setEnabled(true);
                    btnDelete.setEnabled(true);
                    btnAdd.setEnabled(true);
                    btnExit.setEnabled(true);
                    btnCari.setEnabled(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FormDataKelas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pastikan Semua Kolom terisi");
            txtIdKelas.requestFocus();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        status = false;
        editForm(true);
        txtIdKelas.requestFocus();
        btnAdd.setEnabled(false);
        btnDelete.setEnabled(false);
        btnEdit.setEnabled(false);
        btnExit.setEnabled(false);
        btnCari.setEnabled(false);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        try {
            ModelDataKelas mdk = new ModelDataKelas();
            mdk.setIdkelas(txtIdKelas.getText());
            DBConnection conn = DBConnection.getInstance();
            QueryDataKelas queryDk = new QueryDataKelas(conn.getCon());
            queryDk.delete(txtIdKelas.getText());
            JOptionPane.showMessageDialog(this, "Data Delete");
            loadRecords();
            updateRow();
        } catch (SQLException ex) {
            Logger.getLogger(FormDataKelas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtJumlahSiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahSiswaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJumlahSiswaActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        txtNamaKelas.setEditable(true);
        txtNamaKelas.requestFocus();
    }//GEN-LAST:event_btnCariActionPerformed

    private void txtNamaKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaKelasActionPerformed
        // TODO add your handling code here:
        loadRecordsNama();
        updateRowNama();
    }//GEN-LAST:event_txtNamaKelasActionPerformed

    private void txtNamaKelasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNamaKelasMouseClicked
        // TODO add your handling code here:
        loadRecordsNama();
        updateRowNama();
    }//GEN-LAST:event_txtNamaKelasMouseClicked

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
            java.util.logging.Logger.getLogger(FormDataKelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDataKelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDataKelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDataKelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDataKelas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtIdKelas;
    private javax.swing.JTextField txtJumlahSiswa;
    private javax.swing.JTextField txtJurusan;
    private javax.swing.JTextField txtKetuaKelas;
    private javax.swing.JTextField txtLetakKelas;
    private javax.swing.JTextField txtNamaKelas;
    private javax.swing.JTextField txtWaliKelas;
    // End of variables declaration//GEN-END:variables
}
