package com.teste.teste.entity;

public class Calculadora {

    public int soma(int a, int b) {
        int result = a+b;
        return result;
    }

    public int subtrair(int a, int b) {
        int result = a-b;
        return result;
    }

    public int multiplicar(int a, int b) {
        int result = a*b;
        return result;
    }

    public double dividir(int a, int b) {
        double result = 0.0;
        if(b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida");
        } else {
            result = a/b;
        }
        return result;
    }

    public double potencia(int a, int b) {
        double result = Math.pow(a,b);
        return result;
    }

    public double raizQuadrada(int a) {
        double result = 0.0;
        if(a < 0) {
            throw new IllegalArgumentException("Raiz quadrada não deve ser negativo");
        }
        result = Math.sqrt(a);
        return result;
    }

    public long fatorial(int a) {
        long result = 1;
        for(int i = 1; i <= a; i++) {
            result *= i;
        }
        return result;
    }

    public double media(int[] valores) {
        if (valores.length == 0) throw new IllegalArgumentException("A lista não pode estar vazia");
        int soma = 0;
        for(int i = 0; i < valores.length; i++) {
            soma += valores[i];
        }
        double media = (double) soma/ valores.length;
        return media;
    }

    public boolean primo(int a) {
        if (a < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int somaDigitos(int a) {
            int result = 0;
            a = Math.abs(a);

            while (a > 0) {
                result += a % 10;
                a /= 10;
            }
            return result;
    }
}
