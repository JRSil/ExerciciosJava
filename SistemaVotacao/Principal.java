/*
    Nome do programa : Sistema de Votação - Principal
    Objetivo: Construir um sistema de votação
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 31/05/2018
 */
import java.io.IOException;
import javax.swing.JOptionPane;
public class Principal {
    public static void main(String[] args) throws IOException {
        int op = 0, escolha, qtd = 100;
        
        Votacao[] vot = new Votacao[qtd];
        
        ClasseMetodos m = new ClasseMetodos();
        
        while(op != 9){
            JOptionPane.showMessageDialog
              (null, "1- Carregar seção/número candidato/n2-Classificar por seção/n3-Gravar registros/n4-Mostrar indicadores/n9-Finaliza");
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a opção desejada:"));
            switch(op){
                case 1:
                    vot = m.fCadastra(vot, qtd);
                    break;
                case 2:
                    vot = m.fClassificaSecao(vot, qtd);
                    break;
                case 3:
                    m.fGrava(vot, qtd);
                    break;
                case 4:
                    escolha = 0;
                    while(escolha != 9){
                        JOptionPane.showMessageDialog
                      (null, "1- Quantidade de eleitores por seção/n2- Seção com maior e menor número de eleitores/n3- Quantidade de votos por candidato/n4- Exibir os 10 candidatos mais votados e suas quantidades/n9-Finaliza");
                        escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada:"));
                        switch(escolha){
                            case 1:
                                m.pEleitores(vot, qtd);
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 9:
                                JOptionPane.showMessageDialog(null, "Voltando para o primeiro menu");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opção Inválida!");
                                break;
                        }
                    }
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "FIM");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida!");
                    break;
            }
        }
    }
}
