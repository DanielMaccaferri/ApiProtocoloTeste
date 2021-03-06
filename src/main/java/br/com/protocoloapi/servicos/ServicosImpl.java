package br.com.protocoloapi.servicos;


import static io.restassured.RestAssured.given;

import io.restassured.response.Response;


public class ServicosImpl {
	private Response resposta;

	public Resposta getEndPoint(String endPoint, String json) {
		resposta = given().when().log().all().get(endPoint);
		return new Resposta(resposta);
	}

	public Resposta postEndPoint(String endPoint, Object body) {
		resposta = given().contentType("application/json").body(body).when().log().all().post(endPoint);
		return new Resposta(resposta);
	}

	public Resposta putEndPoint(String endPoint, Object body) {
		resposta = given().contentType("application/json").body(body).when().log().all().put(endPoint);
		return new Resposta(resposta);
	}

	public Resposta deleteEndpoint(String endPoint) {
		resposta = given().when().log().all().delete(endPoint);
		return new Resposta(resposta);
	}
	
	public Resposta postEndpointWithAuthorization(String endPoint, String token, String Coreip, Object mensagem) {
		resposta = given().header("X-Next-AuthToken",token)
				  .header("Coreip", esteira)
				  .contentType("application/json")
				  .body(mensagem).when().log()
				.  all().post(endPoint);
		return new Resposta(resposta);
		
	}
}
