package com.company;

import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException, IOException {
        String urlDatabase = "jdbc:mysql://localhost:3306/ebookshop";
        String username = "";
        String password = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Username : ");
        username = sc.nextLine();
        System.out.println("Password : ");
        password = sc.nextLine();

        Connection myConnection = DriverManager.getConnection(urlDatabase,username,password);

        Statement stt = myConnection.createStatement();

        ResultSet resultSet = stt.executeQuery("SELECT * from `books`");

        while(resultSet.next()){
            System.out.println(resultSet.getString("id"));
            System.out.println(resultSet.getString("title"));
            System.out.println(resultSet.getString("author"));
            System.out.println(resultSet.getString("price"));
        }

        String query = "INSERT INTO books (id,title,author,price,qty)"+
                "VALUES (?,?,?,?,?)";
        PreparedStatement preparedStatement = myConnection.prepareStatement(query);

        int id = 15232;
        double price = 12.11;
        int qty = 55;
        String title = "Java for beginner";
        String author = "Nguyen David";



        preparedStatement.setInt(1,id);
        preparedStatement.setString(2,title);
        preparedStatement.setString(3,author);
        preparedStatement.setDouble(4,price);
        preparedStatement.setInt(5,qty);

        int effected = preparedStatement.executeUpdate();

        System.out.println(effected);

        query = "DELETE FROM books WHERE title = ?";

        preparedStatement = myConnection.prepareStatement(query);

        title = "Java for beginner";

        // set the corresponding param
        preparedStatement.setString(1, title);

        effected = preparedStatement.executeUpdate();

        System.out.println(effected);

        while(resultSet.next()){
            System.out.println(resultSet.getString("id"));
            System.out.println(resultSet.getString("title"));
            System.out.println(resultSet.getString("author"));
        }

        query = "UPDATE books SET qty = ? WHERE ID = ?";

        preparedStatement = myConnection.prepareStatement(query);

        qty = 56;
        id = 1001;

        preparedStatement.setInt(1,qty);
        preparedStatement.setInt(2,id);

        effected = preparedStatement.executeUpdate();

        System.out.println(effected);

        myConnection.close();
        sc.close();
    }
}

