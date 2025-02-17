from ahorcadoData import iniciaAhorcado

juegoterminado=False
Ahorcado=iniciaAhorcado()
Intentos=5

while not juegoterminado:

    print(Ahorcado[0])
    print(Ahorcado[3])
    letra=input("Qué letra vas a probar: ").lower()

    if letra in Ahorcado[2]:
        nuevo_lugar= ""
        for i in range(len(Ahorcado[2])):
            if letra == Ahorcado[2][i]:
                nuevo_lugar += letra
            else:
                nuevo_lugar += Ahorcado[3][i]
        Ahorcado[3]=nuevo_lugar

    else:
        Intentos-=1
        print("letra incorecta. Te quedan " +str(Intentos),"vidas restantes")

    if "_" not in Ahorcado[3]:
        print("Felicidades. Has adivinado la palabra", Ahorcado[1])
        juegoterminado=True
    elif Intentos<=0:
        print("Fin del juego, la palabra era " +str(Ahorcado[1]))
        juegoterminado=True