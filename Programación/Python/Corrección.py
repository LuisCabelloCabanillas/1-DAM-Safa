"""hacer un programa para jugar piedra papel o tijeras"""
from random import randint


print("En este programa vas a jugar al piedra, papel o tijeras contra la máquina")

hayGanador=False
while not hayGanador:

    num_Saco= input("Escoge que vas a sacar: ").lower()

    if num_Saco == "piedra":
        num_Saco=1
    if num_Saco == "papel":
        num_Saco=2
    if num_Saco == "tijeras":
        num_Saco=3



    numero_aleatorio = randint(1, 3)
    if numero_aleatorio == 1:
        print("Piedra")
    elif numero_aleatorio == 2:
        print("Papel")
    elif numero_aleatorio == 3:
        print("Tijeras")


    if numero_aleatorio==1 and num_Saco==2 :
        print("Ganaste")
        hayGanador=True
    if numero_aleatorio==2 and num_Saco==3 :
        print("Ganaste")
        hayGanador = True
    if numero_aleatorio==3 and num_Saco==1 :
        print("Ganaste")
        hayGanador = True
    if num_Saco==1 and numero_aleatorio==2 :
        print("Ganó la máquina")
        hayGanador = True
    if num_Saco==2 and numero_aleatorio==3 :
        print("Ganó la máquina")
        hayGanador = True
    if num_Saco==3 and numero_aleatorio==1 :
        print("Ganó la máquina")
        hayGanador = True
    if num_Saco==numero_aleatorio :
        print("Empate")