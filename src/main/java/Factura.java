import com.google.gson.Gson;

public class Factura {
    static class sis{
        String Business_name;
        String Invoice_number;
        String Date;
        String Terms_of_payment;
        public sis(String city,String strate,String Zip_code,String numero,String Date,String Terms_of_payment) {
            this.Business_name=city+(" ")+strate+(" ")+Zip_code;
            this.Invoice_number=numero;
            this.Date=Date;
            this.Terms_of_payment=Terms_of_payment;


        }

    }
    static class sus {
        String Description_of_goods_or_services;
        public sus( String product, String description, String Qty, String Rate, String Amount) {
            this.Description_of_goods_or_services = product + (" ") + description + (" ") + Qty + (" ") + Rate + (" ") + Amount;
        }
    }
    public static void main(String[] args){

        sis selopide= new sis("city","strate","Zip_code",
                "numero","Date","Terms_of_payment");

sus OwO=new sus("product","description","Qty","Rate","Amount");

        Gson iro=new  Gson();
        String Json= iro.toJson(selopide);
        String Des1= iro.toJson(OwO);


        System.out.println(Json);
        System.out.println(Des1);
    }
}
