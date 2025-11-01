# 📚 Java Fundamentals - Conceitos e Aprendizados

Repositório com exercícios práticos sobre os fundamentos da linguagem Java, cobrindo desde lógica sequencial até programação orientada a objetos.

---

## 📋 Índice

- [Lógica Sequencial](#-lógica-sequencial)
- [Condicionais](#-condicionais)
- [Estruturas de Repetição](#-estruturas-de-repetição)
- [Arrays e Collections](#-arrays-e-collections)
- [Scanner e Conversões](#-scanner-e-conversões)
- [Programação Orientada a Objetos](#-programação-orientada-a-objetos)
- [Exceções](#-exceções)

---

## 🔢 Lógica Sequencial

### Variáveis e Tipos Primitivos
- **Tipos numéricos**: `int`, `long`, `double`, `float`
- **Tipos de caractere**: `char`
- **Tipo booleano**: `boolean`
- **Inferência de tipo**: uso de `var` para declaração simplificada

### Operadores Aritméticos
- Operações básicas: adição, subtração, multiplicação, divisão
- Cálculo de valores com múltiplas variáveis
- Trabalho com salários, descontos e horas extras

**Conceitos principais:**
- Declaração e inicialização de variáveis
- Tipagem estática e inferência de tipos
- Operações matemáticas e manipulação de valores numéricos

---

## 🔀 Condicionais

### Estruturas Condicionais

#### If/Else
- Comparações entre valores numéricos
- Comparações entre strings (usando `equals()` e `Objects.equals()`)
- Verificação de tipos e objetos

#### Switch/Case
- Seleção múltipla baseada em valores
- Aplicação prática: verificação de idade por faixas etárias

#### Operador Ternário
- Condições inline para atribuição simplificada
- Sintaxe: `condição ? valorSeVerdadeiro : valorSeFalso`

### Operadores Lógicos
- **E (&&)**: ambas condições devem ser verdadeiras
- **OU (||)**: pelo menos uma condição deve ser verdadeira
- **NÃO (!)**: inverte o valor booleano

**Conceitos principais:**
- Controle de fluxo com condições
- Comparação de valores e objetos
- Lógica booleana e operadores relacionais

---

## 🔁 Estruturas de Repetição

### While
- Executa um bloco enquanto uma condição é verdadeira
- Útil quando não sabemos quantas iterações serão necessárias
- Contador incremental

### Do-While
- Garante pelo menos uma execução do bloco
- Verifica a condição após a primeira execução
- Diferença sutil com `while` tradicional

### For
- Loop com contador controlado
- Estrutura: `for(inicialização; condição; incremento)`
- Ideal para iterações com número conhecido de repetições

**Conceitos principais:**
- Loops e iterações
- Controle de fluxo repetitivo
- Quando usar cada tipo de estrutura de repetição

---

## 📦 Arrays e Collections

### Arrays
- Estrutura de dados para armazenar múltiplos valores do mesmo tipo
- Tamanho fixo após inicialização
- Acesso por índice

### ArrayList
- Lista dinâmica que cresce conforme necessário
- Métodos principais:
  - `add()`: adiciona elementos
  - `remove()`: remove elementos
  - `size()`: retorna o tamanho
  - `contains()`: verifica existência
  - `isEmpty()`: verifica se está vazia
  - `forEach()`: iteração moderna

### HashMap
- Estrutura de dados chave-valor
- Armazenamento de pares associativos

**Conceitos principais:**
- Estruturas de dados básicas
- Collections Framework
- Manipulação de listas e iterações

---

## ⌨️ Scanner e Conversões

### Scanner
- Leitura de dados do console (`System.in`)
- Métodos principais:
  - `nextLine()`: lê uma linha completa (String)
  - `nextInt()`: lê um inteiro
  - `nextLong()`: lê um long
  - `nextDouble()`: lê um double
- Interação com o usuário via terminal

### Conversão de Tipos
- **Conversão explícita**: `double` para `int` usando `intValue()`
- **Conversão implícita**: manipulação de strings para números
- Métodos utilitários: `toString()`, `parseInt()`, etc.

**Conceitos principais:**
- Entrada de dados do usuário
- Conversão entre tipos primitivos e objetos
- Manipulação de tipos de dados

---

## 🎯 Programação Orientada a Objetos

### Classes e Objetos
- Definição de classes como modelos
- Instanciação de objetos
- Atributos e métodos

### Métodos
- **Métodos de instância**: associados a objetos específicos
- **Métodos estáticos**: podem ser chamados sem instanciar a classe
- **Parâmetros**: passagem de valores para métodos
- **Retorno**: tipos de retorno e valores

### Construtores
- Inicialização de objetos
- Construtor vazio e com parâmetros
- Uso de `this` para referenciar atributos

### Encapsulamento
- Modificadores de acesso: `private`, `public`, `protected`
- **Getters**: métodos para ler valores de atributos privados
- **Setters**: métodos para modificar valores de atributos privados
- Proteção de dados e controle de acesso

**Exemplo prático**: `ContaBancaria` com atributos privados e métodos públicos de acesso

### Herança
- Relação pai-filho entre classes
- Palavra-chave `extends`
- Herança de atributos e métodos
- Uso de `super` para acessar classe pai

**Exemplo prático**: `Animal` (classe pai) e `Cachorro`, `Gato` (classes filhas)

### Polimorfismo

#### Sobrecarga de Métodos
- Múltiplos métodos com mesmo nome mas assinaturas diferentes
- Diferenças em tipos ou quantidade de parâmetros
- Resolução em tempo de compilação

**Exemplo prático**: `Calculadora` com métodos `somar()` para diferentes tipos

#### Sobrescrita de Métodos
- Métodos redefinidos em classes filhas
- Anotação `@Override`
- Resolução em tempo de execução (polimorfismo dinâmico)
- JVM decide qual método chamar baseado no tipo real do objeto

**Exemplo prático**: `Departamento`, `Funcionario` e `FrotaVeiculos` sobrescrevendo métodos

### Abstração
- Classes abstratas e métodos abstratos
- Modelagem de conceitos genéricos
- Uso de `super()` em construtores para inicializar classes pai

**Exemplo prático**: `Endereco` (classe abstrata) e `Funcionario` (herda endereço)

### Interfaces
- Contratos que classes devem implementar
- Definição de métodos sem implementação
- Múltiplas implementações possíveis
- Palavra-chave `implements`

**Conceitos principais:**
- Os quatro pilares da POO: Encapsulamento, Herança, Polimorfismo e Abstração
- Organização de código orientado a objetos
- Reutilização de código e manutenibilidade

---

## ⚠️ Exceções

### Exceções Verificadas (Checked)
- Exceções que o compilador obriga a tratar
- Uso de `try-catch` obrigatório
- Exemplo: `IOException` ao ler arquivos
- `FileNotFoundException` ao trabalhar com arquivos

### Exceções Não Verificadas (Unchecked)
- Exceções de tempo de execução
- `RuntimeException` e suas subclasses
- Não obrigatório tratar, mas recomendado

### Tratamento de Exceções
- Bloco `try-catch`: captura e tratamento de erros
- Bloco `finally`: código que sempre executa
- Lançamento de exceções: `throw`
- Mensagens de erro informativas

### Exceções Personalizadas
- Criação de exceções próprias
- Herança de `Exception` ou `RuntimeException`
- Exemplo: `ConflictException` para validação de CPF

**Conceitos principais:**
- Tratamento de erros robusto
- Boas práticas de manipulação de exceções
- Validação e segurança de dados
- Exceções customizadas para casos específicos

---

## 📁 Estrutura do Projeto

```
Java Fundamentals/
├── logica-sequencial/          # Variáveis e operadores básicos
├── condicionais/               # If/else, switch, ternário
├── repeticao/                  # While, do-while, for
├── array-scanner/              # Arrays, Collections, Scanner, Conversões
├── programacao-orientada-objetos/  # POO completa
└── excecoes-java/              # Tratamento de exceções
```

---

## 🎓 Resumo dos Aprendizados

Este projeto abrange os fundamentos essenciais do Java, desde conceitos básicos até programação orientada a objetos avançada:

✅ **Fundamentos**: variáveis, tipos, operadores  
✅ **Controle de Fluxo**: condicionais e repetições  
✅ **Estruturas de Dados**: arrays e collections  
✅ **POO**: classes, objetos, herança, polimorfismo, encapsulamento  
✅ **Tratamento de Erros**: exceções verificadas e não verificadas  
✅ **Boas Práticas**: organização de código e encapsulamento adequado

---

## 🚀 Como Utilizar

Cada módulo é independente e contém exemplos práticos. Os arquivos `Main.java` em cada pasta demonstram a execução dos conceitos aprendidos.

Para executar, utilize uma IDE Java (IntelliJ IDEA, Eclipse, VS Code) ou compile via terminal:

```bash
javac src/Main.java
java Main
```

---

**Desenvolvido como material de estudo dos fundamentos da linguagem Java** 🎯

