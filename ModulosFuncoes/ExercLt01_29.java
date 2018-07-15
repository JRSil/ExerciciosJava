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
        System.out.println("Investimento após 30 dias: "+poupOuRenda(tipo, valor));
    }
    
    static Double poupOuRenda(int escolha, Double din){
        Double dinFinal = 0.0;
        switch(escolha){
            case 1:
                dinFinal = din + (din * 0.03);
                break;
            case 2:
                dinFinal = din + (din * 0.05);
                break;
            default:
                System.out.println("Valor Inválido!");
                break;
        }
        return dinFinal;
    }
}
