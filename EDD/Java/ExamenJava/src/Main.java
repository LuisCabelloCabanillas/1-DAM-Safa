public class Main {
    public static void main(String[] args) {
        FestividadImpl semanaSantaSevilla = new FestividadImpl("Semana Santa", "abril");
        FestividadImpl feriaSevilla = new FestividadImpl("La Feria de Sevilla", "abril");
        PoblacionImpl sevilla = new PoblacionImpl("Sevilla", 1942389, 14036, 1200000, 1500000, feriaSevilla);

        System.out.println(sevilla);
        System.out.println(semanaSantaSevilla);
    }
}