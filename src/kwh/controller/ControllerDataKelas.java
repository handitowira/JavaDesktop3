/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kwh.controller;

import kwh.dao.DaoDataKelas;
import kwh.dao.ImplementDataKelas;
import kwh.model.ModelDataKelas;
import kwh.model.TableModelDataKelas;
import kwh.view.FormDataKelas;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author HANDITO
 * @version 2.0
 * @keterangan masih dalam proses pak, belum fix, secepatnya saya kirim ulang bila mvc saya telah selesai
 */
public class ControllerDataKelas {

    FormDataKelas form;
    ImplementDataKelas implDataKelas;
    List<ModelDataKelas> lmdk;

    public ControllerDataKelas(FormDataKelas form) {
        this.form = form;
        implDataKelas = new DaoDataKelas();
        lmdk = implDataKelas.getAll();
    }

    public void reset() {
        form.getTxtIdKelas().setText("");
        form.getTxtNamaKelas().setText("");
        form.getTxtJurusan().setText("");
        form.getTxtWaliKelas().setText("");
        form.getTxtKetuaKelas().setText("");
        form.getTxtJumlahSiswa().setText("");
        form.getTxtLetak().setText("");
    }

    public void resetCari() {
        form.getTxtCari().setText("");
    }

    public void isiTable() {
        lmdk = implDataKelas.getAll();
        TableModelDataKelas tmdk = new TableModelDataKelas(lmdk);
        form.getTbData().setModel(tmdk);
    }

    public void isiField(int row) {
        form.getTxtIdKelas().setText(lmdk.get(row).getIdkelas().toString());
        form.getTxtNamaKelas().setText(lmdk.get(row).getNamakelas());
        form.getTxtJurusan().setText(lmdk.get(row).getJurusan());
        form.getTxtWaliKelas().setText(lmdk.get(row).getWalikelas());
        form.getTxtKetuaKelas().setText(lmdk.get(row).getKetuakelas());
        form.getTxtJumlahSiswa().setText(lmdk.get(row).getJumlahsiswa().toString());
        form.getTxtLetak().setText(lmdk.get(row).getLetak());
    }

    public void select() {
        implDataKelas.getCariNamaKelas(form.getTxtCari().getText());
        isiTableCariNamaKelas();
    }

    public void insert() {
        if (!form.getTxtNamaKelas().getText().trim().isEmpty()
                && !form.getTxtJurusan().getText().trim().isEmpty()
                && !form.getTxtWaliKelas().getText().trim().isEmpty()
                && !form.getTxtKetuaKelas().getText().trim().isEmpty()
                && !form.getTxtJumlahSiswa().getText().trim().isEmpty()
                && !form.getTxtLetak().getText().trim().isEmpty()) {
            ModelDataKelas mdk = new ModelDataKelas();
            mdk.setNamakelas(form.getTxtNamaKelas().getText());
            mdk.setJurusan(form.getTxtJurusan().getText());
            mdk.setWalikelas(form.getTxtWaliKelas().getText());
            mdk.setKetuakelas(form.getTxtWaliKelas().getText());
            mdk.setJumlahsiswa(Integer.parseInt(form.getTxtJumlahSiswa().getText()));
            mdk.setLetak(form.getTxtLetak().getText());
            implDataKelas.insert(mdk);
        } else {
            JOptionPane.showMessageDialog(form, "Pastikan Semua Kolom terisi");
        }
    }

    public void update() {
        if (!form.getTxtIdKelas().getText().trim().isEmpty()) {
            System.out.println("1");
            ModelDataKelas mdk = new ModelDataKelas();
            System.out.println("2");
            mdk.setIdkelas(Integer.parseInt(form.getTxtIdKelas().getText()));
            System.out.println("3");
            mdk.setNamakelas(form.getTxtNamaKelas().getText());
            System.out.println("4");
            mdk.setJurusan(form.getTxtJurusan().getText());
            System.out.println("5");
            mdk.setWalikelas(form.getTxtWaliKelas().getText());
            System.out.println("6");
            mdk.setKetuakelas(form.getTxtWaliKelas().getText());
            System.out.println("7");
            mdk.setJumlahsiswa(Integer.parseInt(form.getTxtJumlahSiswa().getText()));
            System.out.println("8");
            mdk.setLetak(form.getTxtLetak().getText());
            System.out.println("9");
            implDataKelas.update(mdk);
            System.out.println("10");
        } else {
            JOptionPane.showMessageDialog(form, "Pilih data yang akan diupdate");
        }
    }

