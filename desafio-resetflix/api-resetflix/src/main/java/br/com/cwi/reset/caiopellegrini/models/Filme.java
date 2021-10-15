package br.com.cwi.reset.caiopellegrini.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Filme {
    private Integer id;
    private String nome;
    private LocalDate anoLancamento;
    private String capaFilme;
    private Diretor diretor;
   // private Genero generos;
   // private PersonagemAtor personagens;
    private String resumo;

    public Filme(Integer id, String nome, LocalDate anoLancamento, String capaFilme, Diretor diretor, Genero generos, PersonagemAtor personagens, String resumo) {
        this.id = id;
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.capaFilme = capaFilme;
        this.diretor = diretor;
        // this.generos = generos;
        // this.personagens = personagens;
        this.resumo = resumo;
    }

    public static List<Genero> getGeneros (){
        List<Genero> generos = new ArrayList<>();
        return generos;
    }

    public static List <PersonagemAtor> getPersonagens () {
            List <PersonagemAtor> personagens = new ArrayList<>();
            return personagens;

    }
}
