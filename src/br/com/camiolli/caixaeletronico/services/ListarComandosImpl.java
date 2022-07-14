package br.com.camiolli.caixaeletronico.services;

public class ListarComandosImpl implements ListarComandos {


    @Override // sobrepor o método da Interface
    public void execute(){
        System.out.println("Escolha uma operação:");
        System.out.println("0 - Sair");
        System.out.println("1 - Saque");
        System.out.println("2 - Depósito");
        System.out.println("3 - Conta");
        System.out.println("4 - Transferencia");
    }

}

