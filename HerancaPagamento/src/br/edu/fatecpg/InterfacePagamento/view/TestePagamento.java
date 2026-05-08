package br.edu.fatecpg.InterfacePagamento.view;
import br.edu.fatecpg.InterfacePagamento.model.PagamentoCartao;
import br.edu.fatecpg.InterfacePagamento.model.PagamentoDinheiro;

public class TestePagamento {
    public static void main(String[] args) {

        PagamentoCartao cartao = new PagamentoCartao(100);
        PagamentoDinheiro dinheiro = new PagamentoDinheiro(100);

        System.out.println(cartao.emitirRecibo());
        System.out.println();

        System.out.println(dinheiro.emitirRecibo());
    }
}