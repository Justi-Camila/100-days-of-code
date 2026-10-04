# Dia 02 — 03/10/2026

## O que foi feito

### 1. Refatoração hexagonal — Projeto Gestão de Vagas
Continuação da refatoração do projeto [gestao-vagas](https://github.com/Justi-Camila/gestao-vagas)
para arquitetura hexagonal (ports and adapters), começando pelo fluxo de Job.

**Principais aprendizados:**
- Entendi a estrutura do `JobController` original: usa Swagger/OpenAPI
  (`@Tag`, `@Operation`, `@ApiResponses`) e `@PreAuthorize` com roles do
  Spring Security (ex: `"COMPANY"`)
- Identifiquei que o endpoint que usa `ListAllJobsByCompanyUseCase` ainda
  não foi portado pra arquitetura hexagonal — próximo passo
- Rodei `mvnw clean compile` e confirmei que o código hexagonal do Job
  (52 arquivos) compila sem erros
- Próximo passo: aplicar o mesmo padrão pro fluxo de `candidates`, por conta própria

### 2. Java — Curso Nélio Alves (Udemy)
**Tópicos de hoje:** Estrutura Sequencial

**Principais aprendizados:**
- _Como as variáveis estão alocadas na RAM_

### 3. OCI Foundations (Oracle)
**Tópicos de hoje:** OCI Introduction

**Principais aprendizados:**
- Possui 7 categorias principais
- Região é composta por domínios de disponibilidade
- Domínios de falhas -> mínimo de 3 por domínio de disponibilidade 
- Oracle Data Guard -> garante que os dados principais e stand-by fiquem sincronizados
- Segundo data center para recuperação de desastres ou backup
- Cloud Shell -> vem com vários utilitários pré-autenticados (Como CLI, Git, Java)
- Code Editor -> ambiente de edição no console que permite editar código e atualizar workflows sem precisar alternar entre console e ambiente de desenvolvimento

## Links
- [Repositório Gestão de Vagas](https://github.com/Justi-Camila/gestao-vagas)