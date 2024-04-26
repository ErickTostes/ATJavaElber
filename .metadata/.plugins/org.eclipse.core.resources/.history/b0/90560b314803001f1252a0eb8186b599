package cafeteriaApp.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import cafeteriaApp.model.domain.Produtos;


public class ProdutoService {
	private static Map<Integer, Produtos> produtos = new HashMap<Integer, Produtos>();

	private static Integer id = 0;

	public static void incluir(Produtos produto) {

		produto.setId(++id);

		produtos.put(produto.getId(), produto);
	}

	public static void excluir(Integer id) {
		produtos.remove(id);
	}

	public static Collection<Produtos> obterLista() {
		return produtos.values();
	}

	public static Produtos obterPorId(Integer id) {
		return produtos.get(id);
	}

	public static void atualizar(Produtos produto) {
		// Verificar se o funcionário existe no mapa de funcionários
		if (produtos.containsKey(produto.getId())) {
			// Atualizar o funcionário com os novos dados
			produtos.put(produto.getId(), produto);
		} else {
			// Se o funcionário não existe, lançar uma exceção ou tratar conforme necessário
			throw new RuntimeException("Funcionário não encontrado para atualização");
			// Ou você pode decidir criar um novo funcionário com o ID fornecido
			// funcionarios.put(funcionario.getId(), funcionario);
		}
	}
}
