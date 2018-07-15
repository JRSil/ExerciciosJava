/*
    Nome do programa : Sistema de trânsito - Estatistica
    Objetivo: Construir uma variável heterogenea para o sistema de trânsito
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 24/05/2018
 */
public class Estatistica {
    int codCidade;
    String nomeCidade;
    int qtdAcidentes, tipoVeiculo;
    
    //construtor
    Estatistica(){
        this(0,"",0,0);
    }
    
    Estatistica(int codCidadeEst, String nomeCidadeEst, int qtdAcidentesEst, int tipoVeiculoEst){
        codCidade = codCidadeEst;
        nomeCidade = nomeCidadeEst;
        qtdAcidentes = qtdAcidentesEst;
        tipoVeiculo = tipoVeiculoEst;
    }
}
