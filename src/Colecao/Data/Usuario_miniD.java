/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecao.Data;

import Colecao.Model.Usuario_mini;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Usuario_miniD extends Conectando {
    public Usuario_miniD () throws Exception{}
    public boolean incluir_M(Usuario_mini obj) throws Exception{
      String sql = "insert into miniaturas (nome,marca,escala,anolancamento,cor) values (?,?,?,?,?)"; 
//"insert into colecionador (nome,senha,foco,email,data_inicio) values (?,?,?,?,?)";
        PreparedStatement ps = getConectando().prepareStatement(sql);
        ps.setString(1, obj.getNome());
        ps.setString(2, obj.getMarca());
        ps.setString(3, obj.getEscala());
        ps.setInt(4, obj.getAnolancamento());
        ps.setString(5, obj.getCor());
        //ps.setInt(6, obj.getNumero_id());
        
        return ps.executeUpdate()>0;//funcionando
    }

    public ArrayList<Usuario_mini> pesquisar(String pesq) throws Exception {
        ArrayList<Usuario_mini> listademiniaturas=new ArrayList<>();
        String sql="Select * from miniaturas where nome like '%"+pesq+"%' order by numero_id";
        PreparedStatement ps = getConectando().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
        Usuario_mini obj = new Usuario_mini(rs.getString("nome"),rs.getString("marca"),
        rs.getString("escala"),rs.getInt("anolancamento"),rs.getString("cor"),rs.getInt("numero_id"));
        listademiniaturas.add(obj);
        }
        return listademiniaturas;
}
    
}
