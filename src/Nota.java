public class Nota {

    private String lineaDeTexto;
    private final int notaId;
    private static int ID = 1;

    public Nota(String lineaDeTexto){
        this.lineaDeTexto = lineaDeTexto;
        notaId = ID;
        ID++;
    }

    public String getLineaDeTexto(){
        return lineaDeTexto;
    }
    public void setLineaDeTexto(String lineaDeTexto){
        this.lineaDeTexto = lineaDeTexto;
    }
    public int getNotaId(){
        return notaId;
    }

    @Override
    public String toString() {
        return "Nota con ID nro: " + notaId + " es: " + lineaDeTexto +
                "\n____________________________________________________________";
    }
}
