/*
    Nome do programa : ExercLt01_45
    Objetivo: Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 01/03/2018
 */
public class ExercLt01_45 {
    public static void main (String args[]){
        int x;
        for(int i = 1; i <= 15; i++){
            x = i*i;
            if((i == 1)||(i == 3)){
                System.out.print(i+"/"+x+" - ");
            }else if(i == 15){
                System.out.print(i+"/"+x+".");
            }else{
                System.out.print(i+"/"+x+" + ");
            }
        }
    }
}
