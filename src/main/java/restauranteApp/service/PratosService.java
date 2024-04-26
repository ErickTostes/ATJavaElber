package restauranteApp.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import restauranteApp.model.domain.Pratos;


public class SobremesaService {
	private static Map<Integer, Pratos> pratos = new HashMap<Integer, Pratos>();

	private static Integer id = 0;

	public static void incluir(Prato prato) {

		prato.setId(++id);

		pratos.put(prato.getId(), prato);
	}

	public static void excluir(Integer id) {
		pratos.remove(id);
	}

	public static Collection<Prato> obterLista() {
		return pratos.values();
	}

	public static Prato obterPorId(Integer id) {
		return prato.get(id);
	}

	public static void atualizar(Prato prato) {
		// Verificar se o funcionário existe no mapa de funcionários
		if (pratos.containsKey(prato.getId())) {
			// Atualizar o funcionário com os novos dados
			pratos.put(prato.getId(), prato);
		} else {
			// Se o funcionário não existe, lançar uma exceção ou tratar conforme necessário
			throw new RuntimeException("Prato não encontrado para atualização");
			// Ou você pode decidir criar um novo funcionário com o ID fornecido
			// funcionarios.put(funcionario.getId(), funcionario);
		}
	}
}
