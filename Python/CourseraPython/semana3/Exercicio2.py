#Receba um número inteiro na entrada e imprima
#Fizz
#se o número for divisível por 3. Caso contrário,
#imprima o mesmo número que foi dado na entrada.

x = int(input("Digite o valor de x: "))

if (x % 3 == 0):
    print("Fizz")
else:
    print(x)