/*
    Nome do programa : CaixaEletronico
    Objetivo: Criar um menu de opções:
                Menu Principal
                1 – Carregar Notas
                2 – Retirar Notas
                3 – Estatística
                9 – Fim
1.1. Carregar a quantidade de notas em uma área da memória com 6 ocorrências.
1.2. Solicitar que o cliente faça a retirada de valores obedecendo ao critério do
maior pelo menor.
1.3. Dar a opção para o cliente escolher o valor e a quantidade de notas. P. ex.: 1 x
20, 2 x 10...
1.4. Caso não tenha o valor da maior cédula, disponibilizar a próxima.
1.5. Se o valor a ser solicitado for maior que o saldo total do caixa, enviar a
mensagem “EXCEDEU O LIMITE DO CAIXA”.
1.6. Solicitar até 100 retiradas ou até não haver mais notas
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 05/04/2018
 */

import javax.swing.JOptionPane;
import java.util.*;

public class CaixaEletronico {
    static int escolhaBanco = 4, totalSaque = 0, totalCaixa = 0, subTotais, contador = 0;
    static int saque[] = new int[6];
    
    static Stack bb = new Stack();
    static Stack santander = new Stack();
    static Stack itau = new Stack();
    static Stack caixa = new Stack();
    
    public static void main (String args[]){
        int op = 0;
        int notas[] = new int[6];
        while(op != 9){
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada:"));
            switch(op){
                case 1:
                    notas = carregaNotas(notas);
                    calculaTotal(notas);
                    break;
                case 2:
                    retiraNotas(notas);
                    break;
                case 3:
                    estatistica();
                    break;
                case 9:
                    System.out.println("FIM");
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA");
                    break;
            }
        }
    }
    
    static int[] carregaNotas(int notas[]){
        int i;
        for(i = 0; i < 6; i++){
            notas[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de notas de R$"+valorNota(i)+":"));
        }
        return notas;
    }
    
    static void calculaTotal(int notas[]){
        int i;
        for(i = 0; i < 6; i++){
            totalCaixa += (notas[i] * valorNota(i));
        }
        subTotais = totalCaixa;
    }
    
    static void retiraNotas(int notas[]){
        int i, j;
        boolean limite = false;
        
        if((subTotais > 0)||(contador > 100)){
            escolhaBanco = Integer.parseInt(JOptionPane.showInputDialog
                ("Digite o número do seu banco:\n0 - Banco do Brasil\n1 - Santander\n2 - Itaú\n3 - Caixa Econômica"));
        
            for(j = 5; j >= 0; j--){
                while(limite != true){
                    saque[j] = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de notas de R$"+valorNota(j)+":"));
                    if(notas[j] < saque[j]){
                        if((saque[j] * valorNota(j)) < subTotais){
                            saque[j] = notas[j];
                            JOptionPane.showMessageDialog(null, "Apenas temos "+saque[j]+" notas de R$"+valorNota(j)+".\nPegue o restante da próxima nota.");
                            notas[j] -= saque[j];
                            subTotais -= (saque[j] * valorNota(j));
                            totalSaque += (saque[j] * valorNota(j));
                            limite = true;
                        }else{
                            JOptionPane.showMessageDialog(null, "Excedeu o limite do caixa!");
                        }
                    }else{
                        notas[j] -= saque[j];
                        subTotais -= (saque[j] * valorNota(j));
                        totalSaque += (saque[j] * valorNota(j));
                        limite = true;
                    }
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Excedeu o limite do caixa!");
        }
        contador++;
        contadorSaques();
    }
    
    static int valorNota(int i){
        int valor = 0;
        switch(i){
            case 0:
                valor = 2;
                break;
            case 1:
                valor = 5;
                break;
            case 2:
                valor = 10;
                break;
            case 3:
                valor = 20;
                break;
            case 4:
                valor = 50;
                break;
            case 5:
                valor = 100;
                break;
        }
        return valor;
    }
    
    static void contadorSaques(){
        int i = 0;
        switch(escolhaBanco){
            case 0:
                bb.push(totalSaque);
                break;
            case 1:
                santander.push(totalSaque);
                break;
            case 2:
                itau.push(totalSaque);
                break;
            case 3:
                caixa.push(totalSaque);
                break;
        }
    }
}