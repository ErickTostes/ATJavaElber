package cafeteriaApp.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import cafeteriaApp.model.domain.Funcionario;

public class FuncionarioService {
	private static Map<Integer, Funcionario> funcionarios = new HashMap<Integer, Funcionario>();
	
	private static Integer id = 0;
	
	public static void incluir(Funcionario funcionario) {
		
		funcionario.setId(++id);
		
		funcionarios.put(funcionario.getId(), funcionario);
	}

	public static void excluir(Integer id) {
		funcionarios.remove(id);
	}
	
	public static Collection<Funcionario> obterLista() {
		return funcionarios.values();
	}
	
	public static Funcionario obterPorId(Integer id) {
		return funcionarios.get(id);
	}
	
	
	public static void atualizar(Funcionario funcionario) {
	    // Verificar se o funcionário existe no mapa de funcionários
	    if (funcionarios.containsKey(funcionario.getId())) {
	        // Atualizar o funcionário com os novos dados
	        funcionarios.put(funcionario.getId(), funcionario);
	    } else {
	        // Se o funcionário não existe, lançar uma exceção ou tratar conforme necessário
	        throw new RuntimeException("Funcionário não encontrado para atualização");
	        // Ou você pode decidir criar um novo funcionário com o ID fornecido
	        // funcionarios.put(funcionario.getId(), funcionario);
	    }
	}

}
