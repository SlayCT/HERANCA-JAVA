package br.edu.fatecpg.InterfaceFuncionario.view;

import br.edu.fatecpg.InterfaceFuncionario.model.Faxineiro;
import br.edu.fatecpg.InterfaceFuncionario.model.Gerente;
import br.edu.fatecpg.InterfaceFuncionario.model.Vendedor;

public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente();
        Vendedor vendedor = new Vendedor();
        Faxineiro faxineiro = new Faxineiro();

        gerente.baterPonto();
        gerente.fecharCaixa();

        vendedor.baterPonto();
        vendedor.realizarVenda();

        faxineiro.baterPonto();
        faxineiro.solicitarMaterial();
    }
}