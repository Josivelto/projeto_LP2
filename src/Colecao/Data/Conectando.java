/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecao.Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author josiv
 */
public class Conectando {
     private Connection con;
    public Connection getConectando(){
    return con;
    }
    public Conectando() throws SQLException, ClassNotFoundException{
    String url="jdbc:postgresql://localhost:5432/bdprojetoifsp2";
    
    String driver="org.postgresql.Driver";
    Class.forName(driver);
    con = DriverManager.getConnection(url, "postgres", "2020");
}
    
}
