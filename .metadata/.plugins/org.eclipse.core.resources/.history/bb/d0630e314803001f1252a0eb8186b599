package cafeteriaApp.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import cafeteriaApp.model.domain.Pedidos;

public class PedidosService {
	private static Map<Integer, Pedidos> pedidos = new HashMap<Integer, Pedidos>();

	private static Integer id = 0;

	public static void incluir(Pedidos pedido) {

		pedido.setId(++id);

		pedidos.put(pedido.getId(), pedido);
	}

	public static void excluir(Integer id) {
		pedidos.remove(id);
	}

	public static Collection<Pedidos> obterLista() {
		return pedidos.values();
	}

	public static Pedidos obterPorId(Integer id) {
		return pedidos.get(id);
	}

	public static void atualizar(Pedidos pedido) {
		// Verificar se o funcionário existe no mapa de funcionários
		if (pedidos.containsKey(pedido.getId())) {
			// Atualizar o funcionário com os novos dados
			pedidos.put(pedido.getId(), pedido);
		} else {
			// Se o funcionário não existe, lançar uma exceção ou tratar conforme necessário
			throw new RuntimeException("Funcionário não encontrado para atualização");
			// Ou você pode decidir criar um novo funcionário com o ID fornecido
			// funcionarios.put(funcionario.getId(), funcionario);
		}
	}
}
