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
public class Insert {
    static final String db_URL = "jdbc:postgresql://localhost:5433/DB_PBO";
    static final String USER = "postgres";
    static final String PASS = "123";

    public static void main(String[] args) {
        try ( Scanner scan = new Scanner(System.in);  
            Connection conn = DriverManager.getConnection(db_URL, USER, PASS)) {
            if (conn != null) {
                System.out.println("Koneksi sukses!");
                
                System.out.println("Inputkan id departemen : ");
                String id_dep = scan.nextLine();
                
                System.out.println("Inputkan id karyawan : ");
                String id_karyawan = scan.nextLine();

                System.out.println("Inputkan nama : ");
                String nama = scan.nextLine();

                System.out.println("Inputkankan asal daerah : ");
                String asal_daerah = scan.nextLine();

                String QUERY = "INSERT INTO karyawan(id_dep, id_karyawan, nama, asal_daerah VALUES (?,?,?,?)";
                
                try ( PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
                    preparedStatement.setString(1, id_dep);
                    preparedStatement.setString(2, id_karyawan);
                    preparedStatement.setString(3, nama);
                    preparedStatement.setString(4, asal_daerah);
                    preparedStatement.executeUpdate();

                    
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
}
