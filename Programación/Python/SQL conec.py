import mysql.connector

# Configuración de la conexión a la base de datos
config = {
'user': 'root',
'password': '123456',
'host': 'localhost', # Puede ser 'localhost' si la base de datos está en tu máquina
'port': '3307',
'database': 'datascraping',
}

conn = mysql.connector.connect(**config)
cursor = conn.cursor()

nuevo_registro = {'nombre': 'Juan', 'precio': 25}

insert_query = "INSERT INTO producto(nombre, precio) VALUES (%s, %s)"
cursor.execute(insert_query, (nuevo_registro['nombre'],
nuevo_registro['precio']))

conn.commit()
conn.close()