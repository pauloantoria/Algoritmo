package com.algoritmo;

public class Primo{

    private int limite;
    private int[] primos;


    Primo (int limite){
        this.limite = limite;
    }
    public int getLimite(){return limite;}

    public void setLimite(int limite) {this.limite = limite;}

    public boolean isPrimo(int num){
        if(num == 0 || num ==1){
            return false;
        }else if (num == 2){
            return true;
        }

        else {
            double raiz = Math.sqrt(num);
            int [] rango = getRango(num);
            for (int i=0; i<rango.length; i++){
                if(rango[i] != 0 && num%rango[i] == 0){
                    return false;
                }
            }
            return true;
        }
    }

    private int[ ] getRango (int limite){
        int[] rango = new int [limite];
        for (int i=2;i<limite;i++)rango[i] = i;
        return rango;
    }
    public int[] getPrimos() {
        primos = new int[limite];
        int countPrimos = 0;
        int i = 0;
        while (countPrimos < limite){
            i++;
            if(isPrimo(i)){
                primos[countPrimos] = i;
                countPrimos++;
            }
        }
        return primos;
    }
}