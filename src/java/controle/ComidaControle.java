package controle;

import entidade.Comida;
import entidade.Sabor;
import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean
public class ComidaControle implements Serializable {

    private List<Comida> comidas = new LinkedList<Comida>();
    
    private Comida comida;
    
    public String novo() {
        comida = new Comida();
        return "editar";
    }
    
    public String salvar() {
        if (!comidas.contains(comida)) {
            comidas.add(comida);
        }
        return "lista";
    }
    
    public void excluir(Comida comida) {
        comidas.remove(comida);
    }
    
    public List<Sabor> getSabores() {
        return Arrays.asList(Sabor.values());
    }

    public List<Comida> getComidas() {
        return comidas;
    }

    public Comida getComida() {
        return comida;
    }

    public void setComida(Comida comida) {
        this.comida = comida;
    }
    
}