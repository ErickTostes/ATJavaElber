package cafeteriaApp.controller;

import com.google.gson.Gson;

import cafeteriaApp.model.domain.Funcionario;
import cafeteriaApp.service.FuncionarioService;
import spark.Route;

public class funcionarioController {

		public static Route obterLista = (req, res) -> {
			
			return FuncionarioService.obterLista();
		};
		
		public static Route incluir = (req, res) -> {
		    // Ler os dados do corpo da requisição
		    String requestBody = req.body();

		    // Converter o JSON do corpo da requisição para um objeto Funcionario
		    Gson gson = new Gson();
		    Funcionario funcionario = gson.fromJson(requestBody, Funcionario.class);

		    // Adicionar o funcionário com os dados recebidos
		    FuncionarioService.incluir(funcionario);

		    // Retornar a resposta
		    return "Inclusão realizada com sucesso: " + funcionario + "!";
		};
		
		public static Route excluir = (req, res) -> {
			
			Integer index = Integer.valueOf(req.params("id"));
			
			Funcionario funcionario = FuncionarioService.obterPorId(index);		
	
			FuncionarioService.excluir(index);		
			
			return "Exclusão realizada com sucesso: "+funcionario+"!";
		};
		
		public static Route obter = (req, res) -> {
			
			Integer index = Integer.valueOf(req.params("id"));
			
			Funcionario funcionario = FuncionarioService.obterPorId(index);		
					
			return "Recuperação realizada com sucesso: "+funcionario+"!";
		};
		
		public static Route atualizar = (req, res) -> {
		    // Ler os dados do corpo da requisição
		    String requestBody = req.body();

		    // Converter o JSON do corpo da requisição para um objeto Funcionario
		    Gson gson = new Gson();
		    Funcionario funcionario = gson.fromJson(requestBody, Funcionario.class);

		    // Atualizar o funcionário com os dados recebidos
		    FuncionarioService.atualizar(funcionario);

		    // Retornar a resposta
		    return "Atualização realizada com sucesso: " + funcionario + "!";
		};

}
