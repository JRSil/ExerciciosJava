/*
    Nome do programa : ExercLt01_Vt01
    Objetivo: Criar e coletar um vetor [50] inteiro. Calcular e exibir:
                a. A média dos valores entre 10 e 200;
                b. A soma dos números ímpares.
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 29/03/2018
 */
import javax.swing.JOptionPane;
public class ExercLt01_Vt01 {
    public static void main (String args[]){
        int vt[] = new int[5];
        int soma = 0, cont = 0;
        Double media = 0.0;
        for(int i = 0; i < 5; i++){
            vt[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
            if(vt[i] % 2 == 1){
                soma += vt[i];
            }
            if((vt[i] >= 10)&&(vt[i] <= 200)){
                media += vt[i];
                cont++;
            }
        }
        media /= cont;
        System.out.println("Média: "+media);
        System.out.println("Soma: "+soma);
    }
}
