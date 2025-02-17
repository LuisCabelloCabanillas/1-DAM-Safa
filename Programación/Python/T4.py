from random import sample

def num_ale(a,b,c):
    numeros = list(range(a,b))
    numeros_ale = sample(numeros, c)
    numeros_ale.sort()
    return numeros_ale
lista1= num_ale(1,16,5)
lista2=num_ale(16,30,5)
lista3 = num_ale(31, 45, 4)
lista3.insert(2,"" )
lista4=num_ale(46,60,5)
lista5=num_ale(61,75,5)

print("-" * 18)
for i in range(5):
    print(f"| {lista1[i]:<2} {lista2[i]:<2} {lista3[i] :<2} {lista4[i]:<2} {lista5[i]:<2} |")
print("-" * 18)

#Explicación: He usado la misma base que el ejercicio anterior eliminando los print para que no se repita la lista.
#Lo nuevo añadido es el cuadro que le rodiea que se hace mediante un "print()" El caracterque quiero usar y cuantos voy a usar mediante una multiplicaión. LOs laterales estan dentro del "print" para que se aplique en cada línea.
#Para que las filas se conviertan en columnas he obligado a que las listas cambien de horientación mediante un "for ... in ..." haciendo que se imprimanlos caracteres (0) en una linea y asi progresivamente.
#El {listan[i]:<2} obliga a que esten todos los digitos ordenados