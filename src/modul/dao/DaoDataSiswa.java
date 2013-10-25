/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.dao;

import modul.model.ModelDataSiswa;
import java.util.List;

/**
 *
 * @author HANDITO
 * @version 1.0
 */
public interface DaoDataSiswa {

    public void insert(ModelDataSiswa mds);

    public void delete(String nis);

    public void update(String oldNis, ModelDataSiswa mds);

    public ModelDataSiswa loadNama(String nama);

    public ModelDataSiswa load(String nis);

    public List<ModelDataSiswa> getAll();

    public List<ModelDataSiswa> getAll(String nama);

    public List<ModelDataSiswa> getAllNis(String nis);
}
