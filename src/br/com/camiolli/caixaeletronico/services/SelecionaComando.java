package br.com.camiolli.caixaeletronico.services;
//0 -> sair
//1 -> saque
//2 -> deposito

public class SelecionaComando {
    private final ListarComandos listarComandos;
    private final ObtemComando obtemComando;
    private final ExecutaComandoEspecifico executaComandoEspecifico;
    public SelecionaComando() { //Executor
        this.listarComandos = new ListarComandosImpl();//Executor
        this.obtemComando = new ObtemComandoImpl();//Executor
        this.executaComandoEspecifico = new ExecutaComandoEspecificoImpl();//Executor
    }
    public boolean executar() {
        listarComandos.execute();
        int comando = obtemComando.execute();
        return executaComandoEspecifico.execute(comando);
    }
}










