package patterns.behavioral.pubsub.task.pubsub.impl.pub;

import patterns.behavioral.pubsub.task.pubsub.ChannelAdmin;
import patterns.behavioral.pubsub.task.pubsub.Event;
import patterns.behavioral.pubsub.task.pubsub.Listner;
import patterns.behavioral.pubsub.task.pubsub.Publisher;
import patterns.behavioral.pubsub.task.pubsub.impl.event.Video;
import patterns.behavioral.pubsub.task.pubsub.impl.sub.Subscriber;

import java.util.ArrayList;
import java.util.List;

/**
  Description object of video channel(model).
 */
public class VideoChannel implements Publisher<Video> {
    private final List<Listner> subscribers;
    private final List<Video> videos;
    private ChannelAdmin admin;

    public VideoChannel() {
        this(new ChannelAdmin("Rob"));
    }

    public VideoChannel(ChannelAdmin admin) {
        this.subscribers = new ArrayList<>();
        this.videos = new ArrayList<>();
        this.admin = admin;
    }

    public void addVideo(Video video) {
        videos.add(video);
        notifySubscribers(()-> video);

    }

    public ChannelAdmin getAdmin() {
        return admin;
    }

    public void setAdmin(ChannelAdmin admin) {
        this.admin = admin;
    }

    @Override
    public void registerSubscriber(Listner<Video> listner) {
        this.subscribers.add(listner);
        for (Video video: videos){
            listner.process(()-> video);
        }

    }

    @Override
    public void unregisterSubscriber(Listner<Video> listner) {
        this.subscribers.remove(listner);

    }

    @Override
    public void notifySubscribers(Event<Video> event) {
        for (Listner subscriber : subscribers){
            subscriber.process(event);
        }

    }
}
