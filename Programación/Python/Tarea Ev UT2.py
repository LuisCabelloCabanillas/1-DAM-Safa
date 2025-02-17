#Datos tabla alumno
alumnos={
    "Ana" : {"Pelo" : "negro", "Edad": 16},
    "María" : {"Pelo" : "rubio", "Edad": 17},
    "Sonia" : {"Pelo" : "rubio", "Edad": 23},
    "Javi" : {"Pelo" : "rubio", "Edad": 21},
    "Andrés" : {"Pelo" : "castaño", "Edad": 17},
    "Pablo" : {"Pelo" : "negro", "Edad": 15},
    "Juan" : {"Pelo" : "pellirrojo", "Edad": 21},
}
#Actividades
Natación= {"Ana", "María", "Sonia", "Juan"}
Inglés= {"María", "Sonia", "Juan", "Pablo"}
piano= {"Ana", "Javi"}
taekwondo= {"Javi", "Andrés", "Pablo"}

#"Tarea 1"
resultado=", ".join(Natación.union(Inglés))
print("Los alumnos que hacen natación o Inglés son", resultado)
#Explicación: ".union()" Une las listas y elimina la repetición.

#"Tarea 2"
result= " y ".join(taekwondo.difference(piano))
print("Los alumnos que hacen taekwondo y no piano son", result)
#Explicación: ".difference()" Seleciona las palabras distintas y evita la reiteración de un mismo elemento.

#"Tarea 3"
ConjAux=set()
tae_in= taekwondo.difference(piano)
for alumno in tae_in:
    ConjAux.add(alumnos[alumno]["Pelo"])
resultado= " y ".join(ConjAux)
print("Los colores de pelo son", resultado)
#Explicación: "set()" Set crea una lista vacia que evita repeticiones. Con el ".add()" Sirve para añadir elementos.

#"Tarea 4"
ConAux=set()
Orden= sorted(Natación)
for alunmo in Orden:
    ConAux.add(alumnos[alunmo]["Pelo"])
Resultado= " y ".join(ConAux)
print("Los colores de pelo son", Resultado)
#Explicación: "sorted()" sirve para ordenar de menor a mayor o alfabéticamente desde la a-z.

#"Tarea 5"
Ing_na= Inglés.intersection(Natación)
if Ing_na:
    print("Los alumnos que hacen tanto inglés como natación son:")
    for alumno in Ing_na:
        datos = alumnos[alumno]
        print(f"Nombre: {alumno}, Color de pelo: {datos['Pelo']}, Edad: {datos['Edad']}")
#Explicación: Primero creo una lista que contenga a los alumnos con los que quiero trabajar "for ... in ..." Sirve para revisar letra por letra o palabra por palabra en un lugar concreto.

#"Tarea 6"
Ing_tae = Inglés.difference(taekwondo)
tae_In = taekwondo.difference(Inglés)
In_Ta_no_r = Ing_tae.union(tae_In)
Edad_m18 = []
if In_Ta_no_r:
    print("La edad media de los alumnos mayores de edad son")
    for alumno in In_Ta_no_r:
        datos = alumnos[alumno]
        if datos["Edad"] >= 18:
            Edad_m18.append(alumnos[alumno]["Edad"])
if Edad_m18:
    Sumatorio_Edad = sum(Edad_m18)/len(Edad_m18)
    print(Sumatorio_Edad)
#Explicaión: Creo una lista que contenga a los alumnos con los que quiero trabajar "if" lo uso para que solo lo haga si esta en esa lista/tabla. Después delimito a los que tienen mínimo 18 años para depues añadirlo en una lista mediante ".append". Por último teniendo cada dato dentro de una los sumo mediante un "sum()" sumatorio de todo los datos y despues lo divido entre "len()" que sirve para calcular el número de datos que tiene.

#"Tarea 7"
Lista_edad={
    16: [{"Nombre": "Ana"}],
    17: [{"Nombre": "María"}, {"Nombre": "Andrés"}],
    23: [{"Nombre": "Sonia"}],
    21: [{"Nombre": "Javi"}, {"Nombre": "Juan"}],
    15: [{"Nombre": "Pablo"}]
}

alum= [alumno["Nombre"] for edad in sorted(Lista_edad) for alumno in Lista_edad[edad]]
resultado = " , ".join(alum)
print("Los nombres ordenados por edad de menor a mayor: ", resultado)

"""
def ejercicio():
    conjuntoEdades: set()
    for elem in alumnos:
        conjuntoEdades.add(alumnos[elem]["Edad"]
        )
        """