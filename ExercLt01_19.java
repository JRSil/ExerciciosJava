/*
    Nome do programa : ExercLt01_19
    Objetivo: Receba 2 valores reais. Calcule e mostre o maior deles.
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 25/02/2018
 */
import javax.swing.JOptionPane;
public class ExercLt01_19 {
    public static void main (String args[]){
        Double a, b;
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor real (a):"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite outro valor real (b):"));
        if(a >= b){
            System.out.println("O maior valor é "+a);
        }
        else{
            System.out.println("O maior valor é "+b);
        }
    }
}
