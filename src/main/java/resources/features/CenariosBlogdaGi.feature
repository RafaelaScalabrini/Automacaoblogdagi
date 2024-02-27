#language:pt
#coding: utf-8

Funcionalidade: Testes no BlogdoAgibank

Cenário: Selecionar uma notícia no site
  Dado que o usuário está na página inicial do site do blog do Agi: https://blogdoagi.com.br/
  Quando o usuário seleciona uma notícia específica no menu do Agibank "Noticia"
  Então a notícia selecionada é exibida em tela cheia com detalhes "Noticias"

Cenário: Pesquisar carreiras
  Dado que o usuário está na página inicial do  blog do Agi: https://blogdoagi.com.br/
  Quando o usuário realiza uma pesquisa por uma "carreira"
  Então uma lista de resultados relacionados à pesquisa "Carreiras"


Cenário: Inscrever-se para receber as principais novidades do Blog do Agi
  Dado que o cliente está na página inicial do site do blog do Agi: https://blogdoagi.com.br/
  Quando o usuário insere seu endereço de e-mail na caixa de inscrição de newsletter e clica no botão "Inscrever-se"
  Então o usuário recebe uma mensagem de confirmação de inscrição e é adicionado à lista de assinantes da "Obrigado! Agora você receberá todas as novidades por e-mail."

