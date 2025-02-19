package utilidades;

import com.aseguradora.utils.SoporteVehiculos;
import com.aseguradora.utils.Tarifa;

public class UtilidadesMultiplicadores {
    private SoporteVehiculos soporteVehiculos;

    public UtilidadesMultiplicadores(SoporteVehiculos soporteVehiculos) {
        this.soporteVehiculos = soporteVehiculos;
    }

    public Tarifa calcularTarifaExtendida(String marca, String modelo, int anyo, String cp, boolean tieneParking, boolean conductorMenor25, boolean conductorPrincipalMenor25, int siniestros) throws IllegalArgumentException {
        Tarifa tarifaBase = soporteVehiculos.calcularTarifa(marca, modelo, anyo);
        double multiplicador = soporteVehiculos.multiplicadorCP(cp);

        if (tieneParking) {
            multiplicador *= 0.9;
        }

        if (conductorPrincipalMenor25) {
            multiplicador *= 1.2;
        } else if (conductorMenor25) {
            multiplicador *= 1.1;
        }

        if (siniestros == 0) {
            multiplicador *= (1 + (0.05 * siniestros));
        }else if (siniestros > 1) {
            multiplicador *= (1 + (0.1 * siniestros));
        }

        double precioTERC = tarifaBase.getPrecioTERC() * multiplicador;
        double precioTAMP = tarifaBase.getPrecioTAMP() * multiplicador;
        double precioTRIE = tarifaBase.getPrecioTRIE() * multiplicador;

        return new Tarifa(marca, modelo, anyo, precioTERC, precioTAMP, precioTRIE);
    }
}