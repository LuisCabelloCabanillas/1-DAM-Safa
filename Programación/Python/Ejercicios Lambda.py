from functools import reduce

Pregunta=input("Elige un ejercicio (entre el 1 y el 20): ")
if Pregunta=="1":
    def suma(*listapara):
        total=0
        for i in listapara:
            total+=int(i)
        return total

    stringPara= input("Introduce los números de la lista separados por comas: ")
    listapara=stringPara.split(",")
    print(listapara)
    print("El total es: ", suma(*listapara))

elif Pregunta=="2":
    def max_min(*listam, reverse=True):
        for i in range(len(listam)):
            numax= listam[i]
            numin=listam[i]
            for num in listam:
                if num > listam[i]:
                    numax=num
                else:
                    numax=listam[i]
                if num< listam[i]:
                    numin=num
                else:
                    numin=listam[i]
            return numax,numin
    lista=[1,4,3,9,8,10,13]
    print(lista)
    print(max_min(*lista))
    print(max_min(*lista,reverse=False))

elif Pregunta=="3":
    def concatenar_lista(*lista):
        listaUnidas=[]
        for i in lista:
            listaUnidas = listaUnidas + i
        return listaUnidas
    lista=[1,2,3,4]
    lista2=[5,6,7,8]
    lista3=[9,10,11,12]
    print("La listas son: " +str(lista), str(lista2))
    print(concatenar_lista(lista,lista2,lista3))

elif Pregunta=="4":
    lista=[1,2,3,4,5]
    ini=int(input("Introduzaca el pricipio de la lista: "))
    fin=int(input("Introduzca el final de la lista: "))
    def generar_sublistas(lista, inicio, fin):
        sublista =[]
        for i in range(fin-ini+1):
            sublista.append(ini+ i)
        return sublista
    print(generar_sublistas(lista,ini,fin))

elif Pregunta=="5":
    def promedio(*numeros):
        return sum(numeros)/len(numeros)
    input(promedio(1,2,3,4,5,6,7,8,9))

elif Pregunta=="6":
    def dividir_elementos(lista, divisor):
        listadivision=[]
        try:
            for num in lista:
                division=num/divisor
                listadivision.append(division)
        except ZeroDivisionError:
            print("Error: No se puede dividir por 0")
        print(listadivision)
    lista=[1,2,3,4,5,6]
    dividir_elementos(lista,divisor=5)

elif Pregunta=="7":
    def obtener_elemento(lista, indice):
        try:
            respuesta = lista[indice]
            return print(f"El resultado del elemento es: {respuesta}")
        except IndexError:
            print("Error: No se puede obtener un elemento de la lista")

    lista = [1, 2, 3, 4, 5]
    indice = int(input("Elige un elemento de la lista para mostrar: \n"))
    obtener_elemento(lista, indice)

elif Pregunta=="8":
    def suma_enteros(lista):
        try:
            suma =sum(lista)
            return print(suma)
        except TypeError:
            print("Error: No se puede sumar entero porque no todo son números")
    lista=[1,2,3,4,5, "L"]
    suma_enteros(lista)

elif Pregunta=="9":
    def buscar_elemento(lista,elemento):
        

"""    
elif Pregunta=="10":
    
    
elif Pregunta=="11":    


elif Pregunta=="12":
    
    
elif Pregunta=="13":
    
    
elif Pregunta=="14":
    
"""
elif Pregunta=="15":
    try:
        n= int(input("Escribe el número que quieras saber su factorial: "))
        factorial= reduce(lambda x,y:x*y,range(1,n+1))
        print(factorial)
    except ValueError as e:
        print("El valor introducido no es un número valido")