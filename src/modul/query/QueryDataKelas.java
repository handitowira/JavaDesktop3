/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.query;

import java.util.List;
import modul.dao.DaoDataKelas;
import modul.model.ModelDataKelas;
import java.sql.Connection;
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
public class QueryDataKelas implements DaoDataKelas {

    private Connection conn = null;

    final String insert = "INSERT INTO datakelas(idkelas,namakelas,jurusan,walikelas,ketuakelas,jumlahsiswa,letak) VALUES(?,?,?,?,?,?,?)";
    final String update = "UPDATE datakelas SET namakelas=?, jurusan=?, walikelas=?, ketuakelas=?, jumlahsiswa=?, letak=? WHERE idkelas=?";
    final String delete = "DELETE FROM datakelas WHERE idkelas=?";
    final String loadIdKelas = "SELECT idkelas,namakelas,jurusan,walikelas,ketuakelas,jumlahsiswa,letak FROM datakelas WHERE idkelas=?";
    final String loadNamaKelas = "SELECT idkelas,namakelas,jurusan,walikelas,ketuakelas,jumlahsiswa,letak FROM datakelas WHERE namakelas=?";
    final String getAll = "SELECT idkelas,namakelas,jurusan,walikelas,ketuakelas,jumlahsiswa,letak FROM datakelas";
    final String getAllIdKelas = "SELECT * FROM datakelas WHERE idkelas like ?";
    final String getAllNamaKelas = "SELECT * FROM datakelas WHERE namakelas like ?";
    private ModelDataKelas namaKelas;

    public QueryDataKelas(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(ModelDataKelas mdk) {
        try {
            PreparedStatement st = conn.prepareStatement(insert);
            st.setString(1, mdk.getIdkelas());
            st.setString(2, mdk.getNamakelas());
            st.setString(3, mdk.getJurusan());
            st.setString(4, mdk.getWalikelas());
            st.setString(5, mdk.getKetuakelas());
            st.setInt(6, mdk.getJumlahsiswa());
            st.setString(7, mdk.getLetak());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoDataKelas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String idKelas) {
        try {
            PreparedStatement st = conn.prepareStatement(delete);
            st.setString(1, idKelas);
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoDataKelas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(String oldIdKelas, ModelDataKelas mdk) {
        try {
            PreparedStatement st = conn.prepareStatement(update);
            st.setString(1, mdk.getNamakelas());
            st.setString(2, mdk.getJurusan());
            st.setString(3, mdk.getWalikelas());
            st.setString(4, mdk.getKetuakelas());
            st.setInt(5, mdk.getJumlahsiswa());
            st.setString(6, mdk.getLetak());
            st.setString(7, oldIdKelas);
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoDataKelas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ModelDataKelas loadIdKelas(String idKelas) {
        ModelDataKelas mdk = null;
        try {
            PreparedStatement st = conn.prepareStatement(loadIdKelas);
            st.setString(1, idKelas);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                mdk = new ModelDataKelas();
                mdk.setIdkelas(rs.getString(1));
                mdk.setNamakelas(rs.getString(2));
                mdk.setJurusan(rs.getString(3));
                mdk.setWalikelas(rs.getString(4));
                mdk.setKetuakelas(rs.getString(5));
                mdk.setJumlahsiswa(rs.getInt(6));
                mdk.setLetak(rs.getString(7));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoDataKelas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return namaKelas;
    }

    @Override
    public ModelDataKelas loadNamaKelas(String NamaKelas) {
        ModelDataKelas mdk = null;
        try {
            PreparedStatement st = conn.prepareStatement(loadNamaKelas);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                mdk = new ModelDataKelas();
                mdk.setIdkelas(rs.getString(1));
                mdk.setNamakelas(rs.getString(2));
                mdk.setJurusan(rs.getString(3));
                mdk.setWalikelas(rs.getString(4));
                mdk.setKetuakelas(rs.getString(5));
                mdk.setJumlahsiswa(rs.getInt(6));
                mdk.setLetak(rs.getString(7));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoDataKelas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return namaKelas;
    }

    @Override
    public List<ModelDataKelas> getAll() {
        List<ModelDataKelas> list = new ArrayList<ModelDataKelas>();
        try {
            PreparedStatement st = conn.prepareStatement(getAll);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                ModelDataKelas mdk = new ModelDataKelas();
                mdk.setIdkelas(rs.getString(1));
                mdk.setNamakelas(rs.getString(2));
                mdk.setJurusan(rs.getString(3));
                mdk.setWalikelas(rs.getString(4));
                mdk.setKetuakelas(rs.getString(5));
                mdk.setJumlahsiswa(rs.getInt(6));
                mdk.setLetak(rs.getString(7));
                list.add(mdk);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoDataKelas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public List<ModelDataKelas> getAllIdKelas(String idKelas) {
        List<ModelDataKelas> list = new ArrayList<ModelDataKelas>();
        try {
            PreparedStatement st = conn.prepareStatement(getAllIdKelas);
            st.setString(1, "%" + idKelas + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                ModelDataKelas mdk = new ModelDataKelas();
                mdk.setIdkelas(rs.getString(1));
                mdk.setNamakelas(rs.getString(2));
                mdk.setJurusan(rs.getString(3));
                mdk.setWalikelas(rs.getString(4));
                mdk.setKetuakelas(rs.getString(5));
                mdk.setJumlahsiswa(rs.getInt(6));
                mdk.setLetak(rs.getString(7));
                list.add(mdk);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoDataKelas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public List<ModelDataKelas> getAllNamaKelas(String namaKelas) {
        List<ModelDataKelas> list = new ArrayList<ModelDataKelas>();
        try {
            PreparedStatement st = conn.prepareStatement(getAllNamaKelas);
            st.setString(1, "%" + namaKelas + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                ModelDataKelas mdk = new ModelDataKelas();
                mdk.setIdkelas(rs.getString(1));
                mdk.setNamakelas(rs.getString(2));
                mdk.setJurusan(rs.getString(3));
                mdk.setWalikelas(rs.getString(4));
                mdk.setKetuakelas(rs.getString(5));
                mdk.setJumlahsiswa(rs.getInt(6));
                mdk.setLetak(rs.getString(7));
                list.add(mdk);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoDataKelas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
