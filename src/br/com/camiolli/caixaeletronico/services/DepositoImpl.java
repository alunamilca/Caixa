package br.com.camiolli.caixaeletronico.services;

import br.com.camiolli.caixaeletronico.model.Conta;
import repository.MemoriaContaRepository;

public class DepositoImpl implements Deposito {
    private final MemoriaContaRepository repository;

    public DepositoImpl(MemoriaContaRepository repository) {
        this.repository = repository;
    }

    @Override
        public double execute(double valor, int numeroDaConta){
        Conta conta;

        conta = repository.findByld(numeroDaConta);
        conta.adicionarSaldo(valor);

            System.out.println("Estou depositando " + valor);//Implementação da interface
            System.out.println("Numero da conta é:"+ numeroDaConta);//Implementação da interface
        System.out.printf("Seu saldo atual é de R$ é %.2f %n" ,conta.getSaldo());
        return valor;





    }

}