    public void delete() {
        if (!form.getTxtIdKelas().getText().trim().isEmpty()) {
            int id = Integer.parseInt(form.getTxtIdKelas().getText());
            implDataKelas.delete(id);
        } else {
            JOptionPane.showMessageDialog(form, "Pilih data yang akan dihapus");
        }
    }

    public void isiTableCariIdKelas() {
        lmdk = implDataKelas.getCariIdKelas(form.getTxtCari().getText());
        TableModelDataKelas tmdk = new TableModelDataKelas(lmdk);
        form.getTbData().setModel(tmdk);
    }

    public void isiTableCariNamaKelas() {
        lmdk = implDataKelas.getCariNamaKelas(form.getTxtCari().getText());
        TableModelDataKelas tmdk = new TableModelDataKelas(lmdk);
        form.getTbData().setModel(tmdk);
    }

    public void isiTableCariJurusan() {
        lmdk = implDataKelas.getCariJurusan(form.getTxtCari().getText());
        TableModelDataKelas tmdk = new TableModelDataKelas(lmdk);
        form.getTbData().setModel(tmdk);
    }

    public void isiTableCariWaliKelas() {
        lmdk = implDataKelas.getCariWaliKelas(form.getTxtCari().getText());
        TableModelDataKelas tmdk = new TableModelDataKelas(lmdk);
        form.getTbData().setModel(tmdk);
    }

    public void isiTableCariKetuaKelas() {
        lmdk = implDataKelas.getCariKetuaKelas(form.getTxtCari().getText());
        TableModelDataKelas tmdk = new TableModelDataKelas(lmdk);
        form.getTbData().setModel(tmdk);
    }

    public void isiTableCariJumlahSiswa() {
        lmdk = implDataKelas.getCariJumlahSiswa(form.getTxtCari().getText());
        TableModelDataKelas tmdk = new TableModelDataKelas(lmdk);
        form.getTbData().setModel(tmdk);
    }

    public void isiTableCariLetak() {
        lmdk = implDataKelas.getCariLetak(form.getTxtCari().getText());
        TableModelDataKelas tmdk = new TableModelDataKelas(lmdk);
        form.getTbData().setModel(tmdk);
    }

    public void cariIdKelas() {
        if (!form.getTxtCari().getText().trim().isEmpty()) {
            implDataKelas.getCariIdKelas(form.getTxtCari().getText());
            isiTableCariIdKelas();
        } else {
            JOptionPane.showMessageDialog(form, "Silahkan ketikkan ID Kelas");
        }
    }

    public void cariNamaKelas() {
        if (!form.getTxtCari().getText().trim().isEmpty()) {
            implDataKelas.getCariNamaKelas(form.getTxtCari().getText());
            isiTableCariNamaKelas();
        } else {
            JOptionPane.showMessageDialog(form, "Silahkan ketikkan Nama Kelas");
        }
    }

    public void cariJurusan() {
        if (!form.getTxtCari().getText().trim().isEmpty()) {
            implDataKelas.getCariJurusan(form.getTxtCari().getText());
            isiTableCariJurusan();
        } else {
            JOptionPane.showMessageDialog(form, "Silahkan ketikkan Jurusan");
        }
    }

    public void cariWaliKelas() {
        if (!form.getTxtCari().getText().trim().isEmpty()) {
            implDataKelas.getCariWaliKelas(form.getTxtCari().getText());
            isiTableCariWaliKelas();
        } else {
            JOptionPane.showMessageDialog(form, "Silahkan ketikkan Wali Kelas");
        }
    }

    public void cariKetuaKelas() {
        if (!form.getTxtCari().getText().trim().isEmpty()) {
            implDataKelas.getCariKetuaKelas(form.getTxtCari().getText());
            isiTableCariKetuaKelas();
        } else {
            JOptionPane.showMessageDialog(form, "Silahkan ketikkan Ketua Kelas");
        }
    }

    public void cariJumlahSiswa() {
        if (!form.getTxtCari().getText().trim().isEmpty()) {
            implDataKelas.getCariJumlahSiswa(form.getTxtCari().getText());
            isiTableCariJumlahSiswa();
        } else {
            JOptionPane.showMessageDialog(form, "Silahkan ketikkan Jumlah Siswa");
        }
    }

    public void cariLetak() {
        if (!form.getTxtCari().getText().trim().isEmpty()) {
            implDataKelas.getCariLetak(form.getTxtCari().getText());
            isiTableCariLetak();
        } else {
            JOptionPane.showMessageDialog(form, "Silahkan ketikkan Letak");
        }
    }
}
