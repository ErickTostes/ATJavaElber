package cafeteriaApp.controller;

import com.google.gson.Gson;

import cafeteriaApp.model.domain.Sobremesa;
import cafeteriaApp.service.SobremesaService;
import spark.Route;

public class sobremesaController {
	public static Route obterLista = (req, res) -> {

		return SobremesaService.obterLista();
	};

	public static Route incluir = (req, res) -> {
		// Ler os dados do corpo da requisição
		String requestBody = req.body();

		// Converter o JSON do corpo da requisição para um objeto Funcionario
		Gson gson = new Gson();
		Sobremesa sobremesa = gson.fromJson(requestBody, Sobremesa.class);

		// Adicionar o funcionário com os dados recebidos
		SobremesaService.incluir(sobremesa);

		// Retornar a resposta
		return "Inclusão realizada com sucesso: " + sobremesa + "!";
	};

	public static Route excluir = (req, res) -> {

		Integer index = Integer.valueOf(req.params("id"));

		Sobremesa sobremesa = SobremesaService.obterPorId(index);

		SobremesaService.excluir(index);

		return "Exclusão realizada com sucesso: " + sobremesa + "!";
	};

	public static Route obter = (req, res) -> {

		Integer index = Integer.valueOf(req.params("id"));

		Sobremesa sobremesa = SobremesaService.obterPorId(index);

		return "Recuperação realizada com sucesso: " + sobremesa + "!";
	};

	public static Route atualizar = (req, res) -> {
		// Ler os dados do corpo da requisição
		String requestBody = req.body();

		// Converter o JSON do corpo da requisição para um objeto Funcionario
		Gson gson = new Gson();
		Sobremesa sobremesa = gson.fromJson(requestBody, Sobremesa.class);

		// Atualizar o funcionário com os dados recebidos
		SobremesaService.atualizar(sobremesa);

		// Retornar a resposta
		return "Atualização realizada com sucesso: " + sobremesa + "!";
	};
}
