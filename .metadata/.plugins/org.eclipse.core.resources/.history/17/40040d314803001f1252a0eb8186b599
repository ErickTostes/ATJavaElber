package cafeteriaApp.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import cafeteriaApp.model.domain.Bebida;


public class BebidaService {
	private static Map<Integer, Bebida> bebidas = new HashMap<Integer, Bebida>();

	private static Integer id = 0;

	public static void incluir(Bebida bebida) {

		bebida.setId(++id);

		bebidas.put(bebida.getId(), bebida);
	}

	public static void excluir(Integer id) {
		bebidas.remove(id);
	}

	public static Collection<Bebida> obterLista() {
		return bebidas.values();
	}

	public static Bebida obterPorId(Integer id) {
		return bebidas.get(id);
	}

	public static void atualizar(Bebida bebida) {
		// Verificar se o funcionário existe no mapa de funcionários
		if (bebidas.containsKey(bebida.getId())) {
			// Atualizar o funcionário com os novos dados
			bebidas.put(bebida.getId(), bebida);
		} else {
			// Se o funcionário não existe, lançar uma exceção ou tratar conforme necessário
			throw new RuntimeException("bebida não encontrado para atualização");
			// Ou você pode decidir criar um novo funcionário com o ID fornecido
			// funcionarios.put(funcionario.getId(), funcionario);
		}
	}
}
