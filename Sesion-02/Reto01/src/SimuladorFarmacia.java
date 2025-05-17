import java.util.Scanner;

public class SimuladorFarmacia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\uD83D\uDC8A - Sistema de Farmacia");
        //entrada de medicina
        System.out.print("Ingrese nombre del medicamento: ");
        String medicamento = scanner.nextLine();
        //entrada de precio unitario
        System.out.print("Ingrese nombre del precio unitario: ");
        double precio = scanner.nextDouble();
        //entrada de cantidad de piezas
        System.out.print("Ingrese nombre del cantidad de piezas: ");
        int cantidadPiezas = scanner.nextInt();

        //total sin descuento
        var total = precio * cantidadPiezas;
        //aplicar descuento
        var aplicarDescuento = total>500;
        double descuento = (aplicarDescuento) ? total*0.15 : 0;

        //mensaje en consola
        System.out.println("\n\uD83E\uDDFE - Recibo de productos");
        System.out.println("Medicamento: " + medicamento);
        System.out.println("Cantidad: " + cantidadPiezas);
        System.out.println("Precio unitario: $" + precio);
        System.out.println("Total sin descuento: $" + total);
        System.out.println("¿Aplica descuento?: " + aplicarDescuento);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + (total-descuento));

    }
}
