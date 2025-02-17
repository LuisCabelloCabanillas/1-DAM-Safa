
Saludo= "Hola"
print(Saludo+". Vamos a empezar a ver variables")

vocal, numero, cadena = 'A' , 13 , "Hola"


print(f"vocal: {vocal}")
#print("número: "+str(número))
#print("cadena: "+cadena)


edad=20
mayor_de_edad = (edad>= 18)

if mayor_de_edad:
    print("Es mayor de edad")
else:
    print("No es mayor de edad")

a = 12
print("á:"+str(a))

"""
while = 12
"""

var1 = float(20)
print(f"var1: {var1}")

print("hola e llaman \"cabesa\".")
textomultilinea= """
Hola
soy una 
cadema
multilinea
"""
print(textomultilinea)


mayus= "HOLA estoy en MAYÚCULAS (a veces)"
print(cadena.upper())
print(cadena.lower())
print("Número de letras sin espacios: "+str(len(mayus) -(mayus.count(" "))))
print(cadena.replace(" ", "_"))

cad1 = "Pitita vive en los Remedios."
print(cad1.replace("Pitita" , "Ella"))

var1 = "Jose"
var2 = "María"
var3 = "Miguel"
cad2 = "{alum1} esta sentada cerca de {alum2} y lejos de {alum3}"
print(cad2.format(alum3=var1, alum1=var2, alum2=var3))

num1 = 2.346172
num2 = 0

print("Vamos a ver cómo salen los números num1 y num 2: {0:.3f} y {1:.1f}.".format(num1, num2))

head = "Producto\tCantidad"
description = "{0:<15}\t{1}"
print(head)
print(description.format("Coche", 2))