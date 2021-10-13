package br.com.cwi.reset.caiopellegrini;

public class JaExisteAtorCadastradoException extends Exception{
    public JaExisteAtorCadastradoException(){
        super ("Já existe um ator cadastrado para o nome: ");
    }
}
