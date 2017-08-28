package model;
// Generated 28/08/2017 09:48:42 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Filme generated by hbm2java
 */
public class Filme  implements java.io.Serializable {


     private Short filmeId;
     private String titulo;
     private String descricao;
     private Date anoDeLancamento;
     private byte idiomaId;
     private Byte idiomaOriginalId;
     private byte duracaoDaLocacao;
     private BigDecimal precoDaLocacao;
     private Short duracaoDoFilme;
     private BigDecimal custoDeSubstituicao;
     private String classificacao;
     private String recursosEspeciais;
     private Date ultimaAtualizacao;
     private Set inventarios = new HashSet(0);
     private Set filmeAtors = new HashSet(0);
     private Set filmeCategorias = new HashSet(0);

    public Filme() {
    }

	
    public Filme(String titulo, byte idiomaId, byte duracaoDaLocacao, BigDecimal precoDaLocacao, BigDecimal custoDeSubstituicao, Date ultimaAtualizacao) {
        this.titulo = titulo;
        this.idiomaId = idiomaId;
        this.duracaoDaLocacao = duracaoDaLocacao;
        this.precoDaLocacao = precoDaLocacao;
        this.custoDeSubstituicao = custoDeSubstituicao;
        this.ultimaAtualizacao = ultimaAtualizacao;
    }
    public Filme(String titulo, String descricao, Date anoDeLancamento, byte idiomaId, Byte idiomaOriginalId, byte duracaoDaLocacao, BigDecimal precoDaLocacao, Short duracaoDoFilme, BigDecimal custoDeSubstituicao, String classificacao, String recursosEspeciais, Date ultimaAtualizacao, Set inventarios, Set filmeAtors, Set filmeCategorias) {
       this.titulo = titulo;
       this.descricao = descricao;
       this.anoDeLancamento = anoDeLancamento;
       this.idiomaId = idiomaId;
       this.idiomaOriginalId = idiomaOriginalId;
       this.duracaoDaLocacao = duracaoDaLocacao;
       this.precoDaLocacao = precoDaLocacao;
       this.duracaoDoFilme = duracaoDoFilme;
       this.custoDeSubstituicao = custoDeSubstituicao;
       this.classificacao = classificacao;
       this.recursosEspeciais = recursosEspeciais;
       this.ultimaAtualizacao = ultimaAtualizacao;
       this.inventarios = inventarios;
       this.filmeAtors = filmeAtors;
       this.filmeCategorias = filmeCategorias;
    }
   
    public Short getFilmeId() {
        return this.filmeId;
    }
    
    public void setFilmeId(Short filmeId) {
        this.filmeId = filmeId;
    }
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Date getAnoDeLancamento() {
        return this.anoDeLancamento;
    }
    
    public void setAnoDeLancamento(Date anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
    public byte getIdiomaId() {
        return this.idiomaId;
    }
    
    public void setIdiomaId(byte idiomaId) {
        this.idiomaId = idiomaId;
    }
    public Byte getIdiomaOriginalId() {
        return this.idiomaOriginalId;
    }
    
    public void setIdiomaOriginalId(Byte idiomaOriginalId) {
        this.idiomaOriginalId = idiomaOriginalId;
    }
    public byte getDuracaoDaLocacao() {
        return this.duracaoDaLocacao;
    }
    
    public void setDuracaoDaLocacao(byte duracaoDaLocacao) {
        this.duracaoDaLocacao = duracaoDaLocacao;
    }
    public BigDecimal getPrecoDaLocacao() {
        return this.precoDaLocacao;
    }
    
    public void setPrecoDaLocacao(BigDecimal precoDaLocacao) {
        this.precoDaLocacao = precoDaLocacao;
    }
    public Short getDuracaoDoFilme() {
        return this.duracaoDoFilme;
    }
    
    public void setDuracaoDoFilme(Short duracaoDoFilme) {
        this.duracaoDoFilme = duracaoDoFilme;
    }
    public BigDecimal getCustoDeSubstituicao() {
        return this.custoDeSubstituicao;
    }
    
    public void setCustoDeSubstituicao(BigDecimal custoDeSubstituicao) {
        this.custoDeSubstituicao = custoDeSubstituicao;
    }
    public String getClassificacao() {
        return this.classificacao;
    }
    
    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
    public String getRecursosEspeciais() {
        return this.recursosEspeciais;
    }
    
    public void setRecursosEspeciais(String recursosEspeciais) {
        this.recursosEspeciais = recursosEspeciais;
    }
    public Date getUltimaAtualizacao() {
        return this.ultimaAtualizacao;
    }
    
    public void setUltimaAtualizacao(Date ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
    }
    public Set getInventarios() {
        return this.inventarios;
    }
    
    public void setInventarios(Set inventarios) {
        this.inventarios = inventarios;
    }
    public Set getFilmeAtors() {
        return this.filmeAtors;
    }
    
    public void setFilmeAtors(Set filmeAtors) {
        this.filmeAtors = filmeAtors;
    }
    public Set getFilmeCategorias() {
        return this.filmeCategorias;
    }
    
    public void setFilmeCategorias(Set filmeCategorias) {
        this.filmeCategorias = filmeCategorias;
    }




}


