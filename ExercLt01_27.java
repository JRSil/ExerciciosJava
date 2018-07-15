/*
    Nome do programa : ExercLt01_26
    Objetivo: Receba o número de voltas, a extensão do circuito (em metros) e o tempo de
              duração (minutos). Calcule e mostre a velocidade média em km/h.
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 01/03/2018
 */
import javax.swing.JOptionPane;
public class ExercLt01_27 {
    public static void main (String args[]){
        Double circ, min, hora, km, vel;
        int voltas;
        voltas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de voltas:"));
        circ = Double.parseDouble(JOptionPane.showInputDialog("Digite a extensão do circuito(metros):"));
        min = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de duração(minutos):"));
        hora = min / 60;
        km = circ / 1000;
        vel = (km * voltas) / hora;
        System.out.println("A velocidade média foi de: "+vel+"km/h.");
    }
}
