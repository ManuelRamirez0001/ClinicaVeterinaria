import java.text.NumberFormat;
import java.util.Locale;
public class Main {
    public static void main(String[] args){
        Locale colomboLocale = new Locale("es", "CO");//tuve que buscar format, ya que no queria editar directamente la salida manual
        NumberFormat formateadorMoneda = NumberFormat.getCurrencyInstance(colomboLocale);
        Animales perro=new Perro("raul",12,"Ruben raul","labrador");
        Animales gato = new Gato("martina",9,"Fernanda",false);
        Animales ave= new Ave("pocoyo",3,"martinsombra",12.8);

        Animales[] animales = { perro, gato, ave };

        for (Animales animal : animales) {

            if (animal instanceof Asegurable) {
                String resultado = formateadorMoneda.format(((Asegurable) animal).calcularPrimaSeguro());
                System.out.println(resultado);
            }
        }
    }

}