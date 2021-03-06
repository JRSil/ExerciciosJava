/*
    Nome do programa : ExercLt01_36
    Objetivo: Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 01/03/2018
 */
import javax.swing.JOptionPane;
public class ExercLt01_36 {
    public static void main (String args[]){
        int n, fat;
        Double total = 1.0;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        System.out.printf("1 + ");
        for(int i = 1; i <= n; i++){
            fat = 1;
            for(int j = i; j > 1; j--){
                fat *= j;
            }
            total += 1/(double)fat;
            if(i == n){
                System.out.printf("1/"+i+"!.\n");
            }
            else{
                System.out.printf("1/"+i+"! + ");
            }
        }
        System.out.println("Total = "+total);
    }
}
