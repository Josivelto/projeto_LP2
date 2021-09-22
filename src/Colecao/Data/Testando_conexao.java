/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecao.Data;

import java.sql.PreparedStatement;

/**
 *
 * @author josiv
 */
public class Testando_conexao {
    public static void main(String[] args) {
        try {
            Conectando c = new Conectando();
            System.out.println("Conexão ok.");
           String sql = "insert into colecionador (nome,senha,foco,email,data_inicio) values ('barbosa','luisluis',3,'barbosa@gmail.com','05/05/2005')";
            PreparedStatement ps = c.getConectando().prepareStatement(sql);
            if (ps.executeUpdate() > 0) {
                System.out.println("Registro salvo com sucesso!");
            } else {
                System.out.println("Erro ao salvar.");
            }
        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
    }
    
}
