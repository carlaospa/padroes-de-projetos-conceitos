package com.carlaospa.padroesdeprojetos.facade;

import com.carlaospa.padroesdeprojetos.subsistema1.CrmService;
import com.carlaospa.padroesdeprojetos.subsistema2.CepApi;

public class Facade {

    public void migrarcliente(String nome, String cep){

        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estaco = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estaco);

    }
}
