/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.dao;

import modul.model.ModelDataKelas;
import java.util.List;

/**
 * class interface atau juga di sebut class abstract yang mana berfungsi agar
 * method method yang ada di dalamnya di implementasikan di class child. atau di
 * sebut juga seperataion of concern, dimana nantinya setiap kode akan
 * dipisahkan sesuai dengan fungsinya, sehingga kode dibawahnya hanya perlu
 * mengetahui secara abstrak cara mengakses data tanpa perlu mengetahui
 * bagaimana akses ke sumber data diimplementasikan.
 *
 * @author Handitowira
 * @version 1.0
 */
public interface DaoDataKelas {

    public void insert(ModelDataKelas mdk);

    public void delete(String idKelas);

    public void update(String oldIdKelas, ModelDataKelas mdk);

    public ModelDataKelas loadIdKelas(String idKelas);

    public ModelDataKelas loadNamaKelas(String NamaKelas);

    public List<ModelDataKelas> getAll();

    public List<ModelDataKelas> getAllIdKelas(String idKelas);

    public List<ModelDataKelas> getAllNamaKelas(String namaKelas);
}
