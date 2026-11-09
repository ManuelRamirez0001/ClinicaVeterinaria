public class Ave extends Animales{
    private double pesoEnGramos;
    public Ave(String nombre, int edad, String nombreDueno,double pesoEnGramos) {
        super(nombre, edad, nombreDueno);
        this.pesoEnGramos=pesoEnGramos;
    }

    public double getPesoEnGramos() {
        return pesoEnGramos;
    }

    public void setPesoEnGramos(double pesoEnGramos) {
        this.pesoEnGramos = pesoEnGramos;
    }

    @Override
    public double costoConsulta() {
        return 28000+(100*getPesoEnGramos());
    }

    @Override
    public void mostrarFicha() {
        super.mostrarFicha();
        System.out.println("El peso del ave es de:"+getPesoEnGramos()+"gramos");
    }
}
