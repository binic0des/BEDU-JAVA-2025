public class Entrada {
    //atributo
    String nombreEvento;
    double precioEntrada;

    //constructor
    public Entrada(String nombre, double precio) {
        this.nombreEvento = nombre;
        this.precioEntrada = precio;
    }

    //metodo
    public void mostrarInformacion() {
        System.out.println("\n☆ Información del evento. ☆");
        System.out.println("\uD83C\uDF9F\uFE0F Evento: " + nombreEvento + " | \uD83D\uDCB2 Precio: $" + precioEntrada);
    }

    //reto con record
    public record entradaRecord(String nombreEvento, double precioEntrada){
        public void mostrarInformacionRecord(){
            System.out.println("\n- Entrada con record:");
            System.out.println("\uD83C\uDF9F\uFE0F Evento: " + nombreEvento + " | \uD83D\uDCB2 Precio: $" + precioEntrada);
        }
    }
}
