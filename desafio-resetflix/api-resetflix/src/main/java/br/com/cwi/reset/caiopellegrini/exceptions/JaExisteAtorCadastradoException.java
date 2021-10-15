package br.com.cwi.reset.caiopellegrini.exceptions;

public class JaExisteAtorCadastradoException extends Exception{
    public JaExisteAtorCadastradoException(final String tipo){
        super (String.format("Já existe um %s cadastrado para o nome ", tipo));

    }

    public JaExisteAtorCadastradoException() {

    }
}
