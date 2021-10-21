package br.com.cwi.reset.caiopellegrini.exceptions;

public class DataNascimentoException extends Exception{

    public DataNascimentoException (final String tipo){

        super ("Não é possível cadastrar %s não nascidos.");
    }

    public DataNascimentoException() {

    }
}
