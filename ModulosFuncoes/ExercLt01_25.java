/*
    Nome do programa : ExercLt01_25
    Objetivo: Receba a hora de início e de final de um jogo (HH,MM) sabendo que o
              tempo máximo é de 24 horas e pode começar num dia e terminar noutro.
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 03/04/2018
 */
import javax.swing.JOptionPane;
public class ExercLt01_25 {
    public static void main (String args[]){
        Double hi, hf, part;
        hi = Double.parseDouble(JOptionPane.showInputDialog("Digite a hora de início:"));
        hf = Double.parseDouble(JOptionPane.showInputDialog("Digite a hora final:"));
        
        part = funcPart(hi, hf);
        
        if(part <= 24.0){
            System.out.println("Tempo de jogo: "+part);
        }else{
            System.out.println("Tempo máximo ultrapassado");
        }
    }
    
    static Double funcPart(Double hi, Double hf){
        Double part;
        if(hi<hf){
            part = hf - hi;
        }else{
            part = (24.0 - hi) + hf;
        }
        return part;
    }
}
