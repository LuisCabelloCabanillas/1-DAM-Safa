import mysql.connector
# Conéctate a la base de datos
conexion = mysql.connector.connect(
host="localhost",
user="root",
password="123456",
database="datascraping",
port=3307,
)
# Crea un cursor para ejecutar consultas SQL
cursor = conexion.cursor(dictionary=True)
# Ejecuta una consulta SQL para seleccionar datos de una tabla
consulta = "SELECT * FROM producto"
cursor.execute(consulta)
# Obtiene los nombres de las columnas
columnas = cursor.column_names
# Obtiene todos los resultados de la consulta
resultados = cursor.fetchall()
# Cierra la conexión y el cursor
cursor.close()
conexion.close()
# Construye la lista de diccionarios con los nombres de las columnas como claves
lista_de_diccionarios = []
print(resultados)