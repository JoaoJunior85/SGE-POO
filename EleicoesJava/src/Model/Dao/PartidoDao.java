/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Dao;

import Connection.ConnectionFactory;
import eleicoesjava.Modelo.Candidato;

import eleicoesjava.Modelo.Partido;
import eleicoesjava.Modelo.Partido;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PartidoDao {

    public void Salvar(Partido p) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(" Insert into partidos (id, nome, numVotosPart) Values (?,?,?) ");
            
            stmt.setInt(1, p.getId());            // String - código
            stmt.setString(2, p.getNome());              // String - nome
            stmt.setInt(3, p.getNumVotosPart());              
                  
            stmt.executeUpdate();
            JOptionPane.showInternalMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showInternalMessageDialog(null, "Erro ao Salvar!!! " + ex);
            System.out.println(" ");
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public List<Partido> listarTabela() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Partido> partidos = new ArrayList<>();

        try {
            stmt = con.prepareStatement(" Select id, nome, candidato  from partidos");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Partido p = new Partido();
                Candidato c = new Candidato();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                c.setNome(rs.getString("candidato"));
                p.setCan(c);
                c.setPart(p);
                partidos.add(p);

            }
            System.out.println("Listado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar " + ex);
        } finally {

            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return partidos;
    }

    public void atualizar(Partido p) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("Update partidos set , nome = ?, numVotosPart = ?  Where id = ? ");

            stmt.setInt(2, p.getId());                   // int
            stmt.setString(3, p.getNome());              // String
            stmt.executeUpdate();
            JOptionPane.showInternalMessageDialog(null, "Atualizado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showInternalMessageDialog(null, "Erro ao Atualizar!!! " + ex);
            System.out.println(" ");
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public void eliminar(Partido e) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("Delete from Partidos Where id = ? ");

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

    public List<Partido> busca(String nome) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Partido> partidos = new ArrayList<>();

        try {
            stmt = con.prepareStatement(" Select * from partidos where nome Like ?");
            stmt.setString(1, nome);
            //      stmt.setString(1," %"+desc+"%");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Partido p = new Partido();
                Candidato c = new Candidato();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                c.setNome(rs.getString("candidato"));
                p.setCan(c);
                c.setPart(p);
                partidos.add(p);

            }
            System.out.println("Listado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar " + ex);
        } finally {

            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return partidos;
    }

 

}
