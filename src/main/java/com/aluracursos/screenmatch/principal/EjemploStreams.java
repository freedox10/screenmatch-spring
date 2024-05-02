package com.aluracursos.screenmatch.principal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploStreams {
    public void mnuestraEjemplo(){
        List<String> nombres = Arrays.asList("Brenda","Luis","Maria Fernanda","Eric","Genesys");

        nombres.stream()
                .sorted()
                .limit(4)
                .filter(n->n.startsWith("B"))
                .map(n->n.toUpperCase())
                .forEach(System.out::println);
    }

}
