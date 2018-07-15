/*
    Nome do programa : Sistema de trânsito - ClasseMetodos
    Objetivo: Aqui ficam todos os métodos do sistema de trânsito
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 24/05/2018
 */
import javax.swing.JOptionPane;
public class ClasseMetodos {
    public Estatistica[] fCadastra(Estatistica[] est, int qtd){
        for(int i=0;i < qtd; i++){
            est[i] = new Estatistica();
        }
        
        for(int i=0;i < qtd; i++){
            est[i].codCidade = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da cidade:"));
            est[i].nomeCidade = JOptionPane.showInputDialog("Digite o nome da cidade:");
            est[i].qtdAcidentes = Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade de acidentes:"));
            est[i].tipoVeiculo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo do veículo:"));
        }
        
        return est;
    }
    
    public void pTipo(Estatistica[] est, int qtd){
        int tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo de veículo que deseja buscar:"));
        for(int i = 0; i < qtd; i++){
            if(est[i].tipoVeiculo == tipo){
                System.out.println(est[i].codCidade+" - "+est[i].nomeCidade+" - "+est[i].qtdAcidentes+" - "+est[i].tipoVeiculo);
            }
        }
    }
    
    public void pQtdAcidentes(Estatistica[] est, int qtd){
        Estatistica[] aux = new Estatistica[1];
        
        for(int i=0;i < 1; i++){
            aux[i] = new Estatistica();
        }
        
        for(int i = 0; i < qtd - 1; i++){
            for(int j = i+1; j < qtd; j++){
                if(est[j].qtdAcidentes < est[i].qtdAcidentes){
                    est[i] = aux[0];
                    est[i] = est[j];
                    est[j] = aux[0];
                }
            }
        }
        
        for(int i = 0; i < qtd; i++){
            if((est[i].qtdAcidentes > 100)&&(est[i].qtdAcidentes < 500)){
                System.out.println(est[i].codCidade+" - "+est[i].nomeCidade+" - "+est[i].qtdAcidentes+" - "+est[i].tipoVeiculo);
            }
        }
    }
    
    public void pConsultaAcidentes(Estatistica[] est, int qtd){
        Estatistica[] aux = new Estatistica[1];
        
        for(int i=0;i < qtd; i++){
            aux[i] = new Estatistica();
        }
        
        for(int i = 0; i < qtd - 1; i++){
            for(int j = i+1; j < qtd; j++){
                if(est[j].codCidade < est[i].codCidade){
                    est[i] = aux[0];
                    est[i] = est[j];
                    est[j] = aux[0];
                }
            }
        }
        
        for(int i = 0; i < qtd; i++){
            System.out.println(est[i].codCidade+" - "+est[i].nomeCidade+" - "+est[i].qtdAcidentes+" - "+est[i].tipoVeiculo);
        }
    }
    
    public void pMenor(Estatistica[] est, int qtd){
        Estatistica[] aux = new Estatistica[1];
        
        for(int i=0;i < qtd; i++){
            aux[i] = new Estatistica();
        }
        
        for(int i = 0; i < qtd - 1; i++){
            for(int j = i+1; j < qtd; j++){
                if(est[j].qtdAcidentes < est[i].qtdAcidentes){
                    est[i] = aux[0];
                    est[i] = est[j];
                    est[j] = aux[0];
                }
            }
        }
        
        for(int i = 0; i < qtd; i++){
            System.out.println(est[i].codCidade+" - "+est[i].nomeCidade+" - "+est[i].qtdAcidentes+" - "+est[i].tipoVeiculo);
        }
    }
    
    public void pMaior(Estatistica[] est, int qtd){
        Estatistica[] aux = new Estatistica[1];
        
        for(int i=0;i < qtd; i++){
            aux[i] = new Estatistica();
        }
        
        for(int i = 0; i < qtd - 1; i++){
            for(int j = i+1; j < qtd; j++){
                if(est[i].qtdAcidentes < est[j].qtdAcidentes){
                    est[i] = aux[0];
                    est[i] = est[j];
                    est[j] = aux[0];
                }
            }
        }
        
        for(int i = 0; i < qtd; i++){
            System.out.println(est[i].codCidade+" - "+est[i].nomeCidade+" - "+est[i].qtdAcidentes+" - "+est[i].tipoVeiculo);
        }
    }
}
