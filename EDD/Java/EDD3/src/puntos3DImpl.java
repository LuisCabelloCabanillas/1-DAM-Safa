public class puntos3DImpl {
    private Double X;
    private Double Y;
    private Double Z;

    public puntos3DImpl(Double X, Double Y, Double Z) {
        if (Double.isNaN(X) || Double.isNaN(Y) || Double.isNaN(Z)) {
            throw new IllegalArgumentException("Las coordenadas no puede ser nulas");
        }
            this.X = X;
            this.Y = Y;
            this.Z = Z;
    }
    public Double getX() {
        return X;
    }
    public void setX(Double X) {
        if (Double.isNaN(X)) {
            throw new IllegalArgumentException("Las coordenada no puede ser nula");
        }
        this.X = X;
    }
    public Double getY() {
        return Y;
    }
    public void setY(Double Y) {
        if (Double.isNaN(Y)) {
            throw new IllegalArgumentException("Las coordenada no puede ser nula");
        }
        this.Y = Y;
    }
    public Double getZ() {
        return Z;
    }
    public void setZ(Double Z) {
        if (Double.isNaN(Z)) {
            throw new IllegalArgumentException("Las coordenada no puede ser nula");
        }
        this.Z = Z;
    }

    public double calcularDistancia(puntos3DImpl otro) {
        if (otro == null) {
            throw new IllegalArgumentException("La coordenada no puede ser nula");
        }
        return Math.sqrt(Math.pow(this.X - otro.X, 2) + Math.pow(this.Y - otro.Y, 2)+ Math.pow(this.Z - otro.Z, 2));
    }
    public String toString() {
        return "("+getX()+","+getY()+","+getZ()+")";
    }
}