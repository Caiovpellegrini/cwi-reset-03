package br.com.cwi.reset.caiopellegrini;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Filme {
    private Integer id;
    private String nome;
    private LocalDate anoLancamento;
    private String capaFilme;
    private Diretor diretor;
    // - List:PersonagemAtor personagens
    private String resumo;

    public static void main(String[] args) {
        List<String> generos = new ArrayList<>();
        generos.add("AÇÃO");
        generos.add("AVENTURA");
        generos.add("COMÉDIA");
        generos.add("DOCUMENTARIO");
        generos.add("DRAMA");
        generos.add("ESPIONAGEM");
        generos.add("FICCAO_CIENTIFICA");
        generos.add("GUERRA");
        generos.add("MISTERIO");
        generos.add("MUSICAL");
        generos.add("POLICIAL");
        generos.add("ROMANCE");
        generos.add("TERROR");
    }
}
