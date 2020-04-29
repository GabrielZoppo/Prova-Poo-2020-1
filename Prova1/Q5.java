package Prova1;
import java.util.Scanner;
import Prova1.classes.*;
public class Q5 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Banco b = new Banco("Banrisul");
        int o = 0;

while (o != 6) {
switch (sc.nextInt()) {
    case 1:
        System.out.println("Insira o nome do cliente: ");
        String nome = sc.next();
        System.out.println("Insira o email do cliente: ");
        String email = sc.next();
        System.out.println("Insira o cpf: ");
        String cpf = sc.next();
        Cliente c = new Cliente(nome, email);
        System.out.println("Insira o numero da agência: ");
        String numeroAg = sc.next();
        System.out.println("Insira o numero da conta: ");
        String numeroCc = sc.next();
        ContaCorrente cc = new ContaCorrente(numeroAg, numeroCc, c);
        b.adicionaConta(cc);
        break;

    case 2:
        System.out.println("Insira o index da conta que queres remover: ");
        b.removeConta(sc.nextInt());
        break;

    case 3:
        System.out.println("Insira o index da conta: ");
        int index = sc.nextInt();
        System.out.println("\nInsira o valor a ser depositado: \n");
        b.depositar(index, sc.nextDouble());
        break;

    case 4:
        System.out.println("Insira o index da conta: ");
        int i = sc.nextInt();
        System.out.println("Insira o valor a ser sacado: ");
        b.sacar(i, sc.nextDouble());
        break;

    case 5:
        System.out.println(b);
        break;
    
    case 6:
    o = 6;
    sc.close();
    break;
  
 
        }
    }
}
}