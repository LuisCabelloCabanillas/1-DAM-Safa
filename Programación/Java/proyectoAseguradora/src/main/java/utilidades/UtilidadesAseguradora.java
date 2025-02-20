package utilidades;

import modelos.Aseguradora;
import modelos.Poliza;

public class UtilidadesAseguradora {
    public static Poliza recuperarPoliza(Aseguradora a, String numeroPoliza){
        for (Poliza poliza: a.getListaPolizas()){
            if (poliza.getNumero().equals(numeroPoliza)){
                return poliza;
            }
        }
        return null;
    }
}
