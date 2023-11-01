package hw2;

import java.util.ArrayList;

public class Market implements QueueBehaviour,MarketBehaviour{
    private String name;
    private String order;
    ArrayList<String> names = new ArrayList<>();
    ArrayList<String> orders  = new ArrayList<>();

    public Market(String name, String order){
        this.name = name;
        this.order = order;
    }

    @Override
    public void placeOrder() {
        orders.add(order);
        System.out.println("Покупатель " + getName() + " сделал заказ " + getOrder());

    }

    @Override
    public void takeOrder() {
        orders.remove(order);
        System.out.println(getName() + " получил заказ " + getOrder());

    }

    @Override
    public void joinToQueue() {
        names.add(name);
        System.out.println("Покупатель " + getName() + " стал в очередь" );

    }

    @Override
    public void leaveQueue() {
        //names.remove(name);
        System.out.println("Покупатель " + getName() + " покинул очередь" );
        names.remove(name);

    }

    @Override
    public int size() {
        return names.size();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrder() {
        return order;
    }
    public void setOrder(String order) {
        this.order = order;
    }
    public void update(){
        placeOrder();
        takeOrder();
    }

}
