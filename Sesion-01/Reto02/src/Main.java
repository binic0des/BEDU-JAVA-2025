public class Main {
    public static void main(String[] args) {
        //crear objeto
        Entrada evento1 = new Entrada("ABBA Voyage \uD83E\uDEA9", 250);
        evento1.mostrarInformacion();

        Entrada evento2 = new Entrada("Chappell Roan Tour \uD83D\uDCA5", 180.50);
        evento2.mostrarInformacion();

        //crear objeto usando record
        Entrada.entradaRecord evento3 = new Entrada.entradaRecord("Red Velvet: Red Room \uD83C\uDF70", 140.87);
        evento3.mostrarInformacionRecord();

    }
}
