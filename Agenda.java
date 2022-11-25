public class Agenda {
   
    

    public Agenda(  String nombre, String apellido, int telefono1, String empresa) {
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono1 = telefono1;
        
        this.empresa = empresa;
    }
    
    int telefono1;
    public int getTelefono() {
        return telefono1;
    }
    public void setTelefono1(int telefono1) {
        this.telefono1 = telefono1;
    }
    String nombre;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    String apellido;
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    String empresa;
    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
    

}
;