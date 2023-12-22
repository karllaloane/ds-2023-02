# Diagrama de Componentes

O diagrama de componentes representa a arquitetura de componentes de um sistema que utiliza uma API REST para interações com um serviço de busca baseado no Elasticsearch.

A API REST é a camada que recebe e processa requisições externas. Contém a lógica para encaminhar requisições aos controladores e serviços apropriados.

A arquitetura apresentada no diagrama segue um padrão de desenvolvimento de software conhecido como arquitetura em camadas, onde as responsabilidades são divididas em camadas distintas. 

## Componentes

### Cliente
- Cliente web, cliente mobile ou software externo.
- Inicia a requisição.

### Controlador Web (Controller)
- Camada da aplicação que recebe requisições da API REST. É a interface de entrada para o sistema, responsável por receber e encaminhar requisições externas para as camadas internas.
- Encaminha as requisições para os serviços apropriados com base na lógica de negócios.

### Serviço (Service)
- Camada que executa a lógica de busca.
- Chamado pelo Controlador Web para processar requisições de busca.

### Repositório
- Camada que interage diretamente com o Elasticsearch para realizar consultas e atualizações.
- Define métodos de alto nível para acessar os dados no Elasticsearch. Pode ser implementado usando Spring Data Elasticsearch, que simplifica a interação com o Elasticsearch.

### Elasticsearch
- Armazena e recupera dados conforme necessário.
