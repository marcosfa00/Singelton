ARCHIVO README

#   SINGLETON

    Creamos un objeto en la propia clase 
    ya que el Construcytor es privado
    
Lo hacemos de la siguiente manera
    
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


#   en la clase main llamamo al objeto así

    System.out.println( BaseDeDatos.usuario1.getUsuario());
        System.out.println(BaseDeDatos.usuario1.getToken());
    
    BaseDeDatos.geNuevoUsuario();

