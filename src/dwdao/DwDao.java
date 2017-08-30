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

    public static void carregarFilmes() {
        try {
            Connection connDW = ConnectionFactory.getConnection("dw_ssd", "root", "");
            Connection connLOCADORA = ConnectionFactory.getConnection("locadora", "root", "");
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

    public static void carregarLOJA() {
        try {
            Connection connDW = ConnectionFactory.getConnection("dw_ssd", "root", "");
            Connection connLOCADORA = ConnectionFactory.getConnection("locadora", "root", "");

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

    public static void carregarCliente() {
        try {
            Connection connDW = ConnectionFactory.getConnection("dw_ssd", "root", "");
            Connection connLOCADORA = ConnectionFactory.getConnection("locadora", "root", "");

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

    public static void carregarTempo() {
        try {
            Connection connDW = ConnectionFactory.getConnection("dw_ssd", "root", "");
            Connection connLOCADORA = ConnectionFactory.getConnection("locadora", "root", "");

            String buscar = "select distinct DATE_FORMAT(a.data_de_devolucao, '%W') as dia_semana, MONTHNAME(a.data_de_devolucao) as mes, QUARTER(a.data_de_devolucao) as quadrimestre from aluguel a";
            String incluir = "insert into dwtempo(dia_semana, mes, quadrimestre) values (?, ?, ?)";
            PreparedStatement stmt = connLOCADORA.prepareStatement(buscar);
            PreparedStatement stmtDW = connDW.prepareStatement(incluir);
            ResultSet rs = stmt.executeQuery();
            //int count = 
            while (rs.next()) {
                System.out.println(rs.getRow());
                stmtDW.setString(1, rs.getString("dia_semana"));
                stmtDW.setString(2, rs.getString("mes"));
                stmtDW.setString(3, String.valueOf(rs.getInt("quadrimestre")) + "º");
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

    public static void carregarAluguel() {
        try {
            Connection connDW = ConnectionFactory.getConnection("dw_ssd", "root", "");
            Connection connLOCADORA = ConnectionFactory.getConnection("locadora", "root", "");

            String buscar = "SELECT \n"
                    + "a.aluguel_id as id_alugueis, \n"
                    + "f.filme_id as id_filme_categoria,\n"
                    + "a.cliente_id as id_cliente,\n"
                    + "i.loja_id as id_loja,\n"
                    + "DATE_FORMAT(a.data_de_aluguel, '%W') as dia_semana, \n"
                    + "MONTHNAME(a.data_de_aluguel) as mes, \n"
                    + "QUARTER(a.data_de_aluguel) as trimestre,\n"
                    + "DATEDIFF(a.data_de_devolucao, a.data_de_aluguel) as quantidade,\n"
                    + "sum(p.valor) as valor \n"
                    + "FROM aluguel as a left join (inventario as i, pagamento as p) on (a.inventario_id=i.inventario_id and a.aluguel_id=p.aluguel_id) \n"
                    + "left join filme as f on i.filme_id=f.filme_id group by a.aluguel_id;";
            String incluir = "insert into dwalugueis_fato("
                    + "id_alugueis, "//1
                    + "id_filme_categoria, "//2
                    + "id_cliente, "//3
                    + "id_loja, "//4
                    + "dia_semana, "//5
                    + "mes, "//6
                    + "trimestre, "//7
                    + "quantidade, "//8
                    + "valor"//9
                    + ") values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = connLOCADORA.prepareStatement(buscar);
            PreparedStatement stmtDW = connDW.prepareStatement(incluir);
            ResultSet rs = stmt.executeQuery();
            //int count = 
            while (rs.next()) {
                System.out.println(rs.getRow());
                stmtDW.setInt(1, rs.getInt("id_alugueis"));
                stmtDW.setInt(2, rs.getInt("id_filme_categoria"));
                stmtDW.setInt(3, rs.getInt("id_cliente"));
                stmtDW.setInt(4, rs.getInt("id_loja"));
                stmtDW.setString(5, rs.getString("dia_semana"));
                stmtDW.setString(6, rs.getString("mes"));
                stmtDW.setString(7, rs.getString("trimestre"));
                stmtDW.setInt(8, rs.getInt("quantidade"));
                stmtDW.setDouble(9, rs.getDouble("valor"));

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

    public static int buscaIdTempo(String w, String m) {
        try {
            Connection connDW = ConnectionFactory.getConnection("dw_ssd", "root", "");
            String sql = "SELECT id_tempo FROM dwtempo where dia_semana like '" + w + "' and mes like '" + m + "'";
            PreparedStatement stmtDW = connDW.prepareStatement(sql);
            ResultSet rs = stmtDW.executeQuery();
            if (rs.next()) {
                System.out.println(rs.getRow());
                return rs.getInt("id_tempo");
            }

        } catch (SQLException e) {
            Logger.getLogger(DwDao.class.getName()).log(Level.SEVERE, null, e);
        }

        return 0;
    }
}
