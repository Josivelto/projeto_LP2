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
public class Usuario_mini {
    private String nome;
    private String marca;
    private String escala;
    private int anolancamento;
    private String cor;
    private int numero_id;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the escala
     */
    public String getEscala() {
        return escala;
    }

    /**
     * @param escala the escala to set
     */
    public void setEscala(String escala) {
        this.escala = escala;
    }

    /**
     * @return the anolancamento
     */
    public int getAnolancamento() {
        return anolancamento;
    }

    /**
     * @param anolancamento the anolancamento to set
     */
    public void setAnolancamento(int anolancamento) {
        this.anolancamento = anolancamento;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the numero_id
     */
    public int getNumero_id() {
        return numero_id;
    }

    /**
     * @param numero_id the numero_id to set
     */
    public void setNumero_id(int numero_id) {
        this.numero_id = numero_id;
    }
    public Usuario_mini(){
        nome= new String();
        marca = new String();
        escala = new String();
        anolancamento =0;
        cor = new String();
        numero_id =0;
    }
    
    public Usuario_mini(String nome,String marca,String escala, int anolancamento,String cor, int numero_id){
        this.nome=nome;
        this.marca=marca;
        this.escala=escala;
        this.anolancamento=anolancamento;
        this.cor=cor;
        this.numero_id=numero_id;
    }
    
}
