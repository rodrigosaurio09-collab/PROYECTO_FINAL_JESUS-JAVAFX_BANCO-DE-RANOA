public class Client extends User {

    //este es final porque un cliente no puede cambiar de cuenta, si se quiere cambiar de cuenta.
    private final Account account;

    public Client(int id, String name, String password, Account account) {
        super(id, name, password);
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    @Override
    public String getRole() {
        return "Cliente";
    }
    
}