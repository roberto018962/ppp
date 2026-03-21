# Padrão de Projeto: Strategy 🎯

Este repositório apresenta uma implementação prática do padrão de projeto comportamental **Strategy**, desenvolvida para a disciplina de **Princípios e Padrões de Projeto** (4º semestre - IFRS).

## 📝 Contexto e Problema

O projeto simula um sistema de recuperação de conta que precisa enviar códigos de segurança para os usuários. O desafio central é que o sistema deve suportar múltiplos canais de comunicação (E-mail, SMS, WhatsApp, Discord) que podem crescer ao longo do tempo.

### O Problema (Violação do SOLID)
Sem o padrão Strategy, a classe `Gerenciador` teria que verificar qual método de envio usar através de estruturas condicionais (`if/else` ou `switch`). Isso criaria um **alto acoplamento** e violaria o **Princípio do Aberto/Fechado (OCP)**, pois qualquer novo canal exigiria a modificação do código central do gerenciador.

### A Solução (Strategy)
A solução aplicada utiliza o padrão **Strategy** para:
1.  **Definir uma Interface Comum:** A interface `Recuperacao` estabelece o contrato `enviarCodigo`.
2.  **Encapsulamento de Algoritmos:** Cada canal de comunicação é uma classe independente que implementa a interface.
3.  **Composição sobre Herança:** O `Gerenciador` recebe qualquer objeto que implemente `Recuperacao` em tempo de execução, permitindo a troca dinâmica da estratégia de envio.

## 🏗️ Estrutura do Projeto

O código está organizado da seguinte forma:

* **`Gerenciador.java`**: Atua como o contexto. Ele mantém uma referência para a estratégia selecionada e delega a execução do envio.
* **`estrategias/Recuperacao.java`**: A interface que define o comportamento padrão para todas as estratégias de envio.
* **`estrategias/` (Implementações Concretas)**:
    * `Email.java`: Lógica de envio via E-mail.
    * `Sms.java`: Lógica de envio via SMS.
    * `Whatsapp.java`: Lógica de envio via WhatsApp.
    * `Discord.java`: Lógica de envio via Discord.
* **`App.java`**: Classe principal que demonstra a troca de estratégias "on-the-fly".
