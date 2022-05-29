package application.controller;

import java.sql.SQLException;

import application.model.Compra;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CompraController implements ICompraController {

	private TextField txtCodigoCompra;
	private TextField txtNomeComprador;
	private TextField txtEmailCompra;
	private TextField txtCodigoEvento_compra;
	private TextField txtCodigoIngresso_compra;
	private TextField txtCodigoCaravana_compra;
	private TextArea taCompra;
	
	public CompraController(TextField txtCodigoCompra, TextField txtNomeComprador, TextField txtEmailCompra,
			TextField txtCodigoEvento_compra, TextField txtCodigoIngresso_compra, TextField txtCodigoCaravana_compra,
			TextArea taCompra) {
		this.txtCodigoCompra = txtCodigoCompra;
		this.txtNomeComprador = txtNomeComprador;
		this.txtEmailCompra = txtEmailCompra;
		this.txtCodigoEvento_compra = txtCodigoEvento_compra;
		this.txtCodigoIngresso_compra = txtCodigoIngresso_compra;
		this.txtCodigoCaravana_compra = txtCodigoCaravana_compra;
		this.taCompra = taCompra;
	}

	@Override
	public void inserirCompra(Compra cp) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizarCompra(Compra cp) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluirCompra(Compra cp) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buscarCompra(Compra cp) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void BuscarCompras() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

}
