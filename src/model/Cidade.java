/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author igors
 */
public class Cidade {

   private int id;
   private String nome;
   private String UF;
   private int demandaMamografo;

    public Cidade(int id, String nome, String UF, int demandaMamografo) {
        this.id = id;
        this.nome = nome;
        this.UF = UF;
        this.demandaMamografo = demandaMamografo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public int getDemandaMamografo() {
        return demandaMamografo;
    }

    public void setDemandaMamografo(int demandaMamografo) {
        this.demandaMamografo = demandaMamografo;
    }
    
   public Cidade() {
    }
 
    
}
