package hw2;
//Реализовать класс Market и все методы, которые он обязан реализовывать.
//        Методы из интерфейса QueueBehaviour, имитируют работу очереди, MarketBehaviour –
//        помещает и удаляет человека из очереди, метод update – обновляет состояние магазина
//        (принимает и отдаёт заказы)

public class Main {
    public static void main(String[] args) {
        Market market = new Market("Bob", " Order ");
        market.joinToQueue();
        market.setName("Rut");
        market.joinToQueue();
        market.setName("Jon");
        market.joinToQueue();
        System.out.println("В очереди стоит " + market.size() + " человек");
        System.out.println();

        market.setName("Bob");
        market.update();
        market.leaveQueue();
        System.out.println("В очереди стоит " + market.size() + " человек");
        System.out.println();
        market.setName("Rut");
        market.update();
        market.leaveQueue();
        System.out.println("В очереди стоит " + market.size() + " человек");
    }

}
