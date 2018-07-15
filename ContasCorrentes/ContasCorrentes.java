/*
    Nome do programa : Sistema de Contas Correntes - ContasCorrentes
    Objetivo: Construir um sistema de contas correntes, variável das contas
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 07/06/2018
 */
public class ContasCorrentes {
    int codCC;
    String clienteC;
    Double saldoCC, limiteCC;
    int tipoCC;
    
    ContasCorrentes(){
        this(0,"",0.0,0.0,0);
    }
    
    ContasCorrentes(int cod, String cli, Double saldo, Double limite, int tipo){
        codCC = cod;
        clienteC = cli;
        saldoCC = saldo;
        limiteCC = limite;
        tipoCC = tipo;
    }
}
