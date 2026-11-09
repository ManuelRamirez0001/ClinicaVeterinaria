public class Gato extends Animales implements Vacunable, Asegurable{
    private boolean esEsterilizado;
    public Gato(String nombre, int edad, String nombreDueno, boolean esEsterilizado) {
        super(nombre, edad, nombreDueno);
        this.esEsterilizado=esEsterilizado;
    }

    public boolean getEsEsterilizado() {
        return esEsterilizado;
    }

    public void setEsEsterilizado(boolean esEsterilizado) {
        this.esEsterilizado = esEsterilizado;
    }

    @Override
    public double costoConsulta() {
        return 38000;
    }
    @Override
    public void mostrarFicha(){
        super.mostrarFicha();
        System.out.println("Esta esterilizado: "+getEsEsterilizado());
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
        if(getEsEsterilizado()){
            return 120000;
        }
        return 200000;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "";
    }
}
