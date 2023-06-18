public class Prueba {
    public static void main(String[] args) {

        BlocNotas blocUno = new BlocNotas(4);
        blocUno.llenarBlocConNotasDeLasClases();
        blocUno.listarNotas();
        blocUno.cantidadDeNotasDelBloc();
        blocUno.eliminarNota();
        blocUno.listarNotas();



    }
}