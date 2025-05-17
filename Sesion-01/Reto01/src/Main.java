import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Paciente paciente1 = new Paciente();

        System.out.print("Ingresa nombre del paciente: ");
        paciente1.nombre = entrada.nextLine();

        System.out.print("Ingresa edad del paciente: ");
        paciente1.edad = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Ingresa el número de expediente: ");
        paciente1.numExpediente = entrada.nextLine();

        entrada.close();

        paciente1.mostrarInformacion();

    }
}