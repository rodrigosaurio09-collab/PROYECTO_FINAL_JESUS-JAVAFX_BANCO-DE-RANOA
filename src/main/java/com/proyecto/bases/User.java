
//Clase papi de todos los usuarios, solo returneará sus datos
public abstract class User {

    //atributos
    private int id;
    private String name;
    private String password;

    //constructor
    public User(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    //metodos
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean compare(String password) {
        return this.password.equals(password);
    }

    //según entendí, abstract es para que las subclases implementen este método, y no instanciar un User directamente. (encapsulamiento supongo?)
    public abstract String getRole();

}