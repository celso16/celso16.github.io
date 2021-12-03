package com.company;

public class Main {

    public static void main(String[] args) {
        Calculadora c1= new Calculadora();
        c1.display = false;
        c1.botões = 10;
        c1.pilhas = 100;
        c1.status();
        c1.calcular();
    }
}
