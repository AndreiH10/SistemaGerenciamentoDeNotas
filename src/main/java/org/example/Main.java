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

        alunos.put("Andrei", new ArrayList<>(List.of(10.0, 9.5, 8.0, 6.5)));
        alunos.put("Adriel", new ArrayList<>(List.of(10.0, 10.0, 10.0, 10.0)));
        alunos.put("Aline", new ArrayList<>(List.of(7.0, 6.5, 8.0, 9.5)));

        for (Map.Entry<String, List<Double>> entry : alunos.entrySet()){
            String nome = entry.getKey();
            List<Double> notas = entry.getValue();

            try {

            }catch (){

            }
        }
    }
}
