/*
    Nome do programa : ExercLt01_22
    Objetivo: Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem
              crescente.
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 25/02/2018
 */
import javax.swing.JOptionPane;
public class ExercLt01_22 {
    static int a,b;
    public static void main (String args[]){
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro diferente:"));
        procedureOrdem();
    }
    
    static void procedureOrdem(){
        if (a >= b){
            System.out.println(b+", "+a);
        }
        else{
            System.out.println(a+", "+b);
        }
    }
}