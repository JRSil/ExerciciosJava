/*
    Nome do programa : ExercLt1_07
    Objetivo: Receber os valores do comprimento, largura e altura de um paralelepípedo.
              Calcular e apresentar o resultado invertido.
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 22/02/2018
 */
import javax.swing.JOptionPane;
public class ExercLt1_07 {
    public static void main (String args[]){
        int comp, larg, alt, vol;
        comp = Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento:"));
        larg = Integer.parseInt(JOptionPane.showInputDialog("Digite a largura:"));
        alt = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura:"));
        vol = comp * larg * alt;
        System.out.println("O volume é: "+vol);
    }
}
