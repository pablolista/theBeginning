#Receba 3 números inteiros na entrada e imprima
#   crescente
#se eles forem dados em ordem crescente. Caso contrário, imprima
#não está em ordem crescente

conjunto = []

for i in range (3):
    x = int(input("Adicione um número: "))
    conjunto.append(x)


if (conjunto[1] > conjunto [0]) and (conjunto [1] < conjunto[2]):
    print("crescente")
else:
    print("não está em ordem crescente")