package cafeteriaApp.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import cafeteriaApp.model.domain.Usuario;

public class UsuarioService {

	private static Map<Integer, Usuario> usuarios = new HashMap<Integer, Usuario>();

	private static Integer id = 0;

	public static void incluir(Usuario usuario) {

		usuario.setId(++id);

		usuarios.put(usuario.getId(), usuario);
	}

	public static void excluir(Integer id) {
		usuarios.remove(id);
	}

	public static Collection<Usuario> obterLista() {
		return usuarios.values();
	}

	public static Usuario obterPorId(Integer id) {
		return usuarios.get(id);
	}

	public static void atualizar(Usuario usuario) {
		// Verificar se o funcionário existe no mapa de funcionários
		if (usuarios.containsKey(usuario.getId())) {
			// Atualizar o funcionário com os novos dados
			usuarios.put(usuario.getId(), usuario);
		} else {
			// Se o funcionário não existe, lançar uma exceção ou tratar conforme necessário
			throw new RuntimeException("Funcionário não encontrado para atualização");
			// Ou você pode decidir criar um novo funcionário com o ID fornecido
			// funcionarios.put(funcionario.getId(), funcionario);
		}
	}
}
