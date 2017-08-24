package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {

    public Connection geraConexao() {
        Connection conexao = null;

        try {
            // Registrando a classe JDBC no sistema em tempo de execução
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/db_sonharte";
            String usuario = "root";
            String senha = "";
            conexao = DriverManager.getConnection(url, usuario, senha);
        } catch (ClassNotFoundException e) {
            System.out
                    .println("Classe não encontrada. Erro: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Ocorreu um erro de SQL. Erro: "
                    + e.getMessage());
        }
        return conexao;
    }

}
