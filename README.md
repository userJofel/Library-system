# Library System

Sistema simples de gerenciamento de biblioteca feito em Java, com funcionamento via terminal.  
O projeto permite cadastrar usuários, cadastrar livros, realizar empréstimos, devolver livros, buscar registros por ID e listar informações cadastradas.

## Sobre o projeto

Este projeto foi criado como parte do meu aprendizado em Java, praticando conceitos importantes da programação orientada a objetos.

O sistema trabalha com usuários, livros e empréstimos, simulando o funcionamento básico de uma biblioteca.

## Funcionalidades

- Criar usuários
- Criar livros
- Buscar usuário por ID
- Buscar livro por ID
- Realizar empréstimo de livro
- Devolver livro
- Listar usuários cadastrados
- Listar livros cadastrados
- Listar empréstimos ativos
- Verificar se um livro está disponível ou indisponível

## Tecnologias utilizadas

- Java
- Programação Orientada a Objetos
- ArrayList
- Scanner
- Git e GitHub

## Conceitos praticados

- Classes e objetos
- Encapsulamento
- Getters e setters
- Métodos
- Construtores
- Listas com `ArrayList`
- Estrutura de repetição
- Estrutura condicional
- Organização de responsabilidades em classes
- IDs automáticos com atributo `static`

## Estrutura do projeto

```bash
Library-system/
├── src/
│   ├── Main.java
│   ├── LibraryService.java
│   ├── Usuario.java
│   ├── Livro.java
│   └── Loan.java