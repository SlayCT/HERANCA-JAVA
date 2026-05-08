# Exercícios de Programação Orientada a Objetos em Java

## Sobre o projeto
Este projeto reúne exercícios desenvolvidos em Java com foco nos principais conceitos de Programação Orientada a Objetos (POO), como:
- Classes e objetos
- Interfaces
- Encapsulamento
- Herança
- Polimorfismo

Os exercícios simulam situações reais, como gerenciamento de funcionários, sistema de pagamentos e autenticação de usuários.

---

# Exercício 1 — Sistema de Funcionários

## Descrição
Criação de uma interface `Funcionario` e das classes:
- `Gerente`
- `Vendedor`
- `Faxineiro`

Cada funcionário possui a funcionalidade genérica:
- Bater ponto

E funcionalidades específicas:
- Gerente → fechar caixa
- Vendedor → realizar venda
- Faxineiro → solicitar material

## Conceitos aplicados
- Interface
- Implementação de métodos
- Organização em classes

---

# Exercício 2 — Sistema de Pagamentos

## Descrição
Criação da interface `Pagamento` com os métodos:
- `calcularPagamento()`
- `emitirRecibo()`

Implementações:
- `PagamentoCartao`
- `PagamentoDinheiro`

## Regras de negócio
- Cartão → taxa de 5%
- Dinheiro → desconto de 10%

O sistema realiza:
- cálculo do valor final
- emissão de recibos

## Conceitos aplicados
- Interface
- Polimorfismo
- Sobrescrita de métodos

---

# Exercício 3 — Sistema de Autenticação

## Descrição
Criação da interface `Autenticavel` e da classe `SistemaDeSeguranca`.

O sistema:
- valida login e senha
- permite autenticação
- realiza logout

## Login padrão
Usuário:
admin

Senha:
1234

## Conceitos aplicados
- Encapsulamento
- Interface
- Estruturas de repetição
- Validação de dados

# Tecnologias utilizadas
- Java
- Eclipse IDE
