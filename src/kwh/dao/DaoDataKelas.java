/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kwh.dao;

import kwh.model.ModelDataKelas;
import kwh.util.DBConnection;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HANDITO
 * @version 2.0
 */
public class DaoDataKelas implements ImplementDataKelas {

    Connection conn;

    final String insert = "INSERT INTO datakelas(idkelas,namakelas,jurusan,walikelas,ketuakelas,jumlahsiswa,letak) VALUES(?,?,?,?,?,?,?)";
    final String update = "UPDATE datakelas SET namakelas=?, jurusan=?, walikelas=?, ketuakelas=?, jumlahsiswa=?, letak=? WHERE idkelas=?";
    final String delete = "DELETE FROM datakelas WHERE idkelas=?";
    final String select = "SELECT * FROM datakelas";
    final String cariidkelas = "SELECT * FROM datakelas WHERE idkelas like ?";
    final String carinamakelas = "SELECT * FROM datakelas WHERE namakelas like ?";
    final String carijurusan = "SELECT * FROM datakelas WHERE jurusan like ?";
    final String cariwalikelas = "SELECT * FROM datakelas WHERE walikelas like ?";
    final String cariketuakelas = "SELECT * FROM datakelas WHERE ketuakelas like ?";
    final String carijumlahsiswa = "SELECT * FROM datakelas WHERE jumlahsiswa like ?";
    final String cariletak = "SELECT * FROM datakelas WHERE letak like ?";

    public DaoDataKelas() {
        conn = DBConnection.connection();
    }

