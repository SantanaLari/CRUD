package application.controller;

import java.sql.SQLException;

import application.model.Programacao;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ProgramacaoController implements IProgramacaoController{

	private TextField txtCodigoProgramacao;
	private TextField txtCodigoEvento_Programacao;
	private TextField txtHorarioProgramacao;
	private TextField txtNomeProgramacao;
	private TextArea taProgramacao;
	
	public ProgramacaoController(TextField txtCodigoProgramacao, TextField txtCodigoEvento_Programacao,
			TextField txtHorarioProgramacao, TextField txtNomeProgramacao, TextArea taProgramacao) {
		this.txtCodigoProgramacao = txtCodigoProgramacao;
		this.txtCodigoEvento_Programacao = txtCodigoEvento_Programacao;
		this.txtHorarioProgramacao = txtHorarioProgramacao;
		this.txtNomeProgramacao = txtNomeProgramacao;
		this.taProgramacao = taProgramacao;
	}

	@Override
	public void inserirProgramacao(Programacao p) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizarProgramacao(Programacao p) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluirProgramacao(Programacao p) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buscarProgramacao(Programacao p) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buscarProgramacoes() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

}
