package cafeteriaApp;

import cafeteriaApp.controller.bebidaController;
import cafeteriaApp.controller.funcionarioController;
import cafeteriaApp.controller.pedidosController;
import cafeteriaApp.controller.produtoController;
import cafeteriaApp.controller.sobremesaController;
import cafeteriaApp.controller.usuarioController;
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

		// sobremesa
		Spark.get("/sobremesa/lista", sobremesaController.obterLista);
		Spark.post("/sobremesa/incluir", sobremesaController.incluir);
		Spark.delete("/sobremesa/:id/excluir", sobremesaController.excluir);
		Spark.get("/sobremesa/:id", sobremesaController.obter);
		Spark.put("/sobremesa/:id/atualizar", sobremesaController.atualizar);
		
		//bebida
		Spark.get("/bebida/lista", bebidaController.obterLista);
		Spark.post("/bebida/incluir", bebidaController.incluir);
		Spark.delete("/bebida/:id/excluir", bebidaController.excluir);
		Spark.get("/bebida/:id", bebidaController.obter);
		Spark.put("/bebida/:id/atualizar", bebidaController.atualizar);
				

	}

}
