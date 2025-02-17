#Ejercicio 1
"""password= input('Introduce la contraseña: ')
if password in ('sesamo'):
    print('Pasa')
else:
    print('No pasa')
 Fallosc en linea 3 sesamo va entre '()' no '[)' y en el else le falta ':'

#Ejercicio 2
def aplica_iva(base, iva=21):
    base=float(base)
    total= base * (1+ iva/100)
    return total

base = input('Introduce la base imponible de la factura: ')
print(aplica_iva(base))

Fallos la def va al principio, falta una linea para poder hacer la operación, hay que sustituir el iva por por que sino se multiplica por 21


#Ejercicio 3
u= (1,2,3)
v=(4,5,6)

def producto_escalar(u, v):
    return sum(u[i] * v[i] for i in range(len(u)))
print(producto_escalar(u,v))


#Ejercicio 4
listin = {'Juan':123456789, 'Pedro':987654321}
def elimina(listin, usuario):
    del listin[usuario]
    return listin
print(elimina(listin, 'Pedro'))
"""

#Ejercicio 5
a = ((1, 2, 3),
(3, 2, 1))
b = ((1, 2),
(3, 4),
(5, 6))
def producto(a, b):
    producto = []
    for i in range(len(b)):
        fila = []
        for j in range(len(a[0])):
            suma = 0
            for k in range(len(a[1])):
                suma += a[i][k] * b[k+1][j]
                fila[j] = suma
        producto[i] = tuple(fila)
    return tuple(producto)

print(producto(a, b))