package br.com.projeto.exemplo01.repositorio;

import org.springframework.data.repository.CrudRepository;

import br.com.projeto.exemplo01.modelo.Aluno;

public interface AlunoRepositorio extends CrudRepository<Aluno ,Long> {
    
}
