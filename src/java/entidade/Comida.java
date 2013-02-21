package entidade;

import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.NotNull;

public class Comida implements Serializable {
    
    private String nome;
    
    @NotNull(message="É obrigatório informar as calorias")
    private Double calorias;
    
    private Date validade;
    
    private Sabor sabor;

    public Double getCalorias() {
        return calorias;
    }

    public void setCalorias(Double calorias) {
        this.calorias = calorias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public Sabor getSabor() {
        return sabor;
    }

    public void setSabor(Sabor sabor) {
        this.sabor = sabor;
    }
    
}
