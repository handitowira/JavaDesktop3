/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Class DBConnection berfungsi sebagai alat penyambung antara app dengan
 * database pada DB_URL merupakan keterangan url dan nama database pada app
 * ini, yaitu nama databasenya "java_desktop_3" DB_USER merupakan nama User
 * dari MySQL yaitu "root" MySQL tidak menggunakan password sehingga
 * DB_PASS kosongkan saja.
 *
 * @author Handitowira
 * @version 1.0
 */
public class DBConnection {

    private Connection conn = null;
    private static DBConnection dBConn = null;
    static final String DB_URL = "jdbc:mysql://localhost:3306/java_desktop_3";
    static final String DB_USER = "root";
    static final String DB_PASS = "";

    private DBConnection() {
        if (conn == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public static DBConnection getInstance() {
        DBConnection conn = null;
        if (dBConn == null) {
            dBConn = new DBConnection();
            conn = dBConn;
        } else {
            conn = dBConn;
        }
        return conn;
    }

    public Connection getCon() throws SQLException {
        return this.conn;
    }
}
