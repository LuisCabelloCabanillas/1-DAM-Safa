from random import sample

def num_ale(a,b,c):
    numeros = list(range(a,b))
    numeros_ale = sample(numeros, c)
    numeros_ale.sort()
    return numeros_ale


lista1= num_ale(1,16,5)
print(lista1)
lista2=num_ale(16,30,5)
print(lista2)
lista3 = num_ale(31, 45, 4)
lista3.insert(2, "" )
print(lista3)
lista4=num_ale(46,60,5)
print(lista4)
lista5=num_ale(61,75,5)
print(lista5)

#Explicación: He usado la misma def que en el apartado anterior para este ejercicio.
#He repetido el proceso 5 veces como pide el enunciado dejando un conjunto vacío en el segundo espacio de la segunda fila con un "insert()" Aclarando donde lo quiero y porque lo quiero cambiar.

