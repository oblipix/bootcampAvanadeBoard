package br.seuprojeto.view;

import br.seuprojeto.controller.TarefaController;
import br.seuprojeto.model.Tarefa;
import java.util.List;
import java.util.Scanner;

public class TarefaView {
    public static void main(String[] args) {
        TarefaController controller = new TarefaController();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adicionar nova tarefa:");
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();
        System.out.print("Status: ");
        String status = scanner.nextLine();

        controller.adicionarTarefa(titulo, descricao, status);
        System.out.println("Tarefa adicionada com sucesso!\n");

        System.out.println("Lista de Tarefas:");
        List<Tarefa> tarefas = controller.listarTarefas();
        for (Tarefa t : tarefas) {
            System.out.println("ID: " + t.getId() + " | " + t.getTitulo() + " - " + t.getDescricao() + " [" + t.getStatus() + "]");
        }

        scanner.close();
    }
}
