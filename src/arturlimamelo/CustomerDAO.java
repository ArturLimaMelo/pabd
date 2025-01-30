/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arturlimamelo;

import ArturLimaMelo.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import ArturLimaMelo.Customer;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

/**
 *
 * @author 20221074010012
 */
public class CustomerDAO {
    private Connection con;

    public CustomerDAO() throws SQLException {
        this.con = new ConnectionFactory().getConnection();
        System.out.println("Connection OK");
    }
    public void insertCustomer(Customer c) throws SQLException {
          String sql = "insert into customer (Store_ID, email, Address_ID, Active, first_name, last_name) values (?, ?, ?, ?, ?, ?)";
            PreparedStatement st = con.prepareStatement(sql);
            
            st.setInt(1, c.getStore_id());
            st.setString(2, c.getEmail());
            st.setInt(3, c.getAddress_id());
            st.setInt(4, c.getActive());
            st.setString(5, c.getFirst_name());
            st.setString(6, c.getLast_name());
            
            st.execute();
            String query = " select * from customer"
              + " order by customer_id desc"
              + " limit 5";
            Statement qst = con.createStatement();
            ResultSet rs = qst.executeQuery(query);
            ResultSetMetaData md = rs.getMetaData();
            st.close();
    }
    public void deleteCustomer(Customer c) throws SQLException {
        String delsql = "delete from customer where first_name = ? and last_name = ?";
            PreparedStatement dst = con.prepareStatement(delsql);
            dst.setString(1, c.getFirst_name());
            dst.setString(2, c.getLast_name());
            dst.executeUpdate();
    }
    public void updateCustomer(Customer c) throws SQLException {
        String upsql = "update customer set Store_ID = ?, Address_ID = ? where first_name = ? and last_name = ?";
            PreparedStatement pst = con.prepareStatement(upsql);
            pst.setInt(1, 2);
            pst.setInt(2, 5);
            pst.setString(3, c.getFirst_name());
            pst.setString(4, c.getLast_name());
            pst.executeUpdate();
    }
    public void showCustomer() throws SQLException {
             String query = "select * from customer"
                    + " order by customer_id desc"
                    + " limit 10";
           
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            ResultSetMetaData md = rs.getMetaData();
           
            int col = md.getColumnCount();
           
            for (int i = 1; i <= col; i++) {
                System.out.print(md.getColumnName(i)+ " \t");
            }
            System.out.println("");
           
            while (rs.next()) {
                for (int i = 1; i <= col; i++) {
                    System.out.print(rs.getString(i)+" \t");
                }
                System.out.println("");
            }
    }
}
     

