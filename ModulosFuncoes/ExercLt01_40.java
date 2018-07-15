/*
    Nome do programa : ExercLt01_40
    Objetivo: Receba 2 números inteiros. Verifique e mostre todos os números primos
              existentes entre eles.
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 01/03/2018
 */
import javax.swing.JOptionPane;
public class ExercLt01_40 {
    static int n1, n2;
    public static void main (String args[]){
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro diferente:"));
        procPrimo();
    }
    
    static void procPrimo(){
        if(n1 < n2){
            for(int i = n1 + 1; i < n2; i++){
                int primo = 0;
                for(int j = 1; j <= i; j++){
                    if(i % j == 0){
                        primo++;
                    }
                }
                if(primo == 2){
                    System.out.println(i);
                }
            }
        }else{
            for(int i = n2 + 1; i < n1; i++){
                int primo = 0;
                for(int j = 1; j <= i; j++){
                    if(i % j == 0){
                        primo++;
                    }
                }
                if(primo == 2){
                    System.out.println(i);
                }
            }
        }
    }
}
