package model;
// Generated 28/08/2017 09:48:42 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Funcionario generated by hbm2java
 */
public class Funcionario  implements java.io.Serializable {


     private Byte funcionarioId;
     private Endereco endereco;
     private Loja loja;
     private String primeiroNome;
     private String ultimoNome;
     private byte[] foto;
     private String email;
     private boolean ativo;
     private String usuario;
     private String senha;
     private Date ultimaAtualizacao;
     private Set pagamentos = new HashSet(0);

    public Funcionario() {
    }

	
    public Funcionario(Endereco endereco, Loja loja, String primeiroNome, String ultimoNome, boolean ativo, String usuario, Date ultimaAtualizacao) {
        this.endereco = endereco;
        this.loja = loja;
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.ativo = ativo;
        this.usuario = usuario;
        this.ultimaAtualizacao = ultimaAtualizacao;
    }
    public Funcionario(Endereco endereco, Loja loja, String primeiroNome, String ultimoNome, byte[] foto, String email, boolean ativo, String usuario, String senha, Date ultimaAtualizacao, Set pagamentos) {
       this.endereco = endereco;
       this.loja = loja;
       this.primeiroNome = primeiroNome;
       this.ultimoNome = ultimoNome;
       this.foto = foto;
       this.email = email;
       this.ativo = ativo;
       this.usuario = usuario;
       this.senha = senha;
       this.ultimaAtualizacao = ultimaAtualizacao;
       this.pagamentos = pagamentos;
    }
   
    public Byte getFuncionarioId() {
        return this.funcionarioId;
    }
    
    public void setFuncionarioId(Byte funcionarioId) {
        this.funcionarioId = funcionarioId;
    }
    public Endereco getEndereco() {
        return this.endereco;
    }
    
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Loja getLoja() {
        return this.loja;
    }
    
    public void setLoja(Loja loja) {
        this.loja = loja;
    }
    public String getPrimeiroNome() {
        return this.primeiroNome;
    }
    
    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }
    public String getUltimoNome() {
        return this.ultimoNome;
    }
    
    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }
    public byte[] getFoto() {
        return this.foto;
    }
    
    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public boolean isAtivo() {
        return this.ativo;
    }
    
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getSenha() {
        return this.senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public Date getUltimaAtualizacao() {
        return this.ultimaAtualizacao;
    }
    
    public void setUltimaAtualizacao(Date ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
    }
    public Set getPagamentos() {
        return this.pagamentos;
    }
    
    public void setPagamentos(Set pagamentos) {
        this.pagamentos = pagamentos;
    }




}

