package dao;

import java.sql.*;

public class ConexaoJDBC {
    public staticConnection getConexao() throws Exception{
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/db_veterinaria", "root", "");
    }
}
