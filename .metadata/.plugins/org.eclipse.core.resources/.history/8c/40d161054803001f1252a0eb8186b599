package cafeteriaApp.controller;

import com.google.gson.Gson;

import cafeteriaApp.model.domain.Produtos;
import cafeteriaApp.service.ProdutoService;
import spark.Route;

public class produtoController {
	public static Route obterLista = (req, res) -> {

		return ProdutoService.obterLista();
	};

	public static Route incluir = (req, res) -> {
		// Ler os dados do corpo da requisição
		String requestBody = req.body();

		// Converter o JSON do corpo da requisição para um objeto Funcionario
		Gson gson = new Gson();
		Produtos produto = gson.fromJson(requestBody, Produtos.class);

		// Adicionar o funcionário com os dados recebidos
		ProdutoService.incluir(produto);

		// Retornar a resposta
		return "Inclusão realizada com sucesso: " + produto + "!";
	};

	public static Route excluir = (req, res) -> {

		Integer index = Integer.valueOf(req.params("id"));

		Produtos produto = ProdutoService.obterPorId(index);

		ProdutoService.excluir(index);

		return "Exclusão realizada com sucesso: " + produto + "!";
	};

	public static Route obter = (req, res) -> {

		Integer index = Integer.valueOf(req.params("id"));

		Produtos produto = ProdutoService.obterPorId(index);

		return "Recuperação realizada com sucesso: " + produto + "!";
	};

	public static Route atualizar = (req, res) -> {
		// Ler os dados do corpo da requisição
		String requestBody = req.body();

		// Converter o JSON do corpo da requisição para um objeto Funcionario
		Gson gson = new Gson();
		Produtos produto = gson.fromJson(requestBody, Produtos.class);

		// Atualizar o funcionário com os dados recebidos
		ProdutoService.atualizar(produto);

		// Retornar a resposta
		return "Atualização realizada com sucesso: " + produto + "!";
	};

}
