package Task3;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        Manufacturer producer = new Manufacturer(store);
        Client consumer = new Client(store);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
