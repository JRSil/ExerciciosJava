/*
    Nome do programa : ExercLt01_Vt03
    Objetivo: Criar e coletar valores inteiros nos vetores VT1[3] e VT2[3]. Concatenar
              esses valores em um 3º vetor (VT3[6]) e mostrar os seus dados. P. ex:
              VT1| 1| 2| 3| |VT2| 4| 5| 6| |VT3| 1| 2| 3| 4| 5| 6
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 29/03/2018
 */
import javax.swing.JOptionPane;
public class ExercLt01_Vt03 {
    public static void main (String args[]){
        int v1[] = new int[3];
        int v2[] = new int[3];
        int v3[] = new int[6];
        
        int i;
        
        for(i = 0; i < 3; i++){
            v1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro:"));
        }
        
        for(i = 0; i < 3; i++){
            v2[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro:"));
        }
        
        for(i = 0; i < 6; i++){
            if(i <= 2){
                v3[i] = v1[i];
            }else{
                v3[i] = v2[i - 3];
            }
            System.out.println(v3[i]);
        }
    }
}
