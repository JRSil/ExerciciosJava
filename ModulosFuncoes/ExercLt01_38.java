/*
    Nome do programa : ExercLt01_38
    Objetivo: Receba 100 números inteiros reais. Verifique e mostre o maior e o menos
              valor. Obs.: somente valores positivos.
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 01/03/2018
 */
import javax.swing.JOptionPane;
public class ExercLt01_38 {
    static int num, maior = 0, menor = 0, quant;
    public static void main (String args[]){
        quant = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade:"));
        pegaNum();
        System.out.println("O maior número é "+maior+"\nO menor número é "+menor);
    }
    
    static void pegaNum(){
        for(int i = 0; i < quant; i++){
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
            if(i == 0){
                menor = num;
            }
            if(num > maior){
                maior = num;
            }else{
                if(num < menor){
                    menor = num;
                }
            }
        }
    }
}
