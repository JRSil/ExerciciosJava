/*
    Nome do programa : ExercLt1_04
    Objetivo: Receber a temperatura em graus Celsius. Calcular  
              e apresentar o resultado em Farenheit.
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 22/02/2018
 */
import javax.swing.JOptionPane;
public class ExercLt1_04 {
    public static void main (String args[]){
        Double celsius, farenheit;
        celsius = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura(°C):"));
        farenheit = (9*celsius+160)/5;
        System.out.println(farenheit+"°F");;
    }
}
