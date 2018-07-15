/*
    Nome do programa : ExercLt01_Vt12
    Objetivo: Carregar códigos das peças em um tabuleiro de xadrez, onde:
              Calcular e mostrar a soma das peças do tabuleiro.
              Não pode utilizar estrutura de decisão e Escolha Caso na contagem das peças
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 30/03/2018
 */
import javax.swing.JOptionPane;
public class ExercLt01_Vt12 {
    public static void main (String args[]){
        int i, j;
        int cont[] = new int[7];
        int tab[][] = new int[8][8];
        
        for(i = 0; i < 8; i++){
            for(j = 0; j < 8; j++){
                tab[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da peça:"));
                //\nPosição = linha "+i+" coluna"+j
            }
        }
        
        for(i = 0; i < 7; i++){
            cont[i] = 0;
        }
        
        for(i = 0; i < 8; i++){
            for(j = 0; j < 8; j++){
                cont[tab[i][j]] += 1;
            }
        }
        
        for(i = 0; i < 7; i++){
            System.out.println("Peça #"+i+": "+cont[i]);
        }
    }
}
