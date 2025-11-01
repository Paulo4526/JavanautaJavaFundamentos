# 📚 Java Fundamentals

Repositório com exercícios práticos dos fundamentos da linguagem **Java**, desde lógica básica até programação orientada a objetos.

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
- **Tipos primitivos:** `int`, `long`, `double`, `float`, `char`, `boolean`
- **Inferência de tipo:** uso de `var`
- **Operadores aritméticos:** `+`, `-`, `*`, `/`
- **Conceitos:** declaração, inicialização, tipagem e manipulação numérica

---

## 🔀 Condicionais
- **If/Else:** comparações de valores e objetos (`equals()`)
- **Switch/Case:** seleção múltipla
- **Ternário:** `condição ? valor1 : valor2`
- **Operadores lógicos:** `&&`, `||`, `!`
- **Conceito:** controle de fluxo e lógica booleana

---

## 🔁 Estruturas de Repetição
- **While:** executa enquanto condição for verdadeira
- **Do-While:** executa ao menos uma vez
- **For:** loop com contador
- **Conceito:** iterações e controle de repetição

---

## 📦 Arrays e Collections
- **Arrays:** tamanho fixo, acesso por índice
- **ArrayList:** lista dinâmica (`add`, `remove`, `size`, `contains`, `isEmpty`, `forEach`)
- **HashMap:** pares chave-valor
- **Conceito:** estruturas de dados e manipulação de coleções

---

## ⌨️ Scanner e Conversões
- **Scanner:** leitura de dados (`nextLine`, `nextInt`, `nextDouble`, etc.)
- **Conversões:**
  - Implícita e explícita entre tipos (`parseInt`, `toString`, cast)
- **Conceito:** entrada de dados e manipulação de tipos

---

## 🎯 Programação Orientada a Objetos

### Conceitos
- **Classes e Objetos:** modelo e instância
- **Métodos:** instância e estáticos, parâmetros e retorno
- **Construtores:** inicialização com ou sem parâmetros (`this`)
- **Encapsulamento:** `private`, `public`, `protected`, getters e setters
- **Herança:** `extends`, `super`, reutilização de código
- **Polimorfismo:**
  - *Sobrecarga:* múltiplos métodos com mesmo nome
  - *Sobrescrita:* redefinição com `@Override`
- **Abstração:** classes e métodos abstratos
- **Interfaces:** contratos implementáveis (`implements`)
- **Pilares:** Encapsulamento, Herança, Polimorfismo e Abstração

---

## ⚠️ Exceções
- **Verificadas:** `IOException`, `FileNotFoundException`
- **Não verificadas:** `RuntimeException` e subclasses
- **Tratamento:** `try-catch-finally`, `throw`
- **Personalizadas:** herdam de `Exception` ou `RuntimeException`
- **Conceito:** tratamento de erros e validação segura

---

## 🎓 Resumo
✅ **Fundamentos:** variáveis, tipos e operadores  
✅ **Fluxo:** condicionais e loops  
✅ **Dados:** arrays e collections  
✅ **POO:** classes, herança, polimorfismo, encapsulamento  
✅ **Exceções:** tratamento e personalização  

---

## 🚀 Como Utilizar
Cada módulo contém exemplos práticos com um `Main.java`.  
Execute com uma IDE (IntelliJ, Eclipse, VS Code) ou via terminal:

```bash
javac src/Main.java
java Main
