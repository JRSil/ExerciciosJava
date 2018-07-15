/*
    Nome do programa : ExercLt01_18
    Objetivo: Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do
              maior pelo menos valor.
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 25/02/2018
 */
import javax.swing.JOptionPane;
public class ExercLt01_18 {
    static int a, b, sub;
    public static void main (String args[]){
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro (a):"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite outro valor inteiro (b):"));
        procedureSub();
        System.out.println(sub);
    }
    
    static void procedureSub(){
        if(a >= b){
            sub = a - b;
        }
        else{
            sub = b - a;
        }
    }
}