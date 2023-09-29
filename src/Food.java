import java.time.Instant;
import java.util.Date;

public class FoodInStorage extends DifferentInStorage {

    private String date;

    public FoodInStorage(String name, Producer producer,
                         double price, int amount, int ordered, String date){
        super(name, producer, price, amount, ordered);
        this.date = date;
    }

    public String toString() {
        double special = Math.pow(10, 2);
        return name + " - " + producer.getName() + "\n     цена: "
                + price + "\n     дата хранения до: " + date +
                "\n     количество на складе: " + amount +
                "\n     рейтинг: " + Math.ceil(rating*special)/special;
    }

}
