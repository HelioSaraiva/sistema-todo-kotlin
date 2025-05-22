# sistema-todo-kotlin

# ✅ Sistema To-Do em Kotlin (Console App)

Aplicação de linha de comando (CLI) desenvolvida em **Kotlin** puro para gerenciamento de tarefas pessoais. O projeto simula um sistema de lista To-Do com operações completas de **Cadastro, Consulta, Listagem, Alteração e Remoção** de tarefas.

---

## 📸 Preview do App

![image](https://github.com/user-attachments/assets/07a5532c-c41c-4df4-86bb-877589adf916)
![image](https://github.com/user-attachments/assets/528f6b38-804f-4c1e-8c8f-a63a27b7a5f7)
![image](https://github.com/user-attachments/assets/4865cc7f-982c-451d-ba93-e7ad253e49ae)




---

## 📌 Funcionalidades

- [x] Menu interativo com layout amigável
- [x] Cadastro de nova tarefa
- [x] Consulta individual por ID
- [x] Listagem completa das tarefas
- [x] Alteração de uma tarefa existente
- [x] Remoção de tarefa por índice
- [x] Limpeza total da lista com confirmação
- [x] Validação de entrada para evitar erros

---

## 💡 Destaques Técnicos

- Desenvolvido 100% em **Kotlin puro**
- Interface baseada em **console (linha de comando)**
- Estrutura organizada em funções reutilizáveis
- Validação robusta de entrada com `Int?` e `toIntOrNull()`
- Uso do recurso `readln()` para interação com o usuário
- Ótima base para expansão com persistência em arquivo ou banco de dados

---

## 🚀 Como executar

1. Clone o repositório:
```bash
git clone https://github.com/seuusuario/sistema-todo-kotlin.git
```

2. Compile e execute com o Kotlin CLI:
```bash
kotlinc App.kt -include-runtime -d app.jar
java -jar app.jar
```

> Ou rode diretamente em uma IDE como **IntelliJ IDEA** ou **Visual Studio Code** com suporte a Kotlin.

---

## 📂 Estrutura do Projeto

```
├── App.kt          # Arquivo principal com todas as funções e lógica
└── README.md       # Documentação do projeto
```

---

## 👨‍💻 Para recrutadores

> Este projeto mostra que o desenvolvedor:

- Entende lógica de programação e estrutura de controle
- Sabe trabalhar com listas mutáveis e estruturas de repetição
- Aplica **validação defensiva** para entrada de dados
- Organiza o código de forma **modular e reutilizável**
- Cria **interfaces simples mas eficazes** para terminal

---

## 🛠️ Melhorias futuras

- [ ] Persistência de tarefas com arquivos locais (JSON ou TXT)
- [ ] Interface gráfica (Swing ou Compose Desktop)
- [ ] Versão web com Kotlin + Ktor ou Spring
- [ ] Exportação de tarefas para arquivo
- [ ] Suporte a datas e horários nas tarefas

---

## 📄 Licença

Este projeto está sob a licença MIT.  
Sinta-se livre para estudar, modificar e usar no seu portfólio!

---

## 🙋 Sobre o autor

Desenvolvido por **Helio Saraiva Buzato**  
📧 buzato@hotmail.com  
🔗 [LinkedIn](https://linkedin.com/in/heliosaraivabuzato)  
🔗 [GitHub](https://github.com/HelioSaraiva)
