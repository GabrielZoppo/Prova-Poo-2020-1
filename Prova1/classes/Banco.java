package Prova1.classes;

import java.util.ArrayList;

public class Banco{
private String nomeBanco;
private int tamanhoContas;
ArrayList<ContaCorrente> contas;

public Banco(String nomeBanco){
    this.nomeBanco = nomeBanco;
    this.contas = new ArrayList<ContaCorrente>();
    }
    public String getNomeBanco(){
        return this.nomeBanco;
    }
    public void adicionaConta(ContaCorrente contacorrente){
        contas.add(contacorrente);
        tamanhoContas = tamanhoContas + 1;
        
    }
    public void removeConta(int index) {
        this.contas.remove(index);
    }
    public void depositar(int index, double valor){
        this.contas.get(index).Depositar(valor);
    }

    public void sacar(int index, double valor){
        this.contas.get(index).Sacar(valor);
        }

        public int totalDeContas(){
        return tamanhoContas;
        }


@Override
        public String toString(){
            String banco = this.nomeBanco;
            int i = 0;
            for (ContaCorrente c : this.contas) {
                banco = banco + i + c.toString() + "\n";
                i++;
        }
        return banco;
}
}