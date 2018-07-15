/*
    Nome do programa : ExercLt1_01
    Objetivo: Coletar o valor do lado de um quadrado, calcular sua área 
              e apresentar o resultado.
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 15/02/2018

 */
import javax.swing.JOptionPane;
public class ExercLt1_01
{    
   public static void main (String args [ ])
     {
       int Lado,Area;
       Lado = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UM  VALOR DO LADO"));
       Area = (Lado * Lado);
      JOptionPane.showMessageDialog(null,"A AREA DO QUADRADO "+Area);
    } 
} 

