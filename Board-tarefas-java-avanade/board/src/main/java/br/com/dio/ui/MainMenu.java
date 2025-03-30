package br.com.dio.ui;

import java.util.Scanner;

public class MainMenu {

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao Board de Tarefas!");
        System.out.println("1. Criar Tarefa");
        System.out.println("2. Listar Tarefas");
        System.out.println("3. Sair");

        int option = scanner.nextInt();
        switch (option) {
            case 1:
                System.out.println("Criando tarefa...");
                break;
            case 2:
                System.out.println("Listando tarefas...");
                break;
            case 3:
                System.out.println("Saindo...");
                System.exit(0);
            default:
                System.out.println("Opção inválida!");
        }
    }
}

