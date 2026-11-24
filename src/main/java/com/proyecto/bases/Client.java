public class Client extends User {


    public Client(int id, String name, String password) {
        super(id, name, password);
    }

    @Override
    public String getRole() {
        return "Cliente";
    }
}