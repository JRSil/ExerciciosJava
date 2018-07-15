/*
    Nome do programa : ExercLt01_39
    Objetivo: Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
              Casa: 1 2 3 4 ... 64
               Qte: 1 2 4 8 ... N
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 01/03/2018
 */
public class ExercLt01_39 {
    public static void main (String args[]){
        Double qtd = 1.0, soma = 0.0;
        for(int i = 0; i < 64; i++){
            qtd = Math.pow(2, i);
            soma += qtd;
        }
        System.out.println("Quantidade de grãos: "+soma);
    }
}
