/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kwh.model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author HANDITO
 * @version 2.0
 */
public class TableModelBukuTelepon extends AbstractTableModel {

    List<ModelDataKelas> lmdk;

    public TableModelBukuTelepon(List<ModelDataKelas> lmdk) {
        this.lmdk = lmdk;
    }

    @Override
    public int getRowCount() {
        return lmdk.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "IdKelas";
            case 1:
                return "NamaKelas";
            case 2:
                return "Jurusan";
            case 3:
                return "WaliKelas";
            case 4:
                return "KetuaKelas";
            case 5:
                return "JumlahSiswa";
            case 6:
                return "Letak";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
            case 0:
                return lmdk.get(row).getIdkelas();
            case 1:
                return lmdk.get(row).getNamakelas();
            case 2:
                return lmdk.get(row).getJurusan();
            case 3:
                return lmdk.get(row).getWalikelas();
            case 4:
                return lmdk.get(row).getKetuakelas();
            case 5:
                return lmdk.get(row).getJumlahsiswa();
            case 6:
                return lmdk.get(row).getLetak();
            default:
                return null;
        }
    }

}
