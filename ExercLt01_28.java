/*
    Nome do programa : ExercLt01_28
    Objetivo: Receba o preço atual e a média mensal de um produto. Calcule e mostre o
              novo preço sabendo que:
              Venda Mensal      Preço Atual      Preço Novo
                < 500               < 30            + 10%
            >= 500 e < 1000     >= 30 e < 80         +15%
                >= 1000             >= 80            - 5%
              Obs.: para outras condições, preço novo será igual ao preço atual.
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 01/03/2018
 */
import javax.swing.JOptionPane;
public class ExercLt01_28 {
    public static void main (String args[]){
        int venda;
        Double atual, novo;
        venda = Integer.parseInt(JOptionPane.showInputDialog("Digite a média de vendas mensais:"));
        atual = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor atual do produto:"));
        if((venda < 500)&&(atual < 30)){
            novo = atual + (atual * 0.1);
            System.out.println("Valor novo: "+novo);
        }
        else if(((venda >= 500)&&(venda < 1000))&&((atual >= 30)&&(atual < 80))){
            novo = atual + (atual * 0.15);
            System.out.println("Valor novo: "+novo);
        }
        else if((venda >= 1000)&&(atual >= 80)){
            novo = atual - (atual * 0.05);
            System.out.println("Valor novo: "+novo);
        }
        else{
            novo = atual;
            System.out.println("Valor novo: "+novo);
        }
    }
}
