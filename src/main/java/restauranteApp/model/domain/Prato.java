package restauranteApp.model.domain;

public class Prato extends Produtos {
	
	private String tipo;
	private String tamanho;
	
	public Prato(String idProduto, String nome, double preco, String tipo, String tamanho) {
		super(idProduto, nome, preco, categoria);
		this.tipo = tipo;
        this.tamanho = tamanho;
	}
	
	@Override
	 public String toString() {
      return "Prato -> tipo = " + tipo + ", tamanho = " + tamanho;
	 }


	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	
}
