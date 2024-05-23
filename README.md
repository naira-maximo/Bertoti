# Software Engineering

Within Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software: engineering after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). The addition of time adds an important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t programming.

We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth.

Software Engineering at Google: https://abseil.io/resources/swe-book

*******

## Atividade 1

> O que é Engenharia de Software?

A Engenharia de Software engloba não somente a programação, mas questões que conferem o quão durável e ampliável é o software em questão.
Essa função requer uma análise de uso e seus parâmetros de crescimento.
Algumas perguntas refletidas na Engenharia de Software:
* O software será funcional mesmo com um crescimento de usuários, comparado aos acessos já esperados (software escalável)?
* O software terá qualidade e manterá sua usabilidade ao longo do tempo? O quanto esse software está preparado para receber atualizações e implementações?

As linguagens de programação não precisam obedecer a uma hierarquia. Cada necessidade ou preferência do programador interfere na escolha. Precisa avaliar para que uma linguagem tem melhor desempenho, as características principais e a aplicabilidade na demanda em questão.

Trade-offs:

Uma escolha, planejadas a longo prazo ou não, de perder alguma funcionalidade ou recurso possibilitando ganhar outros fatores que sejam mais viáveis para o projeto/aplicação em questão. 
Exemplo: por mais que a linguagem Java seja mais "complicada" comparada a outras linguagens de alto nível (perde), a portabilidade foi viabilizada, pois é compatível em vários sistemas e dispositivos (JVM).

*******

## Atividade 2

> Nas aulas de sexta-feira, discutimos sobre Engenharia de Software e trade-offs. Cite 3 exemplos de trade-offs (em software) e explique conforme comentários que fizemos na sexta.

Na empresa em que trabalho, são utilizados arquivos compartilhados em nuvem, seja no OneDrive ou Google Drive. Portanto, listas de preços dos fornecedores, planilhas de venda e compra, relatórios mensais, tudo está disponível para a visualização e atualização constante dos envolvidos de forma simultânea. É utilizada uma plataforma encomendada para gerar Purchase/Sales Orders, Invoices e outros documentos com os part numbers cadastrados, onde todo e qualquer gerenciamento do software precisa ser feito pela empresa desenvolvedora.
Com certeza não é a melhor opção, tanto pela velocidade de busca, quanto pela possibilidade de migrar dados, etc. Porém, é uma empresa composta majoritariamente por pessoas com pouco conhecimento tecnológico e com muita resistência a mudanças. O trabalho utilizando Excel compartilhado está presente desde o nascimento da empresa e, embora novos funcionários indiquem um novo software e o desenvolvimento de uma plataforma própria, um treinamento da equipe e contratar alguém para migrar os dados já cadastrados com parâmetros funcionais é evitado. O requisito de experiência com as tecnologias já utilizadas, curva de aprendizado, ferramentas gratuitas e de fácil instalação são priorizados pela empresa, em detrimento de adotar um banco de dados e uma interface simples de lançamento e consulta.

Como não tenho muitas experiências com escolhas de software em meu trabalho, por utilizarem plataformas e aplicações encomendadas de outras empresas, vou descrever as situações abordadas em sala:

Em um exemplo dado em sala de aula, o requisito não funcional de portabilidade do Java foi priorizado, sendo possível rodar em diversos dispositivos pela presença da JVM. O fato de o código precisar ser mais detalhado e descritivo, apresentando linguagem mais próximo do hardware, tem uma "perda" no quesito simplicidade. Porém, por esses mesmos motivos possibilita a compatibilidade com diversas aplicações. O Trade-off é escolher o Java em detrimento de outras linguagens mais simples e de alto nível, como o Python. A praticidade da linguagem limita algumas ações que precisam estar mais próximas ao hardware. 

Outro exemplo descrito em sala foi a utilização do Mongo em uma empresa, escolhido pela sua rapidez no lançamento de dados e na "construção" do banco com estruturas flexíveis. Ao invés de utilizar um Banco de Dados relacional, com complexidade de dados e estruturas e ser mais leve em termos de memória RAM, nesse Trade-off foi priorizada a praticidade do Mongo, mesmo que a escolha não fosse sustentável e a ampliação de dados da empresa ao longo do tempo acabasse por tornar o Mongo incompatível para as necessidades. 

*******

## Atividade 3

> Avaliar os tipos de arquitetura presentes nos slides 24 - 29 e dar 1 exemplo de situação em que isso pode ser aplicado, dando uma breve explicação.

Architecture: https://docs.google.com/presentation/d/1Lmad2CS1pM1UycQpYn6FiDm2NsEO6CVSchym65tuk4U/edit?usp=drivesdk

