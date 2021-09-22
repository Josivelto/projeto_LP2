/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecao.Data;
import Colecao.Model.Usuario_c;
import Colecao.Model.usuario_marca;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import Colecao.View.JFinicio;
import java.sql.SQLException;

/**
 *
 * @author josiv
 */
public class Usuario_Data extends Conectando {
    private JFinicio objJFINICIO;
    public Usuario_Data () throws Exception{}
    public boolean incluir(Usuario_c obj) throws Exception{
      String sql = "insert into colecionador (nome,senha,foco,email,data_inicio) values (?,?,?,?,?)"; 
//"insert into colecionador (nome,senha,foco,email,data_inicio) values (?,?,?,?,?)";
        PreparedStatement ps = getConectando().prepareStatement(sql);
        ps.setString(1, obj.getNome());
        ps.setString(2, obj.getSenha());
        ps.setInt(3, obj.getFoco());
        ps.setString(4, obj.getEmail());
        ps.setString(5, obj.getData_inicio());

        
        return ps.executeUpdate()>0;//funcionando
    }
    
     public boolean editar(Usuario_c obj) throws Exception{
        String sql = "update colecionador set nome=?,senha=?,foco=?,email=?,data_inicio=? where idc=?";
        
        PreparedStatement ps = getConectando().prepareStatement(sql);
        ps.setString(1, obj.getNome());
        ps.setString(2, obj.getSenha());
        ps.setInt(3, obj.getFoco());
        ps.setString(4, obj.getEmail());
        ps.setString(5, obj.getData_inicio());
        ps.setInt(6, obj.getIdc());
        
        return ps.executeUpdate()>0;//funcionando
     }
     public ArrayList<Usuario_c> pesquisar(String pesq) throws Exception {
        ArrayList<Usuario_c> listausuarios=new ArrayList<>();
        String sql="Select * from colecionador where idc=3";
        PreparedStatement ps = getConectando().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
        Usuario_c obj = new Usuario_c(rs.getString("nome"), rs.getInt("idc"), rs.getString("senha"), rs.getInt("foco"), rs.getString("email"), rs.getString("data_inicio"));
       
        listausuarios.add(obj); 
       
        }
        return listausuarios;
     }
     /*public ArrayList<Usuario> pesquisar(String pesq) throws Exception {
        ArrayList<Usuario> listausuarios=new ArrayList<>();
        String sql="Select * from tbusuarios where nome like '"+pesq+"%' order by nome";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
        Usuario obj = new Usuario(rs.getInt("id"),rs.getString("nome"),
        rs.getString("email"),rs.getString("senha"),rs.getInt("tipo"));
        listausuarios.add(obj);
        }
        return listausuarios;*/
     
     
     
     public void executaSQL (String sql) throws Exception{
        
        PreparedStatement ps = getConectando().prepareStatement(sql);
//        String rs =""+ ps.executeQuery();
//        return rs;
     }
     public boolean validar(Usuario_c obj) throws Exception{
    
      String sql = "select* from colecionador where idc ="+obj.getIdc()+" and senha ='"+obj.getSenha()+"';"; 
                  /*select idc, senha from colecionador where idc = 1 and senha = 'luisluis';*/
        PreparedStatement ps = getConectando().prepareStatement(sql);//preparess é uma classe
       
        ResultSet rs = ps.executeQuery();//esse é  o metodo que faz a pesquisa no banco
        //funcionando mais ou menos, falta um if aqui, ver com a professora depois
        
        if(rs.next()){
        obj.setNome(rs.getString("nome"));
        obj.setIdc(rs.getInt("idc"));
        obj.setSenha(rs.getString("senha"));
        obj.setFoco(rs.getInt("foco"));
        obj.setData_inicio(rs.getString("data_inicio"));
        obj.setEmail(rs.getString("email"));
        return true;
        }
       
           return false;

    }
//     public boolean pesquisa_marca(usuario_marca obj) throws Exception{
//    
//      String sql = "select* from marca where logo ="+obj.getLogo_marca(); 
//                  /*select idc, senha from colecionador where idc = 1 and senha = 'luisluis';*/
//        PreparedStatement ps = getConectando().prepareStatement(sql);//preparess é uma classe
//       
//        ResultSet rs = ps.executeQuery();//esse é  o metodo que faz a pesquisa no banco
//        //funcionando mais ou menos, falta um if aqui, ver com a professora depois
//        
//        if(rs.next()){
//        obj.setLogo_marca(rs.getString("logo"));
//        obj.setNome_marca(rs.getString("nome"));
//        
//        return true;
//        }
//       
//           return false;
//
//    }
}
