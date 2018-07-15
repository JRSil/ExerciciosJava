/*
    Nome do programa : ExercLt01_14
    Objetivo: Receber 2 ângulos de um triângulo. Calcular e mostrar o valor do 3º ângulo.
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 25/02/2018
 */
import javax.swing.JOptionPane;
public class ExercLt01_14 {
    public static void main (String args[]){
        int ang1, ang2, ang3;
        ang1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro ângulo:"));
        ang2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do segundo ângulo:"));
        ang3 = 180 - (ang1+ang2);
        System.out.println("O valor do terceiro ângulo é: "+ang3);
    }
}
