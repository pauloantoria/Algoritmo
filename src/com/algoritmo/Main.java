package com.algoritmo;

public class Main {

    public static void main(String[] args) {
       Primo nprimo = new Primo(20);
       var nprimos = nprimo.getPrimos();
       System.out.println ("Los primeros 20 números primos son:");
       for (int i = 0; i < nprimos.length; i++) System.out.print (nprimos[i] + ", ");
       System.out.println ("");


       Fibonacci nfibonacci = new Fibonacci(20);
       var nfibonaccii = nfibonacci.getFibonacci();
       System.out.println("Y los primeros 20 números de la sucesión de Fibonacci son:");
       for (var elfibonacci : nfibonaccii) System.out.print (elfibonacci + ", ");
    }
}