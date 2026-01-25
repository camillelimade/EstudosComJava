# Estudos com Java - por Camille

Esse repositório foi criado com o intuito de centralizar meus exercícios de treinamento em Java, desenvolvidos a partir dos conteúdos estudados no **programa CapacitaRede**.

O **[CapacitaRede](https://capacitabrasil.irede.org.br/)** é uma iniciativa educacional promovida pelo Instituto iRede, por meio do Capacita Brasil, com o objetivo de fortalecer a formação técnica e profissional de estudantes e jovens do Ceará, oferecendo capacitações na área de tecnologia e desenvolvimento de software.

Os códigos aqui armazenados correspondem às atividades práticas, exercícios e experimentos realizados ao longo da minha jornada de aprendizagem em Java, servindo como registro da minha evolução, fixação dos conceitos estudados e apoio para estudos futuros.

## Objetivo deste Repositório
Dentre os motivos que me fizeram criar este repositório estão:
- Organização de anotações técnicas em paralelo com a atividade prática de desenvolvimento dos códigos
- Realização de exercícios que fortaleçam minha lógica de programação e a compreensão de Programação Orientada a Objetos em Java
- Registro da minha evolução, a fim de mapear e planejar como posso aprimorar minhas respostas e meu raciocínio na resolução de problemas
## Ferramentas Utilizadas

- **IDE**: IntelliJ IDEA, utilizada para o desenvolvimento e organização dos códigos
- **Plataforma**: Java 21 (JDK 21), versão utilizada nos estudos e exercícios do repositório

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
