package br.com.camiolli.caixaeletronico.services;

import br.com.camiolli.caixaeletronico.model.Conta;
import repository.MemoriaContaRepository;

public class AbrirContaImpl implements AbrirConta{
    private final MemoriaContaRepository repository;
    public AbrirContaImpl(MemoriaContaRepository repository) {
        this.repository = repository;
    }

    @Override
    public Conta execute() {
        Conta conta;

        conta = new Conta();


        repository.adiciona(conta);

        System.out.printf("Conta Numero %d seu saldo é de R$ %.2f %n" , conta.getNumeroDaConta(),conta.getSaldo());
        return conta;
    }
}
