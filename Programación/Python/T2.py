from random import sample

def num_ale(a,b,c):
    numeros = list(range(a,b))
    numeros_ale = sample(numeros, c)
    numeros_ale.sort()
    return numeros_ale

a = int(input("Elige el primer número delimitador: "))
b = int(input("Elige el último número delimitador: "))
c = int(input("Cuantos números desea ver: "))
resultado = num_ale(a,b,c)
print(resultado)

#Explicación. Para comenzar he observado los si guientes ejercicios y he pensado que lo mejor es crear una "def" para poder utilizarlo sin tener que repetir el codigo todas las veces.
#Al crear una def he puesto como texto entre () "a,b,c" ya que voy a utilizar 3 variables durante la definición.
#Pongo un "list(range(a,b))" para que el programa entienda que la lista a crear debe de ser entre los valores en a y b
#Creo una nueva lista para guardar dentro un "sample" que aleatoriza los números sin repetirlosel "()" Hace que el programa sepa que es entre los números y en "c" veces.
#Después uso un "sort" para que se ordenen los números. (Si lo quitamos sigue funcionando pero no se ordenan como el ejemplo).
#El "return" finaliza la acción y después escogemos los datos de a, b y c los cuales limitan cada variable y lo mostramos.