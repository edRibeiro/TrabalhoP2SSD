package model;
// Generated 29/08/2017 01:55:11 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Dwcliente generated by hbm2java
 */
public class Dwcliente  implements java.io.Serializable {


     private int idCliente;
     private String cidade;
     private String estado;
     private String genero;
     private BigDecimal rendaAnual;
     private String escolaridade;
     private Set dwalugueisFatos = new HashSet(0);

    public Dwcliente() {
    }

	
    public Dwcliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public Dwcliente(int idCliente, String cidade, String estado, String genero, BigDecimal rendaAnual, String escolaridade, Set dwalugueisFatos) {
       this.idCliente = idCliente;
       this.cidade = cidade;
       this.estado = estado;
       this.genero = genero;
       this.rendaAnual = rendaAnual;
       this.escolaridade = escolaridade;
       this.dwalugueisFatos = dwalugueisFatos;
    }
   
    public int getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public String getCidade() {
        return this.cidade;
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getGenero() {
        return this.genero;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public BigDecimal getRendaAnual() {
        return this.rendaAnual;
    }
    
    public void setRendaAnual(BigDecimal rendaAnual) {
        this.rendaAnual = rendaAnual;
    }
    public String getEscolaridade() {
        return this.escolaridade;
    }
    
    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }
    public Set getDwalugueisFatos() {
        return this.dwalugueisFatos;
    }
    
    public void setDwalugueisFatos(Set dwalugueisFatos) {
        this.dwalugueisFatos = dwalugueisFatos;
    }




}


