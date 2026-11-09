public class Perro extends Animales implements Vacunable, Asegurable {
    private String raza;
    public Perro(String nombre, int edad, String nombreDueno, String raza) {
        super(nombre, edad, nombreDueno);
        this.raza=raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public double costoConsulta() {
        return 45000+(3000*getEdad());
    }
    @Override
    public void mostrarFicha(){
        super.mostrarFicha();
        System.out.println("la raza es:\n "+ getRaza());
    }

    @Override
    public void registrarVacuna(String nombre) {

    }

    @Override
    public int getVacunasAplicadas() {
        return 0;
    }

    @Override
    public double calcularPrimaSeguro() {
        return 80000*getEdad();
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "";
    }
}
