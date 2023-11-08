package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionMySQL;
import modelos.Clientes;
import modelos.Compras;
import modelos.Pacotes;

public class CompraDAO {
	// create
	public void create(Compras compra) {

		String sql = "insert into Compras (data_compras, id_pacotes, id, periodo_pacotes, destino_pacotes (?, ?, ?, ?, ?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = conn.prepareStatement(sql);

			pstm.setString(1, compra.getData_compras());
			pstm.setInt(2, compra.getPacotes().getId_pacotes());
			pstm.setInt(3, compra.getCliente().getId());

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	// read
	public List<Compras> read() {
		List<Compras> compras = new ArrayList<Compras>();
		String sql = "select c.*, cl.*, pdv.* from compras c, clientes cl, pacotes pdv where c.id_compras = pdv.id_pacotes and c.id = cl.id";

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;

		try {

			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = conn.prepareStatement(sql);

			rset = pstm.executeQuery();

			while (rset.next()) {

				Compras compra = new Compras();
				Pacotes pacote = new Pacotes();
				Clientes cliente = new Clientes();

				compra.setId_compras(rset.getInt("id_compras"));
				compra.setData_compras(rset.getString("data_compras"));
				compra.setPeriodo_pacotes(rset.getString("periodo_pacotes"));
				compra.setDestino_pacotes(rset.getString("destino_pacotes"));

				pacote.setId_pacotes(rset.getInt("id_pacotes"));
				pacote.setPeriodo_pacotes(rset.getString("periodo_pacotes"));
				pacote.setDestino_pacotes(rset.getString("destino_pacotes"));
				pacote.setPreco_pacotes(rset.getFloat("preco_pacotes"));

				cliente.setId(rset.getInt("id"));
				cliente.setNome(rset.getString("nome"));
				cliente.setEmail(rset.getString("email"));
				cliente.setCpf(rset.getString("cpf"));
				cliente.setSenha(rset.getString("senha"));

				compra.setPacotes(pacote);
				compra.setCliente(cliente);

				compras.add(compra);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return compras;
	}

	// update
	public void update(Compras compra) {
		String sql = "UPDATE Compras set data_compra = ?, id_pacotes = ?, id = ? WHERE id_compras = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {

			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = conn.prepareStatement(sql);

			pstm.setString(1, compra.getData_compras());
			pstm.setInt(2, compra.getPacotes().getId_pacotes());
			pstm.setInt(3, compra.getCliente().getId());
			pstm.setInt(4, compra.getId_compras());

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	// delete
	public void delete(int id) {
		String sql = "DELETE FROM Compras WHERE id_compras = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {

			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, id);

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	// readById
	public Compras readById(int id) {
		Compras compra = new Compras();
		String sql = "select c.id_compras, c.data_compras, cl.nome, cl.cpf, pdv.periodo_Pacotes, pdv.Destino_Pacotes, pdv.preco_Pacotes from compras c, clientes cl, pacotes pdv where c.id_compras = pdv.id_pacotes and c.id = cl.id";

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;

		try {
			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, id);

			rset = pstm.executeQuery();

			rset.next();

			Pacotes pacote = new Pacotes();
			Clientes cliente = new Clientes();

			compra.setId_compras(rset.getInt("id_compras"));
			compra.setData_compras(rset.getString("Data_compra"));

			pacote.setId_pacotes(rset.getInt("id_pacotes"));
			pacote.setPeriodo_pacotes(rset.getString("periodo_pacotes"));
			pacote.setDestino_pacotes(rset.getString("destino_pacotes"));
			pacote.setPreco_pacotes(rset.getFloat("preco_pacotes"));

			cliente.setId(rset.getInt("id_cliente"));
			cliente.setNome(rset.getString("nome"));
			cliente.setEmail(rset.getString("email"));
			cliente.setCpf(rset.getString("cpf"));
			cliente.setSenha(rset.getString("senha"));

			compra.setPacotes(pacote);
			compra.setCliente(cliente);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return compra;
	}
}
