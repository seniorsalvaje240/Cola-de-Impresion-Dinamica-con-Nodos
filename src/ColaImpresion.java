public class ColaImpresion {

    private Nodo frente;
    private Nodo ultimo;

    public ColaImpresion () {
        this.frente = null;
        this.ultimo = null;
    }

    public void add (Documento doc) {
        Nodo nuevo = new Nodo(doc);
        if (frente == null) {
            frente = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
        }
    }

    public Documento imprimirDocumento() {
        if (frente == null) {
            return null;
        }

        Documento info = frente.info;
        frente = frente.siguiente;

        if (frente == null) {
            ultimo = null;
        }

        return info;
    }

    public void mostrarEstado () {
        if (frente == null) {
            System.out.println("Cola vacia");
        }

        Nodo actual = frente;

        int i = 1;

        System.out.println("COLA ACTUAL DE IMPRESION");
        while (actual != null) {
            System.out.println(i + ". " + actual.info);
            actual = actual.siguiente;
            i++;
        }

    }

}
