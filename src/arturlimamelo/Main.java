/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ArturLimaMelo;

import java.sql.*;
import arturlimamelo.CustomerDAO;
/**
 *
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        
        Connection con = null;

        // try {
            
        Customer c = new Customer(1, "Dimitri", "Tolstoi", "dimitri.tolstoi@gmail.com", 5, 5);
        CustomerDAO dao = new CustomerDAO();
        dao.insertCustomer(c);
        dao.deleteCustomer(c);
        dao.updateCustomer(c);
        dao.showCustomer();
            // ********** CRUD ********** 

          
       
            
            /*
            int col = md.getColumnCount();
            System.out.println("\nInserção do cliente:\n");
            for (int i = 1; i <= col; i++){
                System.out.print(md.getColumnName(i)+"\t");
            } System.out.println("");
       
            while (rs.next()){
                for (int i = 1; i <= col; i++) {
                    System.out.print(rs.getString(i)+ "\t");
               
                }System.out.println("");
            }
            */

            
            
           /* 
            rs = st.executeQuery(query);
            md = rs.getMetaData();
            col = md.getColumnCount();
            System.out.println("\nAtualização do cliente:\n");
            for (int i = 1; i <= col; i++){
                System.out.print(md.getColumnName(i)+"\t");
            } System.out.println("");
       
            while (rs.next()){
                for (int i = 1; i <= col; i++) {
                    System.out.print(rs.getString(i)+ "\t");
               
                }System.out.println("");
            }
            */
            
            
            /*
            rs = st.executeQuery(query);
            md = rs.getMetaData();
            col = md.getColumnCount();
            System.out.println("\nRemoção do cliente:\n");
            for (int i = 1; i <= col; i++){
                System.out.print(md.getColumnName(i)+"\t");
            } System.out.println("");
       
            while (rs.next()){
                for (int i = 1; i <= col; i++) {
                    System.out.print(rs.getString(i)+ "\t");
               
                }System.out.println("");
            }
            */
           /*   
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro");
        } finally {
            con.close();
            System.out.println("Connection closed!");
        }
*/
    }

}