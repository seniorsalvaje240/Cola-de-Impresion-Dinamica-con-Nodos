public class Documento {

    private String nombre;
    private int paginas;

    public Documento (String nombre, int paginas) {
        this.nombre = nombre;
        this.paginas = paginas;
    }

    @Override
    public String toString () {
        return "Doc: " + this.nombre + "(" + this.paginas + "págs)";
    }

}
