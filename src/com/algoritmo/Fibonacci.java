package com.algoritmo;

public class Fibonacci {
    private int limite;
    private int[] fibonacci;

    Fibonacci (int limite) {
        this.limite = limite;
        fibonacci = new int[limite];
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite (int limite) {
        this.limite = limite;
    }

    public int[] getFibonacci() {
        for (int i = 0; i<fibonacci.length; i++){
            fibonacci[i] = getPosicion(i);
        }
        return fibonacci;
    }

    int getPosicion (int n) {
        if (n>1) {
            return getPosicion (n-1) + getPosicion (n-2);
        }
        else if (n == 1) {
            return 1;
        }
        else {
            return 0;
        }
    }



}
