/*
    Nome do programa : ExercLt1_06
    Objetivo: Receber valor de x e y e apresentar o resultado invertido.
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 22/02/2018
 */
import javax.swing.JOptionPane;
public class ExercLt1_06 {
    public static void main (String args[]){
        int x,y,sub;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de x:"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de y:"));
        System.out.println("Inicialmente:\nx="+x+"\ny="+y);
        sub = x;
        x = y;
        y = sub;
        System.out.println("\nTroca:\n\nx="+x+"\ny="+y);
    }
}
