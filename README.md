# Aula 6 — Polimorfismo

## 1. Sobrescrita em uma hierarquia de veículos

`Veiculo` define o método `mover()`. As subclasses `Carro` e `Bicicleta` sobrescrevem esse método, mantendo sua assinatura e fornecendo implementações específicas. A anotação `@Override` permite que o compilador verifique a sobrescrita.

No `Main`, um array de referências do tipo `Veiculo` contém um `Carro` e uma `Bicicleta`. A mesma chamada `veiculo.mover()` imprime mensagens diferentes, pois Java escolhe a implementação de acordo com o tipo real do objeto em tempo de execução. Isso permite tratar objetos da mesma hierarquia de forma uniforme, preservando seus comportamentos específicos. É o polimorfismo por sobrescrita, também chamado de polimorfismo dinâmico.

## 2. Sobrecarga de métodos

A classe `Calculadora` oferece três assinaturas:

- `somar(int a, int b)`: soma dois inteiros.
- `somar(int a, int b, int c)`: soma três inteiros.
- `somar(double a, double b)`: soma dois valores do tipo double.

A sobrecarga permite reutilizar o mesmo nome de método com diferentes quantidades, tipos ou ordens de parâmetros. Alterar apenas o tipo de retorno não é suficiente para sobrecarregar um método. O compilador seleciona a versão aplicável conforme os argumentos e seus tipos conhecidos na compilação. Esse mecanismo é frequentemente chamado de polimorfismo estático.

Na sobrescrita, uma subclasse redefine um método herdado com a mesma assinatura, e a implementação é escolhida em tempo de execução pelo tipo real do objeto. Na sobrecarga, os métodos têm assinaturas diferentes, não exigem herança e a versão é selecionada em tempo de compilação.

## Executar no IntelliJ IDEA

Abra o projeto e execute o método `main` de `src/Main.java` pelo botão verde ao lado do método. O projeto utiliza somente Java, sem dependências externas.

## Saída esperada

```text
=== 1. Sobrescrita de métodos ===
O carro está dirigindo
A bicicleta está pedalando

=== 2. Sobrecarga de métodos ===
somar(2, 3) = 5
somar(-5, 8) = 3
somar(1, 2, 3) = 6
somar(10, -4, 0) = 6
somar(2.5, 3.7) = 6.2
somar(-1.5, 0.5) = -1.0
```
