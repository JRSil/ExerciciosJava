/*
    Nome do programa : ExercLt1_09
    Objetivo: Receber 2 números reais.
              Calcular e apresentar a diferença.
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 22/02/2018
 */
import javax.swing.JOptionPane;
public class ExercLt1_10 {
    public static void main (String args[]){
        Double x, y, sub;
        x = Double.parseDouble(JOptionPane.showInputDialog("Digite o maior valor:"));
        y = Double.parseDouble(JOptionPane.showInputDialog("Digite o menor valor:"));
        sub = x - y;
        System.out.println("A diferença entre os dois é "+sub);
    }
}
