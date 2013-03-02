package br.com.yanaga.jsf.webflow.app.repository;

import br.com.yanaga.jsf.webflow.app.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

public interface PessoaRepository
        extends JpaRepository<Pessoa, Long>,
        QueryDslPredicateExecutor<Pessoa> {
    
}