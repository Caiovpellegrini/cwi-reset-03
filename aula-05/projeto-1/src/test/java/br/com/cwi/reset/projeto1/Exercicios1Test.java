package br.com.cwi.reset.projeto1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercicios1Test {

    @Test
    public void testSomaUm () {
        //Arrange
        Exercicios1 somarCinco = new Exercicios1();
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        Integer expected = 15;

        //Action
        Integer result = somarCinco.somarLista(numeros);

        //Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testSomaDois (){
        //Arrange
        Exercicios1 somarCinco = new Exercicios1();
        List <Integer> numeros = Arrays.asList(-1,1,2,3,4);
        Integer expected = 9;

        //Action
        Integer result = somarCinco.somarLista(numeros);

        //Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testSomaTres (){
        //Arrange
        Exercicios1 somarTres = new Exercicios1();
        List <Integer> numeros = Arrays.asList(-1,-2,-3);
        Integer expected = -6;

        //Action
        Integer result = somarTres.somarLista(numeros);

        //Assert
        Assertions.assertEquals(expected, result);
    }
    @Test
    public void testSomaQuatro (){
        //Arrange
        Exercicios1 somarQuatro = new Exercicios1();
        List <Integer> numeros = Arrays.asList(0,0,0);
        Integer expected = 0;

        //Action
        Integer result = somarQuatro.somarLista(numeros);

        //Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testSomarListVazia (){
        //Arrange
        Exercicios1 somarListVazia = new Exercicios1();
        List <Integer> numeros = Arrays.asList();
        Integer expected = 0;

        //Action
        Integer result = somarListVazia.somarLista(numeros);

        //Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testMediaUm () {
        //Arrange
        Exercicios1 mediaUm = new Exercicios1();
        List<Integer> numeros = Arrays.asList(5, 7, 17, 12, 21);
        Double expected = 12.4;

        //Action
        Double result = mediaUm.calcularMedia(numeros);

        //Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testMediaDois () {
        //Arrange
        Exercicios1 mediaDois = new Exercicios1();
        List<Integer> numeros = Arrays.asList(-5, 7, 17, 12, 21);
        Double expected = 10.4;

        //Action
        Double result = mediaDois.calcularMedia(numeros);

        //Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testMediaTres () {
        //Arrange
        Exercicios1 mediaTres = new Exercicios1();
        List<Integer> numeros = Arrays.asList(-10, -20, -30);
        Double expected = -20.00;

        //Action
        Double result = mediaTres.calcularMedia(numeros);

        //Assert
        Assertions.assertEquals(expected, result);
    }
    @Test
    public void testMediaQuatro () {
        //Arrange
        Exercicios1 mediaQuatro = new Exercicios1();
        List<Integer> numeros = Arrays.asList(0, 0, 0);
        Double expected = 0.0;

        //Action
        Double result = mediaQuatro.calcularMedia(numeros);

        //Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testMediaCinco () {
        //Arrange
        Exercicios1 mediaCinco = new Exercicios1();
        List<Integer> numeros = Arrays.asList();
        Double expected = 0.0;

        //Action
        Double result = mediaCinco.calcularMedia(numeros);

        //Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testInverterPalavraAbacate(){
        //Arrange
        Exercicios1 inverter = new Exercicios1();
        String palavra = "abacate";
        String expected = "etacaba";

        //Action
        String result = inverter.obterPalavraInvertida(palavra);

        //Arranjo
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testInverterPalavraBanana(){
        //Arrange
        Exercicios1 inverter = new Exercicios1();
        String palavra = "banana";
        String expected = "ananab";

        //Action
        String result = inverter.obterPalavraInvertida(palavra);

        //Arranjo
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testInverterPalavraPessego(){
        //Arrange
        Exercicios1 inverter = new Exercicios1();
        String palavra = "pessego";
        String expected = "ogessep";

        //Action
        String result = inverter.obterPalavraInvertida(palavra);

        //Arranjo
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testInverterPalavraMorango(){
        //Arrange
        Exercicios1 inverter = new Exercicios1();
        String palavra = "morango";
        String expected = "ognarom";

        //Action
        String result = inverter.obterPalavraInvertida(palavra);

        //Arranjo
        Assertions.assertEquals(expected, result);
    }


}
