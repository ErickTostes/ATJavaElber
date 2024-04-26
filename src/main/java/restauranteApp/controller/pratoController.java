package restauranteApp.controller;

import com.google.gson.Gson;

import restauranteApp.model.domain.Prato;
import restauranteApp.service.PratosService;
import spark.Route;

public class pratoController {
	public static Route obterLista = (req, res) -> {

		return PratosService.obterLista();
	};

	public static Route incluir = (req, res) -> {
		// Ler os dados do corpo da requisição
		String requestBody = req.body();

		// Converter o JSON do corpo da requisição para um objeto Funcionario
		Gson gson = new Gson();
		Prato rato = gson.fromJson(requestBody, Prato.class);

		// Adicionar o funcionário com os dados recebidos
		PratosService.incluir(prato);

		// Retornar a resposta
		return "Inclusão realizada com sucesso: " + prato + "!";
	};

	public static Route excluir = (req, res) -> {

		Integer index = Integer.valueOf(req.params("id"));

		Prato prato = PratosService.obterPorId(index);

		PratosService.excluir(index);

		return "Exclusão realizada com sucesso: " + prato + "!";
	};

	public static Route obter = (req, res) -> {

		Integer index = Integer.valueOf(req.params("id"));

		Prato prato = PratosService.obterPorId(index);

		return "Recuperação realizada com sucesso: " + prato + "!";
	};

	public static Route atualizar = (req, res) -> {
		// Ler os dados do corpo da requisição
		String requestBody = req.body();

		// Converter o JSON do corpo da requisição para um objeto Funcionario
		Gson gson = new Gson();
		Prato prato = gson.fromJson(requestBody, Prato.class);

		// Atualizar o funcionário com os dados recebidos
		PratosService.atualizar(sobremesa);

		// Retornar a resposta
		return "Atualização realizada com sucesso: " + prato + "!";
	};
}
