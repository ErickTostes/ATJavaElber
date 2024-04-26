package cafeteriaApp.controller;

import com.google.gson.Gson;

import cafeteriaApp.model.domain.Pedidos;
import cafeteriaApp.service.PedidosService;
import spark.Route;

public class pedidosController {

	public static Route obterLista = (req, res) -> {

		return PedidosService.obterLista();
	};

	public static Route incluir = (req, res) -> {
		// Ler os dados do corpo da requisição
		String requestBody = req.body();

		// Converter o JSON do corpo da requisição para um objeto Funcionario
		Gson gson = new Gson();
		Pedidos pedido = gson.fromJson(requestBody, Pedidos.class);

		// Adicionar o funcionário com os dados recebidos
		PedidosService.incluir(pedido);

		// Retornar a resposta
		return "Inclusão realizada com sucesso: " + pedido + "!";
	};

	public static Route excluir = (req, res) -> {

		Integer index = Integer.valueOf(req.params("id"));

		Pedidos pedido = PedidosService.obterPorId(index);

		PedidosService.excluir(index);

		return "Exclusão realizada com sucesso: " + pedido + "!";
	};

	public static Route obter = (req, res) -> {

		Integer index = Integer.valueOf(req.params("id"));

		Pedidos pedido = PedidosService.obterPorId(index);

		return "Recuperação realizada com sucesso: " + pedido + "!";
	};

	public static Route atualizar = (req, res) -> {
		// Ler os dados do corpo da requisição
		String requestBody = req.body();

		// Converter o JSON do corpo da requisição para um objeto Funcionario
		Gson gson = new Gson();
		Pedidos pedido = gson.fromJson(requestBody, Pedidos.class);

		// Atualizar o funcionário com os dados recebidos
		PedidosService.atualizar(pedido);

		// Retornar a resposta
		return "Atualização realizada com sucesso: " + pedido + "!";
	};
}
