package Task3;

public class Manufacturer implements Runnable{
    Store store;

    public Manufacturer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            store.produce();
        }
    }
}
