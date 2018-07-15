/*
    Nome do programa : ExercLt01_31
    Objetivo: Calcule e mostre o quadrado dos números entre 10 e 150.
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 01/03/2018
 */
public class ExercLt01_31 {
    static Double quad;
    public static void main (String args[]){
        procedureQuad();
    }
    
    static void procedureQuad(){
        for(int i = 10; i <= 150; i++){
            quad = Math.pow(i, 2);
            System.out.println(i+"² = "+quad+"\n");
        }
    }
}
