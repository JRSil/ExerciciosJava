/*
    Nome do programa : ExercLt01_30
    Objetivo: Receba a data de nascimento e atual em ano, mês e dia. Calcule e mostre a
              idade em anos, meses e dias, considerando os anos bissextos.
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 03/04/2018
 */
import javax.swing.JOptionPane;
public class ExercLt01_30 {
    static int diaN, mesN, anoN, diaAt, mesAt, anoAt, dia = 0, mes, ano;
    public static void main (String args[]){
        diaN = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia de nascimento:"));
        mesN = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês de nascimento:"));
        anoN = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento:"));
        diaAt = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia atual:"));
        mesAt = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês atual:"));
        anoAt = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual:"));
        
        tempoVida();
        
        System.out.println("Idade: "+ano+" ano(s), "+mes+" mes(es) e "+dia+" dia(s).");
    }
    
    static void tempoVida(){
        if(mesN > mesAt){
            ano = (anoAt - anoN) - 1;
            mes = ((12 - mesN) + mesAt);
            if(diaAt < diaN){
                mes--;
            }
        }else{
            ano = anoAt - anoN;
            mes = mesAt - mesN;
            if(diaAt < diaN){
                mes--;
            }
        }
        
        if(diaN < diaAt){
            dia = diaAt - diaN;
        }else{
            if((mesAt == 1)||(mesAt == 5)||(mesAt == 7)||(mesAt == 8)||(mesAt == 10)||(mesAt == 12)){
                dia = (30 - diaN) + diaAt;
            }else if((mesAt == 3)||(mesAt == 4)||(mesAt == 6)||(mesAt == 9)||(mesAt == 11)){
                dia = (31 - diaN) + diaAt;
            }else if(mesAt == 2){
                if(anoAt % 4 == 0){
                    dia = (29 - diaN) + diaAt;
                }else{
                    dia = (28 - diaN) + diaAt;
                }
            }
        }
    }
}
