# Jogo da Velha (Tic-Tac-Toe) - Projeto Android

![Android Studio Logo](https://img.shields.io/badge/Android%20Studio-3DDC84?style=for-the-badge&logo=android-studio&logoColor=white)
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![XML](https://img.shields.io/badge/XML-60AC84?style=for-the-badge&logo=xml&logoColor=white)
![Google Gemini](https://img.shields.io/badge/Google%20Gemini-131313?style=for-the-badge&logo=google-gemini&logoColor=white)

Este projeto é um aplicativo simples de **Jogo da Velha (Tic-Tac-Toe)** desenvolvido para a plataforma **Android**. Ele serve como um estudo de caso prático para **avaliar o desempenho e a qualidade do código gerado com o auxílio da inteligência artificial, especificamente o modelo Gemini 1.5 Flash**.

---

## 🎯 Objetivo do Projeto

O objetivo principal é criar uma versão funcional do clássico Jogo da Velha, enquanto simultaneamente exploramos e demonstramos as capacidades do **Gemini 1.5 Flash** no processo de desenvolvimento de software. Isso inclui desde a concepção inicial da ideia até a geração de trechos de código e a assistência na resolução de problemas.

---

## 🚀 Tecnologias Utilizadas

* **Linguagem de Programação:** Java
* **Interface de Usuário:** XML (Layouts Android)
* **Plataforma:** Android
* **Ferramenta de Geração de Código:** Gemini 1.5 Flash (Modelo de IA)

---

## ✨ Funcionalidades

O aplicativo Jogo da Velha oferece as seguintes funcionalidades básicas:

* **Tabuleiro 3x3:** Uma grade visual para representar o tabuleiro do jogo.
* **Jogadas de 'X' e 'O':** Os jogadores se revezam marcando suas posições.
* **Detecção de Vitória:** O jogo identifica automaticamente quando um jogador forma uma linha de três (horizontal, vertical ou diagonal).
* **Detecção de Empate:** Reconhece quando o tabuleiro está cheio e não há vencedor.
* **Reinício do Jogo:** Um botão dedicado para começar uma nova partida a qualquer momento.
* **Exibição de Status:** Um campo de texto que informa a vez do jogador atual, o vencedor ou se a partida terminou em empate.

---

## 🤖 O Papel da IA (Gemini 1.5 Flash)

O desenvolvimento deste aplicativo foi significativamente impulsionado pelo **Gemini 1.5 Flash**. A IA foi utilizada para:

* **Conceituação Inicial:** Ajuda a definir a estrutura básica e os requisitos do jogo.
* **Geração da Lógica Central:** Criação da classe `TicTacToeGame` em Java, responsável por toda a inteligência do jogo (controle de turnos, validação de jogadas, verificação de vitórias/empates).
* **Desenvolvimento do Layout UI:** Geração do código XML para a interface do usuário, incluindo a estrutura do `GridLayout` e os `Button`s para o tabuleiro.
* **Assistência na Depuração:** Identificação e sugestão de soluções para erros de tempo de execução, como o `InflateException` causado por referências incorretas de cores no XML.

---

## 📈 Avaliação da Qualidade e Desempenho do Código Gerado pela IA

A análise do código produzido com o auxílio do Gemini 1.5 Flash revela pontos importantes:

* **Lógica Clara e Eficiente:** A implementação em Java das regras do Jogo da Velha é concisa, legível e cobre os cenários essenciais do jogo de forma eficaz.
* **Estrutura de UI Robusta:** O XML gerado para o layout segue as melhores práticas do Android, utilizando componentes apropriados para uma interface responsiva e funcional.
* **Capacidade de Diagnóstico de Erros:** A habilidade da IA em pinpointar e oferecer soluções para erros específicos do Android (como o `UnsupportedOperationException` na cor) demonstra um entendimento contextual avançado, que é crucial na depuração.
* **Base Sólida para Desenvolvimento:** Embora o projeto final exija integração humana e configuração no Android Studio, o código gerado pela IA serve como uma excelente base, acelerando o processo de desenvolvimento e permitindo que o desenvolvedor se concentre em refinamentos e funcionalidades mais complexas.

Este projeto serve como um testemunho da capacidade das IAs de grande modelo de linguagem em serem ferramentas valiosas para desenvolvedores, otimizando o fluxo de trabalho e contribuindo para a criação de código funcional e de qualidade.

---

## ⚙️ Como Rodar o Projeto

Para executar este aplicativo em seu ambiente de desenvolvimento:

1.  **Clone o Repositório:**
    ```bash
    git clone [https://github.com/PedroPog/TicTacToe.git](https://github.com/PedroPog/TicTacToe.git)
    ```
2.  **Abra no Android Studio:**
    * No Android Studio, selecione `File > Open` e navegue até a pasta `TicTacToe` que você clonou.
3.  **Sincronize o Projeto:**
    * Aguarde o Android Studio sincronizar o projeto e baixar as dependências do Gradle.
4.  **Execute em um Emulador ou Dispositivo:**
    * Selecione um emulador Android configurado ou conecte um dispositivo Android via USB.
    * Clique no botão **Run** (ícone de play verde) na barra de ferramentas do Android Studio.
