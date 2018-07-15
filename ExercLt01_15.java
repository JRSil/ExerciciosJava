/*
    Nome do programa : ExercLt01_15
    Objetivo: Receba os valores de 2 catetos de um triângulo retângulo. 
              Calcule e mostre a hipotenusa.
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 25/02/2018
 */
import javax.swing.JOptionPane;
public class ExercLt01_15 {
    public static void main (String args[]){
        int catAd, catOp;
        Double hipo;
        catAd = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do cateto adjacente:"));
        catOp = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do cateto oposto:"));
        hipo = Math.sqrt(Math.pow(catAd, 2) + Math.pow(catOp, 2));
        System.out.println("Hipotenusa = "+hipo);
    }
}
