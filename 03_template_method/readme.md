# Padrão de Projeto: Template Method 🧪

Este repositório apresenta uma implementação prática do padrão de projeto comportamental **Template Method**, desenvolvida para a disciplina de **Princípios e Padrões de Projeto** (4º semestre - IFRS).

## 📝 Contexto e Problema

O projeto simula uma linha de produção de fertilizantes industriais (como NPK e Supersimples). O processo de fabricação segue uma sequência rigorosa de etapas técnicas, mas os componentes utilizados variam conforme o tipo de produto.

### O Problema (Duplicação e Rigidez)
Sem o padrão Template Method, cada classe de fertilizante teria que implementar todo o algoritmo de produção repetidamente. Isso causaria duplicação de código nas etapas comuns (como dosagem e mistura) e aumentaria o risco de erro humano, como pular a etapa crítica de análise de umidade em um dos produtos.

### A Solução (Template Method)
A solução utiliza o padrão **Template Method** para definir o esqueleto do algoritmo na classe base:
1.  **O Método Template:** O método `produzir()` na classe `Fertilizante` é definido como `final`. Isso garante que a ordem das operações (selecionar materiais, dosar, misturar e analisar umidade) seja fixa e imutável para todas as subclasses.
2.  **Passos Abstratos (Ganchos):** O método `selecionar_materiais()` é abstrato. Cada fertilizante específico (NPK ou Supersimples) decide quais materiais coletar, preenchendo essa "lacuna" no algoritmo.
3.  **Passos Concretos:** Etapas como `dosificar()`, `misturar()` e `analisar_umidade()` são implementadas uma única vez na classe mãe, garantindo que o controle de qualidade seja idêntico para todos os produtos.

## 🏗️ Estrutura do Projeto

* **`Fertilizante.java`**: Classe abstrata que define o método template `produzir()` e a lógica comum de umidificação e análise.
* **`Npk.java`**: Subclasse que define os materiais específicos (Nitrogênio, Fósforo e Potássio) e a umidade ideal de 0.2f.
* **`Supersimples.java`**: Subclasse que define seus materiais (Cálcio, Fósforo e Enxofre) e a umidade ideal de 0.15f.
* **`Main.java`**: Ponto de entrada que executa a produção dos diferentes tipos de fertilizantes.

## ⚙️ Funcionamento do Algoritmo
O algoritmo possui um comportamento inteligente de **recursividade** na análise de umidade:
* Se a umidade detectada for inferior à `umidade_ideal`, o sistema aciona automaticamente o método `umidecer()` e reavalia a mistura até que o padrão de qualidade seja atingido.
