package br.com.yanaga.jsf.webflow.app.web;

import br.com.yanaga.jsf.webflow.app.Pessoa;
import br.com.yanaga.jsf.webflow.app.QPessoa;
import br.com.yanaga.jsf.webflow.app.repository.PessoaRepository;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PessoaController {
 
    @Autowired
    private PessoaRepository pessoaRepository;
    
    public List<Pessoa> filtrar(FiltroPessoa filtro) {
        if (Strings.isNullOrEmpty(filtro.getTexto())) {
            return pessoaRepository.findAll();
        } else {
            return ImmutableList.copyOf(pessoaRepository.findAll(
                QPessoa.pessoa.nome.containsIgnoreCase(filtro.getTexto())));
        }
    }
    
    public Pessoa novo() {
        return new Pessoa();
    }
    
    public Pessoa salvar(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }
    
    public FiltroPessoa novoFiltro() {
        return new FiltroPessoa();
    }
    
    public static class FiltroPessoa implements Serializable {
        
        private String texto;

        public String getTexto() {
            return texto;
        }

        public void setTexto(String texto) {
            this.texto = texto;
        }
        
    }
    
}