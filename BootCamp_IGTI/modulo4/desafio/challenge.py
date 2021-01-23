clientes=["Marcelo","Joana D'arc","Maria de Fátima"]
produtos=[{"nome":"computador","preco":1000.50},{"nome":"mouse","preco":120.10},{"nome":"Monitor LCD","preco":999.99}]

'''

nome_cliente = input("Digite o nome do cliente: ")
control_cliente = False

while not control_cliente:
    for cliente in clientes:
        if (nome_cliente.upper() in cliente.upper()):
            nome_cliente = cliente
            control_cliente = True
            break
    else:
        print("Nome não encontrado. Tente novamente.")
        nome_cliente = input("Digite o nome do cliente: ")

'''

#preco_produto = produtos[i].get('preço')
def calculoImposto(preco_produto):
    quantidade = int(input("Digite a quantidade do produto: "))
    preco_produto *= quantidade
    imposto = round(preco_produto * 0.1,2)
    preco_total = preco_produto+imposto
    return imposto, preco_total



itens_comprados = []
quantidade_comprada = []
total_imposto = []
total_nota = []
control_produto = False




while not control_produto:
    nome_produto = input("Digite o nome do produto ou ENTER para sair: ")
    if nome_produto == "":
        control_produto = True
        break
    for i, produto in enumerate(produtos):
        if nome_produto.upper() in produtos[i].get('nome').upper():
            itens_comprados.append(produtos[i].get('nome'))
            #TRANFORMAR EM FUNCAO E ADICIONAR A FUNCAO ABAIXO

            (imposto, preco_total) = calculoImposto(produtos[i].get('preco'))
            print(imposto, "batuta", preco_total)

            
            print(itens_comprados)
            break
    else:
        print("Produto não encontrado")




