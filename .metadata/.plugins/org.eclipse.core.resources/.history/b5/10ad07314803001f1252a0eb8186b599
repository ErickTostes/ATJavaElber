package cafeteriaApp.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import cafeteriaApp.model.domain.Sobremesa;


public class SobremesaService {
	private static Map<Integer, Sobremesa> sobremesas = new HashMap<Integer, Sobremesa>();

	private static Integer id = 0;

	public static void incluir(Sobremesa sobremesa) {

		sobremesa.setId(++id);

		sobremesas.put(sobremesa.getId(), sobremesa);
	}

	public static void excluir(Integer id) {
		sobremesas.remove(id);
	}

	public static Collection<Sobremesa> obterLista() {
		return sobremesas.values();
	}

	public static Sobremesa obterPorId(Integer id) {
		return sobremesas.get(id);
	}

	public static void atualizar(Sobremesa sobremesa) {
		// Verificar se o funcionário existe no mapa de funcionários
		if (sobremesas.containsKey(sobremesa.getId())) {
			// Atualizar o funcionário com os novos dados
			sobremesas.put(sobremesa.getId(), sobremesa);
		} else {
			// Se o funcionário não existe, lançar uma exceção ou tratar conforme necessário
			throw new RuntimeException("sobremesa não encontrado para atualização");
			// Ou você pode decidir criar um novo funcionário com o ID fornecido
			// funcionarios.put(funcionario.getId(), funcionario);
		}
	}
}
