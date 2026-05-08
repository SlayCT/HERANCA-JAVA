package br.edu.fatecpg.InterfaceFuncionario.model;

public class Faxineiro implements Funcionario {

    public void baterPonto() {
        System.out.println("Faxineiro bateu o ponto.");
    }

    public void solicitarMaterial() {
        System.out.println("Faxineiro solicitou material de limpeza.");
    }
}