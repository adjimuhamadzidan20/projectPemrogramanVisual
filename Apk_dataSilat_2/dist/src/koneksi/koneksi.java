package koneksi;

import java.sql.*;
import javax.swing.*;

public class koneksi {
    Connection konek;
    
    // koneksi database
    public static Connection konek(){
        try {
            String host = "jdbc:mysql://localhost/pencak_silat";
            String user = "root";
            String pass = "";
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection konek = DriverManager.getConnection(host,user,pass);
            return konek;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            
            return null;
        }
    }
    
}
