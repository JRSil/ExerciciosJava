/*
    Nome do programa : ExercLt01_17
    Objetivo: Calcule a quantidade de litros gastos em uma viagem, sabendo que o
              automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 25/02/2018
 */
import javax.swing.JOptionPane;
public class ExercLt01_17 {
    static Double vel, tempo, deslocamento, litros;
    public static void main (String args[]){
        vel = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade média(km/h):"));
        tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de percurso(em h):"));
        procedureLitros();
        System.out.printf("A quantidade de litros foi: %.1f",litros);
    }
    
    static void procedureLitros(){
        deslocamento = vel * tempo;
        litros = deslocamento / 12;
    }
}
