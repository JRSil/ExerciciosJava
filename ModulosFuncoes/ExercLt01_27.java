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
        Double circ, min, km;
        int voltas;
        voltas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de voltas:"));
        circ = Double.parseDouble(JOptionPane.showInputDialog("Digite a extensão do circuito(metros):"));
        min = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de duração(minutos):"));
        System.out.println("A velocidade média foi de: "+functionVel(voltas, circ, min)+"km/h.");
    }
    
    static Double functionVel(int volta, Double circuito, Double minuto){
        Double hora, kilomt, vel;
        hora = minuto / 60;
        kilomt = circuito / 1000;
        vel = (kilomt * volta) / hora;
        return vel;
    }
}
