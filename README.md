![Conversor de Moedas](images/moedas.png)

## Descrição

Neste emocionante desafio de programação, somos convidados a construir um Conversor de Moedas em Java. O projeto envolve fazer requisições a uma API de taxas de câmbio, manipular dados JSON, e filtrar e exibir as moedas de interesse. A experiência proporcionará uma oportunidade prática no desenvolvimento Java, incluindo a interação textual com os usuários via console.

## Objetivo

O objetivo é desenvolver um Conversor de Moedas que ofereça interação textual com os usuários, proporcionando no mínimo 6 opções distintas de conversões de moedas em um menu. A taxa de conversão será obtida dinamicamente por meio de uma API, garantindo dados precisos e em tempo real para uma experiência mais atualizada e eficaz.

## Funcionalidades

- Requisição a uma API de taxas de câmbio
- Manipulação de dados JSON
- Filtro de moedas de interesse
- Exibição de resultados aos usuários
- Menu interativo com pelo menos 6 opções de conversão de moedas

## Estrutura do Projeto

### Classes e Enum

#### `ConsultaMoeda`

Classe responsável por buscar a taxa de conversão de uma moeda para outra utilizando uma API de taxas de câmbio.

#### `BuscaChaveValor`

Classe responsável por buscar o nome completo de uma moeda a partir de sua sigla.

#### `Moedas`

Enum que representa diversas moedas e seus nomes completos.

### Configuração do Ambiente

1. Instale o JDK (Java Development Kit).
2. Configure a variável de ambiente JAVA_HOME.
3. Instale um IDE de sua escolha (IntelliJ IDEA, Eclipse, etc.).

### Criação do Projeto

1. Crie um novo projeto Java na sua IDE.
2. Adicione as dependências necessárias (por exemplo, Gson para manipulação de JSON).

### Consumo da API

1. Utilize a classe `ConsultaMoeda` para fazer requisições HTTP à API de taxas de câmbio.
2. Manipule a resposta JSON para extrair a taxa de conversão.

### Análise da Resposta JSON

1. Utilize a biblioteca Gson para parsear o JSON recebido da API.
2. Extraia os dados necessários e converta-os para os tipos apropriados.

### Filtro de Moedas

1. Utilize a classe `BuscaChaveValor` para buscar e filtrar as moedas de interesse.
2. Exiba as opções de moedas disponíveis para conversão.

### Exibição de Resultados

1. Implemente um menu interativo no console.
2. Ofereça pelo menos 6 opções distintas de conversões de moedas.
3. Mostre os resultados das conversões aos usuários.

## Como Utilizar

1. Clone este repositório.
2. Importe o projeto em sua IDE.
3. Execute a classe principal para iniciar o conversor de moedas.
4. Siga as instruções no console para escolher as moedas e ver as taxas de conversão em tempo real.

## Ferramentas Utilizada

![Git](https://img.shields.io/badge/GIT-E44C30?style=for-the-badge&logo=git&logoColor=white)
![Windows](https://img.shields.io/badge/Windows-000?style=for-the-badge&logo=windows&logoColor=2CA5E0)

## Sistema Ágil de Desenvolvimento

### Trello

Para facilitar o gerenciamento do desenvolvimento, utilizei o Trello conforme descrito:

- **Pronto pra iniciar:** Cartões com tarefas ainda não desenvolvidas.
- **Desenvolvendo:** Tarefas em desenvolvimento.
- **Pausado:** Tarefas iniciadas, mas pausadas.
- **Concluído:** Tarefas finalizadas.

## Contribuição

1. Faça um fork do projeto.
2. Crie uma branch para sua feature (`git checkout -b feature/NovaFeature`).
3. Commit suas mudanças (`git commit -m 'Adiciona nova feature'`).
4. Push para a branch (`git push origin feature/NovaFeature`).
5. Abra um Pull Request.

## Licença

Este projeto está licenciado sob a Licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## Contatos

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/claudio-gloria-vargas-34574537/)
[![Facebook](https://img.shields.io/badge/Facebook-1877F2?style=for-the-badge&logo=facebook&logoColor=white)](https://www.facebook.com/cgvinfo/)	
[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/CGVARGAS)


🎸Claudio G. Vargas

Analista e Desenvolvedor de Sistemas 🍃
