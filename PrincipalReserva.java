package Agencia;
import javax.swing.JOptionPane;


public class PrincipalReserva {
    static String nombre;
    static String apellido;
    static String genero;
    static int edad;
    static String id;
    static String ciudad;
    static String direccion;
    static String telefono;
    static String empresa;

    static String ciudadDestino;
    static int numeroPersonas;
    static String formaPago; 


    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(
            null, 
            null, 
            null, 
            null, 
            0, 
            null, 
            null, 
            null, 
            null
        );

        Tiquete tiquete1 = new Tiquete();
        
        boolean seguir = true;
        while (seguir) {
            String opcion = JOptionPane.showInputDialog(
            "Seleccione una opción:\n1. Capturar Datos Cliente\n2. Capturar Datos Reserva\n3. Liquidar Reserva\n4. Mostrar Datos Reserva\n5. Salir\n"
            );
            
            switch (opcion) {
                case "1":
                    nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
                    cliente1.setNombres(nombre);
                    apellido = JOptionPane.showInputDialog("Ingrese el apellido del cliente:");
                    cliente1.setApellidos(apellido);
                    genero = JOptionPane.showInputDialog("Ingrese el género del cliente:");
                    cliente1.setGenero(genero);
                    edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del cliente:"));
                    cliente1.setEdad(edad);
                    id = JOptionPane.showInputDialog("Ingrese el ID del cliente:");
                    cliente1.setId(id);
                    ciudad = JOptionPane.showInputDialog("Ingrese la ciudad del cliente:");
                    cliente1.setCiudad(ciudad);
                    direccion = JOptionPane.showInputDialog("Ingrese la dirección del cliente:");
                    cliente1.setDireccion(direccion);
                    telefono = JOptionPane.showInputDialog("Ingrese el teléfono del cliente:");
                    cliente1.setTelefono(telefono);
                    empresa = JOptionPane.showInputDialog("Ingrese la empresa del cliente:");
                    cliente1.setEmpresa(empresa);
                    break;
                case "2":
                    //capturar datos reserva
                    ciudadDestino = JOptionPane.showInputDialog("Ingrese la ciudad de destino:");
                    numeroPersonas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de personas:"));
                    formaPago = JOptionPane.showInputDialog("Ingrese la forma de pago:");

                    break;
                case "3":
                    //liquidar reserva 
                    tiquete1.LiquidaReserva(ciudadDestino, numeroPersonas, formaPago);
                    break;
                case "4":
                    tiquete1.MostrarDatos();
                    break;
                case "5":
                    //salir
                    seguir = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
                    break;
            }
        }
    }
}
