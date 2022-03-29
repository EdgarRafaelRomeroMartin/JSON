import com.google.gson.Gson;

public class Mensaje {
    static class sis{
        String Remitente;
        String Destinatario;
        String Asunto;
        String Texto;
        public sis(String nombrer,String emailr,String nombred,String emaild,String asunto,String parrafo) {
            this.Remitente = nombrer +(" ")+ emailr;
            this.Destinatario = nombred +(" ")+ emaild;
            this.Asunto = asunto;
            this.Texto = parrafo;

        } }
    public static void main(String[] args){

        sis selopide= new sis("Alfredo Reino","alf@ibium.com","Billi Clinton",
                "president@whitehouse.gov","Hola Billi","Hola que tal");

        Gson iro=new  Gson();
        String Json= iro.toJson(selopide);


        System.out.println(Json);

    }
}
