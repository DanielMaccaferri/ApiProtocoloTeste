#language:pt
#encoding UTF-8

@geral
Funcionalidade: Buscar Protocolo
                Eu como usuario gostaria
                de buscar um Protocolo
     
@buscarprotocolo @get                
Esquema do Cenario: Buscar Protocolo
       Dado que eu realize uma requisicao na API para consultar um protocolo com  "<conID>"  "<mediaId>"  "<cpf>"  
       Entao a API me retorna o status code 200
      

      
Exemplos:
|conID  |mediaId   |CPF                    |
|0      |   C      | 11100011133           | 





                