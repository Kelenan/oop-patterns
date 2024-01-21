package patterns.generating.builder.task;

import patterns.generating.builder.task.item.Characteristic;
import patterns.generating.builder.task.item.Item;
import patterns.generating.builder.task.item.impl.Bike;

/**
 Using the builder pattern, correct the characteristic class code
 */
public class Main {
    public static void main(String[] args) {
        Item bike = new Bike(Characteristic.builder()
                .wheel("Mountain")
                .color("Pink")
                .brand("Kross")
                .build());

        System.out.println(bike);
    }
}
