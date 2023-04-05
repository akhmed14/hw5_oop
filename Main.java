package hw5;

import hw5.controllers.Controller;
import hw5.model.products.HotBeverage;
import hw5.model.products.Product;
import hw5.model.tasks.CoffieMachine;
import hw5.views.ConsumerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> dataBase = new ArrayList<>(Arrays.asList(new HotBeverage("кофе", 100, 75, true),
                (new HotBeverage("кофе", 100, 75, true)),
                (new HotBeverage("чай", 90, 75, false)),
                (new HotBeverage("американо", 120, 85, true)),
                (new HotBeverage("матэ", 160, 65, false))));
        CoffieMachine machine = new CoffieMachine(dataBase);
        Controller controller = new Controller(machine);
        ConsumerView view = new ConsumerView(controller);
        view.run();

    }
}