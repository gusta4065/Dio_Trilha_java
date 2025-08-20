### **Criação de APIs: Conectando Aplicações com Padrões de Qualidade**

#### **1. O que é uma API?**

Uma **API** (Application Programming Interface) é uma **interface de programação de aplicações**. Em termos simples, uma API atua como um contrato, definindo as regras e protocolos para que diferentes softwares possam se comunicar e interagir entre si. A API é um conjunto de serviços padronizados.

Pense na API como um garçom em um restaurante: você (uma aplicação) não vai direto para a cozinha (o _backend_ do outro software) fazer seu pedido. Em vez disso, você entrega o pedido ao garçom (a API), que o leva para a cozinha e traz a resposta de volta para você.

**Funcionalidades de uma API:**

- Ela serve para **processar dados em serviços** e responder a outras aplicações.
    
- É um tipo de aplicação _backend_ projetada para fornecer serviços de maneira padronizada.
    
- Ela se baseia em um protocolo de comunicação para que o código seja processado de forma padronizada.
    

#### **2. O Protocolo HTTP: A Base da Comunicação**

O **HTTP** (_Hypertext Transfer Protocol_) é o protocolo mais utilizado para a comunicação na web. Ele funciona como a "linguagem" que clientes (como um navegador ou uma aplicação) e servidores usam para trocar dados, como JSON.

A comunicação HTTP se baseia em um ciclo de **requisição e resposta**:

- **Requisição**: O cliente envia um pedido ao servidor com um **URL** (que identifica o recurso) e um **método HTTP** (que indica a ação desejada).
    
- **Resposta**: O servidor processa a requisição e envia uma resposta de volta, que inclui um **código de status HTTP** e, opcionalmente, um corpo com os dados solicitados.
    

**Principais Elementos do HTTP para APIs:**

- **Métodos (ou Verbos) HTTP:** São os verbos que definem a ação a ser executada no recurso. Os mais comuns em APIs RESTful são:
    
    - `GET`: Usado para buscar ou ler dados de um recurso. Não deve alterar dados no servidor.
        
    - `POST`: Usado para enviar dados e criar um novo recurso no servidor.
        
    - `PUT`: Usado para atualizar um recurso completamente, substituindo-o pelo novo dado fornecido.
        
    - `PATCH`: Usado para atualizar um recurso parcialmente, enviando apenas os campos que devem ser alterados.
        
    - `DELETE`: Usado para remover um recurso do servidor.
        
- **Códigos de Status:** São códigos numéricos que indicam o resultado de uma requisição. Eles são agrupados em classes para facilitar o entendimento:
    
    - `1xx` - Informativo (requisição recebida, processo continua).
        
    - `2xx` - Sucesso (a ação foi recebida e processada com sucesso). Ex: `200 OK`, `201 Created` (para `POST`).
        
    - `3xx` - Redirecionamento (ação adicional é necessária para completar a requisição).
        
    - `4xx` - Erro do Cliente (a requisição tem um erro de sintaxe ou não pode ser satisfeita). Ex: `400 Bad Request`, `404 Not Found`.
        
    - `5xx` - Erro do Servidor (o servidor falhou ao processar uma requisição válida). Ex: `500 Internal Server Error`.
        
- **Headers (Cabeçalhos):** São metadados (pares de chave-valor) que fornecem informações adicionais sobre a requisição ou resposta. Eles podem conter detalhes como o tipo de conteúdo (`Content-Type: application/json`), credenciais de autenticação, ou o idioma preferido do cliente.
    

#### **3. Padrões de Arquitetura de APIs: REST**

O padrão de arquitetura mais popular para APIs é o **REST** (_Representational State Transfer_). As APIs que o seguem são chamadas de **APIs RESTful**. Uma API RESTful é uma aplicação que resolve um problema de negócio com base nos padrões do protocolo REST.

As principais características do REST são:

- **Arquitetura Cliente-Servidor:** Separa a interface do usuário (o cliente) da lógica de negócios e do armazenamento de dados (o servidor).
    
- **Comunicação _Stateless_ (Sem Estado):** Cada requisição do cliente deve conter todas as informações necessárias para ser concluída. O servidor não armazena o estado do cliente entre as requisições.
    
- **Sistema em Camadas:** A comunicação entre cliente e servidor pode passar por camadas intermediárias (como caches).
    
- **Interface Uniforme:** A API deve usar um conjunto de métodos e recursos padronizados para simplificar as interações.
    

O mapa mental também menciona a **Transferência de Estado Representacional**, que é a tradução de um estado de um recurso para um formato que pode ser transferido (como JSON). Essa é a essência do REST: transferir representações dos estados dos recursos.