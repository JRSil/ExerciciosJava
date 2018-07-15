/*
    Nome do programa : Sistema de Contas Correntes - Principal
    Objetivo: Construir um sistema de contas correntes
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 07/06/2018
 */
import javax.swing.JOptionPane;
public class Principal {
    public static void main(String[] args) {
        int op = 0, qtdCC = 5, qtdM = 10;
        
        ContasCorrentes[] cc = new ContasCorrentes[qtdCC];
        MovContas[] mov = new MovContas[qtdM];
        ContasAtual[] ca = new ContasAtual[qtdCC];
        
        while(op != 9){
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção:"));
            switch(op){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 9:
                    System.out.println("FIM");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}
