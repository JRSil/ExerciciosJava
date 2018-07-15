/*
    Nome do programa : ExercLt01_24
    Objetivo: Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 28/02/2018
 */
import javax.swing.JOptionPane;
public class ExercLt01_24 {
    public static void main (String args[]){
        int valor, mod2, mod3;
        valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro:"));
        mod2 = valor % 2;
        mod3 = valor % 3;
        if(mod2==0){
            if(mod3==0){
                System.out.println("Valor divisível por 2 e 3");
            }
            else{
                System.out.println("Valor divisível apenas por 2");
            }
        }
        else if(mod3 == 0){
            System.out.println("Valor divisível apenas por 3");
        }
        else{
            System.out.println("Valor não divisível");
        }
    }
}
