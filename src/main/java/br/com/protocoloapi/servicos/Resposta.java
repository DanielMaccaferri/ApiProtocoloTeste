package br.com.protocoloapi.servicos;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class Resposta {

	private static Response resposta;

	public Resposta(Response resposta) {
		Resposta.resposta = resposta;
	}

	public Resposta() {

	}

	public ValidatableResponse getResposta() {
		return resposta.then().log().all();
	}

	public Integer receberStatusCode(Integer statusCode) {

		return resposta.statusCode();

	}

	public String salvarToken(String caminho) {
		return resposta.jsonPath().get(caminho).toString();
	}
}
