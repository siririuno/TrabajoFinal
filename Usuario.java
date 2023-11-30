package TrabajoFinal;
public class Usuario {
    private String nombre; 
    private String apellidos;
    private final String cedula;
    public Usuario(String nombre, String apellido, String cedula) {
        this.nombre=nombre;
        this.apellidos = apellido;
        this.cedula = cedula;
    }
public String getNombre() {
    return nombre;}
public String getApellidos() {
    return apellidos;}
public String getCedula() {
    return cedula;}
}
