package br.com.cwi.reset.caiopellegrini;

public class AnoInicioInvalidoException extends Exception{
    public AnoInicioInvalidoException (){
        super ("Ano de início de atividade inválido para o ator cadastrado.");
    }
}
