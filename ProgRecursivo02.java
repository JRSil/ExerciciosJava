/*
    Nome do programa : ProgRecursivo02
    Objetivo: Calcular a soma dos 100 nºs positivos.(1+2+3+...+100)
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 22/03/2018
 */
public class ProgRecursivo02 {
    public static void main (String args[]){
        int num = 1;
        System.out.println(funcSoma(num));
    }
    
    static int funcSoma(int num){
        int soma;
        if(num == 100){
            return 100;
        }else{
            soma = num + funcSoma(num + 1);
            return soma;
        }
    }
}
