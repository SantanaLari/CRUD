package application.model;

public class Ingresso {
	private int codigo;
	private String tipo;
	private Double preco;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return "Ingresso [codigo=" + codigo + ", tipo=" + tipo + ", preco=" + preco + "]";
	}
}
