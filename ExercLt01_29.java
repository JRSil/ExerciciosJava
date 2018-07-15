/*
    Nome do programa : ExercLt01_29
    Objetivo: Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do
              investimento. Calcule e mostre o valor corrigido em 30 dias sabendo que a
              poupança = 3% e a renda fixa = 5%. Demais tipos não serão considerados
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 01/03/2018
 */
import javax.swing.JOptionPane;
public class ExercLt01_29 {
    public static void main (String args[]){
        int tipo;
        Double valor, poup, renda;
        tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo de investimento:"));
        valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento:"));
        switch(tipo){
            case 1:
                poup = valor + (valor * 0.03);
                System.out.println("Investimento após 30 dias: "+poup);
                break;
            case 2:
                renda = valor + (valor * 0.05);
                System.out.println("Investimento após 30 dias: "+renda);
                break;
        }
    }
}
