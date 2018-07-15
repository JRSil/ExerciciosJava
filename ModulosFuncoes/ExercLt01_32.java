/*
    Nome do programa : ExercLt01_32
    Objetivo: Receba um número inteiro. Calcule e mostre o seu fatorial.
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 01/03/2018
 */
import javax.swing.JOptionPane;
public class ExercLt01_32 {
    public static void main (String args[]){
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        System.out.println("Fatorial = "+funcFat(num));
    }
    
    static int funcFat(int n){
        int fat = 1;
        for(int i = n; i > 1; i--){
            fat = fat * i;
        }
        return fat;
    }
}
