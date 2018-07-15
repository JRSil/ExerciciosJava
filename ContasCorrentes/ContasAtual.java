/*
    Nome do programa : Sistema de Contas Correntes - ContasAtual
    Objetivo: Construir um sistema de contas correntes, variável das contas atualizadas
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 07/06/2018
 */
public class ContasAtual {
    int codCA;
    String clienteA;
    Double saldoCA, limiteCA;
    int tipoCA, statusCA;
    
    ContasAtual(){
        this(0,"",0.0,0.0,0,0);
    }
    
    ContasAtual(int cod, String cli, Double saldo, Double limite, int tipo, int status){
        codCA = cod;
        clienteA = cli;
        saldoCA = saldo;
        limiteCA = limite;
        tipoCA = tipo;
        statusCA = status;
    }
}
