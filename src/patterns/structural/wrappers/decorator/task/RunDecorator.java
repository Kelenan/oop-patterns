package patterns.structural.wrappers.decorator.task;

import patterns.structural.wrappers.decorator.task.impl.Calculator;
import patterns.structural.wrappers.decorator.task.impl.LogableCalculator;

/**
  Task: You'll need to add logging to calculator's methods. Calculator's class must stay without any changes.
  Additional task: replace condition branching in to View class prepare() method with Map
 */
public class RunDecorator {
    public static void main(String[] args) {
        View view = new View(new LogableCalculator(new Calculator()));
        view.run();
    }
}
