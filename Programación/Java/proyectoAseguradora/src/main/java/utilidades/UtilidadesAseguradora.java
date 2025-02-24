package utilidades;

import modelos.AnualidadPoliza;
import modelos.Aseguradora;
import modelos.Poliza;

import java.util.ArrayList;
import java.util.List;

public class UtilidadesAseguradora {
    public static Poliza recuperarPoliza(Aseguradora a, int id){
        for (Poliza poliza: a.getListaPolizas()){
            if (poliza.getNumero().equals(id)){
                return poliza;
            }
        }
        return null;
    }

    public static List<Poliza> recuperarPolizaActivas(Aseguradora aseguradora){
        List<Poliza> polizasActivas = new ArrayList<>();
        for (Poliza poliza: aseguradora.getListaPolizas()){
            if (poliza.getEstadoPoliza().equals(AnualidadPoliza.EstadoPoliza.VIGENTE)){
                polizasActivas.add(poliza);
            }
        }
        return polizasActivas;
    }

    public static List<Poliza> recuperarPolizaPorTomador (Aseguradora aseguradora, String nif){
        List<Poliza> polizasTomador = new ArrayList<>();
        for (Poliza poliza: aseguradora.getListaPolizas()){
            if (poliza.getTomador().getNif().equals(nif)){
                polizasTomador.add(poliza);
            }
        }
        return polizasTomador;
    }

    public static List<Poliza> recuperarPolizaPorConductor (Aseguradora aseguradora, String nif){
        List<Poliza> polizaConductor = new ArrayList<>();
        for (Poliza poliza : aseguradora.getListaPolizas()){
            if (poliza.getConductorPrincipal().getNif().equals(nif)){
                polizaConductor.add(poliza);
            }
        }
        return polizaConductor;
    }
}
