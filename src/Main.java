public class Main {
    public static void main(String[] args) {

        //instanciar un objeto de base de datos pero QUÉ

        System.out.println( BaseDeDatos.usuario1.getUsuario());
        System.out.println(BaseDeDatos.usuario1.getToken());

        BaseDeDatos.geNuevoUsuario();
    }
}