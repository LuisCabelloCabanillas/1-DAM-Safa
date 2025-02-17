import csv

Pregunta = input("Elige un ejercicio (entre el 1 y el 20): ")
if Pregunta == "1":
    archivo_entrada = ("cancion.txt")


    def eliminaCaracteres(frase):
        fraseSalida = frase
        for i in fraseSalida:
            if not i.isalpha() and i != " ":
                fraseSalida = fraseSalida.replace(i, "")
        return fraseSalida


    with open(archivo_entrada, "r") as entrada:
        listaVersos = entrada.readlines()
        listaPalabras = list()
        diccionario = dict()
        for pos, i in enumerate(listaVersos):
            listaVersos[pos] = eliminaCaracteres(listaVersos[pos])
            listaPalabras.extend(listaVersos[pos].split())
            cuentaPalabras = len(listaVersos[pos].split())
            print(f"El verso {pos + 1} tiene {cuentaPalabras} palabras")

        palabraMasLarga = ""
        for palabra in listaPalabras:
            if palabra not in diccionario:
                diccionario[palabra] = 1
            else:
                diccionario[palabra] += 1

            if len(palabra) > len(palabraMasLarga):
                palabraMasLarga = palabra

        print(f"La palabra más larga que aparece en la canción es {palabraMasLarga}")

        listaTuplas = list()
        for palabra in diccionario:
            listaTuplas.append((palabra, diccionario[palabra]))

    listaOrdenada = sorted(listaTuplas, key=lambda tupla: tupla[1], reverse=True)
    listaSalida = list()
    longitudPalabra = 0
    for pos, elem in enumerate(listaOrdenada):
        if pos == 0:
            listaSalida.append(elem[0])
            longitudPalabra = elem[1]
        elif longitudPalabra == elem[1]:
            listaSalida.append(elem[0])
        else:
            break
    print(f"La palabra (o palabras) más repetida es: {listaSalida}")
elif Pregunta == "2":
    with open("usuario.txt", "a") as f:
        entrada = input("Introduce un nombre y apellido (o dejalo vacío para salir): ").strip()
        if entrada == "":
            print("No se introduce un nombre y apellido.")
        else:
            while entrada != "":
                print("El nombre " + str(entrada) + " se ha guardado correctamente")
                f.write(entrada + "\n")
                entrada = input("Introduce un nombre y apellido (o dejalo vacío para salir): ").strip()
            if entrada == "":
                print("No se introduce ningun nombre.")

elif Pregunta == "3":
    with open("empleados.csv", "r", encoding='utf-8') as csvfile:
        csvIterable = csv.reader(csvfile, delimiter=';')
        listaCSV = list(csvIterable)
        listaCSV.pop(0)

    print(listaCSV)
    salarioPromedio = sum(map(lambda x: int(x[5]), listaCSV)) / len(listaCSV)
    # Salario medio
    print(round(salarioPromedio, 2))

    # Trabajadores que más cobran
    listaOrdenadaSalario = sorted(listaCSV, key=lambda x: x[5], reverse=True)
    listaMasCobra = list()
    listaMasCobra.append(listaOrdenadaSalario[0][1] + " " + listaOrdenadaSalario[0][2])
    i = 1
    salarioMaximo = listaOrdenadaSalario[0][5]
    while (listaOrdenadaSalario[i][5] == salarioMaximo):
        listaMasCobra.append(listaOrdenadaSalario[i][1] + " " + listaOrdenadaSalario[i][2])
        i += 1
    print(listaMasCobra)

    # Lista Edad
    listaOrdenadaSalario = sorted(listaCSV, key=lambda x: x[5])

    setMenosCobra = set()
    setMenosCobra.add(listaOrdenadaSalario[0][3])
    i = 1
    salarioMinimo = listaOrdenadaSalario[0][5]
    while (listaOrdenadaSalario[i][5] == salarioMinimo):
        setMenosCobra.add(listaOrdenadaSalario[i][3])
        i += 1
    print(setMenosCobra)

    # Nombre y Apellidos
    listaOrdenadaEdad = sorted(listaCSV, key=lambda x: x[3])
    listaNombres = list(map(lambda x: x[1] + " " + x[2] + f" ({x[3]})", listaOrdenadaEdad))
    print(listaNombres)
elif Pregunta == "4":
    with open("inventario.csv", "a") as f:
        entrada = input("Introduce Producto; Cantidad; Precio (De esta forma): ").strip()
        if entrada == "":
            print("No se introduce ningun producto.")
        else:
            while entrada != "":
                print("El producto se ha guardado correctamente")
                f.write(entrada + "\n")
                entrada = input("Introduce Producto; Cantidad; Precio (De esta forma): ").strip()
            if entrada == "":
                print("No se introduce ningun producto.")

"""elif Pregunta == "5":

elif Pregunta == "6":

elif Pregunta == "7":

elif Pregunta == "8":

elif Pregunta == "9":

elif Pregunta=="10":

elif Pregunta=="11":"""