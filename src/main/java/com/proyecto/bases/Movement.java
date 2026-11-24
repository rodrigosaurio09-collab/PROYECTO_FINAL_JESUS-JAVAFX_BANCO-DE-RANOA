import java.time.LocalDate;

//Un movimiento del historial (apenas entiendo como funciona record, pero jaló en el prototipo que armamos en clase)
public record Movement(String type, double amount, String detail, LocalDate date) {


    //según san google:
    //toString() es un método heredado de la clase Object que devuelve una representación en texto (String) de un objeto    
    @Override
    public String toString() {
    return date + "  |  " + type + "  |  $" + String.format("%.2f", amount) + "  |  " + detail;

}
}