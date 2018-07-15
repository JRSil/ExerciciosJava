/*
    Nome do programa : ExercLt01_12
    Objetivo: Receber o ano de nascimento e o ano atual. Calcular, mostrar a sua idade 
              e quantos anos terá daqui a 17 anos
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 25/02/2018
 */
import javax.swing.JOptionPane;
public class ExercLt01_12 {
    public static void main (String args[]){
        int nasc, atual, idade, futuro;
        nasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento:"));
        atual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual:"));
        idade = atual - nasc;
        futuro = idade + 17;
        System.out.println("Idade atual é: "+idade+"\nDaqui a 17 anos terá: "+futuro+"\n");
    }
}
