/*
    Nome do programa : ExercLt01_41
    Objetivo: Mostre todas as possibilidades de 2 dados de forma que a soma tenha como
              resultado 7.
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 01/03/2018
 */
public class ExercLt01_41 {
    static int d1, d2, soma;
    public static void main (String args[]){
        possibDado();
    }
    
    static void possibDado(){
        for(d1 = 1; d1 <= 6; d1++){
            for(d2 = 1; d2 <= 6; d2++){
                soma = d1 + d2;
                if(soma == 7){
                    System.out.println(d1+" + "+d2+" = "+soma);
                }
            }
        }
    }
}
