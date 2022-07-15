package br.com.camiolli.caixaeletronico.services;

import br.com.camiolli.caixaeletronico.model.Conta;
import repository.MemoriaContaRepository;

public class TransferenciaImpl implements Transferencia {
    private final MemoriaContaRepository repository;
    public TransferenciaImpl(MemoriaContaRepository repository) {

        this.repository = repository;
    }

    @Override
    public double transferir(double valor, Conta destino, Conta origem) {
        Conta conta = new Conta();
        conta = repository.findByld(conta.getNumeroDaConta());
        conta.retirarSaldo(valor);
        System.out.println("Transferencia sendo realizada" + valor);
        conta.retirarSaldo(valor);
        System.out.println("Numero da Conta é:" + conta);
        System.out.printf("Transferencia realizada com sucesso! Seu saldo atual é de R$ %.2f %n", conta.getSaldo());
        return valor;

    }

    @Override
    public void execute(double valor, int numero) {

    }

    @Override
    public void execute() {

    }

}



