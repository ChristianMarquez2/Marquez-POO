public class Pasajero {
    private String nombre;
    private String cedula;
    private String telefono;

    public Pasajero(String nombre, String cedula, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Pasajero{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
