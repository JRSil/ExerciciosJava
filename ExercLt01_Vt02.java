/*
    Nome do programa : ExercLt01_Vt02
    Objetivo: Criar e coletar um vetor [100] inteiro e exibir:
                a. O maior e o menor valor;
                b. A média dos valores.
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 29/03/2018
 */
import javax.swing.JOptionPane;
public class ExercLt01_Vt02 {
    public static void main (String args[]){
        int qtd = 100, maior = 0, menor = 0, i;
        Double media = 0.0;
        int vt[] = new int[qtd];
        
        for(i = 0; i < qtd; i++){
            vt[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro:"));
        }
        
        for(i = 0; i < qtd; i++){
            media += vt[i];
            if(i == 0){
                maior = vt[i];
                menor = vt[i];
            }else{
                if(vt[i] > maior){
                    maior = vt[i];
                }else if(vt[i] < menor){
                    menor = vt[i];
                }
            }
        }
        
        media /= qtd;
        System.out.println("Média: "+media);
        System.out.println("Maior: "+maior);
        System.out.println("Menor: "+menor);
    }
}
