import java.util.Arrays;
import java.util.Scanner;

public class BlocNotas {

    private int tamanio;

    private String blocDeNotas[];

    Scanner entrada = new Scanner(System.in);

    Nota nota1 = new Nota("Esta es una nota de prueba sin alarma");
    NotaAlarma alarm1 = new NotaAlarma("Mi primera nota es un recordatorio", "17:00Hrs");
    NotaAlarma alarm2 = new NotaAlarma("Segunda nota de alarma","20:00Hrs");
    NotaAlarma alarm3 = new NotaAlarma("Es hora de estudiar Java!","06:00Hrs");

    public BlocNotas(int tamanio) {
        this.tamanio = tamanio;
        blocDeNotas = new String[this.tamanio];
    }

    public void llenarBlocConNotasDeLasClases(){
        blocDeNotas[0] = nota1.toString();
        blocDeNotas[1] = alarm1.toString();
        blocDeNotas[2] = alarm2.toString();
        blocDeNotas[3] = alarm3.toString();
    }

    public void llenarBlocConNotasPasadasPorTeclado() {
        for (int i = 0; i < blocDeNotas.length; i++) {
            System.out.print("Ingrese la nota de la posición " + (i + 1) + ": ");
            blocDeNotas[i] = entrada.nextLine();
        }
    }

    public void listarNotas() {
        for (int i = 0; i < blocDeNotas.length; i++) {
            System.out.println(blocDeNotas[i]);
        }
    }

    public void eliminarNota() {
        System.out.print("Ingrese la posición de la Nota que desea eliminar: ");
        int posicion = entrada.nextInt();
        for (int i = 0; i < blocDeNotas.length; i++) {
            if (i == posicion - 1) {
                for (int j = i; j < blocDeNotas.length - 1; j++) {
                    blocDeNotas[j] = blocDeNotas[j + 1];
                }
            }
        }
        blocDeNotas[blocDeNotas.length - 1] = "(Espacio Vacío!)";
        System.out.println("Nota " + posicion + " eliminada." +
                "\n____________________________________________________________");
    }

    public void cantidadDeNotasDelBloc() {
        System.out.println("El Bloc tiene un total de " + tamanio + " Notas." +
                "\n____________________________________________________________");
    }

}
