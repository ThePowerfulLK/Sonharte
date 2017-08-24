package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Cliente;
import util.DataBase;

public class ClienteDAO {

    private final DataBase db;
    
    public ClienteDAO() {
        db = new DataBase();
    }
    
    public void insert(Cliente cliente) {
        try {            
            String sql = "INSERT INTO tb_cliente (cli_nome, cli_fone, cli_email) VALUES (?, ?, ?)";
            PreparedStatement ps = db.geraConexao().prepareStatement(sql);
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getFone());
            ps.setString(3, cliente.getEmail());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro salvo");
        } catch(SQLException error) {
            System.out.println("ERRO: " + error);        
        } 
    }
    
    public void delete(Cliente cliente) {
        try {
            String sql = "DELETE FROM tb_cliente WHERE cli_id = ?";
            PreparedStatement ps = db.geraConexao().prepareStatement(sql);
            ps.setInt(1, cliente.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro deletado");
        } catch(SQLException error) {
            System.out.println("ERRO: " + error);
        }
    }
    
    public void update(Cliente cliente) {
        try {
            String sql = "UPDATE tb_cliente SET cli_nome = ?, cli_fone = ?, cli_email = ? WHERE cli_id = ?";
            PreparedStatement ps = db.geraConexao().prepareStatement(sql);
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getFone());
            ps.setString(3, cliente.getEmail());
            ps.setInt(4, cliente.getId());
            ps.executeUpdate();
        } catch(SQLException error) {
            System.out.println("ERRO: " + error);
        }
    }
    /*
    public List<Cliente> selectAll() {
        List<Cliente> clientes = new ArrayList();
        try {
          //  db.open();
            String sql = "SELECT * FROM tb_cliente";
            PreparedStatement ps = db.getConnetion().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("cli_id"));
                cliente.setNome(rs.getString("cli_nome"));
                cliente.setFone(rs.getString("cli_fone"));
                cliente.setEmail(rs.getString("cli_email"));
                clientes.add(cliente);
            }
        } catch(SQLException error) {
            System.out.println("ERRO: " + error);
        } finally {
          //  db.close();
            return clientes;
        }
    }
    
    public Cliente selectById(int id) {
        Cliente cliente = new Cliente();
        try {
          //  db.open();
            String sql = "SELECT * FROM tb_cliente WHERE cli_id = ?";
            PreparedStatement ps = db.getConnetion().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                cliente.setId(rs.getInt("cli_id"));
                cliente.setNome(rs.getString("cli_nome"));
                cliente.setFone(rs.getString("cli_fone"));
                cliente.setEmail(rs.getString("cli_email"));
            }     
        } catch (SQLException error) {
            System.out.println("ERRO: " + error);
        } finally {
           // db.close();
            return cliente;
        }
    }
    
    public List<Cliente> selectByLike(String filter) {
        List<Cliente> clientes = new ArrayList();
        String filtro = "%" + filter + "%";
        try {
          //  db.open();
            String sql = "SELECT * FROM tb_contatos WHERE cli_nome LIKE ? OR cli_fone LIKE ? OR cli_email LIKE ?";
            PreparedStatement ps = db.getConnetion().prepareStatement(sql);
            ps.setString(1, filtro);
            ps.setString(2, filtro);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("cli_id"));
                cliente.setNome(rs.getString("cli_nome"));
                cliente.setFone(rs.getString("cli_fone"));
                cliente.setEmail(rs.getString("cli_email"));
                clientes.add(cliente);
            }
        } catch(SQLException error) {
            System.out.println("ERRO: " + error);
        } finally {
           // db.close();
            return clientes;
        }
    }
    */
}