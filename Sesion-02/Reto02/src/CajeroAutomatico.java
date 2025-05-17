import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //objeto Scanner para leer la entrada del usuario

        double saldo = 1000.0; //saldo inicial
        int opcion;

        System.out.println("\n--- ☆ Bienvenido al cajero automático ☆ ---");
        do {
            //menu
            System.out.println("\nMenú de operaciones:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir\n");

            //leer opcion
            System.out.print("Elija la operación que desea realizar: ");
            opcion = scanner.nextInt();

            //acciones del menu
            switch (opcion) {
                case 1:
                    System.out.println("\n✅ Consultar saldo");
                    System.out.println("── Saldo: $" + saldo);
                    break;

                case 2:
                    System.out.println("\n\uD83D\uDCB0 Depositar dinero");
                    System.out.print("Ingresa monto a depositar: $");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("── Saldo actualizado: $" + saldo);
                    break;

                case 3:
                    System.out.println("\n\uD83D\uDCB8 Retirar dinero");
                    System.out.print("Ingresa monto a retirar: $");
                    double retiro = scanner.nextDouble();

                    if (saldo >= retiro){
                        saldo -= retiro;
                        System.out.println("── Saldo actualizado: $" + saldo);
                    } else {
                        System.out.println("❌ Fondos insuficientes");
                    }
                    break;

                case 4:
                    System.out.println("\n ☆ Gracias por usar nuestro cajero automático. ¡Hasta luego \uD83D\uDE0A\uD83D\uDC4B!.");
                    break;

                default:
                    System.out.println("❌ Opción no válida. Por favor, elige una opción del menú.");
                    break;
            }
        } while (opcion != 4); //salir del menu

        scanner.close();
    }
}
