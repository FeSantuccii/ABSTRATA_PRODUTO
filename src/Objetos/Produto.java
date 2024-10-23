package Objetos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class Produto {
    private String nome;
    private double precoCusto;
    private double precoVenda;

    public Produto(String nome, double precoCusto, double precoVenda) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }

    public double calcularLucro() { //calculadora de lucro
        return precoVenda - precoCusto;
    }

    public void salvar(Connection conn) throws SQLException { //banco de dados, confesso que para essa parte, obtive ajuda da IA, pois não tenho os conhecimentos necessários
        String sql = "INSERT INTO produtos (nome, precoCusto, precoVenda) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setDouble(2, precoCusto);
            stmt.setDouble(3, precoVenda);
            stmt.executeUpdate();
        }
    }

    public void deletar(Connection conn) throws SQLException {
        String sql = "DELETE FROM produtos WHERE nome = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.executeUpdate();
        }
    }

    public void atualizar(Connection conn) throws SQLException {
        String sql = "UPDATE produtos SET precoCusto = ?, precoVenda = ? WHERE nome = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setDouble(1, precoCusto);
            stmt.setDouble(2, precoVenda);
            stmt.setString(3, nome);
            stmt.executeUpdate();
        }
    }

    //GETTERS E SETTERS
    public String getNome() {
        return nome;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }
}