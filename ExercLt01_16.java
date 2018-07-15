/*
    Nome do programa : ExercLt01_16
    Objetivo: Receba a quantidade de horas trabalhadas, o valor por hora, o percentual
              de desconto e o número de descendentes. Calcule o salário que serão as
              horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário
              Bruto – desconto). A cada dependente será acrescido R$ 100 no Salário
              Líquido. Exiba o salário a receber.
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 25/02/2018
 */
import javax.swing.JOptionPane;
public class ExercLt01_16 {
    public static void main (String args[]){
        int horaT,desc;
        Double valor, perc, desconto, salB, salL, total;
        horaT = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas:"));
        valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por hora:"));
        perc = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de desconto:"));
        desc = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de descendentes:"));
        salB = horaT * valor;
        perc = perc / 100;
        desconto = salB * perc;
        salL = salB - desconto;
        total = salL + (desc * 100);
        System.out.println("Salário a receber: "+total);
    }
}
