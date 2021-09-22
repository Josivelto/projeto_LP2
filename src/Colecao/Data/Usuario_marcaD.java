/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecao.Data;

import Colecao.Model.usuario_marca;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class Usuario_marcaD extends Conectando{

    
    public Usuario_marcaD () throws Exception{}
    public void pesquisa_marca(usuario_marca obj) throws Exception{
    
      String sql = "select* from marca where logo ='"+obj.getLogo_marca()+"'"; 
                  /*select idc, senha from colecionador where idc = 1 and senha = 'luisluis';*/
        PreparedStatement ps = getConectando().prepareStatement(sql);//preparess é uma classe
       
        ResultSet rs = ps.executeQuery();//esse é  o metodo que faz a pesquisa no banco
        //funcionando mais ou menos, falta um if aqui, ver com a professora depois
        
        if(rs.next()){
        obj.setLogo_marca(rs.getString("logo"));
        obj.setNome_marca(rs.getString("nome"));
        
        
        }
       
          

    }
    
}
