#Ejercicio1
from itertools import count
from os.path import split

Saludo = "Hola, ¿Cuál es tu nombre?"
print(Saludo)

nombre= "Luis"
print(nombre)

#Ejercicio2
frase = "Hola a todos".upper()
print(frase)

#Ejercicio3
frase = "esto en extraño"
print("Número de letras A "+str(frase.count("a") +int(frase.count("A"))))

#Ejercicio4
Texto = "Buenas"
print(Texto)
cadenainvertida = Texto[::-1]
print(cadenainvertida)

#Ejercicio5
Texto = "Bienvenidos a todos los alumnos"
print(Texto)
print(Texto.replace(" ", ""))

#Ejercicio6
Texto = "Qué extraño esta el python"
print(Texto)
print(Texto.replace("a","").replace("e", "").replace("u","").replace("i","").replace("o","").replace("A","").replace("E","").replace("I","").replace("U","").replace("O","").replace("á","").replace("é","").replace("ú","").replace("í","").replace("ó",""))

#Ejercicio7
Texto = "No me gusta nada esto"
print(Texto)
palabra = Texto.split()
print(len(palabra))

#Ejercicio8
Cad1 = "dabale arroz a la zorra el abad"
palindromo=Cad1.replace(" ","")
if palindromo==palindromo[::-1]:
    print("La palabra ", Cad1, " es un palíndromo")
else:
    print("La palabra ", Cad1, " no es un palíndromo")

#Ejercicio9

Cad2=input("Ingrese la cadena de texto: ")
Cad21=input("Que letra quieres cambiar: ")
Cad22=input("Por que letra la quieres cambiar: "+ str(Cad21))
print(Cad2.replace(Cad21,Cad22))

#Ejercicio10
Cad3=input("Pon una cadena de texto: ")
no_alfabetica = "º!·$%&/()=?¿^*¨Ç;:_º\|@¬[]{}#0123456789"
frase10= Cad3
print("Se van a eliminar los carácteres no alfabéticos")

for letra in no_alfabetica:
    frase10= frase10.replace(letra, "")
print(frase10)


#Ejercicio11
Cad4= ["esternocleido", "cable", "programacion"]
longitud = 0
for palabra in Cad4:
    if len(palabra)>longitud:
        longitud=len(palabra)
        ayuda= palabra
print(ayuda)

#Ejercicio12
Cad5= input("Escribe una cadena de texto: ")
Cad5_1= input("Que letra quieres contar: ")
print(Cad5.count(Cad5_1))

#Ejercicio13
Cad6= input("Escribe una cadena de texto: ")
orden= []
orden=sorted(Cad6.split())
print(orden)

#Ejercicio14
Cad7= input("Escribe una cadena de texto: ")
Cad7_1= "aeuio"
Cad7_2= "12345"
print(Cad7.replace("a","1").replace("e","2").replace("u","3").replace("i","4").replace("o","5"))

#Ejercicio15
def enmascara(cadena):
    arrayAux= cadena.split(" ")
    ListaSalida = []

    for i in arrayAux:
        palabraAux=""
        for j in range(len(i)):
            if j==0 or j==len(i)-1:
                palabraAux=palabraAux+i[j]
            else:
                palabraAux=palabraAux+"*"
        ListaSalida.append(palabraAux)
    return " ".join(ListaSalida)



Cad8= input("Escribe una frase: ")
print(enmascara(Cad8))

#Ejercicio16
def reversa (cadena):
    palabras = cadena.split()
    Auxi= [cadena[::-1] for cadena in palabras]
    return " ".join(Auxi)

print(reversa(input("Escribe una frase: ")))

#Ejercicio17
Lista_números = ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]
Cad9 = input("Escribe una cadena con número y sera contados todos los números: ")
conteo={número:0 for número in Lista_números}
for i in Cad9:
    if i in conteo:
        conteo[i]+= 1
print(conteo)

#Ejercicio18
def contar_si_es_mas_Que_5(cadena):
    palabra = cadena.split()
    Mostrar = [palabra for palabra in palabra if len(palabra) >= 5]
    return" ".join(Mostrar)

print(contar_si_es_mas_Que_5(input("Escribe una frase: ")))

#Ejercicio 19
Cad11 = input("Escribe una cadena de texto y las palabras serán invertidas: ")
cadena = Cad11.split()
cadena_inversa = cadena[::-1]
fin= " ".join(cadena_inversa)
print(fin)

#Ejercicio20
Cad12= input("Escribe una frase: ")
vocales = "aeiouAEIOU"
resultado= ""
for c in Cad12:
    if c in vocales:
        resultado += c
    else:
        resultado += " "
print(resultado)

#Ejercicio21
Cad13=input("Inserte una cadena de texto: ")
cadena=Cad13.split()
Lista=[]
for palabra in cadena:
    if len(palabra)>0:
        letramayus=palabra[0].upper() + palabra[1:].lower()
        Lista.append(letramayus)
resultado = " ".join(Lista)

print(resultado)

#Ejercicio22
Cad5= input("Escribe una cadena de texto: ")
Cad5_1= input("Que letra quieres contar: ")
print("La letra aparece "+str(Cad5.count(Cad5_1)))

#Ejercicio23
def eliminar_caracteres_repetidos(texto):
    resultado=""
    for letra in texto:
        if letra not in resultado:
            resultado+=letra
    return resultado
Cad14= input("Escribe una cadena de texto: ")
resultado= eliminar_caracteres_repetidos(Cad14)
print("La cadena sin caracteres repetidos es:", resultado)

#Ejercicio24
Cad6= input("Escribe una cadena de texto: ")
orden= []
orden=sorted(Cad6.split())
print(orden)

#Ejercicio25
        

#Ejercicio26


#Ejercicio27


#Ejercicio28
def sustitucion(cadena):
    salida=cadena
    ListaSalida=[]
    for i in range(len(salida)):
        if(i%2==0):
            salida=salida[:i]+"X"+salida[i+1:]
    return salida

print(sustitucion(input("Dime una palabra o frase: ")))

#Ejercicio29
def desplazamiento(cadena):
    salida=""
    abecedario="abcdefghijklmnñopqrstuwyz"

    for c in cadena:
        if c=="z":
            salida = salida+"a"
        elif abecedario.find(c)<0:
            salida = salida+c
        else:
            salida = salida+abecedario[abecedario.index(c)+1]
    return salida

print(desplazamiento(input("Introduce una frase")))

#Ejercicio30
