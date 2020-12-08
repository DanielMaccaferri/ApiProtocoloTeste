package br.com.protocoloapi.servicos;

public interface Servicos {	

	Resposta getEndPoint(String endPoint);
    Resposta postEndPoint(String endPoint, Object body);
    Resposta putEndPoint(String endPoint, Object body);
    Resposta deleteEndpoint(String endPoint);

}
