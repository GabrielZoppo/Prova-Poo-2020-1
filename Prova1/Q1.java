package Prova1;
import javax.swing.JOptionPane;
import Prova1.classes.*;
public class Q1 {
    public static void main(String[] args) throws Exception {
        String nome = JOptionPane.showInputDialog("Digite o nome: ");
        String cpf = JOptionPane.showInputDialog("Digite o CPF: ");
        String email = JOptionPane.showInputDialog("Digite o email:" );
        Cliente c = new Cliente(nome,email,cpf);
      
        System.out.println(c);
    }
}