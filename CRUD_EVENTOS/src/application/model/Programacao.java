package application.model;

public class Programacao {

	private int codigo;
	private Evento evento; //não sei ao certo se é correto usar o "Evento" ou "int" aqui
	private int horario;
	private String nome;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Evento getEvento() {
		return evento;
	}
	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	public int getHorario() {
		return horario;
	}
	public void setHorario(int horario) {
		this.horario = horario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Programacao [codigo=" + codigo + ", codigoEvento=" + evento 
				+ ", horario=" + horario + ", nome=" + nome + "]";
	}
	
}
