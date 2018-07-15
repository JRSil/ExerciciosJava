/*
    Nome do programa : ExercLt01_Vt11
    Objetivo: Criar uma matriz [8][8] inteiro e o programa irá carregar segundo:
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 30/03/2018
 */
public class ExercLt01_Vt11 {
    public static void main (String args[]){
        int i, j, x;
        int m[][] = new int[8][8];
        for(x = 1; x <= 4; x++){
            for(i = x; i <= (8 - x); i++){
                for(j = x; j <= (8 - x); j++){
                    m[i][j] = x;
                }
            }
        }
    }
}
