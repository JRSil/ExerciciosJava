/*
    Nome do programa : ExercLt01_43
    Objetivo: Calcule e mostre quantos anos serão necessários para que Ana seja maior que
              Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m
              e cresce 2 cm ao ano.
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 01/03/2018
 */
public class ExercLt01_43 {
    public static void main (String args[]){
        Double ana = 1.10, maria = 1.50;
        int ano = 0;
        while(ana < maria){
            ana += 0.03;
            maria += 0.02;
            ano++;
        }
        System.out.println(ano+" anos.");
    }
}
