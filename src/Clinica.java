public class Clinica implements Asegurable {
    private String nombre;
    private String direccion;
    private boolean asegurado;

    public Clinica(boolean asegurado, String direccion, String nombre) {
        this.asegurado = asegurado;
        this.direccion = direccion;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isAsegurado() {
        return asegurado;
    }

    public void setAsegurado(boolean asegurado) {
        this.asegurado = asegurado;
    }

    @Override
    public double calcularPrimaSeguro() {
        return 500000;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return " POL-CLINICA-[Clinica-Pepa-09]";
    }
}
