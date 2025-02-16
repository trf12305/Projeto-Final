package DAO;
import DTO.UsuarioDTO;
import java.sql.*;
import javax.swing.JOptionPane;
public class UsuarioDAO {
    
    Connection conn;
    public ResultSet autenticacaoUsuario(UsuarioDTO usuarioDTO){
        conn = new Conexao().getConexao();
        
        try {
            String sql = "select * from projetofinal.usuario where nome_usuario = ? and senha = ?";
            
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, usuarioDTO.getNome_usuario());
            ps.setString(2, usuarioDTO.getSenha());
            
            ResultSet rs = ps.executeQuery();
            return rs;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"UsuarioDAO: " + e);
            return null;
        }
    }
}
