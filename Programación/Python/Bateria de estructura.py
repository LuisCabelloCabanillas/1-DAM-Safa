
from xml.dom.minidom import ProcessingInstruction
def Ejercicio1():
    Lista= ["Ana", "Juan", "Carlos", "Marta"]
    resultado= ", ".join(Lista)
    print(resultado.upper())

#Falta poner la y en el último

def Ejercicio2():
    numeros=[3,8,12,5,7,15,21]
    print(numeros)
    Lista_pares=[]
    print("La lista que veras a continuación es únicamente de números pares")
    for numero in numeros:
        if numero % 2 == 0:
            Lista_pares.append(numero)
    print(Lista_pares)

def Ejercicio3():
    print("Los precios de varios objetos que se quieren comprar son:")
    precios= [100,200,150,400,350]
    print(precios)
    Lista_precios_rebajados=[]
    print("La proxima cadena tiene los precios rebajados un 10%")
    for precio in precios:
        Lista_precios_rebajados.append(precio*0.9)
    print(Lista_precios_rebajados)

def Ejercicio4():
    edades=[23, 12, 56, 34, 78, 10, 29]
    print(edades)
    print("La lista presente es una lista de reservas para una discoteca y que por los tanto las edades menores de 18 años deberan ser eliminados")
    for edad in edades:
        if edad <18:
            edades.remove(edad)
    print(edades)

def Ejercicio5():
    nombres=["Luis", "Ana", "Clara", "Pedro", "Luz"]
    print(nombres)
    Lista_L=[]
    print("La lista de arriba son los invitados a los que quería invitar pero por culpa del local no puede invitar a todos y solo va a invitar a las personas con su letra inicial L")
    for nombre in nombres:
        if nombre[0]== "L":
            Lista_L.append(nombre)
    print(Lista_L)

def Ejercicio6():
    puntuaciones = [5.1, 7.8, 9.3, 10, 4, 6.3]
    print("La lista de puntuaciones son:" +str(puntuaciones))
    Lista_puntuaciones=[]
    for numero in puntuaciones:
        if numero +2>10:
            puntuacion=10
            Lista_puntuaciones.append(puntuacion)
        else:
            Lista_puntuaciones.append(numero+2)
    print(Lista_puntuaciones)

def Ejercicio7():
    nombres = ["Ana", "Juan", "Ana", "Marta", "Ana"]
    nombre=str(nombres)
    print("La empresa tuvo problemas cuando crearon las listas de empleados y pusieros Ana a todas las Andreas como podemos ver en esta lista" +str(nombres))
    print(nombre.replace("Ana", "Andrea"))

def Ejercicio8():
    colores = ["rojo", "azul", "verde", "rojo", "azul", "rojo"]
    print("Hay "  +str(colores.count("rojo")) +" colores rojos")

def Ejercicio9():
    numeros = [2, 4, 6, 8, 10]
    if 5 in numeros:
        print("Existe el número 5")
    else:
        print("No existe el número 5")

def Ejercicio10():
    ventas = [100, 200, 150, 300, 250]
    sumas_ven=[]
    sumas=0
    for numero in ventas:
        sumas += numero
        sumas_ven.append(sumas)
    print(sumas_ven)

def Ejercicio11():
    productos = ["manzana", "banana", "naranja", "uva", "mango"]
    Lista_productos=[]
    print(productos)
    for product in productos:
        if len(product) >=5:
            Lista_productos.append(product)
    print(Lista_productos)

def Ejercicio12():
    numeros = [12, 45, 33, 22, 10, 5, 60, 23]
    numeros_mayo_20=[]
    numeros_meno_20=[]
    for numero in numeros:
        if numero >= 20:
            numeros_mayo_20.append(numero)
        else:
            numeros_meno_20.append(numero)
    print(numeros_mayo_20)
    print(numeros_meno_20)

def Ejercicio13():
    nombres_a = ["Ana", "Carlos", "Luis"]
    nombres_b = ["Pedro", "Juan", "Marta"]
    print("Esta es la primera lista: " + str(nombres_a))
    print("Esta es la segunda lista: " + str(nombres_b))
    print("La union de las dos listas es: ")
    lista_unida=nombres_a + nombres_b
    print(lista_unida)
    print("La lista ordenada es: ")
    lista_unida.sort()
    print(lista_unida)

def Ejercicio14():
    precios = [100, 200, 150, 300, 250]
    suma=0
    multi=1
    for numero in precios:
        suma += numero
    print("El sumatorio es: "+str(suma))
    for numero in precios:
        multi *= numero
    print("El producto total es: " +str(multi))

