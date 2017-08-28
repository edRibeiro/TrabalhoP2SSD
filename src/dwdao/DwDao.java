/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dwdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AMD-FX
 */
public class DwDao {
    public static void carregarFilmes(){
        try {
            Connection connDW = ConnectionFactory.getConnection("dw_ssd", "root", "");
            Connection connLOCADORA  = ConnectionFactory.getConnection("locadora", "root", "");
            String buscar = "select f.filme_id as id_filme_categoria, c.nome as categoria from filme f, categoria c , filme_categoria fc where f.filme_id=fc.filme_id and c.categoria_id=fc.categoria_id";
            String incluir = "insert into dwfilme_categoria(id_filme_categoria, categoria) values (?, ?)";
            PreparedStatement stmt = connLOCADORA.prepareStatement(buscar);
            PreparedStatement stmtDW = connDW.prepareStatement(incluir);
            ResultSet rs = stmt.executeQuery();
            //int count = 
            while (rs.next()) {
                System.out.println(rs.getRow());
                stmtDW.setInt(1, rs.getInt("id_filme_categoria"));
                stmtDW.setString(2, rs.getString("categoria"));  
                int executeUpdate = stmtDW.executeUpdate();
            }
            rs.close();
            stmt.close();
            stmtDW.close();
            connDW.close();
            connLOCADORA.close();
        } catch (SQLException e) {
             Logger.getLogger(DwDao.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public static void carregarLOJA(){
        try {
            Connection connDW = ConnectionFactory.getConnection("dw_ssd", "root", "");
            Connection connLOCADORA  = ConnectionFactory.getConnection("locadora", "root", "");
            
            
            String buscar = "SELECT l.loja_id as id_loja, d.nome as cidade, u.uf as estado FROM loja l, endereco e, cidade d, estados u where l.endereco_id=e.endereco_id and e.cidade_id=d.cidade_id and d.estado_id=u.id";
            String incluir = "insert into dwloja(id_loja, cidade, estado) values (?, ?, ?)";
            PreparedStatement stmt = connLOCADORA.prepareStatement(buscar);
            PreparedStatement stmtDW = connDW.prepareStatement(incluir);
            ResultSet rs = stmt.executeQuery();
            //int count = 
            while (rs.next()) {
                System.out.println(rs.getRow());
                stmtDW.setInt(1, rs.getInt("id_loja"));
                stmtDW.setString(2, rs.getString("cidade"));  
                stmtDW.setString(3, rs.getString("estado"));  
                int executeUpdate = stmtDW.executeUpdate();
            }
            rs.close();
            stmt.close();
            stmtDW.close();
            connDW.close();
            connLOCADORA.close();
        } catch (SQLException e) {
            Logger.getLogger(DwDao.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    public static void carregarCliente(){
        try {
            Connection connDW = ConnectionFactory.getConnection("dw_ssd", "root", "");
            Connection connLOCADORA  = ConnectionFactory.getConnection("locadora", "root", "");
            
            
            String buscar = "SELECT c.cliente_id as id_cliente, cd.nome as cidade, uf.uf as estado, c.genero, c.renda as renda_anual, c.escolaridade FROM cliente c, endereco e, cidade cd, estados uf where c.endereco_id=e.endereco_id and e.cidade_id=cd.cidade_id and cd.estado_id=uf.id";
            String incluir = "insert into dwcliente(id_cliente, cidade, estado, genero, renda_anual, escolaridade) values (?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = connLOCADORA.prepareStatement(buscar);
            PreparedStatement stmtDW = connDW.prepareStatement(incluir);
            ResultSet rs = stmt.executeQuery();
            //int count = 
            while (rs.next()) {
                System.out.println(rs.getRow());
                stmtDW.setInt(1, rs.getInt("id_cliente"));
                stmtDW.setString(2, rs.getString("cidade"));  
                stmtDW.setString(3, rs.getString("estado"));
                stmtDW.setString(4, rs.getString("genero")); 
                stmtDW.setDouble(5, rs.getDouble("renda_anual")); 
                stmtDW.setString(6, rs.getString("escolaridade")); 
                int executeUpdate = stmtDW.executeUpdate();
            }
            rs.close();
            stmt.close();
            stmtDW.close();
            connDW.close();
            connLOCADORA.close();            
        } catch (SQLException e) {
            Logger.getLogger(DwDao.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
