package application.controller;

import java.sql.SQLException;

import application.model.Caravana;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CaravanaController implements ICaravanaController {

	private TextField txtCodigoCaravana;
	private TextField txtNomeCaravana;
	private TextField txtCapacidadeCaravana;
	private TextField txtPrecoCaravana;
	private TextField txtUfCaravana;
	private TextArea taCaravana;
	
	public CaravanaController(TextField txtCodigoCaravana, TextField txtNomeCaravana, TextField txtCapacidadeCaravana,
			TextField txtPrecoCaravana, TextField txtUfCaravana, TextArea taCaravana) {
		this.txtCodigoCaravana = txtCodigoCaravana;
		this.txtNomeCaravana = txtNomeCaravana;
		this.txtCapacidadeCaravana = txtCapacidadeCaravana;
		this.txtPrecoCaravana = txtPrecoCaravana;
		this.txtUfCaravana = txtUfCaravana;
		this.taCaravana = taCaravana;
	}

	@Override
	public void inserirCaravana(Caravana c) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizarCaravana(Caravana c) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluirCaravana(Caravana c) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buscarCaravana(Caravana c) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buscarCaravanaEvento() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

}