def Ejercicio15():
    valores_str = ["10", "20", "30", "40"]
    valores_int=[]
    valores_caudra=[]
    print("La lista dada es: " +str(valores_str))
    for numero in valores_str:
        valores_int.append(int(numero))
    print("La lista en valores enteros es: " +str(valores_int))
    for numero in valores_int:
        valores_caudra.append(numero*numero)
    print("Los valores al cuadrado son: " +str(valores_caudra))

def Ejercicio16():
    animales = ["gato", "perro", "pez", "gato", "perro", "gato"]
    diccionario={}
    for animal in animales:
        diccionario[animal]=animales.count(animal)
    print(diccionario)

def Ejercicio17():
    ciudades = ["Madrid", "Barcelona", "Valencia", "Madrid", "Sevilla", "Valencia"]
    ciudades_no_rep=[]
    ciudades_com=set(ciudades)
    for ciudad in ciudades:
        if ciudades.count(ciudad)<=1:
            ciudades_no_rep.append(ciudad)
    print(ciudades_no_rep)
    for ciudad in ciudades:
        ciudades_com.add(ciudad)
    ciudades_com_lista=list(ciudades_com)
    print(ciudades_com_lista)

def Ejercicio18():
    personas = [("Ana", 20), ("Carlos", 17), ("Luis", 22), ("Pedro", 15)]
    mayores=[]
    menores=[]
    for persona,edad in personas:
        if edad >= 18:
            mayores.append(persona)
        if edad < 18:
            menores.append(persona)
    print("Los mayores de edad son: " +str(mayores))
    print("Los menores de edad son: " +str(menores))

def Ejercicio19():
    lista_1= [1, 2, 3, 4, 5]
    lista_2= [4, 5, 6, 7, 8]
    print("Lista 1 : " +str(lista_1))
    print("Lista 2 : " +str(lista_2))
    intersección=[]
    for numero in lista_1:
        if numero in lista_2:
            intersección.append(numero)
    print(intersección)

def Ejercicio20():
    lista_1= [1, 2, 3, 4, 5]
    lista_2= [4, 5, 6, 7, 8]
    intersección= set(lista_1).intersection(lista_2)
    print(intersección)

def Ejercicio21():


def Ejercicio22():
    lista = [("Ana", 20), ("Carlos", 17), ("Luis", 22), ("Pedro", 15)]

    listaAux = list()

    for pos, elemento in enumerate(lista):
        if pos == 0:
            listaAux.append(elemento)
        else:
            posAux = 0
            while (posAux < len(listaAux) and elemento[1] > listaAux[posAux][1]):
                posAux += 1
            listaAux.insert(posAux, elemento)
    print(listaAux)

def Ejercicio24():
    diccio = dict()
    listaB = []
    listaC = []
    listaD = []
    for pos, elemento in enumerate(lista_direcciones):
        # ApartadoA
        if (elemento in diccio.keys()):
            diccio[elemento] = diccio[elemento] + 1
        else:
            diccio[elemento] = 1
        # ApartadoC
        listaC.append(len(elemento))
        # ApartadoB
        if pos % 2 == 0:
            listaB.append(elemento[::-1])
            listaD.append(listaC[pos] ** 2)
        else:
            listaB.append(elemento.upper())
            listaD.append(listaC[pos] * pos)

    print(diccio)
    print(listaB)
    print(listaC)
    print(listaD)
respuesta=input("Qué prograa quieres usar entre el 1 y el 24: ")
if respuesta == "1":
    Ejercicio1()
if respuesta == "2":
    Ejercicio2()
if respuesta == "3":
    Ejercicio3()
if respuesta == "4":
    Ejercicio4()
if respuesta == "5":
    Ejercicio5()
if respuesta == "6":
    Ejercicio6()
if respuesta == "7":
    Ejercicio7()
if respuesta == "8":
    Ejercicio8()
if respuesta == "9":
    Ejercicio9()
if respuesta == "10":
    Ejercicio10()
if respuesta == "11":
    Ejercicio11()
if respuesta == "12":
    Ejercicio12()
if respuesta == "13":
    Ejercicio13()
if respuesta == "14":
    Ejercicio14()
if respuesta == "15":
    Ejercicio15()
if respuesta == "16":
    Ejercicio16()
if respuesta == "17":
    Ejercicio17()
if respuesta == "18":
    Ejercicio18()
if respuesta == "19":
    Ejercicio19()
if respuesta == "20":
    Ejercicio20()
if respuesta == "21":
    Ejercicio21()
if respuesta == "22":
    Ejercicio22()
if respuesta == "23":
    Ejercicio23()
if respuesta == "24":
    Ejercicio24()
