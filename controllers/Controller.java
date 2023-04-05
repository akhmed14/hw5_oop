package hw5.controllers;

import hw5.model.products.Product;
import hw5.model.tasks.VendingMachine;

public class Controller {
    private final VendingMachine machine;

    public Controller(VendingMachine machine) {
        this.machine = machine;
    }

    public Product findProduct(String name) throws Exception {
        return machine.getProduct(name);

    }

}
