package br.com.projeto.exemplo01.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.exemplo01.modelo.Projeto;

@Repository
public interface ProjetoRepositorio extends CrudRepository<Projeto, Long> {
    
}
