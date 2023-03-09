package com.blz.movietheatre;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_Connect {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:Mysql://localhost:3306/MySql","root","Diyuv@1808");
            Statement smt = con.createStatement();
            smt.executeUpdate("CREATE TABLE movies (id INT AUTO_INCREMENT PRIMARY KEY, title VARCHAR(255),director VARCHAR(255),rating DOUBLE)");
            System.out.println("Table Created Succesfully");
            con.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
