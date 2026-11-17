# 🎤 Mad Libs Java — TWICE Edition 💖

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ_IDEA-000000?style=for-the-badge&logo=intellij-idea&logoColor=white)
![Status](https://img.shields.io/badge/status-concluído-brightgreen?style=for-the-badge)

> 🎲 Um jogo de **Mad Libs** no terminal, feito em Java: você digita palavras sem saber o contexto e o programa monta uma historinha maluca sobre um show do **TWICE**! 🍭✨

---

## 📚 Sumário

- [🧐 O que é Mad Libs?](#-o-que-é-mad-libs)
- [🎮 Como o jogo funciona](#-como-o-jogo-funciona)
- [🖥️ Exemplo de execução](#️-exemplo-de-execução)
- [🛠️ Tecnologias](#️-tecnologias)
- [📁 Estrutura do projeto](#-estrutura-do-projeto)
- [🚀 Como executar](#-como-executar)
- [🧠 O que este projeto pratica](#-o-que-este-projeto-pratica)
- [💡 Ideias para evoluir](#-ideias-para-evoluir)
- [👨‍💻 Autor](#-autor)

---

## 🧐 O que é Mad Libs?

**Mad Libs** é uma brincadeira de palavras: alguém pede adjetivos, substantivos e verbos **sem mostrar a história**, e depois as palavras são encaixadas nos espaços em branco. O resultado quase sempre é engraçado e sem sentido! 🤪

---

## 🎮 Como o jogo funciona

1. ⌨️ O programa pede **5 palavras**, uma de cada vez:

   | # | Tipo de palavra | Variável no código |
   |---|-----------------|--------------------|
   | 1️⃣ | Adjetivo (descrição) | `adjective1` |
   | 2️⃣ | Substantivo ou pessoa | `noun1` |
   | 3️⃣ | Adjetivo (descrição) | `adjective2` |
   | 4️⃣ | Verbo terminado em **-ing** (ação) | `verb1` |
   | 5️⃣ | Adjetivo (descrição) | `adjective3` |

2. 🧩 Ele encaixa as palavras no texto da história.
3. 🎉 Mostra a história final no terminal, em 4 linhas.

> 💬 As instruções e a história do jogo estão em **inglês**.

---

## 🖥️ Exemplo de execução

```text
Enter an a adjective (description): 
amazing
Enter an noun () or person:
dragon
Enter an adjective (description): 
sleepy
Enter a verb end with -ing (action): 
dancing
Enter an adjective (description): 
happy
Today i went to a amazing TWICE concert.
in a exhibit, I saw dragon.
dragon was sleepy and dancing!
I Was happy!
```

> ✏️ As palavras `amazing`, `dragon`, `sleepy`, `dancing` e `happy` foram digitadas pela pessoa que joga. Experimente outras para criar histórias diferentes! 🌈

---

## 🛠️ Tecnologias

- ☕ **Java** — linguagem do projeto
- 📥 **`java.util.Scanner`** — leitura das palavras digitadas no terminal
- 🧠 **IntelliJ IDEA** — IDE usada no desenvolvimento (projeto configurado com JDK 25)

---

## 📁 Estrutura do projeto

```text
madLibsJava/
├── 📂 .idea/            # Configurações do IntelliJ IDEA
├── 📂 src/
│   └── 📄 main.java     # Código do jogo
├── 📄 .gitignore
└── 📄 madLibsJava.iml   # Arquivo de módulo do IntelliJ
```

---

## 🚀 Como executar

### 🔧 Pré-requisitos

- ☕ Ter o **JDK** (Java Development Kit) instalado. O projeto foi criado com o JDK 25 no IntelliJ, mas o código usa apenas `java.util.Scanner`.

### 1️⃣ Clone o repositório

```bash
git clone https://github.com/jvnagos21/madLibsJava.git
cd madLibsJava
```

### 2️⃣ Compile

```bash
javac src/main.java
```

### 3️⃣ Execute

```bash
java -cp src main
```

### 💻 Pelo IntelliJ IDEA

1. 📂 Abra a pasta do projeto no IntelliJ.
2. ▶️ Abra `src/main.java` e clique no botão de **Run** ao lado do método `main`.
3. ⌨️ Digite as palavras no console e divirta-se!

---

## 🧠 O que este projeto pratica

- 📝 Declaração de variáveis do tipo `String`
- ⌨️ Entrada de dados com `Scanner` e `nextLine()`
- 🔗 Concatenação de strings com o operador `+`
- 🖨️ Saída no terminal com `System.out.println`
- 🔒 Fechamento do recurso com `scanner.close()`

---

## 💡 Ideias para evoluir

- 🎨 Criar várias histórias e sortear uma a cada partida
- 🔁 Perguntar se a pessoa quer jogar de novo ao final
- 🌎 Traduzir as instruções e a história para português
- 🧱 Separar o código em métodos e classes
- 🛡️ Validar as entradas (por exemplo, impedir texto vazio)
- 🎶 Trocar o tema da história pelo seu grupo ou artista favorito

---

## 👨‍💻 Autor

Feito com 💜 por **João Vitor** — [@jvnagos21](https://github.com/jvnagos21)

⭐ Se você curtiu o projeto, deixe uma estrela no repositório!
