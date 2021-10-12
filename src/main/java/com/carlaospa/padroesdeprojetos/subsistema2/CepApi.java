package com.carlaospa.padroesdeprojetos.subsistema2;

import com.carlaospa.padroesdeprojetos.singleton.SingletonEager;

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia(){
        return instancia;
    }

    public String recuperarCidade(String ce){
        return "São Pedro";
    }

    public String recuperarEstado(String ce){
        return "RJ";
    }

}
