/*
    Nome do programa : ExercLt01_44
    Objetivo: Receba o número da base e do expoente. Calcule e mostre o valor da
              potência
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 01/03/2018
 */
import javax.swing.JOptionPane;
public class ExercLt01_44 {
    public static void main (String args[]){
        int base, ex;
        Double pot;
        base = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da base:"));
        ex = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do expoente:"));
        pot = Math.pow(base, ex);
        System.out.println(pot);
    }
}
