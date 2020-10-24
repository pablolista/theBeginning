import math

a = float(input("Digite o valor de a:"))
b = float(input("Digite o valor de b:"))
c = float(input("Digite o valor de c:"))

delta = b**2 -4*a*c


if (delta >= 0):
  x1 = (-b + math.sqrt(delta)) / (2*a)
  if (delta == 0):
    print("a raiz desta equação é", round(x1, 2))
  else:
    x2 = (-b - math.sqrt(delta)) / (2*a)
    if (x1 < x2):
      print("as raízes da equação são", round(x1, 2), "e", round(x2, 2))
    else:
      print("as raízes da equação são", round(x2, 2), "e", round(x1, 2))
else:
  print("esta equação não possui raízes reais")