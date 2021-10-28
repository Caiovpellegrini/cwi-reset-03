package br.com.cwi.reset.projeto1.controller;

import br.com.cwi.reset.projeto1.domain.Ator;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/ator")

public class AtorController {
    private static List<Ator> atores = new ArrayList<>();

    @GetMapping
    public List<Ator> getAtor() {

        return atores;
    }

    @GetMapping("/{nome}")
    public ResponseEntity<Ator> getById(@PathVariable String nome) {
        Ator ator = buscarPetPeloNome(nome);

        if (ator == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(ator);
    }

    private Ator buscarPetPeloNome(String nome) {
        for (Ator ator : atores) {
            if (ator.getNome().equals(nome)) {
                return ator;
            }
        }
        return null;
    }

    @PostMapping
    public Ator cadastrarAtor(@RequestBody Ator ator) {
        atores.add(ator);
        return ator;
    }

    @PutMapping
    public void atualizarAtor(@RequestBody Ator ator) {
        Ator atorCadastrado = buscarPetPeloNome(ator.getNome());

        if (atorCadastrado != null) {
            atores.remove(atorCadastrado);
            atores.add(ator);
        }
    }

    @DeleteMapping("/{nome}")
    public void deletarAtor(@PathVariable String nome) {
        Ator ator = buscarPetPeloNome(nome);
        if (ator != null) {
            atores.remove(ator);
        }
    }



}
