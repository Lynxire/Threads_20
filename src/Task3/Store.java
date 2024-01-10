package Task3;

public class Store {
    private int product = 0;

    public synchronized void produce() {
        if (product >= 3) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        product++;
        System.out.println("Производитель добавил товар");
        System.out.println("Товаров на складе: " + product);
        notify();
    }

    public synchronized void clientBuy() {
        if (product < 1) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        product--;
        System.out.println("Покупатель купил товар");
        System.out.println("Товаров на складе: " + product);
        notify();
    }


}
