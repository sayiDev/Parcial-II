import java.util.Scanner;

public class Tienda_Ropa{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int precioCamiseta = 25000;
        int precioPantalon = 45000;
        int precioChaqueta = 65000;

        int cantidadCamisetas = 0;
        int cantidadPantalones = 0;
        int cantidadChaquetas = 0;

        int opcion;

        do {
            System.out.println("Menú de Compras:");
            System.out.println("1. Camisetas - $25000");
            System.out.println("2. Pantalones - $45000");
            System.out.println("3. Chaquetas - $65000");
            System.out.println("4. Salir");
            System.out.print("Digite una opción: ");
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.print("¿Cuántas camisetas quieres comprar? ");
                cantidadCamisetas = cantidadCamisetas + sc.nextInt();
            } else if (opcion == 2) {
                System.out.print("¿Cuántos pantalones quieres comprar? ");
                cantidadPantalones = cantidadPantalones + sc.nextInt();
            } else if (opcion == 3) {
                System.out.print("¿Cuántas chaquetas quieres comprar? ");
                cantidadChaquetas = cantidadChaquetas + sc.nextInt();
            }

        } while (opcion != 4);

        double subtotalCamisetas = precioCamiseta * cantidadCamisetas;
        double ivaCamisetas = subtotalCamisetas * 0.19;
        double descuentoCamisetas = 0;
        if (cantidadCamisetas >= 3 && cantidadCamisetas <= 4) {
            descuentoCamisetas = subtotalCamisetas * 0.10;
        } else if (cantidadCamisetas > 4) {
            descuentoCamisetas = subtotalCamisetas * 0.15;
        }
        double totalCamisetas = subtotalCamisetas + ivaCamisetas - descuentoCamisetas;

        double subtotalPantalones = precioPantalon * cantidadPantalones;
        double ivaPantalones = subtotalPantalones * 0.19;
        double descuentoPantalones = 0;
        if (cantidadPantalones >= 3 && cantidadPantalones <= 4) {
            descuentoPantalones = subtotalPantalones * 0.10;
        } else if (cantidadPantalones > 4) {
            descuentoPantalones = subtotalPantalones * 0.15;
        }
        double totalPantalones = subtotalPantalones + ivaPantalones - descuentoPantalones;

        double subtotalChaquetas = precioChaqueta * cantidadChaquetas;
        double ivaChaquetas = subtotalChaquetas * 0.19;
        double descuentoChaquetas = 0;
        if (cantidadChaquetas >= 3 && cantidadChaquetas <= 4) {
            descuentoChaquetas = subtotalChaquetas * 0.10;
        } else if (cantidadChaquetas > 4) {
            descuentoChaquetas = subtotalChaquetas * 0.15;
        }
        double totalChaquetas = subtotalChaquetas + ivaChaquetas - descuentoChaquetas;

        double totalFinal = totalCamisetas + totalPantalones + totalChaquetas;

        System.out.println("Resumen de la compra:");

        System.out.println("El subtotal de las camisetas es: " + (int)subtotalCamisetas);
        System.out.println("Iva de las camisetas: " + (int)ivaCamisetas);
        System.out.println("Descuento de las camisetas: " + (int)descuentoCamisetas);
        System.out.println("Total camisetas: " + (int)totalCamisetas);
        System.out.println("El subtotal de los pantalones es: " + (int)subtotalPantalones);
        System.out.println("Iva de los pantalones: " + (int)ivaPantalones);
        System.out.println("Descuento de los pantalones: " + (int)descuentoPantalones);
        System.out.println("Total pantalones: " + (int)totalPantalones);
        System.out.println("El subtotal de las chaquetas es: " + (int)subtotalChaquetas);
        System.out.println("Iva de las chaquetas: " + (int)ivaChaquetas);
        System.out.println("Descuento de las chaquetas: " + (int)descuentoChaquetas);
        System.out.println("Total chaquetas: " + (int)totalChaquetas);
        System.out.println("Total a pagar es de: " + (int)totalFinal);
    }
}
