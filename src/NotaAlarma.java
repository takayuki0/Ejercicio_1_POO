public class NotaAlarma extends Nota {

    private String notaAlarma;

    public NotaAlarma(String lineaDeTexto, String notaAlarma) {
        super(lineaDeTexto);
        this.notaAlarma = notaAlarma;
    }

    public String getNotaAlarma() {
        return notaAlarma;
    }

    public void setNotaAlarma(String notaAlarma) {
        this.notaAlarma = notaAlarma;
    }

    public String toString() {
        return "Nota de Alarma con ID nro: " + getNotaId() + " es: " + getLineaDeTexto() +
                "\nProgramada para las: " + notaAlarma +
                "\n____________________________________________________________";
    }


}
