#language: pt
#encoding UTF-8


Funcionalidade: Gerar Protocolo
                Eu como usuario gostaria
                de gerar um protocolo                
                
@gerarprotocolochat @post 
Esquema do Cenario: Gerar protocolo de Chat
       Dado que eu realize uma requisicao na API para criar um protocolo  "<conID>"  "<mediaId>"  "<cpf>"  
       Entao a API me retorna o status code 200
      
Exemplos:
|conID  |mediaId     |CPF                    |
|0      |   "C"      | 11100011133           |   


@gerarprotocolosemcpfchat @post 
Esquema do Cenario: Gerar protocolo de Chat sem CPF
       Dado que eu realize uma requisicao na API para criar um protocolo de midia Chat sem cpf  "<conID>"  "<mediaId>" 
       Entao a API me retorna o status code 200
             
Exemplos:
|conID     |mediaId          |
|0         |    C            |  

  
@gerarprotocolosemconId @post 
Esquema do Cenario: Gerar protocolo de Chat sem conID
       Dado que eu realize uma requisicao na API para criar um protocolo sem conID   "<mediaId>" "<cpf>" 
       Entao a API me retorna o status code 500
      
Exemplos:
|mediaId    | CPF             |
|    C      |  11100011133    |
    
@gerarprotocolovoz @post 
Esquema do Cenario: Gerar protocolo de Voz
       Dado que eu realize uma requisicao na API para criar um protocolo de midia Voz  "<conID>"  "<mediaId>"  "<cpf>"  
       Entao a API me retorna o status code 200
      
Exemplos:
|conID  |mediaId   |CPF                    |
|0      |   V      | 11100011133           |      

@gerarprotocolovozsemcpf @post 
Esquema do Cenario: Gerar protocolo de Voz sem CPF
       Dado que eu realize uma requisicao na API para criar um protocolo de midia Voz sem cpf  "<conID>"  "<mediaId>" 
       Entao a API me retorna o status code 200
      
Exemplos:
|conID     |mediaId          |
|0         |    C            |       