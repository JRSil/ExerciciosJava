/*
    Nome do programa : ExercLt01_26
    Objetivo: Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo
              do menor.
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 28/02/2018
 */
import javax.swing.JOptionPane;
public class ExercLt01_26 {
    static int a, b, mod;
    public static void main (String args[]){
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite outro valor inteiro:"));
        procedureMult();
    }
    
    static void procedureMult(){
        if(a >= b){
            mod = a % b;
            if(mod == 0){
                System.out.println(a+" é múltiplo de "+b);
            }
            else{
                System.out.println(a+" não é múltiplo de "+b);
            }
        }
        else{
            mod = b % a;
            if(mod == 0){
                System.out.println(b+" é múltiplo de "+a);
            }
            else{
                System.out.println(b+" não é múltiplo de "+a);
            }
        }
    }
}
