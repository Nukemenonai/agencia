package Agencia;


public class Cliente extends Persona {
    private String ciudad;
    private String direccion;
    private String telefono;
    private String empresa;

    public Cliente() {}; 

    public Cliente(String id, String nombres, String apellidos, String genero, int edad, String ciudad, String direccion, String telefono, String empresa) {
        super(id, nombres, apellidos, genero, edad);
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.empresa = empresa;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
    @Override
    public String toString() {
        return "Cliente{\n" + "id: " + id + "\nnombres: " + nombres + "\napellidos: " + apellidos + "\ngenero: " + genero + "\nedad: " + edad + "\nciudad: " + ciudad + "\ndireccion: " + direccion + "\ntelefono: " + telefono + "\nempresa: " + empresa + "\n}";
    }
}
