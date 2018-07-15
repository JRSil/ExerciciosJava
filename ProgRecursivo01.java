/*
    Nome do programa : ProgRecursivo01
    Objetivo: Fatorial
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 22/03/2018
 */
import javax.swing.JOptionPane;
public class ProgRecursivo01 {
    public static void main (String args[]){
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        System.out.println(funcFat(num));
    }
    
    static int funcFat(int num){
        int fat;
        if(num == 1){
            return 1;
        }else{
            fat = num * funcFat(num - 1);
            return fat;
        }
    }
}
