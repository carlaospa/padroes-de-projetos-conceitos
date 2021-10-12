package com.carlaospa.padroesdeprojetos.strategy;

public class ComportamentoAgressivo implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Movendo-se agressivamente ...");
    }
}
