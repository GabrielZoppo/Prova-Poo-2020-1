package Prova1;
import javax.swing.JOptionPane;
import Prova1.classes.*;
public class Q2 {
    public static void main(String[] args) throws Exception {
        String numAgencia = JOptionPane.showInputDialog("Digite o número da agencia: ");
        String numConta = JOptionPane.showInputDialog("Digite o número da conta: ");
        String nome = JOptionPane.showInputDialog("Digite o nome do cliente:" );
        String email = JOptionPane.showInputDialog("Digite o email do cliente:" );
        String cpf = JOptionPane.showInputDialog("Digite o cpf do cliente:" );
        Cliente c = new Cliente(nome,email,cpf);
        ContaCorrente cc = new ContaCorrente(numAgencia,numConta,c);
      
        System.out.println(cc);
    }
}