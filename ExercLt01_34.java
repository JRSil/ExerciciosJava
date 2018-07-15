/*
    Nome do programa : ExercLt01_34
    Objetivo: Receba um número. Calcule e mostre os resultados da tabuada desse número.
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 01/03/2018
 */
import javax.swing.JOptionPane;
public class ExercLt01_34 {
    public static void main (String args[]){
        int num, total;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        for(int i = 1; i <= 10; i++){
            total = num * i;
            System.out.println(num+" x "+i+" = "+total);
        }
    }
}
