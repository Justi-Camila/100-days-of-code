# Dia 17 — 23/10/2026

## O que foi feito

### 1. Exercícios de POO: composição de classes e `toString` (Endereço/Conta e Música/Álbum)

Objetivo: Criar classes que se relacionam por composição (`Conta` → `Cliente` → `Pessoa`/`Endereco`, e `Album` → `Artista`/`Musica`) e imprimir o objeto completo no console (pasta `poo/endereco` e `poo/musica`)

Principais aprendizados:

- Sobrescrever o `toString()` com `@Override` para controlar o que aparece no `System.out.println(objeto)`
- Em objetos que contêm outros objetos, o `toString()` do pai chama automaticamente o `toString()` do filho, então cada classe cuida da própria formatação
- Evitar o `'\n'` no final do `toString()`, que gera linhas em branco quando o objeto está dentro de outro
- Imprimir uma lista sem os colchetes: o `List.toString()` sempre devolve `[a, b, c]`, então a classe deve guardar o `List<Musica>` e montar o texto no `toString()` (com `for` ou com `stream().map().collect(Collectors.joining("\n"))`)
- Todo campo que deve aparecer na saída precisa estar no `return` do `toString()`; um campo fora dele existe na classe, mas nunca é impresso
- Principal dificuldade: deixar a saída organizada (indentação e espaços a mais) quando há vários objetos aninhados

## Links
[Repositório Java Básico](https://github.com/Justi-Camila/java-basico)