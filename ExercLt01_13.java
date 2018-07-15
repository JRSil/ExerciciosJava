/*
    Nome do programa : ExercLt01_13
    Objetivo: Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias
              durará esse alimento sabendo que a pessoa consome 50g ao dia.
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 25/02/2018
 */
import javax.swing.JOptionPane;
public class ExercLt01_13 {
    public static void main (String args[]){
        Double alimento, dias;
        alimento = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de alimento(em kg):"));
        dias = alimento / 0.05;
        System.out.println("O alimento durará "+dias+" dia(s).");
    }
}
