import com.google.gson.Gson;

public class prueba {
static class ukra{
    String nombre;
    String precio;
    String Decripcion;
    String Calorias;
    public ukra(String nombre, String precio,String Decripcion,String Calorias ) {
        this.nombre = nombre;
        this.precio = precio;
        this.Decripcion = Decripcion;
        this.Calorias = Calorias;

    } }
public static void main(String[] args){

    ukra coso1= new ukra("Nombre","precio","Descripcion","Calorias");
    ukra coso2= new ukra("Gofles belgas","5.95","Gofles de belgica","650");
    ukra coso3= new ukra("Lo anterior pero con fresas","7.95","Lo anterior pero con fresas","900");
    ukra coso4= new ukra("Lo mismo que lo anteanterior pero con frutas del bosque","8.95","Lo mismo que lo anteanterior pero con frutas del bosque","900");
    ukra coso5= new ukra("Tosatada Francesa","4.5","Tosatada de Francesan","600");
    ukra coso6= new ukra("Desayuno de la casa","6.5","un desayuno","950");
    Gson iro=new  Gson();
    String Json= iro.toJson(coso1);
    String Json2= iro.toJson(coso2);
    String Json3= iro.toJson(coso3);
    String Json4= iro.toJson(coso4);
    String Json5= iro.toJson(coso5);
    String Json6= iro.toJson(coso6);

    System.out.println(Json);
    System.out.println(Json2);
    System.out.println(Json3);
    System.out.println(Json4);
    System.out.println(Json5);
    System.out.println(Json6);

}
}
