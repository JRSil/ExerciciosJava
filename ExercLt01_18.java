/*
    Nome do programa : ExercLt01_18
    Objetivo: Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do
              maior pelo menos valor.
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 25/02/2018
 */
import javax.swing.JOptionPane;
public class ExercLt01_18 {
    public static void main (String args[]){
        int a, b, sub;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro (a):"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite outro valor inteiro (b):"));
        if(a >= b){
            sub = a - b;
            System.out.println("O valor maior a:"+a+" - o menor b:"+b+" = "+sub);
        }
        else{
            sub = b - a;
            System.out.println("O valor maior b:"+b+" - o menor a:"+a+" = "+sub);
        }
    }
}
