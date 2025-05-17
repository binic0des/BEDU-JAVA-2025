public class Paciente {

    //atributos
    String nombre;
    int edad;
    String numExpediente;

    //metodo
    public void mostrarInformacion(){
        System.out.println("\n\uD83D\uDDC2\uFE0F Información del paciente.");
        System.out.println("Paciente: " + nombre + "\nEdad: " + edad + "\nNúmero de expediente: " + numExpediente);
    }

}
