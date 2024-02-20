
<html> 
<head>
<b><i># Automacaoblogdogi<br> </b> </i>  <br> 
<i><b><u>Automação de testes</u></b></i>
</head> <br>
<body> 
  <br>
<p>
**Este é um projeto de testes automatizados utilizando Java, Selenium, JUnit e Cucumber para testar a funcionalidade do  website https://blogdoagi.com.br/.

Antes de executar este projeto, é necessário instalar os seguintes softwares:
Java Development Kit (JDK) 8 ou superior<br>
Maven<br>
ChromeDriver<br>
Chrome versão Versão 121.0.6167.185

#Cenários criados com o BDD:  <br> 
<br>
Cenário: Selecionar uma notícia no site  <br> 

Dado que o usuário está na página inicial do aplicativo  <br> 
Quando o usuário seleciona uma notícia específica no menu do Agibank <br> 
Então a notícia selecionada é exibida em tela cheia com detalhes <br> 

Cenário: Pesquisar carreiras <b>(O sistema não está apresentando o botão de Pesquisa)</b> <br> 
Dado que o usuário está na página inicial do site do blog do Agi: https://blogdoagi.com.br/ <br> 
Quando o usuário realiza uma pesquisa por uma carreira  <br> 
Então uma lista de resultados relacionados à pesquisa é exibida <br> 


Cenário: Inscrever-se para receber as principais novidades do Blog do Agi <br> 
Dado que o usuário está na página inicial do Blog do Agi <br> 
Quando o usuário insere seu endereço de e-mail na caixa de inscrição de newsletter e clica no botão "Inscrever-se" <br> 
Então o usuário recebe uma mensagem de confirmação de inscrição e é adicionado à lista de assinantes da newsletter <br> 

#Informações sobre o desenvolvimento do projeto: <br> 

 A IDE de desenvolvimento da automação foi o Intellij, a linguagem de programação da automação foi Java, o designer partner foi
o Page Object, seguindo os padrões de estrutura e as boas práticas de encapsulamento e divisão das classes e organização de código,
para uma melhor reutilização do código, foi criado os  métodos na classe BasePage o click e o select. Utilizei o site do Cucumber para criar a estrutura do projeto. O site do selenium para especificar os passos básicos e complementar com a organização .</p>
A estrutura geral do código foi em programação orientada a objetos com o encapsulamento dos métodos para uma melhor reutilização do código, as classes (  Inscrever, Noticia e PesquisarCarreiras) representam as telas e elas herdam da classe Base Page.
<p> O mapeamento e organização dos objetos eu utilizei as boas práticas de programação orientada a objetos, o site do cucumber para criar a estrutura do projeto, o site do selenium para esquecificar os passos básicos e complementar com a model e a page object para fazer a organização dos testes com base nas ações e elementos que estão disponíveis nas páginas que representam as telas e herdam da Basepage.</p>
<p> A estrutura do Guerkin utilizada no script eu criei apenas um cenário de teste "CenariosBlogdaGi" e coloquei os passos de preenchimento de todas as páginas no mesmo script do BDD. Criei os hooks para abrir e fechar o chrome, declarei as variáveis para chamar as classes nos passos do BDD e no arquivo de configuração do Maven eu chamei todas as bibliotecas.</p> <br>
</body>


<b><i>Fontes:</b></i>

https://cucumber.io/docs/guides/10-minute-tutorial/?lang=java <br>
https://www.selenium.dev/documentation/webdriver/getting_started/using_selenium/
https://www.selenium.dev/documentation/test_practices/encouraged/page_object_models/
</html>
