# Software Engineering

Within Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software : engineering after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). The addition of time adds an important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t programming.

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

Uma escolha, planejadas a longo prazo ou não, de perder alguma funcionalidade ou recurso possibilitando ganhar outros fatores que sejam mais viaveis para o projeto/aplicação em questão. 
Exemplo: por mais que a linguagem Java seja mais "complicada" comparada a outras linguagens de alto nível (perde), a portabilidade foi viabilizada, pois é compatível em vários sistemas e dispositivos (JVM)

*******

## Atividade 2

> Nas aulas de sexta-feira, discutimos sobre Engenharia de Software e trade-offs. Cite 3 exemplos de trade-offs (em software) e explique conforme comentários que fizemos na sexta.

Na empresa em que trabalho, são utilizados arquivos compartilhados em nuvem, seja no OneDrive ou Google Drive. Portanto, listas de preços dos fornecedores, planilhas de venda e compra, relatórios mensais, tudo está disponível para a visualização e atualização constante dos envolvidos de forma simultânea. É utilizada uma plataforma encomendada para gerar Purchase/Sales Orders, Invoices e outros documentos com os part numbers cadastrados, onde todo e qualquer gerenciamento do software precisa ser feito pela empresa desevolvedora.
Com certeza não é a melhor opção, tanto pela velocidade de busca, quanto pela possibilidade de migrar dados, etc. Porém, é uma empresa composta majoritariamente por pessoas com pouco conhecimento tecnológico e com muita resistência a mudanças. O trabalho utilizando Excel compartilhado está presente desde o nascimento da empresa e, embora novos funcionários indiquem um novo software e o desenvolvimento de uma plataforma própria, um treinamento da equipe e contratar alguém para migrar os dados já cadastrados com parâmetros funcionais é evitado. O requisito de experiência com as tecnologias já utilizadas, curva de aprendizado, ferramentas gratuitas e de fácil instalação são priorizados pela empresa, em detrimento de adotar um banco de dados e uma interface simples de lançamento e consulta.

Como não tenho muitas experiências com escolhas de software em meu trabalho, por utilizarem plataformas e aplicações encomendadas de outras empresas, vou descrever as situações abordadas em sala:

Em um exemplo dado em sala de aula, o requisito não funcional de portabilidade do Java foi priorizado, sendo possível rodar em diversos dispositivos pela presença da JVM. O fato do código precisar ser mais detalhado e descritivo, apresentando linguagem mais próximo do hardware, tem uma "perda" no quesito simplicidade. Porém, por esses mesmos motivos possibilita a compatibilidade com diversas aplicações. O Trade-off é escolher o Java em detrimento de outras linguagens mais simples e de alto nível, como o Python. A praticidade da linguagem limita algumas ações que precisam estar mais próximas ao hardware. 

Outro exemplo descrito em sala foi a utilização do Mongo em uma empresa, escolhido pela sua rapidez no lançamento de dados e na "contrução" do banco com estruturas flexíveis. Ao invés de utilizar um Banco de Dados relacional, com complexidade de dados e estruturas e ser mais leve em termos de memória RAM, nesse Trade-off foi priorizada a praticidade do Mongo, mesmo que a escolha não fosse sustentável e a ampliação de dados da empresa ao longo do tempo acabasse por tornar o Mongo incompatível para as necessidades. 






