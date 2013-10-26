/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.dao;

import modul.model.ModelDataKelas;
import java.util.List;

/**
 *
 * @author HANDITO
 * @version 1.0
 */
public interface DaoDataKelas {

    public void insert(ModelDataKelas mdk);

    public void delete(String idKelas);

    public void update(String oldIdKelas, ModelDataKelas mdk);

    public ModelDataKelas loadIdKelas(String idKelas);

    public ModelDataKelas loadNamaKelas(String NamaKelas);

    public List<ModelDataKelas> getAll();

    public List<ModelDataKelas> getAllIdKelas(String IdKelas);

    public List<ModelDataKelas> getAllNamaKelas(String namaKelas);
}
