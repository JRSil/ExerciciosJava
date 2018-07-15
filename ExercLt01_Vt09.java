/*
    Nome do programa : ExercLt01_Vt09
    Objetivo: Criar e carregar uma matriz [4][4] com valores aleatórios, sendo que a
              diagonal principal terá seus dados carregados no programa segundo:
              | 1 |   |    |    |
              |   | 4 |    |    |
              |   |   | 16 |    |
              |   |   |    | 64 |
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 30/03/2018
 */
import javax.swing.JOptionPane;
public class ExercLt01_Vt09 {
    public static void main (String args[]){
        int i, j;
        Double m[][] = new Double[4][4];
        for(i = 0; i < 4; i++){
            for(j = 0; j < 4; j++){
                if(i == j){
                    m[i][j] = Math.pow(4, i);
                }else{
                    m[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));
                }
            }
        }
    }
}
