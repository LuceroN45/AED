package aed;

public class Horario {
    private int hora;
    private int minutos;

    public Horario(int hora, int minutos) {
        this.hora = hora;
        this.minutos = minutos;
    }

    public Horario(Horario horario) {
        this.hora = horario.hora();
        this.minutos = horario.minutos();
    }

    public int hora() {
        return this.hora;
    }

    public int minutos() {
        return this.minutos;
    }

    @Override
    public String toString() {
        return this.hora + ":" + this.minutos;
    }

    @Override
    public boolean equals(Object otro) {
        
        boolean otroEsNulo = otro == null;

        if (otroEsNulo) {
            return false;
        }

        boolean noSonMismaClase = otro.getClass() != this.getClass();

        if (noSonMismaClase){
            return false;
        }

        Horario otroHorario = (Horario) otro;

        return otroHorario.hora() == this.hora() && otroHorario.minutos() == this.minutos();
    }

}
