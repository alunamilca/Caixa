package br.com.camiolli.caixaeletronico.services;

import br.com.camiolli.caixaeletronico.model.Conta;

public interface Transferencia {

    double transferir (double valor, Conta destino, Conta origem);

    void execute(double valor, int numero);

    void execute();
}

