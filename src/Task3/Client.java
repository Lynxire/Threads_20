package Task3;

public class Client implements Runnable{
    Store store;

    public Client(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            store.clientBuy();
        }

    }
}
