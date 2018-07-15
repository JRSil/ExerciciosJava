/*
    Nome do programa : ExercLt01_17
    Objetivo: Calcule a quantidade de litros gastos em uma viagem, sabendo que o
              automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 25/02/2018
 */
import javax.swing.JOptionPane;
public class ExercLt01_17 {
    public static void main (String args[]){
        Double vel, tempo, deslocamento, litros;
        vel = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade média(km/h):"));
        tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de percurso(em h):"));
        deslocamento = vel * tempo;
        litros = deslocamento / 12;
        System.out.printf("A quantidade de litros foi: %.1f",litros);
    }
}
