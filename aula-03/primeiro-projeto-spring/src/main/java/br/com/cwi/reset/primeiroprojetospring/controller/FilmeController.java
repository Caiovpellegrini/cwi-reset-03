package br.com.cwi.reset.primeiroprojetospring.controller;

import br.com.cwi.reset.primeiroprojetospring.domain.Diretor;
import br.com.cwi.reset.primeiroprojetospring.domain.Filme;
import br.com.cwi.reset.primeiroprojetospring.domain.Genero;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController //dizemos para o Spring que nossa classe é uma "Controladora"
@RequestMapping ("/filme") //Nome que usamos para puxar no localhost:8080/

public class FilmeController {

    private static List<Filme> filmes = new ArrayList<>();

    @PostMapping // adição de um filme
    public ResponseEntity<Filme> cadastrarFilme(@RequestBody Filme filme) {

    // public Filme retorna filme cadastrado
    // @RequestBody no corpo da requisição recebe o Json
    //Filme filme recebe um objeto do tipo filme
    filmes.add(filme);
    return filme;

    }

    private static List<Filme> filmes = new ArrayList<>();

    @PostMapping
    public Filme cadastrarFilme (@RequestBody Filme filme) {
        Filme filmeExistente = buscarPorNome(filme.getNome());
        if (filmeExistente != null) {
            ResponseEntity.badRequest().build();
        }
        filmes.add(filme);
        return ResponseEntity.ok(filme);
    }

    @GetMapping
    public List<Filme> consultarTodos() {
        return filmes;
    }

    @GetMapping("/{nome}")
    public Filme buscarFilmePeloNome(@PathVariable String nome){
        return buscarPorNome(nome);
    }

    @DeleteMapping("/{nome}")
    public void deletarFilme(@PathVariable String nome) {
        Filme filme = buscarFilmePeloNome(nome);
        if (filme != null) {
            filmes.remove(filme);
        }
    }

    @PutMapping
    public Filme atualizarFilme(@RequestBody Filme filme) {
        Filme filmeExistente = buscarFilmePeloNome(filme.getNome());

        if (filmeExistente != null) {
            filmes.remove(filmeExistente);
            filmes.add(filme);
            return filme;
        }
        return null;
    }

    @GetMapping
    public Filme consultarFilme(> {
        return new Filme ("Capitão America", "Filme de herói", 90, 2010, 4.0,
                new Diretor("Nolan", LocalDate.now(), Genero.MASCULINO, 18));
    }

    private Filme buscarPorNome (String nome) { // criando método privado para verificar se já há um filme com  omesmo nome
        for (Filme filme : filmes) { // for percorrendo a lista de filmes
            if (filme.getNome().equals(nome)){ // se filmes pegar nome é igual ao nome inserido
                return filme; //retornar filme
            }
        }
        return null; // caso não retorne nulo
    }
}


