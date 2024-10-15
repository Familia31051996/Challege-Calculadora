import java.util.Scanner;

public class ConvertirMoneda {

    public static void convertir(String monedaBase, String monedaTarget, ConsultarMoneda consulta, Scanner lectura){
        double cantidad;
        double cantidadConvertidad;

        Moneda moneda = consulta.buscarMoneda(monedaBase, monedaTarget);
        System.out.println("La Tasa de conversion para hoy\n1 "+monedaBase+ " = "+moneda.conversion_rate()+" "+monedaTarget);
        System.out.println("Ingrese la cantidad de " + monedaBase);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertidad = cantidad * moneda.conversion_rate();
        System.out.println(cantidad+ " "+monedaBase +" = " +cantidadConvertidad + " " + moneda.target_code());
    }
    public static void convertirOtraMoneda(ConsultarMoneda consulta, Scanner lectura) {
        System.out.println("Ingrese el codigo de la moneda base:");
        String monedaBase = lectura.nextLine().toUpperCase();
        System.out.println("Ingrese la moneda objetivo:");
        String monedaObjetivo = lectura.nextLine().toUpperCase();
        convertir(monedaBase, monedaObjetivo, consulta, lectura);
    }
}
