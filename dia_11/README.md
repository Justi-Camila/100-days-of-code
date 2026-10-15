# Dia 11 — 14/10/2026

## O que foi feito

### 1. HackerRank (Mini-Max Sum)

Objetivo: o problema pede duas somas (somando 5 dos 4 elementos), a menor excluindo o maior valor, e a maior excluindo o menor (`pasta mini_max_sum`)

Principais aprendizados:

- Identificar o que o enunciado pede
- Entender o motivo do erro de overflow e corrigi-lo com o mapToLong
- O Optional aparece na resposta devido a falta de um valor inicial no reduce
- Próximo passo: refatorar os códigos

### 2. DIP, DI, IoC

Objetivo: entender o significado de cada uma

Principais aprendizados:

- DIP (princípio do SOLID) -> módulos de alto e baixo nível dependem de abstrações, não de implementações concretas
- IoC (princípio) -> quem cria e controla os objetos deixa de ser a própria classe e passa a ser um container ou framework
- DI (técnica) -> a classe recebe as dependências de fora, em vez de usar new. É a forma de implementar a IoC e uma das formas de aplicar o DIP

- Próximo passo: Aplicar os conhecimentos no projeto (`gestao-vagas`)