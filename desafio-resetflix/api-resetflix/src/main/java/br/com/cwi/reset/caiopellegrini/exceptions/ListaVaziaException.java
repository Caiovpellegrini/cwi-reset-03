package br.com.cwi.reset.caiopellegrini.exceptions;

public class ListaVaziaException extends Exception {
        public ListaVaziaException (String tipo, String tipoPlural){
        super (String.format("nenhum %s cadastrado, favor cadastrar %s.", tipo, tipoPlural));
        }


}
