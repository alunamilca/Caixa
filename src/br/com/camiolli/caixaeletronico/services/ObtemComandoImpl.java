package br.com.camiolli.caixaeletronico.services;


import java.util.Scanner;

public class ObtemComandoImpl implements ObtemComando {

        @Override // sobrepoe o método da Interface
        public int execute(){
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite a operação desejada:");
            System.out.println(); // apenas para pular linha
            int comando = entrada.nextInt(); // entrada do usuário
            return comando;
        }
    }

