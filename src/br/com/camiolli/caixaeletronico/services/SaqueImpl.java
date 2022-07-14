package br.com.camiolli.caixaeletronico.services;

import br.com.camiolli.caixaeletronico.model.Conta;
import repository.MemoriaContaRepository;

public class SaqueImpl implements Saque {

    private final MemoriaContaRepository repository;

    public SaqueImpl(MemoriaContaRepository repository) {

        this.repository = repository;
    }

    @Override
    public double execute(double valor, int numeroDaConta){
        Conta conta;
        conta = repository.findByld(numeroDaConta);
        conta.retirarSaldo(valor);
        System.out.println("Saque sendo realizado" + valor);
        System.out.println("Numero da conta é:" + numeroDaConta);
        System.out.printf("Seu saldo atual é de R$ é %.2f %n" ,conta.getSaldo());
        return valor;
    }
}




