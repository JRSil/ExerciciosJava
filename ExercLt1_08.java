/*
    Nome do programa : ExercLt1_08
    Objetivo: Receber o valor de depósito com redimento de 1,3%.
              Calcular e apresentar o resultado.
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 22/02/2018
 */
import javax.swing.JOptionPane;
public class ExercLt1_08 {
    public static void main (String args[]){
        int mes;
        Double taxa, valor;
        
        valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito:"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de meses na poupança:"));
        for(int i = 0; i < mes; i++){
            valor *= 1.013;
        }
        System.out.printf("Após "+mes+" meses, o valor ficou em: %.2f\n",valor);
    }
}
