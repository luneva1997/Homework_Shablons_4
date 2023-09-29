import java.time.Instant;
import java.util.Date;

public class DifferentInStorage implements ProductInStorage{

    protected String name;
    protected Producer producer;
    protected double price;
    protected int amount;
    protected double rating = 0;
    protected int ordered = 0;

    public DifferentInStorage(String name, Producer producer,
                         double price, int amount){
        this.name = name;
        this.producer = producer;
        this.price = price;
        this.amount = amount;
    }

    public DifferentInStorage(String name, Producer producer,
                              double price, int amount, int ordered){
        this(name, producer, price, amount);
        this.ordered = ordered;
        rating = (double) ordered/ (ordered + amount) * 10;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getRating(){return rating;}

    @Override
    public void changeAmountMinus(int number) {
        if (number>0 && number<=amount){
            amount -= number;
        } else {
            System.out.println("Нет в наличии такого количества");
        }
    }

    @Override
    public void changeAmountPlus(int number){
        if (number>0){
            amount += number;
        } else{
            System.out.println("Введите корректное число");
        }
    }

    @Override
    public void changeRaiting() {
        rating = (double) (amount / (amount+ordered)) * 100;
    }

    @Override
    public String toString(){
        double special = Math.pow(10, 2);
        return name + " - " + producer.getName() + "\n     цена: "
                + price + "\n     количество на складе: " + amount +
                "\n     рейтинг: " + Math.ceil(rating*special)/special;
    }
}
