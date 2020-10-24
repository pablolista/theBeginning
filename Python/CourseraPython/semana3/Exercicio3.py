#Receba um número inteiro na entrada e imprima
#    Buzz
#se o número for divisível por 5. Caso contrário,
#imprima o mesmo número que foi dado na entrada.

x = int(input("Digite o valor de x:"))

if (x % 5 == 0):
    print("Buzz")
else:
    print(x)