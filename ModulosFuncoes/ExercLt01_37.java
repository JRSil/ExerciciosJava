/*
    Nome do programa : ExercLt01_37
    Objetivo: Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu
              N’nésimo termo.
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 01/03/2018
 */
import javax.swing.JOptionPane;
public class ExercLt01_37 {
    static int n, n2 = 0, total, soma = 0;
    public static void main (String args[]){
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        total = n;
        procFibonacci();
        System.out.println("Total da série: "+soma);
    }
    
    static void procFibonacci(){
        for(int i = 1; i <= 11; i++){
            n = total;
            total = n + n2;
            if(i == 11){
                System.out.println(n+" + "+n2+" = "+total+".\n");
            }
            else{
                System.out.println(n+" + "+n2+" = "+total+",");
            }
            n2 = n;
            soma += total;
        }
    }
}
