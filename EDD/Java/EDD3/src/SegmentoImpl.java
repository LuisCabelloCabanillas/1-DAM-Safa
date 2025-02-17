public class SegmentoImpl {
    private puntos3DImpl extremo1;
    private puntos3DImpl extremo2;

    public SegmentoImpl(puntos3DImpl extremo1, puntos3DImpl extremo2) {
        if (extremo1 == null || extremo2 == null) {
            throw new IllegalArgumentException("Los extremos no pueden ser nulos");
        }
        this.extremo1 = extremo1;
        this.extremo2 = extremo2;
    }

    public puntos3DImpl getExtremo1() {
        return extremo1;
    }
    public puntos3DImpl getExtremo2() {
        return extremo2;
    }
    public void setExtremo1(puntos3DImpl extremo1) {
        if (extremo1 == null) {
            throw new IllegalArgumentException("El extremo1 no puede ser nulo");
        }
        this.extremo1 = extremo1;
    }
    public void setExtremo2(puntos3DImpl extremo2) {
        if (extremo2 == null) {
            throw new IllegalArgumentException("El extremo2 no puede ser nulo");
        }
        this.extremo2 = extremo2;
    }

    public double longitud() {
        return extremo1.calcularDistancia(extremo2);
    }

    public String toString() {
        return "[" + getExtremo1() + "," + getExtremo2() + "]";
    }
}
