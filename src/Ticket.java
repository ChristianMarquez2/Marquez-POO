public class Ticket {
    private Ruta ruta;
    private Servicio tipoServicio;
    private Pasajero pasajero;

    public Ticket(Ruta ruta, Servicio tipoServicio, Pasajero pasajero) {
        this.ruta = ruta;
        this.tipoServicio = tipoServicio;
        this.pasajero = pasajero;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public Servicio getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(Servicio tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }
}
