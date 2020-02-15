package model;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;


public class SQLiteConnector {

    static Connection connection = null;

    public static Connection dbConnector() {

        try {
         
            Class.forName("org.sqlite.JDBC");

            connection = DriverManager.getConnection("jdbc:sqlite:PatientDatabase");
            return connection;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

}
