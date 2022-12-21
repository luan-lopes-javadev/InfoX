package br.com.infox.dal;

import java.sql.*;
import javax.swing.JOptionPane;

public class ModuloConexao {

    //Método responsavel por estabelecer a conexão com o banco
    public static Connection conector() {

        java.sql.Connection conexao = null;
        // a linha abaixo "chama" o driver
        String driver = "com.mysql.cj.jdbc.Driver";
        //Armazenando informacoes referente ao banco
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String password = "root123";
        //Estabelecendo a conexao com o banco
        try { //caso dê certo
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e){
       
            return null;
        }
    }
}
