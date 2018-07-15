/*
    Nome do programa : ExercLt01_Vt05
    Objetivo: Criar e coletar em um vetor [20] inteiro. Calcule e exiba, segundo:
                10
                ∑ (A[1] – A[21–1])
                i = 1
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 30/03/2018
 */
import javax.swing.JOptionPane;
public class ExercLt01_Vt05 {
    public static void main (String args[]){
        int qt = 20, soma = 0, i;
        int vt[] = new int[qt];
        
        for(i = 0; i < qt; i++){
            vt[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        }
        
        for(i = 0; i < 10; i++){
            soma += (vt[i] - vt[(qt - 1) - i]);
        }
        
        System.out.println("Soma: "+soma);
    }
}
