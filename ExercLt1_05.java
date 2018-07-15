/*
    Nome do programa : ExercLt1_05
    Objetivo: Receber a temperatura em graus Celsius. Calcular  
              e apresentar o resultado em Farenheit.
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 22/02/2018
 */
import javax.swing.JOptionPane;
public class ExercLt1_05 {
    public static void main (String args[]){
        int a,b,c;
        Double delta, raiz, raiz2;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de a (ax²+bx+c):"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de b ("+a+"x²+bx+c):"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de c ("+a+"x²+"+b+"x+c):"));
        delta = Math.pow(b,2)-4*a*c;
        if(delta > 0){
            raiz = ((-1*b)+(Math.sqrt(delta)))/2*a;
            raiz2 = ((-1*b)-(Math.sqrt(delta)))/2*a;
            System.out.println("Resultado é:"+raiz+" e "+raiz2);
        }
        else if(delta == 0){
            raiz = ((-1*b)+(Math.sqrt(delta)))/2*a;
            System.out.println("Resultado é:"+raiz);
        }
        else{
            System.out.println("Resultado inexistente entre os reais.");
        }
    }
}
