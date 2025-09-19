/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Dao;

import Connection.ConnectionFactory;
import eleicoesjava.Modelo.Candidato;
import eleicoesjava.Modelo.Partido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CandidatoDao implements Interface {

    public void Salvar(Candidato c) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(" Insert into candidatos (numCandidado, senha, partido, numVotos, "
                    + "codigo, nome, BI, genero, Moradia, Distrito, dataNascimento) Values (?,?,?,?,?,?,?,?,?,?,?,?) ");
            stmt.setInt(1, c.getNumCandidato());         // int
            stmt.setString(2, c.getSenha());             // String
            stmt.setString(3, c.getPart().getNome());    // Partido -> precisa converter p/ String ou ID
            stmt.setInt(4, c.getNumVotosCand());         // Integer
            stmt.setString(5, c.getCodigo());            // String
            stmt.setInt(6, c.getId());                   // int
            stmt.setString(7, c.getNome());              // String
            stmt.setString(8, c.getBI());                // String
            stmt.setString(9, c.getGenero());            // String
            stmt.setString(10, c.getMoradia());          // String
            stmt.setString(11, c.getDistrito());         // String
            stmt.setDate(12, new java.sql.Date(c.getDataNasc().getTime()));

            stmt.executeUpdate();
            JOptionPane.showInternalMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showInternalMessageDialog(null, "Erro ao Salvar!!! " + ex);
            System.out.println(" ");
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public List<Candidato> listarTabela() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Candidato> candidatos = new ArrayList<>();

        try {
            stmt = con.prepareStatement(" Select * from candidatos");
            rs = stmt.executeQuery();

            while (rs.next()) {

                while (rs.next()) {
                    Candidato c = new Candidato();
                    c.setId(rs.getInt("id"));
                    c.setNome(rs.getString("nome"));
                    c.setGenero(rs.getString("genero"));
                    c.setBI(rs.getString("BI"));
                    c.setGenero(rs.getString("genero"));
                   
                   
                    candidatos.add(c);
                }

            }
            System.out.println("Listado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar " + ex);
        } finally {

            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return candidatos;
    }

    public void atualizar(Candidato c) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("Update candidatos set partido = ? , nome = ?, BI = ? , genero = ?,  Where id = ? ");
           
            stmt.setString(3, c.getPart().getNome());    // Partido -> precisa converter p/ String ou ID
            stmt.setInt(6, c.getId());                   // int
            stmt.setString(7, c.getNome());              // String
            stmt.setString(8, c.getBI());                // String
            stmt.setString(9, c.getGenero());            // String
            stmt.executeUpdate();
            JOptionPane.showInternalMessageDialog(null, "Atualizado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showInternalMessageDialog(null, "Erro ao Atualizar!!! " + ex);
            System.out.println(" ");
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public void eliminar(Candidato c) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("Delete from candidatos Where id = ? ");

            stmt.setInt(1, c.getId());

            stmt.executeUpdate();
            JOptionPane.showInternalMessageDialog(null, "Excluido com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showInternalMessageDialog(null, "Erro ao Excluir!!! " + ex);
            System.out.println(" ");
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    @Override
    public List<Candidato> busca(String nome) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Candidato> candidatos = new ArrayList<>();

        try {
            stmt = con.prepareStatement(" Select * from candidatos where nome Like ?");
            stmt.setString(1, nome);
            //      stmt.setString(1," %"+desc+"%");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Candidato c = new Candidato();
                    c.setId(rs.getInt("id"));
                    c.setNome(rs.getString("nome"));
                    c.setGenero(rs.getString("genero"));
                    c.setBI(rs.getString("BI"));
                    c.setGenero(rs.getString("genero"));
                candidatos.add(c);

            }
            System.out.println("Listado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar " + ex);
        } finally {

            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return candidatos;
    }
   

}


