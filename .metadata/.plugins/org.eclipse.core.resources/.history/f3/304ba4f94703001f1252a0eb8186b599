package cafeteriaApp.controller;

import com.google.gson.Gson;

import cafeteriaApp.model.domain.Bebida;
import cafeteriaApp.service.BebidaService;
import spark.Route;

public class bebidaController {
	public static Route obterLista = (req, res) -> {

		return BebidaService.obterLista();
	};

	public static Route incluir = (req, res) -> {
		// Ler os dados do corpo da requisição
		String requestBody = req.body();

		// Converter o JSON do corpo da requisição para um objeto Funcionario
		Gson gson = new Gson();
		Bebida bebida = gson.fromJson(requestBody, Bebida.class);

		// Adicionar o funcionário com os dados recebidos
		BebidaService.incluir(bebida);

		// Retornar a resposta
		return "Inclusão realizada com sucesso: " + bebida + "!";
	};

	public static Route excluir = (req, res) -> {

		Integer index = Integer.valueOf(req.params("id"));

		Bebida bebida = BebidaService.obterPorId(index);

		BebidaService.excluir(index);

		return "Exclusão realizada com sucesso: " + bebida + "!";
	};

	public static Route obter = (req, res) -> {

		Integer index = Integer.valueOf(req.params("id"));

		Bebida bebida = BebidaService.obterPorId(index);

		return "Recuperação realizada com sucesso: " + bebida + "!";
	};

	public static Route atualizar = (req, res) -> {
		// Ler os dados do corpo da requisição
		String requestBody = req.body();

		// Converter o JSON do corpo da requisição para um objeto Funcionario
		Gson gson = new Gson();
		Bebida bebida = gson.fromJson(requestBody, Bebida.class);

		// Atualizar o funcionário com os dados recebidos
		BebidaService.atualizar(bebida);

		// Retornar a resposta
		return "Atualização realizada com sucesso: " + bebida + "!";
	};
}
