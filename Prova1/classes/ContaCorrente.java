package Prova1.classes;

public class ContaCorrente {
    private String numAgencia;
    private String numConta;
    private Cliente cliente;
    private double saldo = 0;
        
    public ContaCorrente(String numAgencia, String numConta, Cliente cliente){
    this.numAgencia = numAgencia;
    this.numConta = numConta;
    this.cliente = cliente;
    }
        protected  boolean Sacar(double valor){

           if(this.saldo < valor){
            return false;
           }
           else{
               
               this.saldo = this.saldo - valor;
               return true;
           }
        }
           protected  boolean Depositar(double valor){

            if(valor < 0 ){
             return false;
            }
            else{
                
                this.saldo = this.saldo + valor;
                return true;

           }
        }
           public double getSaldo(){
            return this.saldo;
        }
        @Override
        public String toString(){
            return this.cliente + "\n" + "número da agencia:" + this.numAgencia + "\n" + "número da conta:" + this.numConta + "\n" + "saldo:" + this.saldo;
        }
    }