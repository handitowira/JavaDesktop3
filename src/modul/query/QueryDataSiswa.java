/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.query;

import modul.dao.DaoDataSiswa;
import modul.model.ModelDataSiswa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HANDITO
 * @version 1.0
 */
public class QueryDataSiswa implements DaoDataSiswa {

    private Connection conn = null;

    final String insert = "";
    final String update = "";
    final String delete = "";
    final String loadNama = "";
    final String loadNis = "";
    final String getAll = "";
    final String getAllNama = "";
    final String getAllNis = "";
    private ModelDataSiswa namaSiswa;

    public QueryDataSiswa(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(ModelDataSiswa mds) {
        try {
            PreparedStatement st = conn.prepareStatement(insert);
            st.setString(1, mds.getNis());
            st.setString(2, mds.getNama());
            st.setString(3, mds.getAlamat());
            st.setString(4, mds.getNotelp());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoDataSiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String nis) {
        try {
            PreparedStatement st = conn.prepareStatement(delete);
            st.setString(1, nis);
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoDataSiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(String oldNis, ModelDataSiswa mds) {
        try {
            PreparedStatement st = conn.prepareStatement(update);
            st.setString(1, mds.getNama());
            st.setString(2, mds.getAlamat());
            st.setString(3, mds.getNotelp());
            st.setString(4, oldNis);
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoDataSiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ModelDataSiswa loadNama(String nama) {
        ModelDataSiswa mds = null;
        try {
            PreparedStatement st = conn.prepareStatement(loadNama);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                mds = new ModelDataSiswa();
                mds.setNis(rs.getString(1));
                mds.setNama(rs.getString(2));
                mds.setAlamat(rs.getString(3));
                mds.setNotelp(rs.getString(4));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoDataSiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return namaSiswa;
    }

    @Override
    public ModelDataSiswa load(String nis) {
        ModelDataSiswa mds = null;
        try {
            PreparedStatement st = conn.prepareStatement(loadNis);
            st.setString(1, nis);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                mds = new ModelDataSiswa();
                mds.setNis(rs.getString(1));
                mds.setNama(rs.getString(2));
                mds.setAlamat(rs.getString(3));
                mds.setNotelp(rs.getString(4));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoDataSiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return namaSiswa;
    }

    @Override
    public List<ModelDataSiswa> getAll() {
        List<ModelDataSiswa> list = new ArrayList<ModelDataSiswa>();
        try {
            PreparedStatement st = conn.prepareStatement(getAll);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                ModelDataSiswa mds = new ModelDataSiswa();
                mds.setNis(rs.getString(1));
                mds.setNama(rs.getString(2));
                mds.setAlamat(rs.getString(3));
                mds.setNotelp(rs.getString(4));
                list.add(mds);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoDataSiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public List<ModelDataSiswa> getAll(String nama) {
        List<ModelDataSiswa> list = new ArrayList<ModelDataSiswa>();
        try {
            PreparedStatement st = conn.prepareStatement(getAllNama);
            st.setString(1, "%" + nama + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                ModelDataSiswa mds = new ModelDataSiswa();
                mds.setNis(rs.getString(1));
                mds.setNama(rs.getString(2));
                mds.setAlamat(rs.getString(3));
                mds.setNotelp(rs.getString(4));
                list.add(mds);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoDataSiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public List<ModelDataSiswa> getAllNis(String nis) {
        List<ModelDataSiswa> list = new ArrayList<ModelDataSiswa>();
        try {
            PreparedStatement st = conn.prepareStatement(getAllNis);
            st.setString(1, "%" + nis + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                ModelDataSiswa mds = new ModelDataSiswa();
                mds.setNis(rs.getString(1));
                mds.setNama(rs.getString(2));
                mds.setAlamat(rs.getString(3));
                mds.setNotelp(rs.getString(4));
                list.add(mds);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoDataSiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}