# Padrão de Projeto: Observer 📈

Este repositório apresenta uma implementação prática do padrão de projeto comportamental **Observer**, desenvolvida para a disciplina de **Princípios e Padrões de Projeto** (4º semestre - IFRS).

## 📝 Contexto e Problema

O projeto simula o sistema de uma **Corretora de Bitcoin** que precisa notificar seus clientes sempre que o valor da cotação da criptomoeda sofre uma alteração.

### O Problema (Acoplamento e Ineficiência)
Sem o padrão Observer, para que os clientes soubessem o valor atualizado, eles teriam que perguntar constantemente à corretora (*polling*), o que é ineficiente. Outra alternativa ruim seria a corretora conhecer cada classe de cliente individualmente para chamá-las, o que criaria um **alto acoplamento**: se um novo tipo de alerta (SMS ou Notificação Push) fosse criado, a classe da Corretora precisaria ser modificada.

### A Solução (Observer)
A solução utiliza o padrão **Observer** para estabelecer uma relação de dependência "um-para-muitos":
1.  **Sujeito (Subject):** A classe `CorretoraBitcoin` mantém uma lista de interessados, mas não sabe quem eles são concretamente, apenas que todos seguem a interface `Observer`.
2.  **Observadores (Observers):** Os clientes (`ClienteEmail`) se registram na corretora para "ouvir" as mudanças.
3.  **Notificação Automática:** Sempre que o método `ajustaCotacao` é chamado, o sujeito percorre sua lista e avisa todos os observadores automaticamente através do método `atualizar`.

## 🏗️ Estrutura do Projeto

O código está organizado nos seguintes pacotes:

* **`corretora/CorretoraBitcoin.java`**: É o "Sujeito". Gerencia o registro, remoção e notificação dos interessados quando o estado (cotação) muda.
* **`observadores/Observer.java`**: Interface que define o contrato de atualização. Garante que a Corretora consiga notificar qualquer objeto que a implemente.
* **`observadores/ClienteEmail.java`**: Um observador concreto que reage à mudança de cotação enviando um e-mail simulado.
* **`App.java`**: Ponto de entrada que demonstra o ciclo de vida: registro de clientes, alteração de valores e remoção de assinaturas.

## ✅ Benefícios da Implementação

* **Baixo Acoplamento:** A `CorretoraBitcoin` não depende de classes concretas de clientes. Podemos adicionar `ClienteSMS` ou `ClienteApp` sem alterar uma linha de código da corretora.
* **Push Model:** A informação é enviada da fonte para os interessados apenas quando necessário, economizando processamento.
* **Flexibilidade em Tempo de Execução:** Como visto no `App.java`, clientes podem ser adicionados ou removidos da lista de notificações dinamicamente enquanto o sistema roda.

---
*Projeto desenvolvido para fins acadêmicos - IFRS.*
