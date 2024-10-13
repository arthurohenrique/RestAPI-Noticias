# RestAPI-Noticias


API REST utilizando Spring Boot e Maven, com Java 17, para facilitar o acesso a notícias e releases fornecidos pela API do IBGE. Esta API foi criada para simplificar a busca por informações atualizadas sobre o Brasil, oferecendo um ponto de integração eficiente para o consumo de dados do IBGE.

## Funcionalidades
A API conta com três endpoints principais, que permitem acessar diferentes tipos de informações disponibilizadas pelo IBGE:

/noticias: Retorna as últimas notícias publicadas pelo IBGE, incluindo informações sobre pesquisas, censo, e outros dados relevantes.

/releases: Este endpoint lista os comunicados oficiais (releases) do IBGE, que contêm informações dirigidas ao público e à imprensa.

/noticiasereleases: Um compilado que retorna tanto notícias quanto releases em uma única requisição.

## Tecnologias Utilizadas
Spring Boot: Utilizado para estruturar a aplicação, facilitar o gerenciamento de dependências, e fornecer uma abordagem rápida para construir APIs RESTful.

Maven: Gerenciamento de dependências e automação do build, simplificando a configuração do projeto e garantindo consistência entre ambientes.

Java 17: A versão mais recente de suporte de longo prazo (LTS) do Java, que oferece melhorias de performance e novos recursos que ajudam a construir uma API robusta.

RestTemplate / WebClient: Para fazer as requisições HTTP à API do IBGE, o Spring oferece duas opções que permitem a fácil integração com APIs externas.

## Como a API Funciona
Consulta à API do IBGE: Cada endpoint da API realiza uma requisição para os respectivos endpoints da API pública do IBGE. Dependendo do endpoint solicitado, a API faz uma chamada GET à API do IBGE para buscar as últimas notícias ou releases.

Resposta ao Cliente: A resposta da API é um JSON contendo as informações solicitadas pelo cliente, facilitando a integração dos dados em aplicações diversas.

## Exemplo de Uso

![image](https://github.com/user-attachments/assets/4c5194ad-e981-412e-ba45-484de9ff4c15)
