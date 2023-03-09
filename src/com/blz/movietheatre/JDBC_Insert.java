package com.blz.movietheatre;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JDBC_Insert {
    public static void main(String[] args) {
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:Mysql://localhost:3306/MySql", "root", "Diyuv@1808");
        PreparedStatement psmt = con.prepareStatement("INSERT INTO movies(title, director, rating ) VALUES(?,?,?)");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.println("Enter Movie Name:");
        String title = br.readLine();
        System.out.println("Enter The Director Name");
        String dir = br.readLine();
        System.out.println("Enter The Rating");
        int rate = Integer.parseInt(br.readLine());
        psmt.setString(1, title);
        psmt.setString(2, dir);
        psmt.setInt(3, rate);
        int count = psmt.executeUpdate();
        if (count >= 0)
            System.out.println(count + "Record Inserted");
        else
            System.out.println("Record Insertion Failed");
        System.out.println("Do You Want To Add More Records[Yes/No]");
        String ch = br.readLine();
        if (ch.equalsIgnoreCase("No"))
            break;

    }
}
        catch (Exception e)
    {
        System.out.println(e);
    }
}
}
