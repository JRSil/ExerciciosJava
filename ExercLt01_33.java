/*
    Nome do programa : ExercLt01_33
    Objetivo: Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 01/03/2018
 */
import javax.swing.JOptionPane;
public class ExercLt01_33 {
    public static void main (String args[]){
        int n;
        Double total = 0.0;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        for(int i = 1; i <= n; i++){
            total += (1/(double)i);
            if(i == n){
                System.out.printf("1/"+i+".\n");
            }
            else{
                System.out.printf("1/"+i+" + ");
            }
        }
        System.out.println("Total = "+total);
    }
}
