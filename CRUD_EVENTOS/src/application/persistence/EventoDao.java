package application.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import application.model.Evento;

public class EventoDao implements IEventoDao {

	private Connection c;
	
	public EventoDao() throws ClassNotFoundException, SQLException{
		GenericDao gDao = new GenericDao();
		c = gDao.getConnection();
	}
	
	@Override
	public void insereEvento(Evento ev) throws SQLException {
		
	}

	@Override
	public void atualizaEvento(Evento ev) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluiEvento(Evento ev) throws SQLException {
		String sql = "DELETE FROM evento WHERE codigo = ?";
		
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setInt(1, ev.getCodigo());
		
		ps.execute();
		ps.close();
	}

	@Override
	public Evento buscaEvento(Evento ev) throws SQLException {
		
		return null;
	}

	@Override
	public List<Evento> buscaEventos() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
