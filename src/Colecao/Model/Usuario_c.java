/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecao.Model;

/**
 *
 * @author josiv
 */
public class Usuario_c {
   
    
    public void setNome (String nome){//metodo set serve para armazenar um valor/nome na variavel/ atributo
        this.nome=nome;
    }
    public String getNome(){//metodo get é feito pararpegar e ussar o que tem naquela vaiavel/atributo
        return nome;
    }
    public void setIdc (int idc){
        this.idc=idc;
    }
    public int getIdc(){
        return idc;
    }
    public void setSenha(String senha){
        this.senha=senha;
    }
    public String getSenha(){
        return senha;
    }
    public void setFoco(int foco){
        this.foco=foco;
    }
    public int getFoco(){
        return foco;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }
    public void setData_inicio(String data_inicio){
        this.data_inicio=data_inicio;
    }
    public String getData_inicio(){
        return data_inicio;
    }
    
    private String nome;//nome do colecionador
    private int idc; //id do colecionador
    private String senha;//senha do colecionador
    private int foco;//foco da colecao do colecionador
    private String email;//email  do colecionador
    private String data_inicio;// data de inicio da colecao do colecionador
    
    public Usuario_c() {//metodo construtor vazio
        nome=new String();
        idc=0;
        senha=new String();
        foco=0;
        email=new String();
        data_inicio=new String();
        
       
    }

    public Usuario_c(String nome,int idc, String senha, int foco, String email, String data_inicio) {//metodo construtor com parametros
        this.nome = nome;
        this.idc = idc;
        this.senha = senha;
        this.foco = foco;
        this.email = email;
        this.data_inicio = data_inicio;
    }
    
}
