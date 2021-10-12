package com.carlaospa.padroesdeprojetos.strategy;

public class ComportamentoDefensivo implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Movendo-se defensivamante ...");
    }
}
