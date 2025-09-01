package aed;

public class Recordatorio {
    private String mensaje_recordatorio;
    private Fecha fecha_recordatorio;
    private Horario horario_recordatorio;

    public Recordatorio(String mensaje, Fecha fecha, Horario horario) {
        this.mensaje_recordatorio = mensaje;

        this.fecha_recordatorio = new Fecha(fecha);
        this.horario_recordatorio = new Horario(horario);
    }

    public Horario horario() {
        Horario horario = new Horario(horario_recordatorio);
        return horario;
    }

    public Fecha fecha() {
        Fecha fecha = new Fecha(fecha_recordatorio);
        return fecha;
    }

    public String mensaje() {
        return this.mensaje_recordatorio;
    }

    @Override
    public String toString() {
        // mensaje @ fecha horario
        return this.mensaje() + " @ " + this.fecha() + " " + this.horario();
    }

    @Override
    public boolean equals(Object otro) {
        boolean esNulo = otro == null;

        if(esNulo){
            return false;
        }

        boolean noSonMismaClase = otro.getClass() == this.getClass();

        if(noSonMismaClase){
            return false;
        }
        

        Recordatorio otroRecordatorio = (Recordatorio) otro;

        return otroRecordatorio.fecha() == this.fecha() && otroRecordatorio.horario() == this.horario() && otroRecordatorio.mensaje() == this.mensaje() ;
    }

}
