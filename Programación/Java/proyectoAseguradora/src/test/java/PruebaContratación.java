import com.aseguradora.utils.SoporteVehiculos;
import com.aseguradora.utils.Tarifa;
import modelos.*;
import utilidades.UtilidadesMultiplicadores;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PruebaContratación {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Datos del tomador:");
            System.out.print("Nombre: ");
            String tomNombre = scanner.nextLine();
            System.out.print("Apellido1: ");
            String tomApellido1 = scanner.nextLine();
            System.out.print("Apellido2: ");
            String tomApellido2 = scanner.nextLine();
            System.out.print("NIF: ");
            String tomNIF = scanner.nextLine();
            System.out.print("Fecha Nacimiento (YYYY-MM-DD): ");
            LocalDate tomFechaNacimiento = LocalDate.parse(scanner.nextLine());
            System.out.print("Sexo (MASCULINO/FEMENINO): ");
            Personas.Sexo tomSexo = Personas.Sexo.valueOf(scanner.nextLine().toUpperCase());
            System.out.print("País: ");
            String tomPais = scanner.nextLine();
            System.out.print("Email: ");
            String tomEmail = scanner.nextLine();
            System.out.print("Teléfono: ");
            String tomTelefono = scanner.nextLine();
            System.out.print("Edad: ");
            int tomEdad = Integer.parseInt(scanner.nextLine());

            System.out.println("Detalles dirección:");
            System.out.print("Tipo de Vía (calle, avenida, plaza, plazoleta, callejon): ");
            Direccion.TipoVia tipoVia = Direccion.TipoVia.valueOf(scanner.nextLine().toLowerCase());
            System.out.print("Nombre de la Vía: ");
            String viaNombre = scanner.nextLine();
            System.out.print("Número de la Vía: ");
            int viaNumero = Integer.parseInt(scanner.nextLine());
            System.out.print("Resto de Dirección: ");
            String restoDireccion = scanner.nextLine();
            System.out.print("Código Postal: ");
            String codigoPostal = scanner.nextLine();
            System.out.print("Localidad: ");
            String localidad = scanner.nextLine();
            System.out.print("Provincia: ");
            String provincia = scanner.nextLine();

            Direccion direccion = new Direccion(1, viaNombre, viaNumero, restoDireccion, codigoPostal, localidad, provincia, tipoVia);
            Personas tomador = new Personas(1, tomNombre, tomApellido1, tomApellido2, tomNIF, tomFechaNacimiento, direccion, tomSexo, tomPais, tomEmail, tomTelefono, tomEdad);

            System.out.print("¿Es el primer conductor el tomador ? (si/no): ");
            String primerConductor = scanner.nextLine().trim().toLowerCase();
            Conductor conductorPrincipal;
            if (primerConductor.equals("si")) {
                conductorPrincipal = new Conductor(1, tomNombre, tomApellido1, tomApellido2, tomNIF, tomFechaNacimiento, direccion, tomSexo, tomPais, tomEmail, tomTelefono, tomEdad, LocalDate.now(), 8, 1);
            } else {
                System.out.println("Detalles primer conductor:");
                System.out.print("Nombre: ");
                String conNombre = scanner.nextLine();
                System.out.print("Apellido1: ");
                String conApellido1 = scanner.nextLine();
                System.out.print("Apellido2: ");
                String conApellido2 = scanner.nextLine();
                System.out.print("NIF: ");
                String conNIF = scanner.nextLine();
                System.out.print("Fecha de nacimieto (YYYY-MM-DD): ");
                LocalDate conFechaNacimiento = LocalDate.parse(scanner.nextLine());
                System.out.print("Sexo (MASCULINO/FEMENINO): ");
                Personas.Sexo conSexo = Personas.Sexo.valueOf(scanner.nextLine().toUpperCase());
                System.out.print("País: ");
                String conPais = scanner.nextLine();
                System.out.print("Email: ");
                String conEmail = scanner.nextLine();
                System.out.print("Teléfono: ");
                String conTelefono = scanner.nextLine();
                System.out.print("Edad: ");
                int conEdad = Integer.parseInt(scanner.nextLine());

                System.out.println("Detalles dirección:");
                System.out.print("Tipo de Vía (calle, avenida, plaza, plazoleta, callejon): ");
                Direccion.TipoVia conTipoVia = Direccion.TipoVia.valueOf(scanner.nextLine().toLowerCase());
                System.out.print("Nombre de la Vía: ");
                String conViaNombre = scanner.nextLine();
                System.out.print("Número de la Vía: ");
                int conViaNumero  = Integer.parseInt(scanner.nextLine());
                System.out.print("Resto de Dirección: ");
                String conResto = scanner.nextLine();
                System.out.print("Código Postal: ");
                String conCP = scanner.nextLine();
                System.out.print("Localidad: ");
                String conLocalidad = scanner.nextLine();
                System.out.print("Provincia: ");
                String conProvincia = scanner.nextLine();

                Direccion conDireccion = new Direccion(1, conViaNombre, conViaNumero, conResto, conCP, conLocalidad, conProvincia, conTipoVia);
                Personas personaConductor = new Personas(2, conNombre, conApellido1, conApellido2, conNIF, conFechaNacimiento, conDireccion, conSexo, conPais, conEmail, conTelefono, conEdad);
                System.out.print("Fecha de Carnet (YYYY-MM-DD): ");
                LocalDate fechaCarnet = LocalDate.parse(scanner.nextLine());
                System.out.print("Puntos de Carnet: ");
                int puntosCarnet = Integer.parseInt(scanner.nextLine());
                System.out.print("Años Asegurados: ");
                int anyoAsegurados = Integer.parseInt(scanner.nextLine());
                conductorPrincipal = new Conductor(1, conNombre, conApellido1, conApellido2, conNIF, conFechaNacimiento, conDireccion, conSexo, conPais, conEmail, conTelefono, conEdad, fechaCarnet, puntosCarnet, anyoAsegurados);
            }

            List<Conductor> conductoresOcasionales = new ArrayList<>();
            System.out.print("¿Hay conductores ocasionales? (si/no): ");
            String existeAdicional = scanner.nextLine().trim().toLowerCase();
            if (existeAdicional.equals("si")) {
                System.out.println("Enter Additional Conductor details:");
                System.out.print("Nombre: ");
                String exiNombre = scanner.nextLine();
                System.out.print("Apellido1: ");
                String exiApellido1 = scanner.nextLine();
                System.out.print("Apellido2: ");
                String exiApellido2 = scanner.nextLine();
                System.out.print("NIF: ");
                String exiNIF = scanner.nextLine();
                System.out.print("Fecha de nacimiento (YYYY-MM-DD): ");
                LocalDate exiFechaNacimineto = LocalDate.parse(scanner.nextLine());
                System.out.print("Sexo (MASCULINO/FEMENINO): ");
                Personas.Sexo exiSexo = Personas.Sexo.valueOf(scanner.nextLine().toUpperCase());
                System.out.print("País: ");
                String exiPais = scanner.nextLine();
                System.out.print("Email: ");
                String exiEmail = scanner.nextLine();
                System.out.print("Teléfono: ");
                String exiTelefono = scanner.nextLine();
                System.out.print("Edad: ");
                int exiEdad = Integer.parseInt(scanner.nextLine());

                System.out.println("Detalles dirección:");
                System.out.print("Tipo de Vía (calle, avenida, plaza, plazoleta, callejon): ");
                Direccion.TipoVia exiTipoVia = Direccion.TipoVia.valueOf(scanner.nextLine().toLowerCase());
                System.out.print("Nombre de la Vía: ");
                String exiViaNombre = scanner.nextLine();
                System.out.print("Número de la Vía: ");
                int exiViaNumero  = Integer.parseInt(scanner.nextLine());
                System.out.print("Resto de Dirección: ");
                String exiResto = scanner.nextLine();
                System.out.print("Código Postal: ");
                String exiCP = scanner.nextLine();
                System.out.print("Localidad: ");
                String exiLocalidad = scanner.nextLine();
                System.out.print("Provincia: ");
                String exiProvincia = scanner.nextLine();

                Direccion exiDireccion = new Direccion(1, exiViaNombre, exiViaNumero, exiResto, exiCP, exiLocalidad, exiProvincia, exiTipoVia);
                Personas personaexi = new Personas(3, exiNombre, exiApellido1, exiApellido2, exiNIF, exiFechaNacimineto, exiDireccion, exiSexo, exiPais, exiEmail, exiTelefono, exiEdad);
                System.out.print("Fecha de Carnet (YYYY-MM-DD): ");
                LocalDate exiFechaCarnet = LocalDate.parse(scanner.nextLine());
                System.out.print("Puntos de Carnet: ");
                int exiPuntos = Integer.parseInt(scanner.nextLine());
                System.out.print("Años Asegurados: ");
                int exiAnios = Integer.parseInt(scanner.nextLine());

                Conductor conAdicional = new Conductor(1, exiNombre, exiApellido1, exiApellido2, exiNIF, exiFechaNacimineto, exiDireccion, exiSexo, exiPais, exiEmail, exiTelefono, exiEdad, exiFechaCarnet, exiPuntos, exiAnios);
                conductoresOcasionales.add(conAdicional);
            }


            System.out.println("Detalles del vehículo:");
            System.out.print("Marca: ");
            String marca = scanner.nextLine();
            System.out.print("Modelo: ");
            String modelo = scanner.nextLine();
            System.out.print("Matrícula: ");
            String matricula = scanner.nextLine();
            System.out.print("Fecha de Matriculación (YYYY-MM-DD): ");
            LocalDate fechaMatriculacion = LocalDate.parse(scanner.nextLine());
            System.out.print("Color: ");
            String color = scanner.nextLine();
            System.out.println("Siniestros en los últimos años: ");
            int numSiniestros = Integer.parseInt(scanner.nextLine());
            Vehiculo vehiculo = new Vehiculo(1,marca, modelo, matricula, fechaMatriculacion, color, tomador,fechaMatriculacion.getYear());


            Cotizacion cotizacion = new Cotizacion(1, 1, LocalDate.now(), LocalDate.now(), vehiculo, tomador, conductorPrincipal, conductoresOcasionales, true, 1, 1.0, 1.0, 1.0, Cotizacion.Modalidad.TERC);

            AnualidadPoliza anualidadPoliza = new AnualidadPoliza(1, AnualidadPoliza.EstadoPoliza.VIGENTE, "No aplica", cotizacion, AnualidadPoliza.ModoPago.IBAN, false, 100.0, 100.0, LocalDate.now(), LocalDate.now().plusYears(1), null);
            anualidadPoliza.setTomador(tomador);
            anualidadPoliza.setConductorPrincipal(conductorPrincipal);

            Poliza poliza = new Poliza(1, List.of(anualidadPoliza), AnualidadPoliza.EstadoPoliza.VIGENTE, "No aplica", cotizacion);

            System.out.println("Poliza creada: " + poliza);
            try {
                UtilidadesMultiplicadores utilidades = new UtilidadesMultiplicadores(SoporteVehiculos.getInstance());
                Tarifa tarifa = utilidades.calcularTarifaExtendida(marca, modelo, LocalDate.now().getYear(), codigoPostal, false, false, true, numSiniestros);
                System.out.println("Tarifa calculada:");
                System.out.println("Precio TERC: " + tarifa.getPrecioTERC());
                System.out.println("Precio TAMP: " + tarifa.getPrecioTAMP());
                System.out.println("Precio TRIE: " + tarifa.getPrecioTRIE());
                System.out.println(tarifa);
                System.out.print("¿Desea aceptar el seguro? (si/no): ");
                String aceptarSeguro = scanner.nextLine().trim().toLowerCase();
                if (aceptarSeguro.equals("si")) {
                    System.out.print("Elija método de pago (IBAN/TARJETA): ");
                    AnualidadPoliza.ModoPago modoPago = AnualidadPoliza.ModoPago.valueOf(scanner.nextLine().toUpperCase());
                    System.out.println("Seguro aceptado. Detalles de la póliza:");
                    System.out.println(poliza);
                } else {
                    System.out.println("Seguro rechazado.");
                }
            } catch (IllegalArgumentException e) {
                System.err.println("Error al calcular la tarifa: " + e.getMessage());
            }


        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

