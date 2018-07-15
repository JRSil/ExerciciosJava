/*
    Nome do programa : ExercLt01_23
    Objetivo: Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não
              necessariamente em ordem. Mostre os 4 números em ordem crescente.
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 25/02/2018
 */
import javax.swing.JOptionPane;
public class ExercLt01_23 {
    static int a, b, c, x;
    public static void main (String args[]){
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro maior que o primeiro:"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro maior que o segundo:"));
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro aleatório diferente:"));
        procedureOrdem();
    }
    
    static void procedureOrdem(){
        if (c > x){
            if (b > x){
                if (a > x){
                    System.out.println(x+", "+a+", "+b+", "+c);
                }
                else{
                    System.out.println(a+", "+x+", "+b+", "+c);
                }
            }
            else{
                System.out.println(a+", "+b+", "+x+", "+c);
            }
        }
        else{
            System.out.println(a+", "+b+", "+c+", "+x);
        }
    }
}