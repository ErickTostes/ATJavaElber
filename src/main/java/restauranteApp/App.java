package restauranteApp;

import restauranteApp.controller.bebidaController;
import restauranteApp.controller.funcionarioController;
import restauranteApp.controller.pedidosController;
import restauranteApp.controller.produtoController;
import restauranteApp.controller.pratoController;
import restauranteApp.controller.usuarioController;
import spark.Spark;

public class App {

	public static void main(String[] args) {
		Spark.port(8080);

		Spark.get("/", (req, res) -> {
			return App.class.getResourceAsStream("/index.html");
		});

		// usuario
		Spark.get("/usuario/lista", usuarioController.obterLista);
		Spark.post("/usuario/nome/incluir", usuarioController.incluir);
		Spark.delete("/funcionario/:id/excluir", usuarioController.excluir);
		Spark.get("/funcionario/:id", usuarioController.obter);
		Spark.put("/funcionario/:id/atualizar", usuarioController.atualizar);

		// FUNCIONÁRIO
		Spark.get("/funcionario/lista", funcionarioController.obterLista);
		Spark.post("/funcionario/nome/incluir", funcionarioController.incluir);
		Spark.delete("/funcionario/:id/excluir", funcionarioController.excluir);
		Spark.get("/funcionario/:id", funcionarioController.obter);
		Spark.put("/funcionario/:id/atualizar", funcionarioController.atualizar);

		// pedidos
		Spark.get("/pedidos/lista", pedidosController.obterLista);
		Spark.post("/pedidos/incluir", pedidosController.incluir);
		Spark.delete("/pedidos/:id/excluir", pedidosController.excluir);
		Spark.get("/pedidos/:id", pedidosController.obter);
		Spark.put("/pedidos/:id/atualizar", pedidosController.atualizar);

		// cardapio - produtos
		Spark.get("/produto/lista", produtoController.obterLista);
		Spark.post("/produto/incluir", produtoController.incluir);
		Spark.delete("/produto/:id/excluir", produtoController.excluir);
		Spark.get("/produto/:id", produtoController.obter);
		Spark.put("/produto/:id/atualizar", produtoController.atualizar);

		// prato
		Spark.get("/prato/lista", pratoController.obterLista);
		Spark.post("/prato/incluir", pratoController.incluir);
		Spark.delete("/prato/:id/excluir", pratoController.excluir);
		Spark.get("/prato/:id", pratoController.obter);
		Spark.put("/prato/:id/atualizar", pratoController.atualizar);
		
		//bebida
		Spark.get("/bebida/lista", bebidaController.obterLista);
		Spark.post("/bebida/incluir", bebidaController.incluir);
		Spark.delete("/bebida/:id/excluir", bebidaController.excluir);
		Spark.get("/bebida/:id", bebidaController.obter);
		Spark.put("/bebida/:id/atualizar", bebidaController.atualizar);
				

	}

}
