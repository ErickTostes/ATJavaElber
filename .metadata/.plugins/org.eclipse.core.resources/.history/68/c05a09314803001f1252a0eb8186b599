package cafeteriaApp.model.domain;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private Integer id;
	private String nome;
	private String enderecoEntrega;
	private List<Pedidos> pedidos;
	
	
	
	public Usuario(Integer id, String nome, String enderecoEntrega) {
		super();
		this.id = id;
		this.nome = nome;
		this.enderecoEntrega = enderecoEntrega;
		this.pedidos = new ArrayList<Pedidos>()
;	}
	
	public Usuario() {
	    this.pedidos = new ArrayList<>();
	}
	
	@Override
	 public String toString() {
        return "Usuário -> id = " + id + ", nome = " + nome + ", Endereço de Entrega = " + enderecoEntrega + ", quantidade de pedidos = " + pedidos.size();
	 }
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id2) {
		this.id = id2;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEnderecoEntrega() {
		return enderecoEntrega;
	}
	public void setEnderecoEntrega(String enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}
}
