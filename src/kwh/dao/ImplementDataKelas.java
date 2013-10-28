/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kwh.dao;

import java.util.List;
import kwh.model.*;

/**
 *
 * @author HANDITO
 * @version 2.0
 * @keterangan masih dalam proses pak, belum fix, secepatnya saya kirim ulang bila mvc saya telah selesai
 */
public interface ImplementDataKelas {

    public void insert(ModelDataKelas mdk);

    public void update(ModelDataKelas mdk);

    public void delete(int idKelas);

    public List<ModelDataKelas> getAll();

    public List<ModelDataKelas> getCariIdKelas(String idKelas);

    public List<ModelDataKelas> getCariNamaKelas(String namaKelas);

    public List<ModelDataKelas> getCariJurusan(String jurusan);

    public List<ModelDataKelas> getCariWaliKelas(String waliKelas);

    public List<ModelDataKelas> getCariKetuaKelas(String ketuaKelas);

    public List<ModelDataKelas> getCariJumlahSiswa(String jumlahSiswa);

    public List<ModelDataKelas> getCariLetak(String letak);

    public List<ModelDataKelas> getCariSemua(String semua);
}
