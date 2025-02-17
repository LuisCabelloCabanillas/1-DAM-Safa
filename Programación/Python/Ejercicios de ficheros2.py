import csv

with open("inventario.csv", "a") as f:
    entrada = input("Introduce Producto; Cantidad; Precio (De esta forma): ").strip()
    if entrada == "":
        print("No se introduce ningun producto.")
    else:
        while entrada != "":
            print("El producto se ha guardado correctamente")
            f.write(entrada + "\n")
            entrada=input("Introduce Producto; Cantidad; Precio (De esta forma): ").strip()
        if entrada == "":
            print("No se introduce ningun producto.")

