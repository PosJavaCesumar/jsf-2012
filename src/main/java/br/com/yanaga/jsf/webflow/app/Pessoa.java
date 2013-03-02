package br.com.yanaga.jsf.webflow.app;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class Pessoa implements Serializable {
    
    @Id
    @GeneratedValue
    private Long id;
    
    @Version
    Integer version;
    
    private String nome;
    
    private Integer peso;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

}