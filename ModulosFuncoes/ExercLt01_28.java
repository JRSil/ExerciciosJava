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
        Double atual;
        venda = Integer.parseInt(JOptionPane.showInputDialog("Digite a média de vendas mensais:"));
        atual = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor atual do produto:"));
        System.out.println("Valor novo: "+valorVenda(venda, atual));
    }
    
    static Double valorVenda(int media, Double atualPr){
        Double novo;
        if((media < 500)&&(atualPr < 30)){
            novo = atualPr + (atualPr * 0.1);
        }
        else if(((media >= 500)&&(media < 1000))&&((atualPr >= 30)&&(atualPr < 80))){
            novo = atualPr + (atualPr * 0.15);
        }
        else if((media >= 1000)&&(atualPr >= 80)){
            novo = atualPr - (atualPr * 0.05);
        }
        else{
            novo = atualPr;
        }
        return novo;
    }
}
