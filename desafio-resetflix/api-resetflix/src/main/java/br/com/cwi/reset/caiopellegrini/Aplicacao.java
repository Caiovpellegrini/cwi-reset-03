package br.com.cwi.reset.caiopellegrini;

import br.com.cwi.reset.caiopellegrini.models.Ator;
import br.com.cwi.reset.caiopellegrini.models.StatusCarreira;
import br.com.cwi.reset.caiopellegrini.request.AtorRequest;
import br.com.cwi.reset.caiopellegrini.service.AtorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@SpringBootApplication

public class Aplicacao {

    public static void main(String[] args) {
        SpringApplication.run(Aplicacao.class, args);
    }
}