/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author MeanRegression
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class balance {
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    int balance;
    int points;
    public void deposit(){
        try {
            
            String sql="select cash from register where username=?";
            conn=DriverManager.getConnection("jdbc:mysql://localhost/patoh","root","");
            pst=conn.prepareStatement(sql);
            pst.setString(1, login1.username);
            rs=pst.executeQuery();
            if(rs.next()){
                balance=rs.getInt("cash");
               conn.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    public void redeam(){
        try {
            String sql=("select points from monitor where username=?");
            conn=DriverManager.getConnection("jdbc:mysql://localhost/patoh","root","");
            pst=conn.prepareStatement(sql);
            pst.setString(1, login1.username);
            rs=pst.executeQuery();
            if(rs.next()){
                points=rs.getInt("points");
                conn.close();
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex);
        }
        
    }
    public static void main(String[]args){
        balance bal=new balance();
        bal.deposit();
    }
}
