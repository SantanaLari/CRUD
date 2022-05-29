package application.controller;

import java.sql.SQLException;

import application.model.Compra;

public interface ICompraController {

	public void inserirCompra(Compra cp) throws ClassNotFoundException, SQLException;
	public void atualizarCompra(Compra cp) throws ClassNotFoundException, SQLException;
	public void excluirCompra(Compra cp) throws ClassNotFoundException, SQLException;
	public void buscarCompra(Compra cp) throws ClassNotFoundException, SQLException;
	public void BuscarCompras() throws ClassNotFoundException, SQLException;
}
