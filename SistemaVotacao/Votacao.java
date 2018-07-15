/*
    Nome do programa : Sistema de Votação - Votacao
    Objetivo: Construir uma variável heterogenea para o sistema de votação
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 31/05/2018
 */
public class Votacao {
    int secao, candidato;
    
    //construtor
    Votacao(){
        this(0,0);
    }
    
    Votacao(int numeroSecao, int numeroCand){
        secao = numeroSecao;
        candidato = numeroCand;
    }
}
