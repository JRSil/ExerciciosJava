/*
    Nome do programa : ExercLt01_Vt08
    Objetivo: Criar e carregar uma matriz [4][3] inteiro com quantidade de produtos
              vendidos em 4 semanas. Calcular e exibir:
                a. A quantidade de cada produto vendido no mês;
                b. A quantidade de produtos vendidos por semana;
                c. O total de produtos vendidos no mês.
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 30/03/2018
 */
import javax.swing.JOptionPane;
public class ExercLt01_Vt08 {
    public static void main (String args[]){
        int tot = 0, i, j;
        int qtdMes[] = new int[3];
        int qtdSem[] = new int[4];
        int m[][] = new int[4][3];
        
        for(i = 0; i < 4; i++){
            for(j = 0; j < 3; j++){
                m[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade:"));
                qtdMes[j] += m[i][j];
                tot += m[i][j];
                qtdSem[i] += m[i][j];
            }
        }
    }
}
