#language: pt
#encoding UTF-8


Funcionalidade: Gerar Protocolo
                Eu como usuario gostaria
                de gerar um protocolo
                
                
@gerarprotocolo @post 
Esquema do Cenario: Gerar protocolo de Chat
       Dado que eu realize uma requisicao na API para criar um protocolo  "<conID>"  "<mediaId>"  "<cpf>"  
       Entao a API me retorna o status code 200
      
Exemplos:
|conID  |mediaId   |CPF                    |
|0      |   C      | 11100011133           |   


@gerarprotocolosemchat @post 
Esquema do Cenario: Gerar protocolo de Chat sem CPF
       Dado que eu realize uma requisicao na API para criar um protocolo  "<conID>"  "<mediaId>" 
       Entao a API me retorna o status code 200
      
Exemplos:
|conID  |mediaId   |
|0      |    C     |  
  