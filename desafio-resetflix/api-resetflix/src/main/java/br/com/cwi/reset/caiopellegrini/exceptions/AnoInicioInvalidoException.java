package br.com.cwi.reset.caiopellegrini.exceptions;

public class AnoInicioInvalidoException extends Exception{
    public AnoInicioInvalidoException (final String tipo){
        super (String.format("Ano de início de atividade inválido para o %s cadastrado.", tipo));
    }

    public AnoInicioInvalidoException() {

    }
}