![Layered Architecture Style](https://github.com/naira-maximo/bertoti/assets/111442399/edf6a706-1327-4836-ac12-f8d8979a170c)

### Estilo de arquitetura em camadas:

Simplicity: ⭐⭐⭐⭐⭐ Scalability: ⭐

Aplicações Web Simples: Muitas aplicações web utilizam o estilo de arquitetura em camadas para separar a lógica de apresentação, a lógica de negócios e o acesso aos dados. Por exemplo, uma aplicação web pode ter uma camada de apresentação (frontend) que lida com a interface do usuário e a interação do usuário, uma camada de negócios (backend) que contém a lógica de processamento e uma camada de acesso a dados que interage com o banco de dados. É um tipo simples de arquitetura, mas que acaba sendo pouco escalável pela sua baixa tolerância a falhas e baixa modularidade. Aumentos de carga, que não são feitos em uma parte isolada da aplicação, precisam envolver toda a camada, o que gera sobrecarga.

![Pipeline Architecture Style](https://github.com/naira-maximo/bertoti/assets/111442399/a482f23d-2675-41e3-8bf0-a0ec155d1fce)

### Estilo de arquitetura de tubulação:

Simplicity: ⭐⭐⭐⭐⭐ Scalability: ⭐ 

Compiladores: Esse estilo de arquitetura é comumente utilizado em uma variedade de sistemas onde há um fluxo contínuo de dados que precisa ser processado em etapas sequenciais. Os compiladores geralmente seguem uma arquitetura de pipeline, onde o código-fonte é processado em várias etapas, como análise léxica, análise sintática, análise semântica, geração de código intermediário e otimização, antes de finalmente gerar o código de máquina. Cada etapa do processo pode ser implementada como uma etapa separada no pipeline, onde os dados (o código-fonte) fluem de uma etapa para a próxima. Gerenciar esses pipelines e coordenar o fluxo de dados entre os estágios pode se tornar complicado à medida que o sistema cresce em tamanho e complexidade.

![Microkernel Architecture Style](https://github.com/naira-maximo/bertoti/assets/111442399/d6b193b3-3f1e-4701-bf33-b6919fd953a9)

### Estilo de arquitetura de microkernel:

Modularity: ⭐⭐⭐⭐⭐ Elasticity: ⭐

Sistemas de Comunicação: O estilo de arquitetura de microkernel é um padrão arquitetural onde o núcleo mínimo do sistema, conhecido como microkernel, fornece apenas as funcionalidades básicas, enquanto serviços adicionais são implementados como processos separados, conhecidos como servidores, que se comunicam com o microkernel. Em sistemas de comunicação, como sistemas de telecomunicações ou redes de computadores, a arquitetura de microkernel pode ser usada para separar as funcionalidades de baixo nível, como gerenciamento de pacotes e controle de fluxo, das funcionalidades de alto nível, como roteamento e gerenciamento de sessões. Em geral, esse estilo de arquitetura é útil em sistemas onde a modularidade é importante, permitindo que diferentes partes do sistema evoluam de forma independente.  No entanto, essa separação pode aumentar a sobrecarga de comunicação entre esses serviços, uma vez que a troca de mensagens entre os processos para realizar tarefas pode ser mais lenta e menos eficiente do que a comunicação interna no kernel.

![Service-Based Architecture Style](https://github.com/naira-maximo/bertoti/assets/111442399/16811e21-a188-4ca2-aefb-8c848ca6b949)

### Estilo de arquitetura baseada em serviços:

Modularity: ⭐⭐⭐⭐ Elasticity: ⭐⭐

E-commerce: Um sistema de e-commerce pode adotar uma arquitetura SOA (Service-Oriented Architecture) para dividir suas funcionalidades em serviços independentes, como gerenciamento de inventário, processamento de pedidos, pagamento, envio, etc. Isso permite que diferentes partes do sistema sejam escaladas e atualizadas independentemente umas das outras.

Serviços bancários online: Bancos podem adotar uma arquitetura baseada em serviços para fornecer funcionalidades como verificação de saldo, transferências de fundos, pagamento de contas, entre outros, como serviços independentes. Isso facilita a integração com diferentes canais de acesso, como aplicativos móveis e sites.

Governo eletrônico: Governos podem adotar uma arquitetura baseada em serviços para disponibilizar serviços online aos cidadãos, como emissão de documentos, pagamento de impostos, agendamento de consultas, entre outros. Isso pode facilitar o acesso dos cidadãos aos serviços governamentais e melhorar a eficiência administrativa.

Aplicações de mídia social: Plataformas de mídia social podem utilizar uma arquitetura baseada em serviços para separar funcionalidades como gerenciamento de perfil, feeds de notícias, mensagens, etc. Isso pode facilitar a escalabilidade da plataforma e permitir o desenvolvimento de novos recursos de forma mais rápida.

Embora a arquitetura baseada em serviços oferece flexibilidade, escalabilidade e reutilização de código, ela também pode aumentar a complexidade operacional e introduzir desafios adicionais na gestão e coordenação dos serviços distribuídos.

![Event-Driven Architecture Style](https://github.com/naira-maximo/bertoti/assets/111442399/c10f8e2e-65d1-4040-91cd-8362059f2bc6)

### Estilo de arquitetura orientada a eventos

Performance: ⭐⭐⭐⭐⭐ Simplicity: ⭐

Processamento de streaming de dados: Empresas que lidam com grandes volumes de dados em tempo real, como empresas de mídia, podem utilizar EDA (Event-Driven Architecture) para processar fluxos de dados contínuos, como transmissões de vídeo ao vivo, feeds de redes sociais, transações financeiras, etc. Os eventos são processados conforme chegam, permitindo análises em tempo real e tomada de decisões em tempo hábil. A arquitetura orientada a eventos pode ser aplicada em diferentes setores para lidar com a complexidade e a escalabilidade de sistemas distribuídos e em tempo real.

Sistemas de logística e transporte: Empresas de logística podem utilizar EDA para rastrear eventos relacionados ao transporte de mercadorias, como atualizações de localização de remessas, alterações de status de entrega, problemas de rota, etc. Os eventos são processados para manter os clientes informados sobre o status de suas remessas e para otimizar operações logísticas.

![Microservices Architecture](https://github.com/naira-maximo/bertoti/assets/111442399/4592eac7-4c49-4ef9-9c26-f8fae89cd34b)

### Arquitetura de microsserviços

Evolutionary: ⭐⭐⭐⭐⭐ Simplicity: ⭐

Netflix: A plataforma de streaming Netflix adota uma arquitetura de microsserviços para sua infraestrutura. Cada funcionalidade, como recomendações de filmes, gerenciamento de usuários, reprodução de vídeo, etc., é encapsulada em um microsserviço independente. Isso permite escalabilidade independente de cada parte do sistema, além de facilitar a implantação contínua e a manutenção.

Uber: O aplicativo Uber utiliza uma arquitetura de microsserviços para lidar com diferentes aspectos do serviço, como gerenciamento de motoristas, rastreamento de veículos, processamento de pagamentos, etc. Cada funcionalidade é fornecida por um microsserviço separado, o que permite escalabilidade e manutenção mais fáceis.

Amazon: A Amazon adota uma arquitetura de microsserviços em muitos de seus serviços, incluindo o Amazon Web Services (AWS). Cada serviço, como armazenamento em nuvem, computação, banco de dados, etc., é fornecido como um microsserviço separado, permitindo que os clientes usem e dimensionem apenas os serviços de que precisam.

Spotify: O serviço de streaming de música Spotify adota uma arquitetura de microsserviços para lidar com diferentes aspectos do serviço, como busca de músicas, reprodução de músicas, gerenciamento de playlists, etc. Isso permite escalabilidade independente de cada parte do sistema e facilita a implantação contínua de novos recursos.

Gerenciar um grande número de microsserviços pode se tornar complicado devido à necessidade de lidar com questões como descoberta de serviços, comunicação entre microsserviços, monitoramento, balanceamento de carga, resiliência, tratamento de falhas e segurança. Além disso, a dependência entre os microsserviços pode introduzir complexidades adicionais na orquestração e coordenação das interações entre os serviços.

## Atividade 4

> Definir uma arquitetura para a aplicação, debatendo tradeoffs com os requisitos não funcionais comentados em aula.

  Para a minha aplicação simples, de empresa de cotação de produtos,  escolhi o estilo de arquitetura em camadas por poder conter uma camada de apresentação (frontend), camada de negócios (backend) e o banco de dados. A escolha foi feita pois essa arquitetura permite clara separação de responsabilidades. Para o meu aprendizado, é de grande valia esse recurso, pois cada camada pode ser desenvolvida, testada e modificada de forma independente. Embora apresente certa regidez, dificultando a adaptação a novos requisitos ou mudanças significativas no sistema, a aplicação não seria usada para grande fluxo de produtos e clientes, fazendo com que a escabilidade também não seja um recurso essencial. 
 
## Atividade 5

> Iniciar o diagrama de classes de uma das partes da arquitetura

[Classes UML (Diagrama de Classes)](https://lucid.app/lucidchart/dd0473f1-03f0-4667-9a66-9c1aef3ea831/edit?beaconFlowId=79C40DBBAB28C098&invitationId=inv_7eb5120e-a016-4cfa-910b-d09a336a7380&page=HWEp-vi-RSFO# "Sistema de Cotação de Produtos Químicos")
