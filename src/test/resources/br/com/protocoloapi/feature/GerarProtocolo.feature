#language: pt
#encoding UTF-8

@geral
Funcionalidade: Gerar Protocolo
                Eu como usuario gostaria
                de gerar um protocolo
                
@gerarprotocolo @post
Esquema do Cenario: Gerar Protocolo
       Dado que eu realize uma requisicao na API para criar um protocolo  "<conID>"  "<mediaIdd>"  "<cpf>" 
       Entao a API me retorna o status code 200
      
Exemplos:
|conId   |   mediaId              |     cpf              |
|  0     |      "C"               | 11100011133          |