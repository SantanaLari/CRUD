package application.persistence;

import java.sql.SQLException;
import java.util.List;

import application.model.Compra;

public interface ICompraDao {
	public void insereCompra(Compra cp) throws SQLException;
	public void atualizaCompra(Compra cp) throws SQLException;
	public void excluiCompra(Compra cp) throws SQLException;
	public Compra buscaCompra(Compra cp) throws SQLException;
	public List<Compra> buscaCompras(Compra cp) throws SQLException;
}
