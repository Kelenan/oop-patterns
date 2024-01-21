package patterns.behavioral.pubsub.task.pubsub;

public interface Listner<T> {
    void process(Event<T> event);
}

