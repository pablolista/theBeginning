import math

a = float(input("Digite o valor de a:"))
b = float(input("Digite o valor de b:"))
c = float(input("Digite o valor de c:"))

delta = b**2 -4*a*c
print("O valor de delta é:", delta)


if (delta >= 0):
  x1 = (-b + math.sqrt(delta)) / (2*a)
  if (delta == 0):
    print("O valor de x1 é: ", round(x1, 2))
  else:
    x2 = (-b - math.sqrt(delta)) / (2*a)
    print("O valor de x1 é:", round(x1, 2), " e o valor de x2 é:", round(x2, 2))
else:
  print("Não há resultados para delta negativo")