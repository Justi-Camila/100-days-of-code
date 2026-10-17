# Dia 13 — 16/10/2026

## O que foi feito

### 1. HackerRank (Java HashSet)

Objetivo: contar os pares únicos após cada leitura, tratando (a, b) e (b, a) como o mesmo par (pasta `hashset`)

Principais aprendizados:

- Tempo O(T): laço de T pares
- Espaço O(T): o Set guarda até T chaves
- Só acrescentar algo quando souber exatamente o caso que ele resolve, o .trim() nesse caso não resolvia
- Quando a ordem não importa, normalize a chave
- compareTo() devolve negativo, zero ou positivo e serve para escolher uma ordem fixa ao montar a chave
- Baixei a entrada do teste, rodei com o arquivo e comparei com o gabarito até achar o primeiro par repetido que o programa não detectou
- Total de dicas: 2 sobre o código (a ideia da chave em ordem fixa e o esqueleto com lacunas) 
- Próximo passo: iniciar Java Singleton Pattern
