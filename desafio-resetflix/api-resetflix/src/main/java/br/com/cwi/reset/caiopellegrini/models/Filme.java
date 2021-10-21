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
    private Genero generos;
    private List<PersonagemAtor> personagens;
    private String resumo;
    private Estudio estudio;

    public Filme(Integer id, String nome, LocalDate anoLancamento, String capaFilme, Diretor diretor, Genero generos,
                 List<PersonagemAtor> personagens, String resumo, Estudio estudio) {
        this.id = id;
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.capaFilme = capaFilme;
        this.diretor = diretor;
        this.generos = generos;
        this.personagens = personagens;
        this.resumo = resumo;
        this.estudio = estudio;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getAnoLancamento() {
        return anoLancamento;
    }

    public String getCapaFilme() {
        return capaFilme;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public Genero getGeneros() {
        return generos;
    }

    public List<PersonagemAtor> getPersonagens() {
        return personagens;
    }

    public String getResumo() {
        return resumo;
    }

    public Estudio getEstudio() {
        return estudio;
    }
}
