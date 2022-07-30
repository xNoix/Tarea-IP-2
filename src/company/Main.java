package company;
public class Main {

    public static String TypeOfNumber(int number) {

        if (number < 0) {
            return number + " es negativo";
        } else if (number > 0) {
            return number + " es positivo";
        }
        else {
            return "es " + number;
        }
    }

    public static int Fwhile(int numeroWhile) {
        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        return numeroWhile;
    }
    public static int FDoWhile(int numeroWhile) {

        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        } while (numeroWhile < 3);
        return numeroWhile;
    }

    public static int FFor(int numeroFor) {

        for (int i = numeroFor; i < 3; i++) {
            System.out.println(i);
        }
        return 3;
    }

    public static String Estaciones(String estacion) {

        switch (estacion.toLowerCase()) {

            case "verano":
                System.out.println("Estamos en verano");
                break;
            case "primavera":
                System.out.println("Estamos en primavera");
                break;
            case "otoño":
                System.out.println("Estamos en otoño");
                break;
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            default:
                System.out.println("El parametro ingresado no es una estacion");
                break;
        }
        return "";
    }

    public static void main(String[] args) {

        System.out.println(TypeOfNumber(6));
        System.out.println(Fwhile(-5));
        System.out.println(FDoWhile(-5));
        System.out.println(FFor(0));
        System.out.println(Estaciones("verano"));
    }
}
