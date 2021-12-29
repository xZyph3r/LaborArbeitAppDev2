package com.company;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class Main {
    static final String DB_URL = "jdbc:mariadb://localhost/mobilfunkanbieter";
    static final String Driver = "org.mariadb.jdbc.Driver";
    static final String USER = "root";
    static final String PASS = "";

    public Main() {
    }

    public static void main(String[] args) {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("Driver geladen");
        } catch (ClassNotFoundException var3) {
            var3.printStackTrace();
        }

        System.out.println(" ");

        try {
            Connection con = DriverManager.getConnection("jdbc:mariadb://localhost/mobilfunkanbieter", "root", "");
            System.out.println("Verbindung zum Server aufgebaut");

        } catch (SQLException var2) {
            var2.printStackTrace();
        }

    }
}

