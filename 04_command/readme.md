# Padrão de Projeto: Command ⌨️

Este repositório apresenta uma implementação prática do padrão de projeto comportamental **Command**, desenvolvida para a disciplina de **Princípios e Padrões de Projeto** (4º semestre - IFRS).

## 📝 Contexto e Problema

O projeto simula a interface de um **Editor de Texto** que possui botões para operações comuns, como "Copiar" e "Colar". O objetivo é gerenciar como essas solicitações são disparadas pela interface e executadas pelo núcleo do sistema.

### O Problema (Acoplamento de Interface)
Sem o padrão Command, os componentes da interface gráfica (os botões) precisariam conhecer detalhes da implementação do editor para realizar as ações. Isso criaria um **alto acoplamento**: o código do botão ficaria "sujo" com lógica de negócio e seria difícil reutilizar o mesmo botão para funções diferentes ou implementar funcionalidades como filas de tarefas ou históricos de desfazer (undo).

### A Solução (Command)
A solução utiliza o padrão **Command** para transformar cada solicitação em um objeto autônomo:
1.  **Interface Comando:** A interface `Comando` define o contrato `executar()`, padronizando como qualquer ação será disparada.
2.  **Encapsulamento:** As classes `ComandoCopiar` e `ComandoColar` encapsulam a solicitação, guardando uma referência para o **Receptor** (`Editor`) que realmente sabe como manipular o texto.
3.  **Invocador Genérico:** A classe `Botao` não sabe o que o comando faz. Ela apenas guarda uma referência para um objeto do tipo `Comando` e o executa quando o usuário interage com ela. Isso permite trocar a função de um botão em tempo de execução.

## 🏗️ Estrutura do Projeto

* **`Editor.java`**: É o **Receptor** (Receiver). Contém a lógica de negócio real para copiar e colar texto.
* **`Comando.java`**: Interface que define a operação padrão para todos os comandos.
* **`ComandoCopiar.java` / `ComandoColar.java`**: Comandos concretos que vinculam o Invocador ao Receptor.
* **`Botao.java`**: É o **Invocador** (Invoker). Carrega um comando e o dispara sem conhecer seus detalhes internos.
* **`Main.java`**: Classe principal que configura o sistema, associa comandos aos botões e demonstra a flexibilidade do padrão.
