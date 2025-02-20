package br.seuprojeto.dao;

import br.seuprojeto.model.Tarefa;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TarefaDAO {
    private Connection conexao;

    public TarefaDAO(Connection conexao) {
        this.conexao = conexao;
    }

    public void adicionarTarefa(Tarefa tarefa) throws SQLException {
        String sql = "INSERT INTO tarefas (titulo, descricao, status) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, tarefa.getTitulo());
            stmt.setString(2, tarefa.getDescricao());
            stmt.setString(3, tarefa.getStatus());
            stmt.executeUpdate();
        }
    }

    public List<Tarefa> listarTarefas() throws SQLException {
        List<Tarefa> lista = new ArrayList<>();
        String sql = "SELECT * FROM tarefas";
        try (Statement stmt = conexao.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(new Tarefa(rs.getInt("id"), rs.getString("titulo"), rs.getString("descricao"), rs.getString("status")));
            }
        }
        return lista;
    }
}
