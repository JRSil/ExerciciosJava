/*
    Nome do programa : ExercLt01_20
    Objetivo: Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula
              AX²+BX+C=0. Verifique e mostre a existência de raízes reais e se caso
              exista, calcule e mostre.
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 25/02/2018
 */
import javax.swing.JOptionPane;
public class ExercLt01_20 {
    static int a,b,c;
    static Double delta, raiz, raiz2;
    public static void main (String args[]){
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de a (ax²+bx+c):"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de b ("+a+"x²+bx+c):"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de c ("+a+"x²+"+b+"x+c):"));
        procedureRaiz();
    }
    
    static void procedureRaiz(){
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
