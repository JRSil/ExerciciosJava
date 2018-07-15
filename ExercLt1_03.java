/*
    Nome do programa : ExercLt1_03
    Objetivo: Receba a base e a altura de um triângulo. Calcular 
              e apresentar o resultado.
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 22/02/2018
 */
import javax.swing.JOptionPane;
public class ExercLt1_03 {
    public static void main (String args[]){
        int base, altura, area;
        base = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base:"));
        altura = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura:"));
        area = (base*altura)/2;
        System.out.println("A área deste triângulo é igual a:"+area);
    }
}
