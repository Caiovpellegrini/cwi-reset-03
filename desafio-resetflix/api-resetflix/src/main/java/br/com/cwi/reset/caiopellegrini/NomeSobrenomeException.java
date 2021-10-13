package br.com.cwi.reset.caiopellegrini;

public class NomeSobrenomeException extends Exception{
    public NomeSobrenomeException () {
     super ("Deve ser informado no mínimo nome e sobrenome para o ator.");
    }
}
