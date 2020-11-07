pessoa = "Marcelo"
endereco = "Rua das flores, 74"
idade = 18

pessoa = {
    "nome": "Marcelo",
    "endereco": "Rua das flores, 74",
    "idade": "18"
}

print(pessoa)
print(pessoa['idade'])



lista =['Marcelo', 'Maria', 'José', 'João']
print(lista)
print(lista[0])
print(lista[-1])
print(lista[1:3])
print(lista[:2])

lista[0] = 'Rodrigo'
print(lista)
lista.extend(['Mario'])
print(lista)
lista.extend('Luidgi')
print(lista)
lista.append('Pablo')
print(lista)
del lista[5:11]
print(lista)
lista.insert(5, "Luidgi")
print(lista)



