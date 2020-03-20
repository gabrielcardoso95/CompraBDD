#language:pt
@CompraProduto
Funcionalidade: Compra de produto
  A pesquisa deve ser feita pela home page.

  Contexto: 
    Dado que estou na pagina inicial
    E usuario faz login

  @CompraSucesso
  Cenario: Busca de produto pela home com sucesso
    E clico no menu SPEAKERS
    E seleciono o produto
    E adiciono ao carrinho
    E vou para a pagina de chekout
    E confirmo o endereco de entrega
    Quando confirmo o pagamento
    Entao eu valido a compra feita

