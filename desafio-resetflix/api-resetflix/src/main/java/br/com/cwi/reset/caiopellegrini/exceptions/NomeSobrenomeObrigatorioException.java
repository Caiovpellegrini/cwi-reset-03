package br.com.cwi.reset.caiopellegrini.exceptions;

public class NomeSobrenomeObrigatorioException extends Exception {
    public NomeSobrenomeObrigatorioException(final String tipo) {
super(String.format("Deve ser informado no mínimo nome e sobrenome para o %s.", tipo));
    }

    public NomeSobrenomeObrigatorioException() {

    }
}
