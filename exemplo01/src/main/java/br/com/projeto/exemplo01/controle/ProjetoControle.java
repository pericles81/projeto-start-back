package br.com.projeto.exemplo01.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.exemplo01.modelo.Projeto;
import br.com.projeto.exemplo01.repositorio.ProjetoRepositorio;

@RestController
@RequestMapping("/projetos")
public class ProjetoControle {

    @Autowired
    private ProjetoRepositorio projeto_Repositorio;

    @GetMapping("/listar")
    public Iterable<Projeto> listar(){
        return projeto_Repositorio.findAll();
    }
    @PostMapping("/cadastrar")
    public Projeto cadastrar(@RequestBody Projeto obj){
        return projeto_Repositorio.save(obj);
    }
}
