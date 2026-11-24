

public class User {

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
}