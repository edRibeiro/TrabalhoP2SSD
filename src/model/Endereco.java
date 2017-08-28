package model;
// Generated 28/08/2017 09:48:42 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Endereco generated by hbm2java
 */
public class Endereco  implements java.io.Serializable {


     private Short enderecoId;
     private Cidade cidade;
     private String endereco;
     private String endereco2;
     private String bairro;
     private String cep;
     private String telefone;
     private Date ultimaAtualizacao;
     private Set funcionarios = new HashSet(0);

    public Endereco() {
    }

	
    public Endereco(Cidade cidade, String endereco, String bairro, String telefone, Date ultimaAtualizacao) {
        this.cidade = cidade;
        this.endereco = endereco;
        this.bairro = bairro;
        this.telefone = telefone;
        this.ultimaAtualizacao = ultimaAtualizacao;
    }
    public Endereco(Cidade cidade, String endereco, String endereco2, String bairro, String cep, String telefone, Date ultimaAtualizacao, Set funcionarios) {
       this.cidade = cidade;
       this.endereco = endereco;
       this.endereco2 = endereco2;
       this.bairro = bairro;
       this.cep = cep;
       this.telefone = telefone;
       this.ultimaAtualizacao = ultimaAtualizacao;
       this.funcionarios = funcionarios;
    }
   
    public Short getEnderecoId() {
        return this.enderecoId;
    }
    
    public void setEnderecoId(Short enderecoId) {
        this.enderecoId = enderecoId;
    }
    public Cidade getCidade() {
        return this.cidade;
    }
    
    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    public String getEndereco() {
        return this.endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getEndereco2() {
        return this.endereco2;
    }
    
    public void setEndereco2(String endereco2) {
        this.endereco2 = endereco2;
    }
    public String getBairro() {
        return this.bairro;
    }
    
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCep() {
        return this.cep;
    }
    
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getTelefone() {
        return this.telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public Date getUltimaAtualizacao() {
        return this.ultimaAtualizacao;
    }
    
    public void setUltimaAtualizacao(Date ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
    }
    public Set getFuncionarios() {
        return this.funcionarios;
    }
    
    public void setFuncionarios(Set funcionarios) {
        this.funcionarios = funcionarios;
    }




}


