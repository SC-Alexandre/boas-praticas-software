### 1. Qual era o principal problema do código original?
O principal problema era a falta de legibilidade, organização e aderência às boas práticas de programação. O código concentrava todas as responsabilidades no método `main`, utilizava variáveis genéricas e não descritivas (`n`, `a`, `b`, `c`) o que dificultava a compreensão e a manutenção por outros desenvolvedores.

### 2. Quais melhorias você realizou?
* **Nomenclatura semântica:** Substituição dos nomes de variáveis por identificadores claros (`nomeAluno`, `nota1`, `nota2`, `media`, `resultado`).
* **Modularização:** Divisão do fluxo em métodos dedicados com responsabilidades únicas (`calcularMedia`, `verificarAprovacao` e `apresentarResultado`).
* **Eliminação do valor fixo no código:** Introdução da constante `MEDIA_MINIMA_APROVACAO` (6.0) no escopo da classe.
* **Código limpo e padronizado:** Código autocomentado e adequação às convenções de código da linguagem Java (*camelCase* e indentação consistente).

### 3. Como a modularização facilitou a organização do código?
A modularização aplicou o princípio da responsabilidade única, separando o cálculo matemático, a regra de negócio da aprovação e a exibição de dados no console. Isso tornou o método `main` limpo, facilitou o reaproveitamento de código e tornou a leitura do fluxo muito mais intuitiva.

### 4. Como o Git ajudou a controlar as alterações realizadas no sistema?
O Git permitiu rastrear todo o histórico evolutivo da refatoração do projeto. Ele possibilitou registrar cada fase de melhoria em commits sequenciais, trabalhar em uma branch isolada sem afetar o código base e utilizar o Pull Request como documentação formal das mudanças antes da integração final à branch principal via merge.