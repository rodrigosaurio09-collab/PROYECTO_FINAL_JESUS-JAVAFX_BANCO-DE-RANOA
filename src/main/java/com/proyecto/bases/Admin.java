
public class Admin extends User {

    public Admin(int id, String name, String password) {
        super(id, name, password);
    }

    @Override
    public String getRole() {
        return "Administrador";
    }
}