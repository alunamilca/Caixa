package br.com.camiolli.caixaeletronico.services;

import repository.MemoriaContaRepository;

import java.util.Scanner;

public class ExecutaComandoEspecificoImpl implements ExecutaComandoEspecifico {
    private final Saque saque;
    private final Deposito deposito;
    private final AbrirConta abrirConta;
    private final Transferencia transferencia;

    public ExecutaComandoEspecificoImpl() {
        MemoriaContaRepository repository = new MemoriaContaRepository();

        this.deposito = new DepositoImpl(repository);//Perguntar pra o professor sobre (Deposito)
        this.saque = new SaqueImpl(repository);
        this.abrirConta = new AbrirContaImpl(repository);
        this.transferencia = new TransferenciaImpl(repository);

    }

    @Override // sobrepor o método da Interface
    public boolean execute(int comando) {
        Scanner entrada = new Scanner(System.in);
        boolean resultado = true;
        if (comando == 0) {
            System.out.println("Operação finalizada!");
            resultado = false;

        } else if (comando == 1) {
            System.out.println("Digite sua conta!");
            int numero = entrada.nextInt();

            System.out.println("Digite o valor a ser sacado:");
            double valor = entrada.nextInt();

            this.saque.execute(valor, numero);
            System.out.println("Saque realizado com Sucesso!");


        } else if (comando == 2) {
            System.out.println("Digite sua conta");
            int numero = entrada.nextInt();

            System.out.println("Digite o valor a ser depositado:");
            double valor = entrada.nextInt();

            this.deposito.execute(valor, numero);
            System.out.println("Deposito realizado com Sucesso!");


        } else if (comando == 3) {
            abrirConta.execute();

        } else if (comando == 4) {
            transferencia.execute();

            System.out.println("Digite sua conta");
            int numero = entrada.nextInt();

            System.out.println("Digite o valor a ser Transferido:");
            double valor = entrada.nextInt();

            System.out.println("Digite a conta de Destino");
            entrada.nextInt();

            this.transferencia.execute(valor, numero);
            System.out.println("Transferencia realizada com Sucesso!");


        } else {
            System.out.println("Opção inválido!");

        }
        return resultado;
    }
}



