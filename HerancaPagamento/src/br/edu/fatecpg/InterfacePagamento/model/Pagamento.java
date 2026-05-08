package br.edu.fatecpg.InterfacePagamento.model;

public interface Pagamento {
    double calcularPagamento();
    String emitirRecibo();
}