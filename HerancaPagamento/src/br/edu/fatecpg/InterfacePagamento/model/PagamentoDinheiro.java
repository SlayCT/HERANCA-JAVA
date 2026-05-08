package br.edu.fatecpg.InterfacePagamento.model;

public class PagamentoDinheiro implements Pagamento {
    private double valor;

    public PagamentoDinheiro(double valor) {
        this.valor = valor;
    }

    public double calcularPagamento() {
        return valor - (valor * 0.10);
    }

    public String emitirRecibo() {
        return "Pagamento em dinheiro\nValor original: R$ " + valor +
               "\nDesconto de 10% aplicado\nValor final: R$ " + calcularPagamento();
    }
}