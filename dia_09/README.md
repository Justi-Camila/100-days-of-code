# Dia 09 — 10/10/2026

## O que foi feito

### 1. Projeto Gestão vagas (arquitetura hexagonal)

Criação do Adapter CompanyRepositoryAdapter e da interface CompanyJpaRepository (arquivo `CompanyRepositoryAdapter` e `CompanyJpaRepository`).

Principais aprendizados:

- @Repository faz o Spring criar o bean
- Basicamente igual ao JobRepositoryAdapter, porém, devolve um boolean diferente do JobRepositoryAdapter que tem o mapper para converter o Job em JobJpaEntity
- O Adapter tem exatamente os métodos da porta que ele implementa, nem mais, nem menos
- Próximo passo: Resolver os JobController e portar o GET de listar vagas

### 2. HackerRank (Staircase)

Objetivo: imprimir uma pirâmide de '#' com right-aligned (`pasta staircase`).

Principais aprendizados:

- Encontrar o método certo para repetir os espaçamentos
- Próximo passo: refatorar o Staircase e iniciar Java String Reverse


## Links
- [Repositório Gestão de Vagas](https://github.com/Justi-Camila/gestao-vagas)