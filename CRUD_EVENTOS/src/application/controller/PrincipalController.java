package application.controller;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import javafx.event.ActionEvent;

import javafx.scene.control.ScrollPane;

import javafx.scene.control.Label;

import javafx.scene.control.TextArea;

public class PrincipalController {
	@FXML
	private Button btnSalvarEvento;
	@FXML
	private TextField txtCodigoEvento;
	@FXML
	private TextArea taEvento;
	@FXML
	private TextField txtHoraEvento;
	@FXML
	private TextField txtNumeroEvento;
	@FXML
	private TextField txtRuaEvento;
	@FXML
	private TextField txtDataEvento;
	@FXML
	private TextField txtNomeEvento;
	@FXML
	private TextField txtUfEvento;
	@FXML
	private Button btnListareEvento;
	@FXML
	private Button btnAtualizarEvento;
	@FXML
	private Button btnExcluirEvento;
	@FXML
	private TextField txtCodigoIngresso;
	@FXML
	private TextField txtTipoIngresso;
	@FXML
	private TextField txtPrecoIngresso;
	@FXML
	private TextArea taCaravana;
	@FXML
	private Button btnSalvarCaravana;
	@FXML
	private TextField txtCodigoCaravana;
	@FXML
	private TextField txtCapacidadeCaravana;
	@FXML
	private TextField txtPrecoCaravana;
	@FXML
	private TextField txtNomeCaravana;
	@FXML
	private TextField txtUfCaravana;
	@FXML
	private Button btnListarCaravana;
	@FXML
	private Button btnAtualizarCaravana;
	@FXML
	private Button btnExcluirCaravana;
	@FXML
	private Button btnVisualizarCaravana;
	@FXML
	private TextArea taProgramacao;
	@FXML
	private Button btnSalvarProgramacao;
	@FXML
	private TextField txtCodigoProgramacao;
	@FXML
	private TextField txtCodigoEvento_Programacao;
	@FXML
	private TextField txtNomeProgramacao;
	@FXML
	private TextField txtHorarioProgramacao;
	@FXML
	private Button btnListarProgramacao;
	@FXML
	private Button btnAtualizarProgramacao;
	@FXML
	private Button btnExcluirProgramacao;
	@FXML
	private TextArea taCompra;
	@FXML
	private Button btnSalvarCompra;
	@FXML
	private TextField txtCodigoCompra;
	@FXML
	private TextField txtNomeComprador;
	@FXML
	private TextField txtEmailCompra;
	@FXML
	private TextField txtCodigoEvento_compra;
	@FXML
	private TextField txtCodigoIngresso_compra;
	@FXML
	private TextField txtCodigoCaravana_compra;
	@FXML
	private Button btnListarCompra;
	@FXML
	private Button btnAtualizarCompra;
	@FXML
	private Button btnExcluirCompra;
	@FXML
	private Button btnVisualizarOpcao_compra;
	@FXML
	private Button btnVisualizarCompra;
	@FXML
	private Label lblInformacao;

	// Event Listener on Button[#btnSalvarEvento].onAction
	@FXML
	public void acaoEvento(ActionEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on Button[#btnSalvarCaravana].onAction
	@FXML
	public void acaoCaravana(ActionEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on Button[#btnVisualizarCaravana].onAction
	@FXML
	public void acaoVisualizarCaravana(ActionEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on Button[#btnSalvarProgramacao].onAction
	@FXML
	public void acaoProgramacao(ActionEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on Button[#btnSalvarCompra].onAction
	@FXML
	public void acaoCompra(ActionEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on Button[#btnVisualizarOpcao_compra].onAction
	@FXML
	public void acaoVisualizarOpcao_compra(ActionEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on Button[#btnVisualizarCompra].onAction
	@FXML
	public void acaoVisualizarCompra(ActionEvent event) {
		// TODO Autogenerated
	}
}