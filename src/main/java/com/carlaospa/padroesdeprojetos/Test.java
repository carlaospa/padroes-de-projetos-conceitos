package com.carlaospa.padroesdeprojetos;

import com.carlaospa.padroesdeprojetos.facade.Facade;
import com.carlaospa.padroesdeprojetos.singleton.SingletonEager;
import com.carlaospa.padroesdeprojetos.singleton.SingletonLazy;
import com.carlaospa.padroesdeprojetos.singleton.SingletonLazyHolder;
import com.carlaospa.padroesdeprojetos.strategy.*;

public class Test {
    public static void main(String[] args) {

        // Testes relacionados ao Design Pattern Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        // Testes relacionados ao Design Pattern Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento defensivo = new ComportamentoDefensivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();

        // Facade

        Facade facade = new Facade();
        facade.migrarcliente("Carlos Alberto", "28915160");


    }
}
