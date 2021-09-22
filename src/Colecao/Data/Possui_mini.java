/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecao.Data;

import Colecao.Model.Usuario_c;
import Colecao.Model.Usuario_mini;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
public class Possui_mini extends Conectando{
    
    public Possui_mini() throws Exception{}
    public boolean Adicionar(Usuario_c obj1, Usuario_mini obj2) throws Exception{
        String sql = "insert into possuiminis(idcolecionador, idminiatura) values (?,?)";
        PreparedStatement ps = getConectando().prepareStatement(sql);
        ps.setInt(1, obj1.getIdc());
        ps.setInt(2, obj2.getNumero_id());
        return ps.executeUpdate()>0;
                
    }
    
    public ArrayList<Usuario_mini> pesquisar_mini_banco(String pesq, Usuario_c obj1) throws Exception {
//usar um obj da model com o id do colecionador em questao
        ArrayList<Usuario_mini> listademiniaturas=new ArrayList<>();
        String sql="Select * from miniaturas where nome like '%"+pesq+"%' "
                + "and not exists (select * from possuiminis where miniaturas.numero_id = \n" +
                 "possuiminis.idminiatura and possuiminis.idcolecionador='" +obj1.getIdc()+"') order by numero_id;";
        
        PreparedStatement ps = getConectando().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
        Usuario_mini obj = new Usuario_mini(rs.getString("nome"),rs.getString("marca"),
        rs.getString("escala"),rs.getInt("anolancamento"),rs.getString("cor"),rs.getInt("numero_id"));
        listademiniaturas.add(obj);
        }
        return listademiniaturas;
    }
    
    public ArrayList<Usuario_mini> pesquisar_mini_colecionador(String pesq, Usuario_c obj1) throws Exception {
//usar um obj da model com o id do colecionador em questao
        ArrayList<Usuario_mini> listademiniaturas=new ArrayList<>();
        String sql="Select * from miniaturas where nome like '%"+pesq+"%' "
                + "and exists (select * from possuiminis where miniaturas.numero_id = \n" +
                 "possuiminis.idminiatura and possuiminis.idcolecionador='" +obj1.getIdc()+"') order by numero_id;";
        
        PreparedStatement ps = getConectando().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
        Usuario_mini obj = new Usuario_mini(rs.getString("nome"),rs.getString("marca"),
        rs.getString("escala"),rs.getInt("anolancamento"),rs.getString("cor"),rs.getInt("numero_id"));
        listademiniaturas.add(obj);
        }
        return listademiniaturas;
    }
    
    public boolean excluir(Usuario_c obj1, Usuario_mini obj2) throws Exception{
        String sql= "Delete from possuiminis where idcolecionador="+obj1.getIdc()+" and idminiatura= "+obj2.getNumero_id();
        PreparedStatement ps = getConectando().prepareStatement(sql);
       // ps.setInt(1, id);
        return ps.executeUpdate()>0;
    }
}
