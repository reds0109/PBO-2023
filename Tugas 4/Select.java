/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbopertemuanempat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static pbopertemuanempat.Update.PASS;
import static pbopertemuanempat.Update.USER;
import static pbopertemuanempat.Update.db_URL;

/**
 *
 * @author reza danis
 */
public class Select {
    
    static final String DB_URL = "jdbc:postgresql://localhost:5433/DB_PBO";
    static final String USER = "postgres";
    static final String PASS = "123";

    
    public static void main(String[] args) {
        // TODO code application logic here
         try ( Connection conn = DriverManager.getConnection(db_URL, USER, PASS)) {
            if (conn != null) {
                System.out.println("Koneksi sukses!");
                System.out.println(" ");

                //tampilkan data dari tabel departemen
                String query2 = "SELECT * FROM karyawan";
                try ( Statement statement2 = conn.createStatement();  ResultSet resultSet2 = statement2.executeQuery(query2)) {
                    
                    System.out.println("Tabel departemen ======== ");
                    while (resultSet2.next()) {
                        // Ambil data dari kolom-kolom yang sesuai
                        System.out.print("id departemen : " + String.valueOf(resultSet2.getObject(1)));
                        System.out.print(", nama departemen : " + String.valueOf(resultSet2.getObject(2)));
                        System.out.println(" ");
                    }
                }
                
                
                
                // Tampilkan data dari tabel karyawan
                String query1 = "SELECT * FROM karyawan ORDER BY id_karyawan ASC";
                try ( Statement statement1 = conn.createStatement();  ResultSet rs = statement1.executeQuery(query1)) {
                    System.out.println(" ");
                    System.out.println("Tabel karyawan ========= ");
                    while (rs.next()) {
                        // Ambil data dari kolom-kolom yang sesuai
                        System.out.print("id departemen : " + String.valueOf(rs.getObject(1)));
                        System.out.print(", id karyawan : " + String.valueOf(rs.getObject(2)));
                        System.out.print(", nama karyawan : " + String.valueOf(rs.getObject(3)));
                        System.out.println(",  asal daerah : " + String.valueOf(rs.getObject(4)));
                    }
                }
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
