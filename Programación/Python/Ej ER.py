import re
from itertools import count

respuesta= input("Elige el ejercicio que quieras hacer (1-20): ")

if respuesta == "1":
    email= input("Escribe su correo electrónico: ")
    patron_email= r'^\w+@\w+\.\w+$'
    if re.match(patron_email, email):
        print("Correo escrito correctamente")
    else:
        print("Correo escrito incorrectamente")

if respuesta == "2":
    numero_telefonico= input("Escribe su numero telefónico: ")
    numeros_permitidos= r'\d{3} \d{3} \d{3}'
    numeros_permitidos_2= r'\d{9}'
    numeros_permitidos_3 = r'\+\d{2} \d{3} \d{3} \d{3}'
    numeros_permitidos_4 = r'\+\d{11}'
    if re.match(numeros_permitidos, numero_telefonico) or re.match(numeros_permitidos_2, numero_telefonico) or re.match(numeros_permitidos_3, numero_telefonico) or re.match(numeros_permitidos_4, numero_telefonico):
        print("Numero permitido escrito correctamente")
    else:
        print("Numero permitido escrito incorrectamente")

if respuesta == "3":
    codigo_postal= input("Escribe su codigo postal: ")
    obligacion= r'\d{5}'
    if re.match(obligacion, codigo_postal):
        print("Codigo postal escrito correctamente")
    else:
        print("Codigo postal escrito incorrectamente")

if respuesta == "4":
    extraccion_palabras= input("Escribe una frase y se extraerá en palabras: ")
    extraido= re.split(r'\W+',extraccion_palabras)
    print(extraido)

if respuesta == "5":
    fecha= input("Escribe una fecha: ")
    validacion= r'\d{2}/\d{2}/\d{4}'
    if re.match(validacion, fecha):
        print("Fecha escrito correctamente")
    else:
        print("Fecha escrito incorrectamente")

if respuesta == "6":
    Filtro= input("Escribe serie de palabras para que se filtren si tienen letra (a): ")
    filtrador= r'\b\w*a\w*\b'
    contador=re.findall(filtrador, Filtro)
    print(contador)

if respuesta == "7":
    Texto= input("Escribe un texto: ")
    seleccionador= r'\d{1,5}'
    num= re.findall(seleccionador, Texto)
    if num:
        print(f"{num}")

if respuesta == "8":
    contrasena = input("Escribe una contraseña (debe contener entre 8 y 16 caracteres): ")
    filt_contra = r'^(?=.+[a-z])(?=.+[A-Z])(?=.+\d)[a-zA-Z\d]{8,16}$'
    if re.match(filt_contra, contrasena):
        print("Contraseña valida")
    else:
        print("Contraseña invalida")

if respuesta == "9":
    texto= input("Escribe un texto: ")
    url= r'https?://[^\s]+'
    URLS= re.findall(url, texto)
    if URLS:
        print(f"{URLS}")

if respuesta == "10":
    """Ejemplo: "Me encanta #Python y #programación" → ["#Python", "#programación"]."""
    hastag = input("Escribe un texto: ")
    tags = r'\#[^\s]+'
    tag = re.findall(tags, hastag)
    if tag:
        print(f"{tag}")

if respuesta == "11":
    