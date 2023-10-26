/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbopertemuanempat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author reza danis
 */
public class Update {
    static final String db_URL = "jdbc:postgresql://localhost:5433/DB_PBO";
    static final String USER = "postgres";
    static final String PASS = "123";
    
    public static void main(String[] args) {
        
        try ( Scanner scan = new Scanner(System.in);  
            Connection conn = DriverManager.getConnection(db_URL, USER, PASS)) {
            if (conn != null) {
                System.out.println("Koneksi sukses!");
        
                System.out.println("Masukkan id karyawan yang akan diperbarui : ");
                String id_karyawan = scan.nextLine();
                
                System.out.println("Masukkan id karyawan lama : ");
                String id_karyawan_lama = scan.nextLine();
                
                System.out.println("Masukkan id departemen : ");
                String id_dep = scan.nextLine();
                               
                System.out.println("Masukkan nama baru : ");
                String namaBaru = scan.nextLine();
                
                System.out.println("Masukkan asal daerah baru : ");
                String asal_daerah_baru = scan.nextLine();
                
                String QUERY = "UPDATE karyawan set id_dep = ?, id_karyawan = ?, namaBaru = ?, asal_daerah_baru = ? WHERE id_karyawan_lama = ?";
       
                try ( PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
                    preparedStatement.setString(1, id_dep);
                    preparedStatement.setString(2, id_karyawan);
                    preparedStatement.setString(3, namaBaru);
                    preparedStatement.setString(4, asal_daerah_baru);
                    preparedStatement.setString(5, id_karyawan_lama);
                    preparedStatement.executeUpdate();
                    
                    int rowsUpdated = preparedStatement.executeUpdate();
                    if(rowsUpdated > 0){
                        System.out.println("Data success diupdate");
                    }else{
                        System.out.println("data dengan id yang diinputkan tidak ditemukan.");
                    }

                    
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        
        
            }
        
        
        } catch (SQLException ex) {
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
          }
    }
}
