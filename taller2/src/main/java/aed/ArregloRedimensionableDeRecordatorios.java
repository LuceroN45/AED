package aed;

//El objetivo de esta secci´on es implementar la clase ArregloRedimensionableDeRecordatorios. El ArregloRedimensionable-
//DeRecordatorios es una implementaci´on sencilla de una secuencia de recordatorios.
//La implementaci´on se basa en guardar los elementos en un arreglo. Cuando el arreglo se llena, lo que debe hacerse es
//crear un nuevo arreglo m´as grande, copiar los elementos del antiguo arreglo al nuevo, y reemplazar el arreglo viejo por el
//nuevo.

class ArregloRedimensionableDeRecordatorios {
    private Recordatorio[] arregloRecordatorios;

    public ArregloRedimensionableDeRecordatorios() {
        this.arregloRecordatorios = new Recordatorio[0];
    }

    public int longitud() {
        return this.arregloRecordatorios.length;
    }

    public void agregarAtras(Recordatorio i) {
        Recordatorio[] nuevoArreglo = new Recordatorio[this.arregloRecordatorios.longitud() + 1]; 
    }

    public Recordatorio obtener(int i) {
        // Implementar
        return null;
    }

    public void quitarAtras() {
        // Implementar
    }

    public void modificarPosicion(int indice, Recordatorio valor) {
        // Implementar
    }

    public ArregloRedimensionableDeRecordatorios(ArregloRedimensionableDeRecordatorios vector) {
        // Implementar
    }

    public ArregloRedimensionableDeRecordatorios copiar() {
        // Implementar
        return null;
    }
}
