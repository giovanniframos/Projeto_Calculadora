# 📘 Projeto - Calculadora (Original + Refatorado)

Trabalho acadêmico contendo:
- Código original da calculadora
- Código refatorado
- Notação de grafo de fluxo
- Complexidade ciclomática
- Caminhos básicos
- Testes
- Javadoc

---

# 📂 Estrutura do Projeto


---

# 🧪 1. Código Original (Resumo)

O código original realiza as operações básicas:

- Soma (+)  
- Subtração (-)  
- Multiplicação (*)  
- Divisão (/) com verificação de divisão por zero  

Problemas identificados:
- Função longa usando muitos `if/else`
- Variável global desnecessária (`r`)
- Tratamento de erro via `System.out.print`
- Baixa legibilidade

---

# 🛠️ 2. Código Refatorado (Resumo)

Melhorias:
- Uso de `switch-case`
- Lançamento de exceções (`IllegalArgumentException`)
- Remoção de variável global
- Melhor legibilidade
- Comentários Javadoc
- Código preparado para testes

---

# 🔀 3. Grafo de Fluxo (Original)

Representação simplificada:

      ┌───────── (+) ───────────┐
      │                          │
      │                          ▼
(Start) → (Verifica operação) → (Result) → (End)
│
├────────── (-) ───────────►
│
├────────── (*) ───────────►
│
└─────── (/) ────────┐
▼
(b == 0?)
│ │
│ └─► Erro → End
▼
Divisão válida → End

---

# 🧮 4. Complexidade Ciclomática

Fórmula usada:

V(G) = E − N + 2


Ou simplesmente:

Decisões no código original:
1. `if(op.equals("+"))`
2. `else if(op.equals("-"))`
3. `else if(op.equals("*"))`
4. `else if(op.equals("/"))`
5. `if(b == 0)`
6. `else` (operação inválida)

---

### ✔ Resultado:

V(G) = 6 + 1 = 7

**Complexidade ciclomática = 7**

---

# 🧭 5. Caminhos Básicos

Com base na complexidade (7), temos 7 caminhos independentes:

1. Caminho da soma
2. Caminho da subtração
3. Caminho da multiplicação
4. Caminho da divisão
5. Caminho da divisão por zero
6. Caminho da operação inválida
7. Caminho de entrada → retorno padrão

---

# ▶ 6. Como executar o projeto

## **Para compilar (projeto Maven)**

### ▶ Código original
./mvnw clean package

shell
Copiar código

### ▶ Rodar a classe diretamente
java com.example.Calculadora.TesteCalculadora

yaml
Copiar código

---

# 📚 7. Como gerar o Javadoc no Eclipse ou VSCode

Dentro da pasta onde estão os .java:

javadoc -d docs src/main/java/com/example/Calculadora/*.java

nginx
Copiar código

Ou no refatorado:

javadoc -d docs refatorado/src/com/example/Calculadora/*.java

yaml
Copiar código

Vai gerar:

docs/
index.html

yaml
Copiar código

Abra no navegador.

---

# 📋 8. Planilha de Teste (Caixa Branca Estática)

| Item avaliado                         | Resultado |
|---------------------------------------|-----------|
| Código está documentado?              | ❌ Não (original) / ✔ Refatorado |
| Nomenclatura de variáveis correta?    | ✔ Sim |
| Legibilidade e organização?           | ❌ Baixa no original / ✔ Boa no refatorado |
| Tratamento de NullPointer?            | ✔ Não ocorre |
| Conexões fechadas corretamente?       | N/A |
| Complexidade ciclomática              | **7** |
| Caminhos básicos                      | **7** |

---

# ✔ 9. Checklist da atividade (Professor)

- [x] Código original
- [x] Código refatorado
- [x] Grafo de fluxo
- [x] Complexidade ciclomática
- [x] Caminhos básicos
- [x] Planilha de teste
- [x] README.md completo
- [x] Projeto público no GitHub

---

# ✨ Autor

**Giovanni**
Curso: Análise e Desenvolvimento de Sistemas  
Disciplina: UX/UI – Engenharia de Software  
