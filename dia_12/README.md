# Dia 12 — 15/10/2026

## O que foi feito

### 1. DIP, DI, IoC

Principais aprendizados:

- Compreendido como aplicar os conceitos no projeto prático (o CreateJobService recebe o repositório pelo construtor, e o Spring decide o adapter)

### 2. HackerRank (Lonely Integer)

Objetivo: descobrir o número que não se repete (pasta `lonely_integer`)

Principais aprendizados:

- Contar a frequência com um Map de números
- Ler o problema e realizar um paso a passo para orientar na definição do código
- Método getOrDefault() recebe uma chave e um padrão, e devolve o valor da chave, ou o padrão caso a chave não exista
- Estava procurando pelo índice i ao invés do numero, e comparava getKey() quando queria getValue()
- (Map.Entry<Integer, Integer> entrada : mapa.entrySet()) -> Utilizado para acessar os métodos getValue() e getKey()
- Próximo passo: iniciar Java HashSet
