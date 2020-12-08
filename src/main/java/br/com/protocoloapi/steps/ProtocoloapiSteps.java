package br.com.protocoloapi.steps;

import com.google.gson.Gson;

import br.com.protocoloapi.pojos.Protocolo;
import br.com.protocoloapi.servicos.Resposta;
import br.com.protocoloapi.servicos.ServicosImpl;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;

public class ProtocoloapiSteps {

	Protocolo protocolo = new Protocolo();
	Gson gson = new Gson();
	ServicosImpl verbos = new ServicosImpl();
	Resposta validarAssercao = new Resposta();
	
	@Dado("^que eu realize uma requisicao na API para criar um protocolo  \"([^\"]*)\"  \"([^\"]*)\"  \"([^\"]*)\"$")
	public void que_eu_realize_uma_requisicao_na_API_para_criar_um_protocolo(String conID, String mediaId, String cpf)
			throws Throwable {
		protocolo.setConID(conID);
		protocolo.setMediaId(mediaId);
		protocolo.setCpf(cpf);

		String json = gson.toJson(protocolo);
		verbos.postEndPoint("http://192.168.246.242:8080/v1/protocol/protocols", json);
	}


	@Entao("^a API me retorna o status code \"([^\"]*)\"$")
	public void a_API_me_retorna_o_status_code(Integer statusCode) throws Throwable {
		validarAssercao.getResposta().statusCode(statusCode).log().all();

	}

}
