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
        base = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da base:"));
        ex = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do expoente:"));
        System.out.println(funcPot(base, ex));
    }
    
    static int funcPot(int base, int ex){
        int pot;
        pot = (int)Math.pow(base, ex);
        return pot;
    }
}
