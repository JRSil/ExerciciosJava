/*
    Nome do programa : ExercLt01_21
    Objetivo: Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética.
              Mostre a mensagem de acordo com a média:
              a. Se a média for >= 6,0 exibir “APROVADO”;
              b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
              c. Se a média for < 3,0 exibir “RETIDO”.
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 25/02/2018
 */
import javax.swing.JOptionPane;
public class ExercLt01_21 {
    public static void main (String args[]){
        Double n1, n2, n3, n4, media;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1:"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2:"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 3:"));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 4:"));
        media = (n1+n2+n3+n4) / 4;
        if (media >= 6){
            System.out.println("Média = "+media+"\nAPROVADO");
        }
        else if ((media < 6)&&(media >= 3)){
            System.out.println("Média = "+media+"\nEXAME");
        }
        else{
            System.out.println("Média = "+media+"\nRETIDO");
        }
    }
}
