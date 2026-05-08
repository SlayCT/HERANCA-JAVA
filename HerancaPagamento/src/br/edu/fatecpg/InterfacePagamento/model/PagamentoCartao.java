package br.edu.fatecpg.InterfacePagamento.model;

public class PagamentoCartao implements Pagamento {
    private double valor;

    public PagamentoCartao(double valor) {
        this.valor = valor;
    }

    public double calcularPagamento() {
        return valor + (valor * 0.05);
    }

    public String emitirRecibo() {
        return "Pagamento no cartão\nValor original: R$ " + valor +
               "\nTaxa de 5% aplicada\nValor final: R$ " + calcularPagamento();
    }
}