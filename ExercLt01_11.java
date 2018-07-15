/*
    Nome do programa : ExercLt01_11
    Objetivo: Receber o raio de uma circunferência.
              Calcular o comprimento e apresentar resultado.
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 25/02/2018
 */
import javax.swing.JOptionPane;
public class ExercLt01_11 {
    public static void main (String args[]){
        Double raio,comp;
        raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio:"));
        comp = 2 * 3.14 * raio;
        System.out.printf("O valor do comprimento da circunferência é: %.2f\n",comp);
    }
}
