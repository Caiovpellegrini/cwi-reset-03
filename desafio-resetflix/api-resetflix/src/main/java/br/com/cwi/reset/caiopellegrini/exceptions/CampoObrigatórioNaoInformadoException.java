package br.com.cwi.reset.caiopellegrini.exceptions;

public class CampoObrigatórioNaoInformadoException extends Exception{
public CampoObrigatórioNaoInformadoException(final String campo){
    super ("Campo obrigatório não informado. Favor informar o campo: %s.");
}

    public CampoObrigatórioNaoInformadoException() {

    }
}
