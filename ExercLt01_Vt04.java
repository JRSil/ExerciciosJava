/*
    Nome do programa : ExercLt01_Vt04
    Objetivo: Criar e coletar em um vetor [30] real e calcular e exibir:
                a. A média do grupo;
                b. A quantidade de notas acima do grupo;
                c. As posições dos valores abaixo da média do grupo.
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 29/03/2018
 */
import javax.swing.JOptionPane;
public class ExercLt01_Vt04 {
    public static void main (String args[]){
        int qtd = 5, cont = 0, i;
        Double media = 0.0;
        Double vt[] = new Double[qtd];
        
        for(i = 0; i < qtd; i++){
            vt[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor real:"));
            media += vt[i];
        }
        
        media /= qtd;
        System.out.println("Média: "+media);
        
        for(i = 0; i < qtd; i++){
            if(vt[i] >= media){
                cont++;
            }else{
                System.out.println("O aluno da posição "+i+" tirou "+vt[i]);
            }
        }
        System.out.println("Quantidade de notas acima: "+cont);
    }
}
