package Agencia;

import javax.swing.JOptionPane;

public class Tiquete {
    private String NroTiquete;
    private String Ciudad;
    private int DiasHospedaje;
    private int CostoPersona;
    private int CostoComida;
    public double descuentos;
    public double total;
    String FormaPago;

    public Tiquete() {}

    public String getNroTiquete() {
        return NroTiquete;
    }

    public void setNroTiquete(String NroTiquete) {
        this.NroTiquete = NroTiquete;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public int getDiasHospedaje() {
        return DiasHospedaje;
    }

    public void setDiasHospedaje(int DiasHospedaje) {
        this.DiasHospedaje = DiasHospedaje;
    }

    public int getCostoPersona() {
        return CostoPersona;
    }

    public void setCostoPersona(int CostoPersona) {
        this.CostoPersona = CostoPersona;
    }

    public int getCostoComida() {
        return CostoComida;
    }

    public void setCostoComida(int CostoComida) {
        this.CostoComida = CostoComida;
    }

    public double getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(double descuentos) {
        this.descuentos = descuentos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getFormaPago() {
        return FormaPago;
    }

    public void setFormaPago(String FormaPago) {
        this.FormaPago = FormaPago;
    }

    @Override
    public String toString() {
        return "Tiquete{" + "Nro Tiquete=" + NroTiquete + ", Ciudad=" + Ciudad + ", Dias Hospedaje=" + DiasHospedaje + ", Costo Persona=" + CostoPersona + ", Costo Comida=" + CostoComida + ", descuentos=" + descuentos + ", total=" + total + ", Forma Pago=" + FormaPago + '}';
    }

    public void LiquidaReserva(String Ciudad, int personas, String FormaPago) {
        double costoAlojamientoDiario = 0.0;
        double valorTiquetePersona = 0.0;
        double costoComidaDiaria = 0.0;
        double valorTotalTiquete = 0.0;
        double valorDescuento = 0.0;
        double valorNetoPagar = 0.0;

        setCiudad(Ciudad);
        setFormaPago(FormaPago);

        switch (Ciudad) {
            case "A":
                setDiasHospedaje(5);
                costoAlojamientoDiario = 15000.0;
                valorTiquetePersona = 100000.0;
                costoComidaDiaria = 9000.0;
                break;
            case "B":
                setDiasHospedaje(4);
                costoAlojamientoDiario = 12500.0;
                valorTiquetePersona = 120000.0;
                costoComidaDiaria = 11000.0;
                break;
            case "C":
                setDiasHospedaje(8);
                costoAlojamientoDiario = 14000.0;
                valorTiquetePersona = 110000.0;
                costoComidaDiaria = 12000.0;
                break;
            case "D":
                setDiasHospedaje(6);
                costoAlojamientoDiario = 17000.0;
                valorTiquetePersona = 115000.0;
                costoComidaDiaria = 10000.0;
                break;
            default:
                System.out.println("Ciudad no válida.");
                return;
        }

        if (personas > 10) {
            valorDescuento = valorTotalTiquete * 0.15;
        } else if (personas >= 1) {
            valorDescuento = valorTotalTiquete * 0.10;
        } else {
            System.out.println("Número de personas no válido.");
            return;
        }

        if (Ciudad.equals("C") || Ciudad.equals("D")) {
            valorDescuento += valorTotalTiquete * 0.05;
        } else if (Ciudad.equals("A") || Ciudad.equals("B")) {
            valorDescuento += valorTotalTiquete * 0.02;
        } else {
            System.out.println("Ciudad no válida.");
            return;
        }

        valorTotalTiquete = valorTiquetePersona * personas + costoAlojamientoDiario * DiasHospedaje + costoComidaDiaria * DiasHospedaje;
        setTotal(valorTotalTiquete);
        setCostoComida((int) (costoComidaDiaria * DiasHospedaje));
        setCostoPersona((int) valorTiquetePersona);
        valorNetoPagar = valorTotalTiquete - valorDescuento;

        if (FormaPago.equals("Efectivo")) {
            valorDescuento += valorNetoPagar * 0.04;
            valorNetoPagar -= valorDescuento;
        } else if (FormaPago.equals("Crédito")) {
            valorDescuento += -valorNetoPagar * 0.15;
            valorNetoPagar -= valorDescuento;
            
        } else {
            System.out.println("Forma de pago no válida.");
        }
        setDescuentos(valorDescuento);
        setTotal(valorNetoPagar);
        setNroTiquete("12345");

    }

    public void MostrarDatos() {
        System.out.println("Nro Tiquete: " + getNroTiquete());
        System.out.println("Ciudad: " + getCiudad());
        System.out.println("Dias Hospedaje: " + getDiasHospedaje());
        System.out.println("Costo Persona: " + getCostoPersona());
        System.out.println("Costo Comida: " + getCostoComida());
        System.out.println("Descuentos: " + getDescuentos());
        System.out.println("Total: " + getTotal());
        System.out.println("Forma Pago: " + getFormaPago());
        JOptionPane.showMessageDialog(null, "Nro Tiquete: " + getNroTiquete() + "\nCiudad: " + getCiudad() + "\nDias Hospedaje: " + getDiasHospedaje() + "\nCosto Persona: " + getCostoPersona() + "\nCosto Comida: " + getCostoComida() + "\nDescuentos: " + getDescuentos() + "\nTotal: " + getTotal() + "\nForma Pago: " + getFormaPago());
    };
}
