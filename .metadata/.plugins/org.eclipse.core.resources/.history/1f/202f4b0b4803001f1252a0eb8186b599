package cafeteriaApp.controller;

import com.google.gson.Gson;

import cafeteriaApp.model.domain.Usuario;
import cafeteriaApp.service.UsuarioService;
import spark.Route;

public class usuarioController {

	public static Route obterLista = (req, res) -> {

		return UsuarioService.obterLista();
	};

	public static Route incluir = (req, res) -> {
		// Ler os dados do corpo da requisição
		String requestBody = req.body();

		// Converter o JSON do corpo da requisição para um objeto Funcionario
		Gson gson = new Gson();
		Usuario usuario = gson.fromJson(requestBody, Usuario.class);

		// Adicionar o funcionário com os dados recebidos
		UsuarioService.incluir(usuario);

		// Retornar a resposta
		return "Inclusão realizada com sucesso: " + usuario + "!";
	};

	public static Route excluir = (req, res) -> {

		Integer index = Integer.valueOf(req.params("id"));

		Usuario usuario = UsuarioService.obterPorId(index);

		UsuarioService.excluir(index);

		return "Exclusão realizada com sucesso: " + usuario + "!";
	};

	public static Route obter = (req, res) -> {

		Integer index = Integer.valueOf(req.params("id"));

		Usuario usuario = UsuarioService.obterPorId(index);

		return "Recuperação realizada com sucesso: " + usuario + "!";
	};

	public static Route atualizar = (req, res) -> {
		// Ler os dados do corpo da requisição
		String requestBody = req.body();

		// Converter o JSON do corpo da requisição para um objeto Funcionario
		Gson gson = new Gson();
		Usuario usuario = gson.fromJson(requestBody, Usuario.class);

		// Atualizar o funcionário com os dados recebidos
		UsuarioService.atualizar(usuario);

		// Retornar a resposta
		return "Atualização realizada com sucesso: " + usuario + "!";
	};

}
