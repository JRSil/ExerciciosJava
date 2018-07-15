/*
    Nome do programa : ExercLt01_Vt11
    Objetivo: Criar uma matriz [8][8] inteiro e o programa irá carregar segundo:
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 30/03/2018
 */
public class ExercLt01_Vt10 {
    public static void main (String args[]){
        int i, j, cont = 0;
        int m[][] = new int[8][8];
        for(i = 0; i < 8; i++){
            for(j = 0; j < 8; j++){
                m[i][j] = (int)Math.pow(2, cont);
                cont++;
            }
        }
    }
}
