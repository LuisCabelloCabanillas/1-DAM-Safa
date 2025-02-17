import random


# Función para generar una columna de números
def num_ale(a, b, c):
    return sorted(random.sample(range(a, b), c))


# Función para generar un cartón de Bingo
def generar_carton():
    lista1 = num_ale(1, 16, 5)  # Columna B
    lista2 = num_ale(16, 31, 5)  # Columna I
    lista3 = num_ale(31, 46, 4)  # Columna N (con el espacio libre en la posición central)
    lista3.insert(2, " ")  # Espacio libre en la posición central
    lista4 = num_ale(46, 61, 5)  # Columna G
    lista5 = num_ale(61, 76, 5)  # Columna O
    return [lista1, lista2, lista3, lista4, lista5]


# Función para mostrar el cartón
def mostrar_carton(carton):
    print("-" * 29)
    print("| B   I   N   G   O |")
    print("-" * 29)
    for i in range(5):
        print(f"| {carton[0][i]:<2} {carton[1][i]:<2} {carton[2][i]:<2} {carton[3][i]:<2} {carton[4][i]:<2} |")
    print("-" * 29)


# Función para generar los cartones de todos los jugadores
def generar_cartones(num_jugadores):
    cartones = []
    while len(cartones) < num_jugadores:
        nuevo_carton = generar_carton()
        if nuevo_carton not in cartones:
            cartones.append(nuevo_carton)
    return cartones


# Función para marcar un número en un cartón
def marcar_carton(carton, numero):
    for i in range(5):
        for j in range(5):
            if carton[i][j] == numero:
                carton[i][j] = "X"


# Función para verificar si hay línea en un cartón
def hay_linea(carton):
    for fila in carton:
        if all(x == "X" or x == " " for x in fila):
            return True
    return False


# Función para verificar si hay bingo en un cartón
def hay_bingo(carton):
    for fila in carton:
        if not all(x == "X" or x == " " for x in fila):
            return False
    return True


# Juego principal de Bingo
def juego_bingo(num_jugadores):
    # Generar cartones para los jugadores
    cartones = generar_cartones(num_jugadores)

    # Mostrar los cartones de todos los jugadores
    print("Cartones de los jugadores:")
    for i, carton in enumerate(cartones):
        print(f"\nJugador {i + 1}:")
        mostrar_carton(carton)

    # Números del 1 al 75 para sorteo
    numeros_por_sacar = list(range(1, 76))
    random.shuffle(numeros_por_sacar)

    jugadores_con_bingo = []

    while numeros_por_sacar and not jugadores_con_bingo:
        numero_sacado = numeros_por_sacar.pop(0)
        print(f"\nNúmero sacado: {numero_sacado}")

        jugadores_con_linea = []

        # Marcar el número en los cartones de los jugadores
        for i, carton in enumerate(cartones):
            marcar_carton(carton, numero_sacado)
            mostrar_carton(carton)

            if hay_linea(carton):
                jugadores_con_linea.append(i + 1)
            if hay_bingo(carton):
                jugadores_con_bingo.append(i + 1)

        # Verificar si algún jugador ha hecho línea
        if jugadores_con_linea:
            print(f"¡Línea para los jugadores: {jugadores_con_linea}!")

        # Verificar si algún jugador ha hecho Bingo
        if jugadores_con_bingo:
            print(f"¡Bingo para los jugadores: {jugadores_con_bingo}!")
            break


# Pedir número de jugadores e iniciar el juego
num_jugadores = int(input("Introduce el número de jugadores: "))
juego_bingo(num_jugadores)