package br.com.alura.screenmatch;

import java.util.Arrays;
import java.util.List;

public class Testest {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        numeros.stream().map(n -> n * 2).forEach(System.out::println);

    }
}
