public class BaseDeDatos {
    private String usuario = "";
    private String token ="";


    //constructores
   private BaseDeDatos(String usuario,String token){
        this.usuario = usuario;
        this.token = token;
    }
    private BaseDeDatos() {
    }
    public void setUsuario(){

    }


    public String getUsuario() {
        return usuario;
    }
    public String getToken() {
        return token;
    }

    public static BaseDeDatos usuario1 = new BaseDeDatos("Manolo","123AA");

   private static BaseDeDatos usuario2 = null;

   public static BaseDeDatos geNuevoUsuario(){
       if (usuario2 == null){
           usuario2 =new BaseDeDatos();
       }
       return usuario2;
   }


}
