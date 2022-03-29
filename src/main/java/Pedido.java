import com.google.gson.Gson;

public class Pedido {
    static class sis{
        String destinatario;
        String articulo;
        String direccion;
        String fecha;
        public sis(String destinatario, String articulo,String direccion,String fecha ) {
            this.destinatario = destinatario;
            this.articulo = articulo;
            this.direccion = direccion;
            this.fecha = fecha;

        } }
    public static void main(String[] args){

        sis selopide= new sis("Juan Delgado Martínez","Bicicleta Bianchi Oltre","calle \n" +
                "Reforma 423, tercer piso, letra A","19-09-2021");

        Gson iro=new  Gson();
        String Json= iro.toJson(selopide);


        System.out.println(Json);

    }
}
