/*
    Nome do programa : Sistema de Contas Correntes - MovContas
    Objetivo: Construir um sistema de contas correntes, variável das movimentação de contas
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 07/06/2018
 */
public class MovContas {
    int codCM;
    Double valorM;
    int tipoM, statusM;
    
    MovContas(){
        this(0,0.0,0,0);
    }
    
    MovContas(int cod, Double valor, int tipo, int status){
        codCM = cod;
        valorM = valor;
        tipoM = tipo;
        statusM = status;
    }
}
