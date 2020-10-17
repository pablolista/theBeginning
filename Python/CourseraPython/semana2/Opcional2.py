x = int(input("Por favor, entre com o número de segundos que deseja converter: "))

dias = x // (24 * 3600) #dias = input floor division quantidade de segundos em um dia (24 horas * quantidade de segundos em uma hora)
x = x % (24 * 3600) #aqui vai armazenar o resto da divisao, que é o tempo restante de segundos
horas = x // 3600 #aqui vai pegar o tempo restante de segundos e dividir pela quantidade de segundos em uma hora
x = x % 3600 #aqui x vai ser o resto da divisão anterior
minutos = x // 60
segundos = x % 60


print(dias, "dias,", horas, "horas,", minutos, "minutos e", segundos, "segundos.")