    @Override
    public void insert(ModelDataKelas mdk) {
        PreparedStatement statement = null;
        try {
            statement = conn.prepareStatement(insert);
            statement.setString(1, mdk.getNamakelas());
            statement.setString(2, mdk.getJurusan());
            statement.setString(3, mdk.getWalikelas());
            statement.setString(4, mdk.getKetuakelas());
            statement.setInt(5, mdk.getJumlahsiswa());
            statement.setString(6, mdk.getLetak());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while (rs.next()) {
                mdk.setIdkelas(rs.getString(1));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void update(ModelDataKelas mdk) {
        PreparedStatement statement = null;
        try {
            statement = conn.prepareStatement(update);
            statement.setString(1, mdk.getIdkelas());
            statement.setString(2, mdk.getNamakelas());
            statement.setString(3, mdk.getJurusan());
            statement.setString(4, mdk.getWalikelas());
            statement.setString(5, mdk.getKetuakelas());
            statement.setInt(6, mdk.getJumlahsiswa());
            statement.setString(7, mdk.getLetak());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void delete(String idKelas) {
        PreparedStatement statement = null;
        try {
            statement = conn.prepareStatement(delete);
            statement.setString(1, idKelas);
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public List<ModelDataKelas> getAll() {
        List<ModelDataKelas> lmdk = null;
        try {
            lmdk = new ArrayList<ModelDataKelas>();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
                ModelDataKelas mdk = new ModelDataKelas();
                mdk.setIdkelas(rs.getString("idkelas"));
                mdk.setNamakelas(rs.getString("namakelas"));
                mdk.setJurusan(rs.getString("jurusan"));
                mdk.setWalikelas(rs.getString("walikelas"));
                mdk.setKetuakelas(rs.getString("ketuakelas"));
                mdk.setJumlahsiswa(rs.getInt("jumlahsiswa"));
                mdk.setLetak(rs.getString("letak"));
                lmdk.add(mdk);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoDataKelas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lmdk;
    }

    @Override
    public List<ModelDataKelas> getCariNamaKelas(String namaKelas) {
        List<ModelDataKelas> lmdk = null;
        try {
            lmdk = new ArrayList<ModelDataKelas>();
            PreparedStatement st = conn.prepareStatement(carinamakelas);
            st.setString(1, "%" + namaKelas + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                ModelDataKelas mdk = new ModelDataKelas();
                mdk.setIdkelas(rs.getString("idkelas"));
                mdk.setNamakelas(rs.getString("namakelas"));
                mdk.setJurusan(rs.getString("jurusan"));
                mdk.setWalikelas(rs.getString("walikelas"));
                mdk.setKetuakelas(rs.getString("ketuakelas"));
                mdk.setJumlahsiswa(rs.getInt("jumlahsiswa"));
                mdk.setLetak(rs.getString("letak"));
                lmdk.add(mdk);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoDataKelas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lmdk;
    }

    @Override
    public List<ModelDataKelas> getCariJurusan(String jurusan) {
        List<ModelDataKelas> lmdk = null;
        try {
            lmdk = new ArrayList<ModelDataKelas>();
            PreparedStatement st = conn.prepareStatement(carijurusan);
            st.setString(1, "%" + jurusan + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                ModelDataKelas mdk = new ModelDataKelas();
                mdk.setIdkelas(rs.getString("idkelas"));
                mdk.setNamakelas(rs.getString("namakelas"));
                mdk.setJurusan(rs.getString("jurusan"));
                mdk.setWalikelas(rs.getString("walikelas"));
                mdk.setKetuakelas(rs.getString("ketuakelas"));
                mdk.setJumlahsiswa(rs.getInt("jumlahsiswa"));
                mdk.setLetak(rs.getString("letak"));
                lmdk.add(mdk);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoDataKelas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lmdk;
    }

    @Override
    public List<ModelDataKelas> getCariWaliKelas(String waliKelas) {
        List<ModelDataKelas> lmdk = null;
        try {
            lmdk = new ArrayList<ModelDataKelas>();
            PreparedStatement st = conn.prepareStatement(cariwalikelas);
            st.setString(1, "%" + waliKelas + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                ModelDataKelas mdk = new ModelDataKelas();
                mdk.setIdkelas(rs.getString("idkelas"));
                mdk.setNamakelas(rs.getString("namakelas"));
                mdk.setJurusan(rs.getString("jurusan"));
                mdk.setWalikelas(rs.getString("walikelas"));
                mdk.setKetuakelas(rs.getString("ketuakelas"));
                mdk.setJumlahsiswa(rs.getInt("jumlahsiswa"));
                mdk.setLetak(rs.getString("letak"));
                lmdk.add(mdk);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoDataKelas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lmdk;
    }

    @Override
    public List<ModelDataKelas> getCariKetuaKelas(String ketuaKelas) {
        List<ModelDataKelas> lmdk = null;
        try {
            lmdk = new ArrayList<ModelDataKelas>();
            PreparedStatement st = conn.prepareStatement(cariketuakelas);
            st.setString(1, "%" + ketuaKelas + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                ModelDataKelas mdk = new ModelDataKelas();
                mdk.setIdkelas(rs.getString("idkelas"));
                mdk.setNamakelas(rs.getString("namakelas"));
                mdk.setJurusan(rs.getString("jurusan"));
                mdk.setWalikelas(rs.getString("walikelas"));
                mdk.setKetuakelas(rs.getString("ketuakelas"));
                mdk.setJumlahsiswa(rs.getInt("jumlahsiswa"));
                mdk.setLetak(rs.getString("letak"));
                lmdk.add(mdk);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoDataKelas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lmdk;
    }

    @Override
    public List<ModelDataKelas> getCariJumlahSiswa(Integer jumlahSiswa) {
        List<ModelDataKelas> lmdk = null;
        try {
            lmdk = new ArrayList<ModelDataKelas>();
            PreparedStatement st = conn.prepareStatement(carijumlahsiswa);
            st.setString(1, "%" + jumlahSiswa + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                ModelDataKelas mdk = new ModelDataKelas();
                mdk.setIdkelas(rs.getString("idkelas"));
                mdk.setNamakelas(rs.getString("namakelas"));
                mdk.setJurusan(rs.getString("jurusan"));
                mdk.setWalikelas(rs.getString("walikelas"));
                mdk.setKetuakelas(rs.getString("ketuakelas"));
                mdk.setJumlahsiswa(rs.getInt("jumlahsiswa"));
                mdk.setLetak(rs.getString("letak"));
                lmdk.add(mdk);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoDataKelas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lmdk;
    }

    @Override
    public List<ModelDataKelas> getCariLetak(String letak) {
        List<ModelDataKelas> lmdk = null;
        try {
            lmdk = new ArrayList<ModelDataKelas>();
            PreparedStatement st = conn.prepareStatement(cariletak);
            st.setString(1, "%" + letak + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                ModelDataKelas mdk = new ModelDataKelas();
                mdk.setIdkelas(rs.getString("idkelas"));
                mdk.setNamakelas(rs.getString("namakelas"));
                mdk.setJurusan(rs.getString("jurusan"));
                mdk.setWalikelas(rs.getString("walikelas"));
                mdk.setKetuakelas(rs.getString("ketuakelas"));
                mdk.setJumlahsiswa(rs.getInt("jumlahsiswa"));
                mdk.setLetak(rs.getString("letak"));
                lmdk.add(mdk);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoDataKelas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lmdk;
    }

    @Override
    public List<ModelDataKelas> getCariSemua(String semua) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
