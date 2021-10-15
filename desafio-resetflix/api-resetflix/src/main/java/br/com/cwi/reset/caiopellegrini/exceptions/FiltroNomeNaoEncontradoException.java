package br.com.cwi.reset.caiopellegrini.exceptions;

public class FiltroNomeNaoEncontradoException extends Exception {

    public void FiltroNomeNaoEncontrado(String tipo, String paramentro) {
        super(String.format("%s não encontrato com o filtro %s, favor informar outro filtro.", tipo, paramentro));

    }

    public FiltroNomeNaoEncontradoException(String ator, String filtroNome) {
    }
}