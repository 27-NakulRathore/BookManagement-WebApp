/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.*;
import model.Book;
import dao.MyConnection;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class BookDAO {
    
     public static int autoIncrement() throws SQLException
    {
         Connection con=null;
         PreparedStatement ps=null;
         String sql;
         ResultSet rs=null;
         con=MyConnection.MygetConnection();
         sql="select max(bid) from book";
         ps=con.prepareStatement(sql);
         rs=ps.executeQuery();
         int n=10;
         if(rs.next())
         {
            n=rs.getInt(1);
            n++;           
         }
         return n;
    }

    public boolean checkLogin(String user, String pass) throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        String sql;
        con = MyConnection.MygetConnection();
        sql = "select * from login where username=? and password=?";
        ps = con.prepareStatement(sql);
        ps.setString(1, user);
        ps.setString(2, pass);
        ResultSet rs = null;
        rs = ps.executeQuery();
        if (rs.next()) {
            return true;
        }

        return false;
    }


    public boolean registerUser(String uname, String pass) {
        try {
            Connection con = MyConnection.MygetConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO login(username, password) VALUES (?,?)");
            ps.setString(1, uname);
            ps.setString(2, pass);
            int i = ps.executeUpdate();
            return i > 0;
        } catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("User Already Exists!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public int updateBook(Book B) throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        String sql;
        con = MyConnection.MygetConnection();
        sql = "update book set bname=?,aname=?,price=?, publisher=? where bid=?";
        ps = con.prepareStatement(sql);
        ps.setString(1, B.getbname());
        ps.setString(2, B.getAuthname());
        ps.setInt(3, B.getbprice());
        ps.setString(4, B.getbpub());
        ps.setInt(5, B.getbid());
        if (ps.executeUpdate() > 0) {
            return 1;
        }
        return 0;
    }

    public int insertBook(Book B) throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        con = MyConnection.MygetConnection();
        String sql;
        sql = "insert into book values(?,?,?,?,?)";
        ps = con.prepareStatement(sql);
        ps.setInt(1, B.getbid());
        ps.setString(2, B.getbname());
        ps.setString(3, B.getAuthname());
        ps.setInt(4, B.getbprice());
        ps.setString(5, B.getbpub());
        int n = 0;
        n = ps.executeUpdate();

        return n;
    }

    public Book searchbyName(String bkname) throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        con = MyConnection.MygetConnection();
        String sql;
        sql = "select * from book where bname=?";
        ps = con.prepareStatement(sql);
        ps.setString(1, bkname);
        rs = ps.executeQuery();
        Book B = new Book();
        if (rs.next()) {
            B.setbid(rs.getInt(1));
            B.setbname(rs.getString(2));
            B.setAuthname(rs.getString(3));
            B.setbprice(rs.getInt(4));
            B.setbpub(rs.getString(5));
        } else {
            return B = null;
        }
        return B;
    }

    public Book searchById(int bid) throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql;
        con = MyConnection.MygetConnection();
        sql = "select * from book where bid=?";
        ps = con.prepareStatement(sql);
        ps.setInt(1, bid);
        rs = ps.executeQuery();
        Book B = new Book();
        if (rs.next()) {
            B.setbid(rs.getInt(1));
            B.setbname(rs.getString(2));
            B.setAuthname(rs.getString(3));
            B.setbprice(rs.getInt(4));
            B.setbpub(rs.getString(5));
        } else {
            B = null;
        }
        return B;
    }

    public ArrayList<Book> searchAll() throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql;
        sql = "select * from book";
        con = MyConnection.MygetConnection();
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();

        ArrayList<Book> mylist = new ArrayList<Book>();
        while (rs.next()) {
            Book B = new Book();
            B.setbid(rs.getInt(1));
            B.setbname(rs.getString(2));
            B.setAuthname(rs.getString(3));
            B.setbprice(rs.getInt(4));
            B.setbpub(rs.getString(5));
            mylist.add(B);
            B = null;
        }
        return mylist;
    }

    public int deletebyName(String bname) throws SQLException {
       
        
        
        Connection con = null;
        PreparedStatement ps = null;
        con = MyConnection.MygetConnection();
        String sql;
        sql = "delete from book where bname=?";
        ps = con.prepareStatement(sql);
        ps.setString(1, bname);
        if (ps.executeUpdate() > 0) {
            return 1;
        }
        return 0;
    }

    /*    */
}
