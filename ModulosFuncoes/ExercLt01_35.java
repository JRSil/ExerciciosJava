/*
    Nome do programa : ExercLt01_35
    Objetivo: Receba 2 números inteiros, verifique qual o maior entre eles. Calcule e
              mostre o resultado da somatória dos números ímpares entre esses valores.
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 01/03/2018
 */
import javax.swing.JOptionPane;
public class ExercLt01_35 {
    public static void main (String args[]){
        int n1, n2;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro:"));
        System.out.println("Soma = "+somaImpar(n1,n2));
    }
    
    static int somaImpar(int a, int b){
        int soma = 0;
        if(a >= b){
            for(int i = a; i >= b; i--){
                if(i % 2 == 1){
                    soma += i;
                }
            }
        }
        else{
            for(int i = b; i >= a; i--){
                if(i % 2 == 1){
                    soma += i;
                }
            }
        }
        return soma;
    }
}
