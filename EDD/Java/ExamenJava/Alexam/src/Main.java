EXAMEN ENTORNO DE DESARROLLO
1.	En este ejercicio aplicaremos la técnica "Extract Method". El código mantiene su funcionalidad, pero ahora resulta más legible. Al extraer el método, este se vuelve reutilizable en otras partes del sistema.
public class Actividad1 {
    void imprimirFactura() {
        imprimirEncabezado();
        imprimirDetalles(getCantidad());
    }
    void imprimirDetalles(Double cantidad) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad: " + cantidad);
    }
}
2.	En este ejercicio aplicaremos "Inline Method". Es fundamental eliminar el método original una vez que su contenido ha sido incorporado directamente, ya que no será utilizado nuevamente.
public class Actividad2 {
    int obtenerCalificaciones() {
        return (numeroDeRetrasos > 5) ? 2 : 1;
    }
}
3.	Una estructura condicional permite seleccionar diferentes comportamientos según el tipo de un objeto. La solución consiste en convertir la estructura condicional en un método mediante "Extract Method". Cada opción condicional se transformará en una versión sobrescrita del método dentro de la clase derivada correspondiente.
abstract class Empleado {
    abstract double getSalario();
}
class Ingeniero extends Empleado {
    double getSalario() {
        return salarioBase + productividad;
    }
}
class Vendedor extends Empleado {
    double getSalario() {
        return salarioBase + ventas * comision;
    }
}
class Director extends Empleado {
    double getSalario() {
        return salarioBase + bonificacion + dietas;
    }
}
4.	Cuando se emplean tipos enumerados para diferenciar variantes de un tipo, puede ser conveniente mejorar el código mediante subclases.
public class Shape {
    private double size;
    public Shape(double size) {
        this.size = size;
    }
    public double getSize() {
        return size;
    }
}
public class Square extends Shape {
    public Square(double size) {
        super(size);
    }
    public double area() {
        double size = getSize();
        return size * size;
    }
}
public class Circle extends Shape {
    public Circle(double size) {
        super(size);
    }
    public double area() {
        double size = getSize();
        return Math.PI * size / 4.0;
    }
}
5.	La solución a este ejercicio es la misma que en prácticas, haciendo uso de etiquetas como:
o	@see para referenciar la documentación de otra clase o método.
o	@version para indicar la versión de una clase.
o	@author para registrar el nombre del autor.
o	@since para especificar la fecha de incorporación de una clase.
o	@param para describir los parámetros de un método.
o	@return para indicar el valor devuelto por un método.
o	@throws para documentar excepciones lanzadas.
o	@deprecated para señalar métodos obsoletos.
6.
        1.	Renombrado: Asignar nombres más descriptivos a paquetes, clases, métodos o campos.
        2.	Sustitución de bloques de código por métodos: Transformar fragmentos de código en métodos reutilizables.
3.	Encapsulación de campos: Implementar métodos getter y setter para un acceso controlado a los campos de una clase.
4.	Reubicación de clases: Mover clases entre paquetes o proyectos para evitar duplicaciones.
5.	Eliminación segura: Borrar código innecesario asegurándose de eliminar todas sus referencias.
6.	Modificación de parámetros: Ajustar parámetros de métodos y sus modificadores de acceso.
7.	Extracción de interfaz: Crear una interfaz a partir de métodos seleccionados en una clase.
7. Los analizadores de código incluyen:
        1.	Analizadores léxicos.
        2.	Analizadores sintácticos.
        3.	Reglas aplicables a ciertas estructuras.
Sus funciones principales son:
        4.	Identificar fragmentos de código que reduzcan el rendimiento.
        5.	Detectar errores potenciales en el software.
        6.	Evaluar la complejidad del código.
7.	Analizar el flujo de datos.
8.	Identificar vulnerabilidades de seguridad.
        8.
        •	El análisis estático evalúa el software sin ejecutarlo.
        •	Se realiza sobre el código fuente para detectar mejoras sin modificar su semántica.
•	Se utilizan herramientas específicas llamadas analizadores estáticos.
•	Un analizador estático de código:
o	Recibe el código fuente.
o	Lo procesa para determinar su funcionalidad.
o	Sugiere mejoras o identifica problemas.
        •	El análisis puede realizarse de forma automática o manual.
•	PMD es un analizador de código estático que detecta errores y vulnerabilidades de manera preventiva.
9.
        •	Repositorio: Espacio de almacenamiento para datos de proyectos.
•	Módulo: Sección específica dentro del repositorio, que puede representar una parte o la totalidad del proyecto.
        •	Revisión: Versión parcial o modificación del código en el repositorio.
•	Etiqueta: Información textual añadida a archivos o módulos para destacar datos importantes.
•	Rama: Línea de desarrollo paralela que permite realizar cambios sin afectar la versión principal.
10.
        •	Identificación: Establecer estándares de documentación y nomenclatura.
        •	Control de cambios: Evaluar y registrar modificaciones en la configuración del software.
•	Auditorías de configuración: Garantizar la correcta implementación de cambios mediante revisiones técnicas.
•	Generación de informes: Documentar la evolución de los distintos elementos del software para asegurar su consistencia.
