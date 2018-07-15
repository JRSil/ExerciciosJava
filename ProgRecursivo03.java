/*
    Nome do programa : ProgRecursivo03
    Objetivo: Coletar um nº positivo inteiro. Calcular e mostrar o resultado.
              Série 1 -> 1/n + 1/n-1 + ... + 1/1
              Série 2 -> n! + (n-1)! + ... + 1!
              Série 3 -> 1/n! + 2/(n-1)! + ... + n/1!
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 22/03/2018
 */
import javax.swing.JOptionPane;
public class ProgRecursivo03 {
    public static void main (String args[]){
        int op;
        Double num, soma = 0.0;
        op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada:"));
        num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número inteiro:"));
        switch(op){
            case 1:
                System.out.println(funcSerie1(num));
                break;
            case 2:
                for(Double i = num; i >= 1; i--){
                    soma += funcSerie2(i);
                }
                System.out.println(soma);
                break;
            case 3:
                Double j = 1.0;
                for(Double i = num; i >= 1; i--){
                    soma += funcSerie3(i, j);
                    j++;
                }
                System.out.println(soma);
                break;
        }
    }
    
    static Double funcSerie1(Double n){
        Double soma;
        if(n == 1){
            return 1.0;
        }else{
            soma = (1/n) + (funcSerie1(n - 1));
            return soma;
        }
    }
    
    static Double funcSerie2(Double num){
        Double soma;
        if(num == 1){
            return 1.0;
        }else{
            soma = (num * funcSerie2(num - 1));
            return soma;
        }
    }
    
    static Double funcSerie3(Double n1, Double n2){
        Double soma;
        if(n1 == 1){
            return n2 / 1.0;
        }else{
            soma = (n2 / (n1 * funcSerie2(n1 - 1)));
            return soma;
        }
    }
}
