package patterns.behavioral.pubsub.task.pubsub;

public interface Publisher<T> {
    void registerSubscriber(Listner<T> listner);
    void unregisterSubscriber(Listner<T> listner);
    void notifySubscribers(Event<T> event);
}
