# Diagrama de Contêineres

O diagrama de contêineres representa a arquitetura de contêineres de um sistema, destacando os principais componentes e suas interações.

![image](https://github.com/karllaloane/ds-2023-02/assets/108896016/dcd5eed6-f796-49e8-b2d5-3244a2e5fd1a)


## Componentes

### Cliente Web
- Representa a interface do usuário, geralmente um aplicativo da web ou cliente web.
- É um contêiner que interage diretamente com a API REST para realizar requisições.

### API REST
- Representa a camada de API REST que recebe e processa requisições do Cliente Web.
- É um contêiner que contém lógica de negócios e interage com o Load Balancer para distribuir o tráfego.

### LoadBalancer (Nginx)
- Representa o servidor Nginx, utilizado como um balanceador de carga.
- É responsável por distribuir as requisições entre os nós da base de dados para otimizar o desempenho e a escalabilidade.

### Elasticsearch cluster
- Representa o armazenamento de dados Elasticsearch.
- É um contêiner de dados responsável por armazenar e recuperar informações em resposta às requisições da API REST.
- Pode ser formado por vários nós, com o objetivo de proporcionar escalabilidade horizontal, distribuindo a carga e melhorando a capacidade geral do sistema.
