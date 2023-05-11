/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author nguye
 */
public class SQLServerConnecttion {

    public static Connection getconnection() {
        Connection c = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://TRUYEN:1433;databaseName=FashionShop";
            String name = "sa";
            String password = "123";
            try {
                c = DriverManager.getConnection(url, name, password);
            } catch (SQLException e) {
            }

        } catch (ClassNotFoundException ex) {
        };
        return c;
    }
}
