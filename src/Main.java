import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ColaImpresion cola = new ColaImpresion();

        System.out.println("Menú");
        System.out.println("1. Añadir documentos a la cola de impresion");
        System.out.println("2. Imprimir documento actual de la cola");
        System.out.println("3. Ver cola de impresion");
        System.out.println("4. Salir");

        while (true) {
            System.out.print("Seleccione una opcion >> ");
            String opc = scanner.nextLine();

            if (opc.equals("4")) {
                System.out.println("Hasta la proxima chupapis!!!");
                break;
            }

            if (opc.equals("1")) {
                System.out.println("Ingrese el nombre del documento: ");
                String nombre = scanner.nextLine();
                System.out.println("Ingrese el numero de paginas del documento: ");
                int paginas = Integer.valueOf(scanner.nextLine());

                cola.add(new Documento(nombre, paginas));

                System.out.println("EL documento a sido añadido");

            } else if (opc.equals("2")) {
                System.out.println(cola.imprimirDocumento());
                System.out.println("El documento a sido impreso correctamente");
            } else if (opc.equals("3")) {
                cola.mostrarEstado();
            }

        }

    }
}