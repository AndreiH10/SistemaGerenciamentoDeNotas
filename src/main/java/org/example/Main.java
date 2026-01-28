package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Map<String, List<Double>> alunos = new HashMap<>();

        List<Double> notasAndrei = new ArrayList<>();
        notasAndrei.add(10.0);
        notasAndrei.add(8.5);
        notasAndrei.add(9.2);
        notasAndrei.add(6.5);
        alunos.put("Andrei",notasAndrei);

        List<Double> notasAdriel = new ArrayList<>();
        notasAdriel.add(10.0);
        notasAdriel.add(10.0);
        notasAdriel.add(10.0);
        notasAdriel.add(10.0);
        alunos.put("Adriel",notasAdriel);

        List<Double> notasAline = new ArrayList<>();
        notasAline.add(7.0);
        notasAline.add(7.0);
        notasAline.add(7.0);
        notasAline.add(7.0);
        alunos.put("Aline",notasAline);


    }
}
