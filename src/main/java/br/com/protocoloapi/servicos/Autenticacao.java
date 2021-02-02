package br.com.protocoloapi.servicos;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class Autenticacao {
	
	private Response resposta;
	
	public Autenticacao() {
		
	}
	
	public Resposta login(String endpoint, Object mensagem) {
		resposta = given().contentType("application/json").body(mensagem).when().log().all().post(endpoint);
		return new Resposta(resposta);
	}
}
