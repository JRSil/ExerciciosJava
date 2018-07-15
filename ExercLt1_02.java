/*
    Nome do programa : ExercLt1_02
    Objetivo: Coletar o valor do salário, calcular seu reajuste 
              e apresentar o resultado.
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 22/02/2018
 */

import javax.swing.JOptionPane;
public class ExercLt1_02{   
   public static void main (String args [ ])
     {
       Double SalarioReceber,SalarioReajuste;
       SalarioReceber = Double.parseDouble(JOptionPane.showInputDialog("DIGITE UM SALÁRIO "));
       SalarioReajuste  = SalarioReceber * 1.15;
      JOptionPane.showMessageDialog(null,"SALÁRIO COM REAJUSTE  "+ SalarioReajuste);
    } 
} 

