# Dia 07 — 08/10/2026

## O que foi feito

1. Projeto Gestão vagas (arquitetura hexagonal)

Início do teste unitário do CreateJobService, usando Mockito para simular as portas JobRepository e CompanyRepository (arquivo `CreateJobServiceTest`). Ainda em andamento.

Principais aprendizados:

O CreateJobService não tem anotação do Spring, então no teste ele é criado com new, passando os mocks no construtor (sem @Autowired)
Teste unitário não precisa subir o Spring nem o banco: o service só depende de interfaces, e os mocks fazem o papel delas
Próximo passo: terminar o teste do caso de sucesso e escrever o caso em que a empresa não existe


2. HackerRank (Diagonal Difference)

Objetivo: calcular a diferença absoluta entre a soma da diagonal principal e a da diagonal secundária de uma matriz quadrada (`pasta diagonal_difference`).

Principais aprendizados:

A matriz chega como List<List<Integer>>, então o acesso ao valor é .get(i).get(j); usar .size() devolve o tamanho, não o elemento
Em vez de índices fixos, usar o padrão: diagonal principal em (i, i); na secundária, linha + coluna = n - 1
Entender a fórmula do problema antes de codar, para deixá-la o mais genérica possível (vale para qualquer tamanho de matriz)
Debugar no papel e no IntelliJ ajuda a compreender o que realmente acontece
Travei em descobrir o .get().get() e em generalizar a fórmula da matriz
Levei mais de 1h30 no exercício; a prova tem 1h30, então vale treinar com cronômetro
Próximo passo: iniciar Plus Minus

## Links
- [Repositório Gestão de Vagas](https://github.com/Justi-Camila/gestao-vagas)