package model;
// Generated 28/08/2017 09:48:42 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Cidade generated by hbm2java
 */
public class Cidade  implements java.io.Serializable {


     private int cidadeId;
     private Estados estados;
     private String nome;
     private Set enderecos = new HashSet(0);

    public Cidade() {
    }

	
    public Cidade(int cidadeId, Estados estados, String nome) {
        this.cidadeId = cidadeId;
        this.estados = estados;
        this.nome = nome;
    }
    public Cidade(int cidadeId, Estados estados, String nome, Set enderecos) {
       this.cidadeId = cidadeId;
       this.estados = estados;
       this.nome = nome;
       this.enderecos = enderecos;
    }
   
    public int getCidadeId() {
        return this.cidadeId;
    }
    
    public void setCidadeId(int cidadeId) {
        this.cidadeId = cidadeId;
    }
    public Estados getEstados() {
        return this.estados;
    }
    
    public void setEstados(Estados estados) {
        this.estados = estados;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Set getEnderecos() {
        return this.enderecos;
    }
    
    public void setEnderecos(Set enderecos) {
        this.enderecos = enderecos;
    }




}


