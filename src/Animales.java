public abstract class Animales{
    private String nombre;
    private int edad;
    private String nombreDueno;
    public Animales(String nombre, int edad, String nombreDueno){
        this.nombre=nombre;
        this.edad=edad;
        this.nombreDueno=nombreDueno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }
    public  void mostrarFicha(){
        System.out.println("los datos del animal en cuestion: "+"Edad: "+getEdad()+"\n"+"Nombre: "+getNombre()+"\n"+"Nombre del Dueño"+ getNombreDueno());
    }
    public abstract double costoConsulta();
}
