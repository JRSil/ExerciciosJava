/*
    Nome do programa : Sistema de trânsito - Principal
    Objetivo: Construir um sistema de trânsito
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 24/05/2018
 */
import javax.swing.JOptionPane;
public class Principal {
    public static void main(String[] args) {
        int op = 0, qtd = 15;
        
        Estatistica[] est = new Estatistica[qtd];
        
        ClasseMetodos m = new ClasseMetodos();
        
        while(op != 9){
            JOptionPane.showMessageDialog
              (null, "1- Cadastrar Estatística/n2-Consulta por tipo de veículo/n3-Consulta por quantidade de acidentes/n4-Consulta todas as cidades/n5-Consulta maior e menor média/n9-Finaliza");
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a opção desejada:"));
            switch(op){
                case 1:
                    est = m.fCadastra(est,qtd);
                    break;
                case 2:
                    m.pTipo(est, qtd);
                    break;
                case 3:
                    m.pQtdAcidentes(est, qtd);
                    break;
                case 4:
                    m.pConsultaAcidentes(est, qtd);
                    break;
                case 5:
                    int escolha = 0;
                    while(escolha != 9){
                        JOptionPane.showMessageDialog
              (null, "1- Por menor número de acidentes/n2- Por maior número de acidentes/n3- Cidades com Quantidade de acidentes acima da média das 5 cidades./n9-Finaliza");
                        escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada:"));
                        switch(escolha){
                            case 1:
                                m.pMenor(est, qtd);
                                break;
                            case 2:
                                m.pMaior(est, qtd);
                                break;
                            case 3:
                                pAcimaMedia(est, qtd);
                                break;
                            case 9:
                                JOptionPane.showMessageDialog(null, "FIM");
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
