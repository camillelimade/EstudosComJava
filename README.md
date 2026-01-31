# Estudos com Java - por Camille

Esse repositório foi criado com o intuito de centralizar meus exercícios de treinamento em Java, desenvolvidos a partir dos conteúdos estudados no **programa CapacitaRede**.

O **[CapacitaRede](https://capacitabrasil.irede.org.br/)** é uma iniciativa educacional promovida pelo Instituto iRede, por meio do Capacita Brasil, com o objetivo de fortalecer a formação técnica e profissional de estudantes e jovens do Ceará, oferecendo capacitações na área de tecnologia e desenvolvimento de _software_.

Os códigos aqui armazenados correspondem às atividades práticas, exercícios e experimentos realizados ao longo da minha jornada de aprendizagem em Java, servindo como registro da minha evolução, fixação dos conceitos estudados e apoio para estudos futuros.

## Objetivo deste Repositório
Dentre os motivos que me fizeram criar este repositório estão:
- Organização de anotações técnicas em paralelo com a atividade prática de desenvolvimento dos códigos
- Realização de exercícios que fortaleçam minha lógica de programação e a compreensão de Programação Orientada a Objetos em Java
- Registro da minha evolução, a fim de mapear e planejar como posso aprimorar minhas respostas e meu raciocínio na resolução de problemas
## Ferramentas Utilizadas

- **IDE**: IntelliJ IDEA, utilizada para o desenvolvimento e organização dos códigos
- **Plataforma**: Java 21 (JDK 21), versão utilizada nos estudos e exercícios do repositório

## Fundamentos de POO
### O que é?
A Programação Orientada a Objetos (POO) é um paradigma de programação que se baseia na abstração de objetos, com a finalidade de representar elementos do mundo real no código.

Esse paradigma organiza o código em torno de objetos, que possuem dados (atributos) e comportamentos (métodos ou funções). A POO é amplamente utilizada no mercado de tecnologia devido à sua confiabilidade, capacidade de reaproveitamento de código e facilidade na modelagem de cenários reais em estruturas que podem ser descritas por meio de linguagens de programação.

- Dentre as linguagens mais utilizadas nesse âmbito, destacam-se Java, C++ e PHP.


## O que são classes?

A classe é um molde, uma estrutura que define uma categoria de objetos por meio de seus atributos (características) e métodos (ações). Apesar de representar um modelo pré-definido, a classe não limita o uso da Programação Orientada a Objetos. Muito pelo contrário: dentro desse paradigma existem conceitos que expandem e proporcionam maior flexibilidade ao uso desses “moldes”, facilitando a vida dos desenvolvedores por meio do conhecido reaproveitamento de código.

Esses conceitos serão abordados nos próximos capítulos.
## O que é encapsulamento?

O encapsulamento é um conceito da Programação Orientada a Objetos que consiste em restringir o acesso direto aos atributos e métodos de uma classe, definindo níveis de acesso e segurança para seus dados.

Por meio do encapsulamento, é possível proteger as informações de um objeto, permitindo que elas sejam acessadas ou modificadas apenas de forma controlada, geralmente por meio de métodos específicos. Esse mecanismo contribui para a organização do código, maior segurança e facilidade de manutenção da aplicação.

Em Java, o encapsulamento é aplicado por meio de quatro níveis de acesso:

- **public**: pode ser utilizado em classes, atributos e métodos, permitindo acesso global ao projeto, desde que a classe seja importada.
- **private**: utilizado para atributos e métodos, permitindo acesso apenas dentro da própria classe.
- **visibilidade padrão (default)**: ocorre quando nenhum modificador de acesso é definido. Nesse caso, o acesso é permitido apenas dentro do mesmo pacote da classe (pacote pode ser entendido como uma pasta).
- **protected**: permite acesso dentro do mesmo pacote e também por subclasses, mesmo que estejam em pacotes diferentes, estando diretamente relacionado ao conceito de herança.

Para acessar atributos definidos como privados, é necessária a criação de métodos específicos, conhecidos como *Getters* e *Setters*, que permitem o acesso controlado a esses dados de forma externa e segura:
- **Getter (get)**: retorna ou consulta o valor de um atributo.
- **Setter (set)**: define ou altera o valor de um atributo.

## Métodos Construtores

Métodos construtores são estruturas especiais utilizadas para criar objetos. Eles são invocados no código por meio da palavra reservada _new_. Caso nenhum construtor seja definido explicitamente, o Java fornece automaticamente um construtor padrão.

O construtor possui o mesmo nome da classe e não possui tipo de retorno, nem mesmo `void`. Sua função é inicializar o objeto na memória, tornando viável a criação de instâncias da classe.

Embora o construtor seja popularmente chamado de método, esse tratamento não é totalmente adequado, pois, por definição, métodos retornam valores, enquanto o construtor apenas inicializa o objeto. Ainda assim, é comum na prática tratá-lo como um método especial da classe.

Na prática profissional, é comum a criação de construtores parametrizados, que permitem inicializar atributos no momento da criação do objeto, tornando o código mais organizado, legível e funcional, de acordo com o contexto e a finalidade do objeto.

Para isso, existem algumas regras na definição de construtores personalizados:
- O nome do construtor deve ser igual ao nome da classe.
- O construtor não possui tipo de retorno, nem mesmo `void`.
- Ele pode receber parâmetros para definir valores iniciais dos atributos.
- Ao criar um construtor manualmente, o Java deixa de gerar automaticamente o construtor padrão, sendo necessário declará-lo explicitamente caso ele ainda seja desejado.

## Conceito de Sobrecarga de Construtores

A sobrecarga permite que uma classe possua múltiplos métodos ou construtores com o mesmo nome, desde que apresentem listas de parâmetros diferentes.

Na prática, isso significa que é possível criar objetos de uma mesma classe de diferentes maneiras, variando a forma como seus atributos são inicializados no momento da criação da instância.

## Herança

A herança é um conceito da Programação Orientada a Objetos que permite que uma classe filha (subclasse) herde atributos e métodos de uma classe mãe (superclasse).

Há a conveniência de definir características e comportamentos comuns em uma classe base e, a partir dela, especializar as subclasses de acordo com suas necessidades específicas.

Em Java, utiliza-se a palavra-chave `extends` para indicar que uma classe herda outra. O relacionamento da subclasse em direção à superclasse caracteriza a herança, enquanto o processo inverso, no qual a subclasse adiciona ou modifica comportamentos, é denominado especialização.

- A palavra-chave `super` é utilizada para acessar atributos, métodos ou chamar o construtor da classe pai.

## Polimorfismo
Permite que o mesmo método seja usado em diferentes objetos com comportamentos diferentes, em que o resultado depende de sua implementação, tomando por exemplo:
- Superclasse: Automóveis
- Método: Acelerar
    - Instância Fusca: 328,195 km/h
    - Instância Palio: 171 km/h a 191 km/h

Por mais que as instâncias participem do mesmo agrupamento (a classe mãe *Automóveis*), isso não impede que elas possuam características comportamentais diferentes ao executar o mesmo método.  
Isso facilita a extensibilidade do código, pois outros tipos de subclasses que derivam de *Automóveis* podem possuir um método `acelerar` com limites ou intervalos diferentes (ainda me referindo ao contexto dessa implementação, pois isso pode variar de acordo com os objetos e agrupamentos retratados), contendo de forma controlada as variantes que podem vir a ser registradas nesse sistema, que poderia ser transcrito como um sistema de concessionária.

Como complemento e diversificação de fontes, usei como base este artigo do DevMedia:  
[Uso de Polimorfismo em Java - DevMedia](https://www.devmedia.com.br/uso-de-polimorfismo-em-java/26140)

### Tipos de Polimorfismo
Existem dois tipos de polimorfismo:
- Polimorfismo Estático (Sobrecarga)
- Polimorfismo Dinâmico (Sobreposição)

### Polimorfismo Estático (Sobrecarga)
Ocorre quando uma classe possui múltiplos métodos com o mesmo nome, porém com assinaturas diferentes (quantidade e/ou tipo de parâmetros).  
A escolha de qual método será executado acontece em tempo de compilação.  
Esse tipo de polimorfismo **não utiliza a anotação `@Override`**, pois não envolve herança nem sobrescrita de métodos.

### Polimorfismo Dinâmico (Sobreposição)
Acontece quando uma subclasse sobrescreve um método herdado da superclasse, fornecendo uma implementação específica.  
Nesse caso, a decisão de qual método será executado ocorre em tempo de execução.

A anotação `@Override` é utilizada para indicar que o método da subclasse está sobrescrevendo corretamente um método da classe mãe, aumentando a clareza do código e ajudando a evitar erros.


## Abstração

Diz respeito a criação de classes e interfaces que estabelecem uma estrutura básica para um tipo de objeto, por meio do conceito de herança.
A abstração permite criar uma "visão" geral do que a classe ou método deve fazer, mas deixa a implmentação para subclasses ou classem que estejam implementando uma interface.

## Classes Abstratas
É uma classe que serve como base e pode conter métodos abstratos e concretos, ela não pode ser instanciada diretamente. Pode conter métodos abstratos (sem corpo) e métodos concretos (com implementação), 
as classes abstratas, elas são utilizadas para definir o escopo de ações (métodos) de um conceito geral.
Elas diferentemente das interfaces permitem a criação de instâncias e métodos construtores.

## Interfaces
Uma interface pode ser explicada como uma coleção de métodos abstratos, divergentemente das classes abstratas não podem conter métodos concretos, ou seja implementáveis. Seu uso é vantajoso pois funciona como uma extensão do escopo das classes abstratas em relação a herança.
Dessa forma, ao implementar interfaces em classes essa prática oferece a possibilidade da criação de múltiplas heranças pois uma classe pode implementar várias interfaces.

| Aspecto | Classe Abstrata | Interface |
|--------|------------------|-----------|
| Métodos Abstratos | Pode conter métodos abstratos e concretos | Todos os métodos eram abstratos até o Java 7 |
| Construtores | Pode ter construtor | Não pode ter construtor |
| Variáveis de Instância | Pode conter variáveis de instância | Não permite variáveis de instância |
| Herança | Permite herança simples | Pode ser implementada por várias classes |
| Implementação Múltipla | Uma classe pode herdar de apenas uma classe abstrata | Uma classe pode implementar várias interfaces |
# Relacionamentos entre Classes ou Objetos em Java

Esses relacionamentos referem-se ao ato em que um objeto ou uma classe se relaciona com outro objeto ou outra classe. Essa conexão possui diferentes graus, que variam de simples a complexos, podendo ser representados de maneiras distintas. Três tipos principais de associação são usados para modelar o relacionamento entre objetos.

Dentre eles estão:
- Associação
- Agregação
- Multiplicidade

---

## Associação (Fraca)

É o relacionamento mais genérico, no qual um objeto sabe da existência do outro, e ambos existem de forma independente.

**Exemplo:**  
Um aluno conhece um professor, e, se o aluno for removido do sistema, o professor continuará existindo.

### Exemplo em Java:
```java
class Aluno {
    private Curso curso;
}

class Curso { 
    private String nome;
}
```

### Características:
- Uma classe possui referência à outra
- As classes podem existir de forma independente
- Pode ser unidirecional ou bidirecional

---

## Agregação (Fraca)

Um objeto todo contém outros objetos, porém estes ainda podem existir de forma independente.

**Exemplo:**  
Se um departamento for apagado, os funcionários vinculados a ele ainda podem existir de maneira independente.

### Exemplo em Java
Exemplo retirado de:  
https://dev.to/emanoelcarvalho/associacao-entre-classes-ou-objetos-em-java-d1n

```java
class Funcionario {
    private String nome;

    Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Departamento {
    private String nome;
    private Funcionario funcionario;

    Departamento(String nome, Funcionario funcionario) {
        this.nome = nome;
        this.funcionario = funcionario;
    }

    public void exibirInformacoes() {
        System.out.println("Departamento: " + nome);
        System.out.println("Funcionario: " + funcionario.getNome());
    }
}

// Mesmo que o Departamento seja destruído, o Funcionário pode continuar existindo.

public class TesteAgregacao {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Maria");
        Departamento departamento = new Departamento("RH", funcionario);

        departamento.exibirInformacoes();
        // O Departamento pode ser destruído, mas o Funcionário ainda existe.
    }
}
```

### Características:
- Relacionamento mais fraco: o objeto pai contém o objeto filho, porém não é responsável pelo seu ciclo de vida
- Existência independente: os objetos filhos podem existir sem o objeto pai

---

## Composição (Forte e Obrigatória)

Um objeto depende completamente do outro. Por exemplo, uma pessoa possui um endereço, e, se a pessoa for excluída, o endereço também será.

### Exemplo em Java:
```java
public class Endereco {
    private String rua;
    //(...)
}

public class Pessoa {
    private String nome;
    private Endereco endereco;
    //(...)
}
```

### Características:
- Relacionamento forte: o objeto pai contém o objeto filho e controla seu ciclo de vida
- Destruição: quando o objeto pai é destruído, o objeto filho também é destruído

# Tratamento de Exceções e Erros em Java

Em Java, é fundamental atentar-se aos possíveis erros que qualquer desenvolvedor, seja iniciante ou experiente, pode encontrar durante o processo de desenvolvimento. O tratamento de exceções é uma parte essencial da escrita de código **robusto e confiável**.

Ao compreender a hierarquia das exceções, a diferença entre os conceitos envolvidos e a forma correta de utilizar os blocos específicos dessa boa prática, o programador internaliza padrões de qualidade para a criação de programas que lidam de maneira **preventiva e controlada** com erros.

---

## Exceções

O tratamento de exceções é um aspecto fundamental em qualquer linguagem de programação, pois contribui diretamente para a **integridade e qualidade de um sistema**.

Em Java, todas as exceções são filhas da classe `Throwable`. Dentro dessa classe, existem duas subclasses principais:
- `Exception`
- `Error`

---

## Checked Exceptions

São exceções que o compilador **exige que sejam tratadas ou declaradas** na assinatura do método. Elas derivam da classe `Exception`, **excluindo** as subclasses de `RuntimeException`.

Esse tipo de exceção força o programador a lidar explicitamente com situações que podem ocorrer durante a execução do programa.

---

## Unchecked Exceptions

São exceções que **não precisam ser declaradas nem tratadas explicitamente** pelo compilador. Elas são subclasses de `RuntimeException`.

Normalmente, estão associadas a erros de lógica no código, como acesso a índices inválidos ou uso incorreto de objetos.

---

## Erros

Os erros representam problemas **graves**, considerados fatais, que geralmente não podem ser tratados pela aplicação. A presença de um ou mais erros no código pode impedir a compilação ou causar falhas críticas durante a execução.

Esses problemas estão, em geral, relacionados ao **ambiente de execução**, como falhas na máquina virtual ou falta de recursos do sistema, e **não devem ser tratados pelo aplicativo**. As classes desse tipo pertencem à hierarquia de `Error`.

---

## Try, Catch e Finally

As estruturas `try`, `catch` e `finally` são utilizadas para tratar exceções de forma organizada.

- O bloco `try` contém o código que pode gerar exceções.
- O bloco `catch` é responsável por tratar as exceções que ocorrerem.
- O bloco `finally` contém código que será executado independentemente de uma exceção ter ocorrido ou não.

Esses blocos permitem que o programa continue sua execução de maneira controlada, mesmo diante de falhas.

