package br.com.projeto.exemplo01.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.exemplo01.modelo.Aluno;
import br.com.projeto.exemplo01.repositorio.AlunoRepositorio;

@RestController
@RequestMapping("/alunos")
public class AlunoControle {

    @Autowired
    private AlunoRepositorio aluno_repositorio;


    @GetMapping("/listar")
    public Iterable<Aluno> listar(){
        return aluno_repositorio.findAll();
    }

    @PostMapping("/cadastrar")
    public Aluno cadastrar(@RequestBody Aluno obj){
        return aluno_repositorio.save(obj);
    }
}
