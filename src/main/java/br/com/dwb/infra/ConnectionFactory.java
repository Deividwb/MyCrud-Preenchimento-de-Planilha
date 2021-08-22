package br.com.dwb.infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private ConnectionFactory(){}

    public static Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/relleno_planilla?useTimezone=true&serverTimezone=GMT","root","");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
