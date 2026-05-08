package br.edu.fatecpg.InterfaceAutenticavel.view;
import java.util.Scanner;
import br.edu.fatecpg.InterfaceAutenticavel.model.SistemaDeSeguranca;

public class TesteLogin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SistemaDeSeguranca sistema = new SistemaDeSeguranca();

        while (!sistema.isAutenticado()) {
            System.out.print("Usuário: ");
            String usuario = sc.nextLine();

            System.out.print("Senha: ");
            String senha = sc.nextLine();

            if (sistema.login(usuario, senha)) {
                System.out.println("Bem-vindo ao sistema!");
            } else {
                System.out.println("Login ou senha incorretos. Tente novamente.\n");
            }
        }

        System.out.print("Deseja sair do sistema? ");
        String resposta = sc.nextLine();

        if (resposta.equalsIgnoreCase("sim")) {
            sistema.logout();
        }

        sc.close();
    }
}
