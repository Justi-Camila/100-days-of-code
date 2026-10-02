# Dia 01 — 02/10/2026

## Exercícios resolvidos

### 1. Fibonacci
Calcular e imprimir a sequência de Fibonacci a partir de uma
quantidade de termos informada pelo usuário.

**Principais aprendizados:**
- A sequência de Fibonacci soma apenas os **dois últimos termos**,
  não precisa guardar todos os termos numa lista
- O valor inicial de `t2` precisa ser `1`, não `2` — um erro
  de base pode parecer sutil mas quebra toda a sequência depois

### 2. Exercicio Java loops II (HackerRank)
Dado `a`, `b`, `n` por caso de teste, imprimir uma sequência de
`n` termos onde cada termo soma `a + b` mais as potências de 2
vezes `b` acumuladas.

**Principais aprendizados:**
- Diferença entre **concatenar texto** (juntar pra exibir) e
  **acumular um valor numérico** (somar a cada repetição de um loop)
- O `print` de cada termo precisa ficar **dentro** do loop que o
  gera — calcular tudo e imprimir só no final perde a sequência
- Escopo de variável: variáveis que precisam resetar a cada caso
  de teste devem ser declaradas **dentro** do loop externo, não fora
- `=` substitui o valor atual; `+=` soma ao que já existia — usar
  o errado quebra a lógica sem gerar erro de compilação

## Código
Ver `Fibonacci.java` e `SomaPotenciasDeDois.java` nesta pasta.