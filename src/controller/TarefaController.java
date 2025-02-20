package br.seuprojeto.controller;

import br.seuprojeto.dao.TarefaDAO;
import br.seuprojeto.model.Tarefa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class TarefaController {
    private TarefaDAO tarefaDAO;

    public TarefaController() {
        try {
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/board", "root", "sua_senha");
            this.tarefaDAO = new TarefaDAO(conexao);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void adicionarTarefa(String titulo, String descricao, String status) {
        try {
            Tarefa tarefa = new Tarefa(0, titulo, descricao, status);
            tarefaDAO.adicionarTarefa(tarefa);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Tarefa> listarTarefas() {
        try {
            return tarefaDAO.listarTarefas();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
