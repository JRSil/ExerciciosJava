/*
    Nome do programa : ExercLt01_42
    Objetivo: Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 01/03/2018
 */
public class ExercLt01_42 {
    public static void main (String args[]){
        int i, j = 1;
        for(i = 1; i <= 50; i++){
            if(i == 50){
                System.out.print(i+"/"+j);
            }else{
                System.out.print(i+"/"+j+" + ");
            }
            j += 2;
        }
    }
}
