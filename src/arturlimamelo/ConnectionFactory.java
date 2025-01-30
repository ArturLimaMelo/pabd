/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArturLimaMelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * 
 */
public class ConnectionFactory {
    
    private String url;
    private String usr;
    private String pwd;

    public ConnectionFactory() {
        this.url = "jdbc:mysql://localhost/sakila";
        this.usr = "root";
        this.pwd = "1234";
    }
    
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, usr, pwd);
    }
    
    
    
}
