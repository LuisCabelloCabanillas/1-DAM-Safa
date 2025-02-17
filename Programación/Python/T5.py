import random
from idlelib.replace import replace

#Si uso randint no hace falta poner [0] en numero_ale2
def num_ale(a,b,c):
    numeros = list(range(a,b))
    numeros_ale = random.sample(numeros, c)
    numeros_ale.sort()
    return numeros_ale

def numero_ale(d):
    numero = list(range(1, 76))
    nume_ale = random.sample(numero, d)
    nume_ale.sort()
    return nume_ale

d = 1
Lista= []
numero_ale2 =num_ale(1,76,1)
lista1= num_ale(1,16,5)

lista2=num_ale(16,30,5)

lista3 = num_ale(31, 45, 4)
lista3.insert(2,"" )

lista4=num_ale(46,60,5)

lista5=num_ale(61,75,5)

Lista.append(lista1)
Lista.append(lista2)
Lista.append(lista3)
Lista.append(lista4)
Lista.append(lista5)
print("El número que ha salido es:" +str(numero_ale2))
for listas in range(len(Lista)):
    for elemento in range(len(Lista[listas])):
        if Lista[listas][elemento] == numero_ale2[0]:
            Lista[listas][elemento] = "X"

print("-" * 18)
for i in range(5):
    print(f"| {lista1[i]:<2} {lista2[i]:<2} {lista3[i] :<2} {lista4[i]:<2} {lista5[i]:<2} |")
print("-" * 18)
