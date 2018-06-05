
package aulla;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Aulla {

    public static void main(String[] args) throws SQLException {

        {

            String connectionURL = "jdbc:sqlserver\\SQLEXPRESS;databaseName=aula;integratedSecurity=true";

            try {

                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

                Connection conexao = DriverManager.getConnection(connectionURL);
                Connection con;
                con= DriverManager.getConnection(connectionURL);
                System.out.println("Conexão obtida com sucesso");

            } 
            catch (Exception e) {

                System.out.println("Não foi possivel conectar com o banco");

            }

        }

    }    
}