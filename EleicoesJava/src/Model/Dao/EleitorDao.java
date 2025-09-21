/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Dao;

import Connection.ConnectionFactory;

import eleicoesjava.Modelo.Eleitor;
import eleicoesjava.Modelo.Partido;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class EleitorDao {

    public void Salvar(Eleitor e) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(" Insert into eleitor (codigo,nome, BI, genero, Moradia, "
                    + "Distrito, dataNascimento) Values (?,?,?,?,?,?,?) ");
            stmt.setString(1, e.getCodigo());            // String - código
            stmt.setString(2, e.getNome());              // String - nome
            stmt.setString(3, e.getBI());                // String - BI
            stmt.setString(4, e.getGenero());            // String - genero
            stmt.setString(5, e.getMoradia());          // String - Moradia
            stmt.setString(6, e.getDistrito());         // String - Distrito
            stmt.setDate(7, new java.sql.Date(e.getDataNasc().getTime())); // Date - dataNascimento
            stmt.executeUpdate();
            JOptionPane.showInternalMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showInternalMessageDialog(null, "Erro ao Salvar!!! " + ex);
            System.out.println(" ");
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public List<Eleitor> listarTabela() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Eleitor> eleitores = new ArrayList<>();

        try {
            stmt = con.prepareStatement(" Select id, nome, bi, dataNascimento, Distrito  from eleitor");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Eleitor e = new Eleitor();
                e.setId(rs.getInt("id"));
                e.setNome(rs.getString("nome"));
                e.setBI(rs.getString("BI"));
                e.setDataNasc(rs.getDate("dataNascimento"));
                e.setDistrito(rs.getString("Distrito"));
                eleitores.add(e);

            }
            System.out.println("Listado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar " + ex);
        } finally {

            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return eleitores;
    }

    public void atualizar(Eleitor e) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("Update eleitores set , nome = ?, BI = ? , dataNAscimento = ?, Distrito = ?  Where id = ? ");

            stmt.setInt(1, e.getId());                   // int
            stmt.setString(2, e.getNome());              // String
            stmt.setString(3, e.getBI());                // String
            stmt.setDate(4, (Date) e.getDataNasc());
            stmt.setString(5, e.getDistrito());
            stmt.executeUpdate();
            JOptionPane.showInternalMessageDialog(null, "Atualizado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showInternalMessageDialog(null, "Erro ao Atualizar!!! " + ex);
            System.out.println(" ");
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public void eliminar(Eleitor e) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("Delete from Eleitor Where id = ? ");

            stmt.setInt(1, e.getId());

            stmt.executeUpdate();
            JOptionPane.showInternalMessageDialog(null, "Excluido com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showInternalMessageDialog(null, "Erro ao Excluir!!! " + ex);
            System.out.println(" ");
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public List<Eleitor> busca(String termo) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String filtro = " %"+termo+"%";
        List<Eleitor> eleitores = new ArrayList<>();

        try {
            stmt = con.prepareStatement(" Select * from eleitor where nome Like ? or BI like?");
            stmt.setString(1, filtro);
            stmt.setString(2, filtro);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Eleitor e = new Eleitor();
                e.setId(rs.getInt("id"));
                e.setNome(rs.getString("nome"));
                e.setBI(rs.getString("BI"));
                e.setGenero(rs.getString("dataNascimento"));
                e.setDistrito(rs.getString("Distrito"));
                eleitores.add(e);

            }
            System.out.println("Listado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar " + ex);
        } finally {

            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return eleitores;
    }

}
