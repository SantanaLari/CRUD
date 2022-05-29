package application.controller;

import java.sql.SQLException;

import application.model.Evento;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class EventoController implements IEventoController {
	
	private TextField txtCodigoEvento;
	private TextField txtNomeEvento;
	private TextField txtDataEvento;
	private TextField txtHoraEvento;
	private TextField txtRuaEvento;
	private TextField txtNumeroEvento;
	private TextField txtUfEvento;
	private TextField txtCodigoIngresso;
	private TextField txtTipoIngresso;
	private TextField txtPrecoIngresso;
	private TextArea taEvento;
	
	public EventoController(TextField txtCodigoEvento, TextField txtNomeEvento, TextField txtDataEvento,
			TextField txtHoraEvento, TextField txtRuaEvento, TextField txtNumeroEvento, TextField txtUfEvento,
			TextField txtCodigoIngresso, TextField txtTipoIngresso, TextField txtPrecoIngresso, TextArea taEvento) {
		this.txtCodigoEvento = txtCodigoEvento;
		this.txtNomeEvento = txtNomeEvento;
		this.txtDataEvento = txtDataEvento;
		this.txtHoraEvento = txtHoraEvento;
		this.txtRuaEvento = txtRuaEvento;
		this.txtNumeroEvento = txtNumeroEvento;
		this.txtUfEvento = txtUfEvento;
		this.txtCodigoIngresso = txtCodigoIngresso;
		this.txtTipoIngresso = txtTipoIngresso;
		this.txtPrecoIngresso = txtPrecoIngresso;
		this.taEvento = taEvento;
	}

	@Override
	public void inserirEvento(Evento ev) throws ClassNotFoundException, SQLException {
			
	}

	@Override
	public void atualizarEvento(Evento ev) throws ClassNotFoundException, SQLException {
	
		
	}

	@Override
	public void excluirEvento(Evento ev) throws ClassNotFoundException, SQLException {
		
		
	}

	@Override
	public void buscarEvento(Evento ev) throws ClassNotFoundException, SQLException {
		
		
	}

	@Override
	public void buscarEventos() throws ClassNotFoundException, SQLException {
		
		
	}

}
