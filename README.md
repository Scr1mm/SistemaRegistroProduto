# Sistema de Registro de Pedidos 

> Projeto desenvolvido em Java para consolidar conceitos fundamentais de lógica de programação, controle de fluxo e estruturas de repetição.

---

## 📌 Sobre o Projeto

Este projeto consiste em uma aplicação de terminal desenvolvida em **Java** para automatizar o registro de vendas diárias de uma lanchonete. O sistema permite cadastrar múltiplos pedidos de forma dinâmica, realiza a validação de entradas de dados e gera um relatório gerencial consolidado ao final das operações.

Além de atender às exigências básicas da atividade acadêmica, o sistema foi aprimorado com **funcionalidades extras** que oferecem métricas detalhadas sobre as vendas do estabelecimento.

---

## 🚀 Funcionalidades

### 🔹 Recursos Principais
- **Menu Interativo:** Permite cadastrar novos pedidos, consultar o relatório a qualquer momento ou encerrar a aplicação.
- **Validação de Dados:** 
  - Impede o cadastro de nomes de clientes vazios.
  - Garante que os valores das compras sejam estritamente positivos (`> R$ 0,00`).
  - Previne erros no console caso o usuário digite texto onde se espera um valor numérico.
- **Relatório Consolidado:**
  - Total de pedidos cadastrados.
  - Valor total vendido (faturamento).
  - Ticket médio por pedido.
  - Maior e menor valor de compra registrados.

### 🌟 Desafios Extras Implementados
- 📊 **Contagem de Grandes Compras:** Identifica a quantidade de vendas acima de **R$ 50,00**.
- 👑 **Destaque do Cliente:** Identifica e exibe o nome do cliente que realizou a maior compra do dia.
- 📐 **Média Filtrada:** Calcula a média de valor considerando apenas os pedidos superiores a **R$ 30,00**.
- 🎯 **Indicador de Meta:** Exibe automaticamente a mensagem **"Meta atingida!"** caso o faturamento total ultrapasse **R$ 500,00**.

---

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java (JDK 8 ou superior)
- **Manipulação de Entradas:** `java.util.Scanner`
- **Paradigma:** Programação Estruturada / Imperativa

---

## 🖥️ Como Executar o Projeto

### Pré-requisitos
Ter o [Java JDK](https://www.oracle.com/java/technologies/downloads/) instalado na sua máquina.
