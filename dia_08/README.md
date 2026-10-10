# Dia 08 — 09/10/2026

## O que foi feito

### 1. Projeto Gestão vagas (arquitetura hexagonal)

Criação dos testes unitários do CreateJobService, usando Mockito para simular as portas JobRepository e CompanyRepository (arquivo `CreateJobServiceTest`).

Principais aprendizados:

- Escrever os testes na ordem -> caminho feliz, depois o caminho de erro, cada um com o seu verify ou assert
- Ler a mensagem de erro e achar a linha que quebrou
- Verificar se o teste realmente protege algo, quebrando o código de propósito
- Sempre fazer as seguintes perguntas (como entra/sai, quais são os caminhos, quais as dependências, como provo)
- Próximo passo: criar o CompanyRepositoryAdapter

### 2. HackerRank (Plus minus)

Objetivo: calcular a proporção de elementos positivos, negativos e zeros de um array, imprimindo cada fração com 6 casas decimais (`pasta plus_minus`).

Principais aprendizados:

- Entender o problema e a sua fórmula para poder passar para o código
- Próximo passo: deixar o código genérico (Plus minus) e iniciar Staircase

### 3. API-Node

Objetivo: entender a estrutura de um projeto em TypeScript utilizando o framework Fastify.

Principais aprendizados:

- Utilização de scripts automatizados facilitam ao rodar a aplicação
- Garantia da integridade dos dados utilizando o validador de dados Zod

### 4. AZ-900

Objetivo: entender as ferramentas e monitoramento

Principais aprendizados:

- Portal do Azure -> utilizado para ver painéis e fazer tarefas pontuais
- Azure Cloud Shell -> rodar comando sem instalar nada na máquina
- Azure CLI -> automação e scripts, com sintaxe enxuta
- Azure Arc -> gerenciar servidores locais e outras nuvens no mesmo painel
- Azure Advisor -> sugere melhorias e analisa os recursos
- Azure Status -> mostra incidentes que afetam regiões ou serviços inteiros (painel público)
- Azure Service Health -> mostra o que impacta as suas assinaturas (manutenção programada/meus recursos)
- Log Analytics -> onde os logs ficam guardados e onde roda consultas KQL (Kusto Query Language)
- Application Insights -> mede tempo de resposta, taxa de erro (voltado para aplicações)
- Próximo passo: realizar o simulado

## Links
- [Repositório Gestão de Vagas](https://github.com/Justi-Camila/gestao-vagas)
- [Repositório API-Node](https://github.com/Justi-Camila/API-Node) 