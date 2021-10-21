package br.com.cwi.reset.primeiroprojetospring.domain;

import br.com.cwi.reset.primeiroprojetospring.domain.Genero;
import br.com.cwi.reset.primeiroprojetospring.domain.Pessoa;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ator extends Pessoa {

    private Integer numeroOscars;

    public Ator(String nome, LocalDate dataNascimento, Genero genero, Integer numeroOscars) {
        super(nome, dataNascimento, genero);
        this.numeroOscars = numeroOscars;
    }

    public Integer getNumeroOscars() {
        return numeroOscars;
    }
}