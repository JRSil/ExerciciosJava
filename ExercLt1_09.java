/*
    Nome do programa : ExercLt1_09
    Objetivo: Receber 2 números inteiros.
              Calcular e apresentar a soma dos quadrados.
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 22/02/2018
 */
import javax.swing.JOptionPane;
public class ExercLt1_09 {
    public static void main (String args[]){
        int x,y;
        Double soma;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de x:"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de y:"));
        soma = Math.pow(x, 2)+Math.pow(y, 2);
        System.out.println("Soma = "+soma);
    }
}
