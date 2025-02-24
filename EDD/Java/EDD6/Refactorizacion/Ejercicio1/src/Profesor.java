import java.util.List;

public class Profesor extends Persona{
    String str;
    int edad;
    List<Prestamo> prestamos;

    public Profesor(String numeroDeTelefono) {
        super(numeroDeTelefono);
    }
    public void printInformacionPersonal() {
        System.out.println("Nombre: " + str +
                "\nEdad: " + edad +
                "\nTelefono: " + numeroDeTelefono);
        /*Para poder refactorizar eliminamos la repetición de código de los system.out*/
    }
    public void printTodaLaInformacion() {
        System.out.println("Nombre: " + str +
                "\nEdad: " + edad +
                "\nTelefono: " + numeroDeTelefono);
        for (Prestamo prestamo: prestamos) {
            System.out.println(prestamo);
            /*Refactorizo el nombre de p para que sea mas descriptivo*/
        }
    }
}
