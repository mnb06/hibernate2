package maven.logic;
import maven.model.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    
        User usuario = new User("Matias", "Bue", "matias@outlook.com", "estudiante");
        System.out.print(usuario.getNombre());
    }
}
